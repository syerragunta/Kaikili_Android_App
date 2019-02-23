package com.sit.kaikiliService.activity;

<<<<<<< HEAD
<<<<<<< HEAD
import android.content.Intent;
import android.content.SharedPreferences;
=======
=======
>>>>>>> 2/23/2019
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
<<<<<<< HEAD
>>>>>>> 2/22/2019
=======
>>>>>>> 2/23/2019
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
<<<<<<< HEAD
<<<<<<< HEAD
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
import com.sit.kaikiliService.adapter.BankDetailListAdapter;
import com.sit.kaikiliService.font.EditTextEupheminUCASRegular;
import com.sit.kaikiliService.font.TextViewEuphemiaUCASRegular;

=======
=======
>>>>>>> 2/23/2019
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
import com.sit.kaikiliService.adapter.BankDetailListAdapter;
import com.sit.kaikiliService.api.Apiresponse;
import com.sit.kaikiliService.api.GetAllBankInfoAPI;
import com.sit.kaikiliService.api.WebApi;
import com.sit.kaikiliService.api.WebUtil;
import com.sit.kaikiliService.font.EditTextEupheminUCASRegular;
import com.sit.kaikiliService.font.TextViewEuphemiaUCASRegular;

import org.json.JSONException;
import org.json.JSONObject;

<<<<<<< HEAD
>>>>>>> 2/22/2019
=======
>>>>>>> 2/23/2019
import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;


/**
 * Created by ketan patel on 2/2/2019.
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
 */

public class BankDetailsActivity extends BaseActivity implements View.OnClickListener {

<<<<<<< HEAD
<<<<<<< HEAD
    @Bind(R.id.top_back)
    ImageView top_back;
    @Bind(R.id.top_title)
    TextViewEuphemiaUCASRegular top_title;

    @Bind(R.id.bank_details_tv_addNew)
    TextViewEuphemiaUCASRegular bank_details_tv_addNew;


    @Bind(R.id.bank_details_listview)
    ListView bank_details_listview;
=======
=======
>>>>>>> 2/23/2019
    @Bind(R.id.top_back)ImageView top_back;
    @Bind(R.id.top_title) TextViewEuphemiaUCASRegular top_title;

    @Bind(R.id.bank_details_tv_addNew) TextViewEuphemiaUCASRegular bank_details_tv_addNew;
    @Bind(R.id.bank_details_listview) ListView bank_details_listview;
<<<<<<< HEAD
>>>>>>> 2/22/2019
=======
>>>>>>> 2/23/2019



    private KaikiliApplication application;
    private SharedPreferences preferences;
    private BankDetailListAdapter adapter;
<<<<<<< HEAD
<<<<<<< HEAD

=======
    private String SP_ID = "SP00001";
>>>>>>> 2/22/2019
=======
>>>>>>> 2/23/2019

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_bank_details );
        ButterKnife.bind( this, this );

        application = (KaikiliApplication) getApplicationContext();
        preferences = application.getSharedPreferences();

        top_title.setText( "Bank Details" );

        top_back.setOnClickListener( this );
        bank_details_tv_addNew.setOnClickListener( this );
        adapter = new BankDetailListAdapter( this );
        bank_details_listview.setAdapter( adapter );
<<<<<<< HEAD
<<<<<<< HEAD

        ArrayList<String> datalist =new ArrayList<>(  );
        datalist.add( "" );
        datalist.add( "" );
        datalist.add( "" );
        datalist.add( "" );
        datalist.add( "" );
        datalist.add( "" );

        adapter.setList(datalist);

    }
=======
      }
>>>>>>> 2/22/2019
=======
      }
>>>>>>> 2/23/2019



    @Override
    public void onClick(View view) {

        if (view == top_back) {
            finish();
        } else if (view == bank_details_tv_addNew) {
            Intent intent = new Intent( this,AddBankDetailsActivity.class );
            startActivity( intent );
        }
    }
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 2/23/2019

    @Override
    protected void onResume() {
        new GetAllBankInfoListTask(this).execute();
        super.onResume();
    }

    public class GetAllBankInfoListTask extends AsyncTask<Void, Void, String> {

        private ProgressDialog mDialog = null;
        private Activity mActivity;


        public GetAllBankInfoListTask(Activity activity) {
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
<<<<<<< HEAD
                jsonObject.put( "sp_id", SP_ID);
=======
                jsonObject.put( "sp_id",  preferences.getString( "sp_id",""));
>>>>>>> 2/23/2019
                Log.e( "--------------Post", jsonObject.toString() );
                String response = new WebUtil().postMethod( jsonObject.toString(), WebApi.URL_USER_BANK_INFO_LIST );
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
            GetAllBankInfoAPI apiresponse = gson.fromJson( response, GetAllBankInfoAPI.class );

            if (apiresponse.getData().size() >0 ) {
                adapter.setList(apiresponse.getData());
            } else {
                Toast.makeText( mActivity, apiresponse.getMessage(), Toast.LENGTH_SHORT ).show();
            }
        }
    }
<<<<<<< HEAD
>>>>>>> 2/22/2019
=======
>>>>>>> 2/23/2019
}
