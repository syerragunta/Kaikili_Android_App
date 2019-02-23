package com.sit.kaikiliService.activity;

<<<<<<< HEAD
<<<<<<< HEAD
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import android.widget.ListView;

import com.sit.kaikiliService.KetanApplication;
import com.sit.kaikiliService.R;
import com.sit.kaikiliService.adapter.AddServiceListAdapter;
=======

import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
>>>>>>> 2/1/2019
=======

import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
>>>>>>> 2/2/2019
=======

import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
>>>>>>> 2/9/2019
=======

import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
>>>>>>> 2/14/2019
=======

import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
>>>>>>> 2/15/2019
=======

import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
>>>>>>> 2/16/2019
=======

import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
>>>>>>> 2/16/2019 V1
=======

import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
>>>>>>> 2/16/2019 V2
import com.sit.kaikiliService.adapter.ServiceInfoItemAdapter;
import com.sit.kaikiliService.comman.WithoutScrollListView;
import com.sit.kaikiliService.font.TextViewEuphemiaUCASRegular;
import com.sit.kaikiliService.model.ServiceInfoModel;

=======
=======
>>>>>>> 2/18/2019
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
import com.sit.kaikiliService.adapter.ServiceInfoItemAdapter;
import com.sit.kaikiliService.api.Apiresponse;
import com.sit.kaikiliService.api.ScheduledTSApi;
import com.sit.kaikiliService.api.TransitionServiceData;
import com.sit.kaikiliService.api.WebApi;
import com.sit.kaikiliService.api.WebUtil;
import com.sit.kaikiliService.comman.CircularImageView;
import com.sit.kaikiliService.comman.WithoutScrollListView;
import com.sit.kaikiliService.font.TextViewEuphemiaUCASBola;
import com.sit.kaikiliService.font.TextViewEuphemiaUCASRegular;
import com.sit.kaikiliService.model.ServiceInfoModel;

import org.json.JSONException;
import org.json.JSONObject;

<<<<<<< HEAD
>>>>>>> 2/16/2019
=======
>>>>>>> 2/18/2019
import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;


/**
 * Created by ketan patel on 31/1/2019.
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
 */

public class ServiceInfoActivity extends BaseActivity implements View.OnClickListener {

<<<<<<< HEAD
<<<<<<< HEAD
    @Bind(R.id.top_back)
    ImageView top_back;
    @Bind(R.id.top_title)
    TextViewEuphemiaUCASRegular top_title;
    @Bind(R.id.service_info_listView)
    WithoutScrollListView service_info_listView;

<<<<<<< HEAD
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
=======
    private KaikiliApplication application;
>>>>>>> 2/16/2019 V2
    private SharedPreferences preferences;
    private ServiceInfoItemAdapter adapter;
    private ArrayList<ServiceInfoModel> serviceInfoList;
=======
=======
>>>>>>> 2/18/2019
    @Bind(R.id.top_back) ImageView top_back;
    @Bind(R.id.top_title) TextViewEuphemiaUCASRegular top_title;
    @Bind(R.id.service_info_listView) WithoutScrollListView service_info_listView;

    @Bind( R.id.service_info_tv_userName ) TextViewEuphemiaUCASRegular service_info_tv_userName;
    @Bind( R.id.service_info_tv_address ) TextViewEuphemiaUCASRegular service_info_tv_address;
    @Bind( R.id.service_info_tv_data ) TextViewEuphemiaUCASRegular service_info_tv_data;
    @Bind( R.id.service_info_civ_profile ) CircularImageView service_info_civ_profile;
    @Bind( R.id.service_info_tv_serviceName ) TextViewEuphemiaUCASBola service_info_tv_serviceName;
    @Bind( R.id.service_info_tv_total ) TextViewEuphemiaUCASBola service_info_tv_total;
    @Bind( R.id.service_info_tv_onTheWay ) TextViewEuphemiaUCASRegular service_info_tv_onTheWay;
    @Bind( R.id.service_info_tv_completed ) TextViewEuphemiaUCASRegular service_info_tv_completed;
    @Bind( R.id.service_info_tv_Accept ) TextViewEuphemiaUCASRegular service_info_tv_Accept;
    @Bind( R.id.service_info_tv_reschedule ) TextViewEuphemiaUCASRegular service_info_tv_reschedule;
    @Bind( R.id.service_info_tv_cancel ) TextViewEuphemiaUCASRegular service_info_tv_cancel;
    @Bind( R.id.service_info_tv_review) TextViewEuphemiaUCASRegular service_info_tv_review;



    private KaikiliApplication application;
    private SharedPreferences preferences;
    private ServiceInfoItemAdapter adapter;
    private ArrayList<ServiceInfoModel> serviceInfoList;
    private TransitionServiceData transitionServiceData;
<<<<<<< HEAD
>>>>>>> 2/16/2019
=======
>>>>>>> 2/18/2019


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_service_info );
        ButterKnife.bind( this, this );

<<<<<<< HEAD
<<<<<<< HEAD
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

=======
=======
>>>>>>> 2/18/2019
        application = (KaikiliApplication) getApplicationContext();
        preferences = application.getSharedPreferences();

        transitionServiceData = (TransitionServiceData) getIntent().getSerializableExtra( "data" );

<<<<<<< HEAD
>>>>>>> 2/16/2019
=======
>>>>>>> 2/18/2019
        top_title.setText( "Service Detail" );
        top_back.setOnClickListener( this );

        adapter = new ServiceInfoItemAdapter( this );
        service_info_listView.setAdapter( adapter );

<<<<<<< HEAD
<<<<<<< HEAD
        serviceInfoList = new ArrayList<>();
        ServiceInfoModel model = new ServiceInfoModel();
        model.setName( "Int Wall Painting 2500/$0.25" );
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        model.setAmount( "625.00" );
=======
        model.setAmount( "65.00" );
>>>>>>> 2/1/2019
=======
        model.setAmount( "65.00" );
>>>>>>> 2/2/2019
=======
        model.setAmount( "65.00" );
>>>>>>> 2/9/2019
=======
        model.setAmount( "65.00" );
>>>>>>> 2/14/2019
=======
        model.setAmount( "65.00" );
>>>>>>> 2/15/2019
=======
        model.setAmount( "65.00" );
>>>>>>> 2/16/2019
=======
        model.setAmount( "65.00" );
>>>>>>> 2/16/2019 V1
=======
        model.setAmount( "65.00" );
>>>>>>> 2/16/2019 V2
        serviceInfoList.add( model );

        ServiceInfoModel model1 = new ServiceInfoModel();
        model1.setName( "Number of Doors 6@$10" );
        model1.setAmount( "60.00" );
        serviceInfoList.add( model1 );

        ServiceInfoModel model2 = new ServiceInfoModel();
        model2.setName( "Number of Windows 10@$5" );
        model2.setAmount( "50.00" );
        serviceInfoList.add( model2 );

        ServiceInfoModel model3 = new ServiceInfoModel();
        model3.setName( "Number of Closet 8@10" );
        model3.setAmount( "80.00" );
        serviceInfoList.add( model3 );

        ServiceInfoModel model4 = new ServiceInfoModel();
        model4.setName( "Top Trim Sq Footage 1000@$0.1" );
        model4.setAmount( "100.00" );
        serviceInfoList.add( model4 );

        ServiceInfoModel model5 = new ServiceInfoModel();
        model5.setName( "Bottom Trim Sq Footage1000@$0.1" );
        model5.setAmount( "100.00" );
        serviceInfoList.add( model5 );

        adapter.setList( serviceInfoList );

=======
=======
>>>>>>> 2/18/2019
        service_info_tv_userName.setText(transitionServiceData.getCust_first_name()+" "+transitionServiceData.getCust_last_name() );
        service_info_tv_serviceName.setText(transitionServiceData.getSr_title());
        service_info_tv_address.setText( "Address :"+transitionServiceData.getAddress());
        service_info_tv_data.setText( "Data :"+transitionServiceData.getDate()+" "+transitionServiceData.getTime());
        service_info_tv_total.setText( "$"+transitionServiceData.getSr_total());

        serviceInfoList = new ArrayList<>();
        for (int i =0;i<transitionServiceData.getCost_comps_per_item().size();i++){
            ServiceInfoModel model = new ServiceInfoModel();
            model.setName( transitionServiceData.getCost_comps_per_item().get(i).getCc_title() );
            model.setAmount(transitionServiceData.getCost_comps_per_item().get(i).getCc_rate_per_item());
            serviceInfoList.add( model );
        }
         adapter.setList( serviceInfoList );



        setButtoneUI();


        service_info_tv_Accept.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new GetServiceDataTask(ServiceInfoActivity.this,"Scheduled").execute( );
            }
        } );

        service_info_tv_reschedule.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new GetServiceDataTask(ServiceInfoActivity.this,"Rescheduled").execute( );
            }
        } );

        service_info_tv_cancel.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new GetServiceDataTask(ServiceInfoActivity.this,"Cancel").execute( );
            }
        } );

        service_info_tv_onTheWay.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new GetServiceDataTask(ServiceInfoActivity.this,"Progress").execute( );
            }
        } );

        service_info_tv_completed.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new GetServiceDataTask(ServiceInfoActivity.this,"Completed").execute( );
            }
        } );

        service_info_tv_review.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new GetServiceDataTask(ServiceInfoActivity.this,"Review").execute( );
            }
        } );

   }

    private void setButtoneUI() {
        if(transitionServiceData.getSr_status().equalsIgnoreCase( "Open" )){
            service_info_tv_Accept.setVisibility( View.VISIBLE );
            service_info_tv_reschedule.setVisibility( View.VISIBLE );
            service_info_tv_cancel.setVisibility( View.VISIBLE );
            service_info_tv_onTheWay.setVisibility( View.GONE );
            service_info_tv_completed.setVisibility( View.GONE );
            service_info_tv_review.setVisibility( View.GONE );

        }else if(transitionServiceData.getSr_status().equalsIgnoreCase( "Rescheduled" )){

            service_info_tv_Accept.setVisibility( View.GONE );
            service_info_tv_reschedule.setVisibility( View.GONE );
            service_info_tv_cancel.setVisibility( View.VISIBLE );
            service_info_tv_onTheWay.setVisibility( View.VISIBLE );
            service_info_tv_completed.setVisibility( View.GONE );
            service_info_tv_review.setVisibility( View.GONE );

        }else if(transitionServiceData.getSr_status().equalsIgnoreCase( "Scheduled" )){

            service_info_tv_Accept.setVisibility( View.GONE );
            service_info_tv_reschedule.setVisibility( View.GONE );
            service_info_tv_cancel.setVisibility( View.VISIBLE );
            service_info_tv_onTheWay.setVisibility( View.VISIBLE );
            service_info_tv_completed.setVisibility( View.GONE );
            service_info_tv_review.setVisibility( View.GONE );

        }else if(transitionServiceData.getSr_status().equalsIgnoreCase( "Progress" )){

            service_info_tv_Accept.setVisibility( View.GONE );
            service_info_tv_reschedule.setVisibility( View.GONE );
            service_info_tv_cancel.setVisibility( View.GONE );
            service_info_tv_onTheWay.setVisibility( View.GONE );
            service_info_tv_review.setVisibility( View.GONE );
            service_info_tv_completed.setVisibility( View.VISIBLE );

        }else if(transitionServiceData.getSr_status().equalsIgnoreCase( "Completed" )){

            service_info_tv_Accept.setVisibility( View.GONE );
            service_info_tv_reschedule.setVisibility( View.GONE );
            service_info_tv_cancel.setVisibility( View.GONE );
            service_info_tv_onTheWay.setVisibility( View.GONE );
            service_info_tv_completed.setVisibility( View.GONE );
            service_info_tv_review.setVisibility( View.VISIBLE );
        }



    }


    public class GetServiceDataTask extends AsyncTask<Void, Void, String> {

        private ProgressDialog mDialog = null;
        private Activity mActivity;
        private String status;


        public GetServiceDataTask(Activity activity,String status) {
            this.mActivity = activity;
            this.status = status;

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
                jsonObject.put( "tran_id", transitionServiceData.getTran_id() );
                jsonObject.put( "sr_status", status );
                Log.e( "--------------Post", jsonObject.toString() );
                String response = new WebUtil().postMethod( jsonObject.toString(), WebApi.URL_TRANSITION_UPDATE );
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
            Apiresponse targetData = gson.fromJson( response, Apiresponse.class );

            if (targetData.getStatus() == 1) {
                Toast.makeText( mActivity,targetData.getMessage(),Toast.LENGTH_SHORT ).show();
                transitionServiceData.setSr_status(status);
                setButtoneUI();
            } else {
                Toast.makeText( mActivity,targetData.getMessage(),Toast.LENGTH_SHORT ).show();
            }
        }
<<<<<<< HEAD
>>>>>>> 2/16/2019
=======
>>>>>>> 2/18/2019
    }


    @Override
    public void onClick(View view) {

        if (view == top_back) {
            finish();

        }
    }
}
