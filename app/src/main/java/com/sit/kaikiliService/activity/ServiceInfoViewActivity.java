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
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.Toast;

import com.google.gson.Gson;
import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
import com.sit.kaikiliService.adapter.ServiceInfoItemAdapter;
import com.sit.kaikiliService.api.Apiresponse;
import com.sit.kaikiliService.api.ScheduledTSApi;
import com.sit.kaikiliService.api.ScheduledTSDataApi;
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
 * Created by ketan patel on 31/1/2019.
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
 */

public class ServiceInfoViewActivity extends BaseActivity implements View.OnClickListener {

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

    @Bind( R.id.service_info_ll_discount)LinearLayout service_info_ll_discount;
    @Bind( R.id.service_info_ll_kaikili)LinearLayout service_info_ll_kaikili;
    @Bind( R.id.service_info_ll_netPay)LinearLayout service_info_ll_netPay;
    @Bind( R.id.service_info_tv_discount)TextViewEuphemiaUCASRegular service_info_tv_discount;
    @Bind( R.id.service_info_tv_kaikili)TextViewEuphemiaUCASRegular service_info_tv_kaikili;
    @Bind( R.id.service_info_tv_natPay)TextViewEuphemiaUCASBola service_info_tv_natPay;



    private KaikiliApplication application;
    private SharedPreferences preferences;
    private ServiceInfoItemAdapter adapter;
    private ArrayList<ServiceInfoModel> serviceInfoList;
    private TransitionServiceData transitionServiceData;
    private String tranId;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_service_info );
        ButterKnife.bind( this, this );

        application = (KaikiliApplication) getApplicationContext();
        preferences = application.getSharedPreferences();

        tranId = getIntent().getStringExtra( "tran_id" );

        top_title.setText( "Service Detail" );
        top_back.setOnClickListener( this );

        adapter = new ServiceInfoItemAdapter( this );
        service_info_listView.setAdapter( adapter );


        new GetServiceDataTask(this).execute();
   }

    private void SetData() {
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


        service_info_ll_discount.setVisibility( View.VISIBLE );
        service_info_ll_netPay.setVisibility( View.VISIBLE );
        service_info_ll_kaikili.setVisibility( View.VISIBLE );


        service_info_tv_discount.setText( transitionServiceData.getDiscount().getDs_rate_per_item() );
        service_info_tv_kaikili.setText( transitionServiceData.getKaikili_commission().getKk_rate_per_item() );
        service_info_tv_natPay.setText( transitionServiceData.getSp_net_pay());

        setButtoneUI();

    }

    private void setButtoneUI() {
            service_info_tv_Accept.setVisibility( View.GONE );
            service_info_tv_reschedule.setVisibility( View.GONE );
            service_info_tv_cancel.setVisibility( View.GONE );
            service_info_tv_onTheWay.setVisibility( View.GONE );
            service_info_tv_completed.setVisibility( View.GONE );
            service_info_tv_review.setVisibility( View.GONE );
    }



    @Override
    public void onClick(View view) {

        if (view == top_back) {
            finish();

        }
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
                jsonObject.put( "tran_id", tranId );
                Log.e( "--------------Post", jsonObject.toString() );
                String response = new WebUtil().postMethod( jsonObject.toString(), WebApi.URL_SINGLE_TRANSITION );
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
            ScheduledTSDataApi targetData = gson.fromJson( response, ScheduledTSDataApi.class );


            if (targetData.getData() != null) {
                transitionServiceData = targetData.getData();
                SetData();

            } else {
                Toast.makeText( mActivity, targetData.getMessage(), Toast.LENGTH_SHORT ).show();
            }
        }
    }


}
