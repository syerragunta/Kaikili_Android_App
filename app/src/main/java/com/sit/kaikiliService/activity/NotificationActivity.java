package com.sit.kaikiliService.activity;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
import com.sit.kaikiliService.adapter.MessageAdapter;
import com.sit.kaikiliService.api.Apiresponse;
import com.sit.kaikiliService.api.GetNotificationAPI;
import com.sit.kaikiliService.api.Message;
import com.sit.kaikiliService.api.NotificationInfo;
import com.sit.kaikiliService.api.WebApi;
import com.sit.kaikiliService.api.WebUtil;
import com.sit.kaikiliService.comman.Util;
import com.sit.kaikiliService.font.EditTextEupheminUCASRegular;
import com.sit.kaikiliService.font.TextViewEuphemiaUCASRegular;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;


/**
 * Created by ketan patel on 19/1/2019.
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
 */

public class NotificationActivity extends BaseActivity implements View.OnClickListener {

    @Bind(R.id.top_back)
    ImageView top_back;
    @Bind(R.id.top_title) TextViewEuphemiaUCASRegular top_title;
    @Bind(R.id.listViewMessages) ListView listViewMessages;
    @Bind(R.id.messagePostArea) EditTextEupheminUCASRegular messagePostArea;
    @Bind(R.id.sendButton) ImageView sendButton;

    private KaikiliApplication application;
    private SharedPreferences preferences;
    private NotificationInfo notificationInfo;
    private ArrayList<Message> messages;
    private MessageAdapter adapter ;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_notification );
        ButterKnife.bind( this, this );

        application = (KaikiliApplication) getApplicationContext();
        preferences = application.getSharedPreferences();

        notificationInfo = (NotificationInfo)getIntent().getSerializableExtra( "Notification" );
        adapter = new MessageAdapter(this);

        top_title.setText( notificationInfo.getSr_title());
        top_back.setOnClickListener( this );
        sendButton.setOnClickListener( this );

        listViewMessages.setAdapter(adapter);

        new GetNotificationDataTask(this).execute();
    }

    public class GetNotificationDataTask extends AsyncTask<Void, Void, String> {

        private ProgressDialog mDialog = null;
        private Activity mActivity;


        public GetNotificationDataTask(Activity activity) {
            mActivity = activity;

            // TODO Auto-generated constructor stub
        }

        @Override
        protected void onPreExecute() {
            // TODO Auto-generated method stub
            super.onPreExecute();

            mDialog = ProgressDialog.show( mActivity, null, "Please wait....", true, true );
            mDialog.getWindow().clearFlags( WindowManager.LayoutParams.FLAG_DIM_BEHIND );
            mDialog.setCanceledOnTouchOutside( false );
        }

        @Override
        protected String doInBackground(Void... params) {
            // TODO Auto-generated method stub
            try {

                JSONObject jsonObject = new JSONObject();
                jsonObject.put( "sp_id", notificationInfo.getSp_id() );
                jsonObject.put( "tran_id", notificationInfo.getTran_id() );
                jsonObject.put( "conversation_id", notificationInfo.getConversation_id() );
                Log.e( "--------------Post", jsonObject.toString() );
                String response = new WebUtil().postMethod( jsonObject.toString(), WebApi.URL_NOTIFICATION_MESSAGE );
                return response;
            } catch (JSONException e) {
                e.printStackTrace();
                return "";
            }
        }

        @Override
        protected void onPostExecute(String response) {
            // TODO Auto-generated method stub
            super.onPostExecute( response );
            if (mDialog.isShowing()) {
                mDialog.dismiss();
            }

            Log.e( "------- Response ", "-------------" + response );
            Gson gson = new Gson(); // Or use new GsonBuilder().create();
            GetNotificationAPI notificationAPI = gson.fromJson( response, GetNotificationAPI.class );

            if (notificationAPI.getData().size() > 0) {
                messages = notificationAPI.getData().get( 0 ).getMessages();
                adapter.setMessages(messages);
            } else {
                Toast.makeText( mActivity,notificationAPI.getMessage(),Toast.LENGTH_SHORT ).show();
            }
        }
    }

    public class PostMessageTask extends AsyncTask<Void, Void, String> {

        private ProgressDialog mDialog = null;
        private Activity mActivity;


        public PostMessageTask(Activity activity) {
            mActivity = activity;

            // TODO Auto-generated constructor stub
        }

        @Override
        protected void onPreExecute() {
            // TODO Auto-generated method stub
            super.onPreExecute();

            mDialog = ProgressDialog.show( mActivity, null, "Please wait....", true, true );
            mDialog.getWindow().clearFlags( WindowManager.LayoutParams.FLAG_DIM_BEHIND );
            mDialog.setCanceledOnTouchOutside( false );
        }

        @Override
        protected String doInBackground(Void... params) {
            // TODO Auto-generated method stub
            try {

                JSONObject jsonObject = new JSONObject();
                jsonObject.put( "sp_id", notificationInfo.getSp_id() );
                jsonObject.put( "tran_id", notificationInfo.getTran_id() );
                jsonObject.put( "message", messagePostArea.getText().toString());
                Log.e( "--------------Post", jsonObject.toString() );
                String response = new WebUtil().postMethod( jsonObject.toString(), WebApi.URL_MESSAGE_POST );
                return response;
            } catch (JSONException e) {
                e.printStackTrace();
                return "";
            }
        }

        @Override
        protected void onPostExecute(String response) {
            // TODO Auto-generated method stub
            super.onPostExecute( response );
            if (mDialog.isShowing()) {
                mDialog.dismiss();
            }
            messagePostArea.setText("");
            Log.e( "------- Response ", "-------------" + response );
            Gson gson = new Gson(); // Or use new GsonBuilder().create();
            Apiresponse apiresponse = gson.fromJson( response, Apiresponse.class );

            if (apiresponse.getStatus() == 1) {
                new GetNotificationDataTask(mActivity).execute();
            } else {
                Toast.makeText( mActivity,apiresponse.getMessage(),Toast.LENGTH_SHORT ).show();
            }
        }
    }

    @Override
    public void onClick(View view) {

        if (view == top_back) {
            finish();

        }else if(view == sendButton){
            if(Util.isNotEmpaty(messagePostArea.getText().toString())){
                Util.hideSoftKeyboard( this );
                new PostMessageTask(this).execute();

            }
        }
    }
}
