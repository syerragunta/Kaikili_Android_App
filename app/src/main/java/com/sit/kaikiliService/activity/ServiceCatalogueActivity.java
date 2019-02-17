package com.sit.kaikiliService.activity;

<<<<<<< HEAD
import android.content.SharedPreferences;
import android.os.Bundle;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import android.text.Editable;
import android.text.TextWatcher;
=======
>>>>>>> 2/1/2019
=======
>>>>>>> 2/2/2019
=======
>>>>>>> 2/9/2019
=======
>>>>>>> 2/14/2019
=======
>>>>>>> 2/15/2019
=======
>>>>>>> 2/16/2019
=======
>>>>>>> 2/16/2019 V1
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import com.sit.kaikiliService.KetanApplication;
import com.sit.kaikiliService.R;
import com.sit.kaikiliService.adapter.AddServiceListAdapter;
import com.sit.kaikiliService.adapter.ServiceCatalogueListAdapter;
import com.sit.kaikiliService.comman.WithoutScrollListView;
import com.sit.kaikiliService.font.EditTextEupheminUCASRegular;
=======
import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
import com.sit.kaikiliService.adapter.ServiceCatalogueListAdapter;
>>>>>>> 2/1/2019
=======
import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
import com.sit.kaikiliService.adapter.ServiceCatalogueListAdapter;
>>>>>>> 2/2/2019
=======
import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
import com.sit.kaikiliService.adapter.ServiceCatalogueListAdapter;
>>>>>>> 2/9/2019
=======
import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
import com.sit.kaikiliService.adapter.ServiceCatalogueListAdapter;
>>>>>>> 2/14/2019
=======
import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
import com.sit.kaikiliService.adapter.ServiceCatalogueListAdapter;
>>>>>>> 2/15/2019
=======
import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
import com.sit.kaikiliService.adapter.ServiceCatalogueListAdapter;
>>>>>>> 2/16/2019
=======
import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
import com.sit.kaikiliService.adapter.ServiceCatalogueListAdapter;
>>>>>>> 2/16/2019 V1
import com.sit.kaikiliService.font.TextViewEuphemiaUCASRegular;

=======
import android.app.Activity;
import android.app.ProgressDialog;
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
import com.sit.kaikiliService.adapter.ServiceCatalogueListAdapter;
import com.sit.kaikiliService.api.ServiceInfo;
import com.sit.kaikiliService.api.UserServiceGetAPI;
import com.sit.kaikiliService.api.WebApi;
import com.sit.kaikiliService.api.WebUtil;
import com.sit.kaikiliService.font.TextViewEuphemiaUCASRegular;

import org.json.JSONException;
import org.json.JSONObject;

>>>>>>> 2/16/2019 V2
import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;


/**
 * Created by ketan patel on 28/1/2019.
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
 */

public class ServiceCatalogueActivity extends BaseActivity implements View.OnClickListener {
<<<<<<< HEAD

    @Bind(R.id.top_back) ImageView top_back;
    @Bind(R.id.top_title) TextViewEuphemiaUCASRegular top_title;

    @Bind(R.id.service_catalogue_listView) ListView service_catalogue_listView;





<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    private KetanApplication application;
=======
    private KaikiliApplication application;
>>>>>>> 2/1/2019
=======
    private KaikiliApplication application;
>>>>>>> 2/2/2019
=======
    private KaikiliApplication application;
>>>>>>> 2/9/2019
=======
    private KaikiliApplication application;
>>>>>>> 2/14/2019
=======
    private KaikiliApplication application;
>>>>>>> 2/15/2019
=======
    private KaikiliApplication application;
>>>>>>> 2/16/2019
=======
    private KaikiliApplication application;
>>>>>>> 2/16/2019 V1
    private SharedPreferences preferences;
    private ArrayList<String> serviceList;
    private ServiceCatalogueListAdapter adapter;


=======
    @Bind(R.id.top_back)
    ImageView top_back;
    @Bind(R.id.top_title)
    TextViewEuphemiaUCASRegular top_title;
    @Bind(R.id.service_catalogue_listView)
    ListView service_catalogue_listView;


    private KaikiliApplication application;
    private SharedPreferences preferences;
    private ArrayList<ServiceInfo> serviceList;
    private ServiceCatalogueListAdapter adapter;

    private String SP_ID = "SP00001";
>>>>>>> 2/16/2019 V2


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_srevice_catalogue );
        ButterKnife.bind( this, this );

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        application = (KetanApplication) getApplicationContext();
=======
        application = (KaikiliApplication) getApplicationContext();
>>>>>>> 2/1/2019
=======
        application = (KaikiliApplication) getApplicationContext();
>>>>>>> 2/2/2019
=======
        application = (KaikiliApplication) getApplicationContext();
>>>>>>> 2/9/2019
=======
        application = (KaikiliApplication) getApplicationContext();
>>>>>>> 2/14/2019
=======
        application = (KaikiliApplication) getApplicationContext();
>>>>>>> 2/15/2019
=======
        application = (KaikiliApplication) getApplicationContext();
>>>>>>> 2/16/2019
=======
        application = (KaikiliApplication) getApplicationContext();
>>>>>>> 2/16/2019 V1
=======
        application = (KaikiliApplication) getApplicationContext();
>>>>>>> 2/16/2019 V2
        preferences = application.getSharedPreferences();

        top_title.setText( "Service Catalogue" );
        top_back.setOnClickListener( this );


        serviceList = new ArrayList<>();
<<<<<<< HEAD
        serviceList.add("TV Mount Installation");
        serviceList.add("Carpet Cleaning");
        serviceList.add("Lawn Mowing");
        serviceList.add("Dishwasher Installation");
        serviceList.add("Interior Painting");
        serviceList.add("Water Heater Installation");
        serviceList.add("Fireplace Cleaning");
        serviceList.add("Moving Service");


        adapter = new ServiceCatalogueListAdapter( this );
        service_catalogue_listView.setAdapter(adapter);
        adapter.setList(serviceList);

    }


=======
        adapter = new ServiceCatalogueListAdapter( this );
        service_catalogue_listView.setAdapter( adapter );



    }

    @Override
    protected void onResume() {
        super.onResume();
        new GetServiceCatalogueTask(this).execute();
    }
>>>>>>> 2/16/2019 V2

    @Override
    public void onClick(View view) {

        if (view == top_back) {
            finish();

        }
    }
<<<<<<< HEAD
=======


    public class GetServiceCatalogueTask extends AsyncTask<Void, Void, String> {

        private ProgressDialog mDialog = null;
        private Activity mActivity;


        public GetServiceCatalogueTask(Activity activity) {
            mActivity = activity;

            // TODO Auto-generated constructor stub
        }

        @Override
        protected void onPreExecute() {
            // TODO Auto-generated method stub
            super.onPreExecute();

            mDialog = ProgressDialog.show( mActivity, null, "please_wait.....", true, true );
            mDialog.getWindow().clearFlags( WindowManager.LayoutParams.FLAG_DIM_BEHIND );
            mDialog.setCanceledOnTouchOutside( false );
        }

        @Override
        protected String doInBackground(Void... params) {
            // TODO Auto-generated method stub
            try {
                JSONObject jsonObject = new JSONObject();
                jsonObject.put( "sp_id", SP_ID );
                Log.e( "--------------Post", jsonObject.toString() );
                String response = new WebUtil().postMethod( jsonObject.toString(), WebApi.URL_USER_SERVICE_CATALOG );
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
            UserServiceGetAPI target2 = gson.fromJson( response, UserServiceGetAPI.class );

            if (target2.getData().size() > 0) {
                serviceList = target2.getData();
                adapter.setList( serviceList );
            } else {
                Toast.makeText( mActivity,"No Server are added in user.",Toast.LENGTH_SHORT ).show();
            }


        }


    }
>>>>>>> 2/16/2019 V2
}
