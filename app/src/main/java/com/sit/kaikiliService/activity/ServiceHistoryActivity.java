package com.sit.kaikiliService.activity;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.Toast;

import com.google.gson.Gson;
import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
import com.sit.kaikiliService.adapter.ServiceInfoItemAdapter;
import com.sit.kaikiliService.adapter.ToDoServiceListAdapter;
import com.sit.kaikiliService.api.Apiresponse;
import com.sit.kaikiliService.api.ScheduledTSApi;
import com.sit.kaikiliService.api.TransitionServiceData;
import com.sit.kaikiliService.api.WebApi;
import com.sit.kaikiliService.api.WebUtil;
import com.sit.kaikiliService.comman.CircularImageView;
import com.sit.kaikiliService.comman.Util;
import com.sit.kaikiliService.comman.WithoutScrollListView;
import com.sit.kaikiliService.font.EditTextEupheminUCASRegular;
import com.sit.kaikiliService.font.TextViewEuphemiaUCASBola;
import com.sit.kaikiliService.font.TextViewEuphemiaUCASRegular;
import com.sit.kaikiliService.model.ServiceInfoModel;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;


/**
 * Created by ketan patel on 21/2/2019.
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
 */

public class ServiceHistoryActivity extends BaseActivity implements View.OnClickListener {

    @Bind(R.id.top_back)
    ImageView top_back;
    @Bind(R.id.top_title) TextViewEuphemiaUCASRegular top_title;
    @Bind(R.id.services_history_list) ListView services_history_list;


    private KaikiliApplication application;
    private SharedPreferences preferences;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    private String SP_id = "SP00001";
=======
>>>>>>> 2/23/2019
=======
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
    private ArrayList<TransitionServiceData> todoServiceDataList;
    private ToDoServiceListAdapter serviceAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_services_history);
        ButterKnife.bind( this, this );

        application = (KaikiliApplication) getApplicationContext();
        preferences = application.getSharedPreferences();

        top_title.setText( "Service History" );
        top_back.setOnClickListener( this );
        serviceAdapter = new ToDoServiceListAdapter( this );
        services_history_list.setAdapter( serviceAdapter );
        new GetServiceDataTask(this).execute();

    }


    public class GetServiceDataTask extends AsyncTask<Void, Void, String> {

        private ProgressDialog mDialog = null;
        private Activity mActivity;


        public GetServiceDataTask(Activity activity) {
            this.mActivity = activity;

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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
                jsonObject.put( "sp_id", SP_id );
=======
                jsonObject.put( "sp_id",  preferences.getString( "sp_id","") );
>>>>>>> 2/23/2019
=======
                jsonObject.put( "sp_id",  preferences.getString( "sp_id","") );
>>>>>>> 2/25/2019
=======
                jsonObject.put( "sp_id",  preferences.getString( "sp_id","") );
>>>>>>> 2/26/2019
=======
                jsonObject.put( "sp_id",  preferences.getString( "sp_id","") );
>>>>>>> 2/27/2019
=======
                jsonObject.put( "sp_id",  preferences.getString( "sp_id","") );
>>>>>>> 2/28/2019
                Log.e( "--------------Post", jsonObject.toString() );
                String response = new WebUtil().postMethod( jsonObject.toString(), WebApi.URL_COMPLETED_SERVICE );
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
            ScheduledTSApi targetData = gson.fromJson( response, ScheduledTSApi.class );

            if (targetData.getData().size() > 0) {

                todoServiceDataList = new ArrayList<>();
                todoServiceDataList.addAll( targetData.getData() );
                serviceAdapter.setList(todoServiceDataList);

            } else {
                Toast.makeText( mActivity, targetData.getMessage(), Toast.LENGTH_SHORT ).show();
            }
        }
    }


    @Override
    public void onClick(View view) {

        if (view == top_back) {
            finish();

        }
    }


}
