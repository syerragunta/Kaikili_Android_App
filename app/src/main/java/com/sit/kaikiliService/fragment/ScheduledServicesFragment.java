package com.sit.kaikiliService.fragment;

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
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.sit.kaikiliService.R;
import com.sit.kaikiliService.adapter.ServiceListAdapter;
import com.sit.kaikiliService.model.ServiceModel;
import java.util.ArrayList;
import butterknife.Bind;
import butterknife.ButterKnife;


/**
 * Created by ketan patel on 30/1/2019.
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
 */

public class ScheduledServicesFragment extends BaseFragment {


    @Bind(R.id.scheduled_services_fgm_recyclerView )RecyclerView scheduled_services_fgm_recyclerView;

    private ServiceListAdapter adapter;
    private ArrayList<ServiceModel> serviceDataList;
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 1/30/2019
=======
>>>>>>> 1/31/2019
=======
>>>>>>> 2/1/2019

    public ScheduledServicesFragment() {
        // Required empty public constructor
    }


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

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
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
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
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
        final View rootView = inflater.inflate(R.layout.fragment_scheduled_services, container, false);
     //   initToolbar();
        ButterKnife.bind( this, rootView );

<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 1/30/2019
=======
>>>>>>> 1/31/2019
=======
>>>>>>> 2/1/2019
        initComponents(rootView);
        return rootView;
    }

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

    @Override
    public void initComponents(View rootView) {

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 1/31/2019
=======
>>>>>>> 2/1/2019
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
>>>>>>> 1/30/2019
=======
>>>>>>> 1/31/2019
=======
>>>>>>> 2/1/2019
    }

}
