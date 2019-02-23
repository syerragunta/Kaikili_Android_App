package com.sit.kaikiliService.fragment;

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
<<<<<<< HEAD
<<<<<<< HEAD
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sit.kaikiliService.R;
import com.sit.kaikiliService.activity.HomeScreenActivity;


public class ScheduledServicesFragment extends BaseFragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

=======
=======
>>>>>>> 1/31/2019
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
=======
>>>>>>> 2/16/2019 V2
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.sit.kaikiliService.R;
import com.sit.kaikiliService.adapter.ServiceListAdapter;
import com.sit.kaikiliService.model.ServiceModel;
=======
=======
>>>>>>> 2/18/2019
import android.app.Activity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Toast;

import com.google.gson.Gson;
import com.sit.kaikiliService.R;
import com.sit.kaikiliService.adapter.ToDoServiceListAdapter;
import com.sit.kaikiliService.api.ScheduledTSApi;
import com.sit.kaikiliService.api.TransitionServiceData;
import com.sit.kaikiliService.api.WebApi;
import com.sit.kaikiliService.api.WebUtil;
import com.sit.kaikiliService.comman.WithoutScrollListView;

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
 * Created by ketan patel on 30/1/2019.
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
 */

public class ScheduledServicesFragment extends BaseFragment {


<<<<<<< HEAD
<<<<<<< HEAD
    @Bind(R.id.scheduled_services_fgm_recyclerView )RecyclerView scheduled_services_fgm_recyclerView;

    private ServiceListAdapter adapter;
    private ArrayList<ServiceModel> serviceDataList;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 1/30/2019
=======
>>>>>>> 1/31/2019
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
=======
>>>>>>> 2/16/2019 V2
=======
=======
>>>>>>> 2/18/2019
    @Bind(R.id.scheduled_services_lv_scheduleServices)WithoutScrollListView scheduled_services_lv_scheduleServices;
    @Bind(R.id.scheduled_services_lv_toDo)WithoutScrollListView scheduled_services_lv_toDo;

    private ToDoServiceListAdapter todoAdapter;
    private ToDoServiceListAdapter scheduledAdapter;
    private ArrayList<TransitionServiceData> todoServiceDataList;
    private ArrayList<TransitionServiceData> scheduledServiceDataList;

    private String SP_ID = "SP00001";

<<<<<<< HEAD
>>>>>>> 2/16/2019
=======
>>>>>>> 2/18/2019

    public ScheduledServicesFragment() {
        // Required empty public constructor
    }


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
<<<<<<< HEAD
<<<<<<< HEAD
    // TODO: Rename and change types and number of parameters
    public static ScheduledServicesFragment newInstance(String param1, String param2) {
        ScheduledServicesFragment fragment = new ScheduledServicesFragment();
        Bundle args = new Bundle();
        args.putString( ARG_PARAM1, param1 );
        args.putString( ARG_PARAM2, param2 );
        fragment.setArguments( args );
        return fragment;
    }
=======
>>>>>>> 1/30/2019
=======
>>>>>>> 1/31/2019
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
=======
>>>>>>> 2/16/2019 V2
=======
>>>>>>> 2/16/2019
=======
>>>>>>> 2/18/2019

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
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
<<<<<<< HEAD
<<<<<<< HEAD
        if (getArguments() != null) {
            mParam1 = getArguments().getString( ARG_PARAM1 );
            mParam2 = getArguments().getString( ARG_PARAM2 );
        }
=======

>>>>>>> 1/30/2019
=======

>>>>>>> 1/31/2019
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
=======

>>>>>>> 2/16/2019 V2
=======

>>>>>>> 2/16/2019
=======

>>>>>>> 2/18/2019
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
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
<<<<<<< HEAD
<<<<<<< HEAD
        final View rootView = inflater.inflate(R.layout.fragment_earnings, container, false);
     //   initToolbar();
=======
=======
>>>>>>> 1/31/2019
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
=======
>>>>>>> 2/16/2019 V2
        final View rootView = inflater.inflate(R.layout.fragment_scheduled_services, container, false);
     //   initToolbar();
        ButterKnife.bind( this, rootView );

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 1/30/2019
=======
>>>>>>> 1/31/2019
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
=======
>>>>>>> 2/16/2019 V2
=======
        final View rootView = inflater.inflate(R.layout.fragment_scheduled_services, container, false);
     //   initToolbar();
        ButterKnife.bind( this, rootView );
>>>>>>> 2/16/2019
=======
        final View rootView = inflater.inflate(R.layout.fragment_scheduled_services, container, false);
     //   initToolbar();
        ButterKnife.bind( this, rootView );
>>>>>>> 2/18/2019
        initComponents(rootView);
        return rootView;
    }

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
<<<<<<< HEAD
<<<<<<< HEAD
    public void initToolbar() {
        ((HomeScreenActivity) getActivity()).setUpToolbar("Scheduled Service");

    }
=======
>>>>>>> 1/30/2019
=======
>>>>>>> 1/31/2019
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
=======
>>>>>>> 2/16/2019 V2
=======
>>>>>>> 2/16/2019
=======
>>>>>>> 2/18/2019

    @Override
    public void initComponents(View rootView) {

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
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 1/31/2019
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
=======
>>>>>>> 2/16/2019 V2
        LinearLayoutManager mLayoutManager = new LinearLayoutManager( getActivity() );
        adapter = new ServiceListAdapter( getActivity());
        scheduled_services_fgm_recyclerView.setLayoutManager( mLayoutManager );
        scheduled_services_fgm_recyclerView.setAdapter( adapter );

        serviceDataList = new ArrayList<>();
        ServiceModel model = new ServiceModel();
        model.setServiceId("1" );
        model.setServiceName( "TV Mount Installation" );
        model.setServiceTime( "01/10/2019 10 AM to 12 PM" );
        serviceDataList.add(model);
        model.setServiceId("2" );
        model.setServiceName( "Interior Painting" );
        model.setServiceTime( "01/11/2019 10 AM to 12 PM" );
        serviceDataList.add(model);
        model.setServiceId("3" );
        model.setServiceName( "Lawn Mowing" );
        model.setServiceTime( "01/11/2019 2 PM to 4 PM" );
        serviceDataList.add(model);
        model.setServiceId("4" );
        model.setServiceName( "Dishwasher Installation" );
        model.setServiceTime( "01/12/2019 10 AM to 12 PM" );
        serviceDataList.add(model);
        model.setServiceId("5" );
        model.setServiceName( "Carpet Cleaning" );
        model.setServiceTime( "01/12/2019 10 AM to 12 PM" );
        serviceDataList.add(model);
        adapter.setList( serviceDataList );

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 1/30/2019
=======
>>>>>>> 1/31/2019
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
=======
>>>>>>> 2/16/2019 V2
    }

=======
=======
>>>>>>> 2/18/2019
        todoServiceDataList = new ArrayList<>();
        scheduledServiceDataList = new ArrayList<>();

        todoAdapter = new ToDoServiceListAdapter(getActivity());
        scheduledAdapter = new ToDoServiceListAdapter(getActivity());


        scheduled_services_lv_toDo.setAdapter(todoAdapter);
        scheduled_services_lv_scheduleServices.setAdapter(scheduledAdapter);


    }

    @Override
    public void onResume() {
        new GetServiceDataTask( getActivity() ).execute( );
        super.onResume();
    }

    public class GetServiceDataTask extends AsyncTask<Void, Void, String> {

        private ProgressDialog mDialog = null;
        private Activity mActivity;


        public GetServiceDataTask(Activity activity) {
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
                jsonObject.put( "sp_id", SP_ID );
                Log.e( "--------------Post", jsonObject.toString() );
                String response = new WebUtil().postMethod( jsonObject.toString(), WebApi.URL_GET_SCHEDULED_SERVICE );
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
                scheduledServiceDataList = new ArrayList<>();

               for (int i = 0; i < targetData.getData().size();i++){
                   if(targetData.getData().get(i).getSr_status().equalsIgnoreCase( "Open" ) ||
                           targetData.getData().get(i).getSr_status().equalsIgnoreCase( "Reschedule" )){
                       todoServiceDataList.add(targetData.getData().get(i));
                   }else {
                       scheduledServiceDataList.add(targetData.getData().get(i));
                   }
               }

                todoAdapter.setList(todoServiceDataList);
                scheduledAdapter.setList(scheduledServiceDataList);


            } else {
                Toast.makeText( mActivity,targetData.getMessage(),Toast.LENGTH_SHORT ).show();
            }


        }


    }
<<<<<<< HEAD
>>>>>>> 2/16/2019
=======
>>>>>>> 2/18/2019
}
