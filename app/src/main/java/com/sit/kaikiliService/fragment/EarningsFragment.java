package com.sit.kaikiliService.fragment;

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
import com.sit.kaikiliService.activity.BaseActivity;
import com.sit.kaikiliService.activity.HomeScreenActivity;

public class EarningsFragment extends BaseFragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

=======
=======
import android.content.Intent;
>>>>>>> 1/31/2019
=======
import android.content.Intent;
>>>>>>> 2/1/2019
=======
import android.content.Intent;
>>>>>>> 2/2/2019
=======
import android.content.Intent;
>>>>>>> 2/9/2019
=======
import android.content.Intent;
>>>>>>> 2/14/2019
=======
import android.content.Intent;
>>>>>>> 2/15/2019
=======
import android.content.Intent;
>>>>>>> 2/16/2019
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.sit.kaikiliService.R;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
import com.sit.kaikiliService.activity.CashOutActivity;
>>>>>>> 1/31/2019
=======
import com.sit.kaikiliService.activity.CashOutActivity;
>>>>>>> 2/1/2019
=======
import com.sit.kaikiliService.activity.CashOutActivity;
>>>>>>> 2/2/2019
=======
import com.sit.kaikiliService.activity.CashOutActivity;
>>>>>>> 2/9/2019
=======
import com.sit.kaikiliService.activity.CashOutActivity;
>>>>>>> 2/14/2019
=======
import com.sit.kaikiliService.activity.CashOutActivity;
>>>>>>> 2/15/2019
=======
import com.sit.kaikiliService.activity.CashOutActivity;
>>>>>>> 2/16/2019
import com.sit.kaikiliService.adapter.EarningsListAdapter;
import com.sit.kaikiliService.font.TextViewEuphemiaUCASRegular;
import com.sit.kaikiliService.model.EarningsModel;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD

=======
import butterknife.OnClick;
>>>>>>> 1/31/2019
=======
import butterknife.OnClick;
>>>>>>> 2/1/2019
=======
import butterknife.OnClick;
>>>>>>> 2/2/2019
=======
import butterknife.OnClick;
>>>>>>> 2/9/2019
=======
import butterknife.OnClick;
>>>>>>> 2/14/2019
=======
import butterknife.OnClick;
>>>>>>> 2/15/2019
=======
import butterknife.OnClick;
>>>>>>> 2/16/2019


/**
 * Created by ketan patel on 30/1/2019.
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
 */

public class EarningsFragment extends BaseFragment {


    @Bind(R.id.fag_earnings_listView )ListView fag_earnings_listView;
    @Bind(R.id.fag_earnings_tv_amount )TextViewEuphemiaUCASRegular fag_earnings_tv_amount;
    @Bind(R.id.fag_earnings_tv_cashOut )TextViewEuphemiaUCASRegular fag_earnings_tv_cashOut;

    private EarningsListAdapter adapter;
    private ArrayList<EarningsModel> earningList;
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

    public EarningsFragment() {
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
    public static EarningsFragment newInstance(String param1, String param2) {
        EarningsFragment fragment = new EarningsFragment();
        Bundle args = new Bundle();
        args.putString( ARG_PARAM1, param1 );
        args.putString( ARG_PARAM2, param2 );
        fragment.setArguments( args );
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        if (getArguments() != null) {
            mParam1 = getArguments().getString( ARG_PARAM1 );
            mParam2 = getArguments().getString( ARG_PARAM2 );
        }
=======
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
>>>>>>> 1/30/2019
=======
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
>>>>>>> 1/31/2019
=======
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
>>>>>>> 2/1/2019
=======
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
>>>>>>> 2/2/2019
=======
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
>>>>>>> 2/9/2019
=======
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
>>>>>>> 2/14/2019
=======
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
>>>>>>> 2/15/2019
=======
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
>>>>>>> 2/16/2019
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_earnings, container, false);
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
       // initToolbar();
=======
        ButterKnife.bind( this,rootView);
>>>>>>> 1/30/2019
=======
        ButterKnife.bind( this,rootView);
>>>>>>> 1/31/2019
=======
        ButterKnife.bind( this,rootView);
>>>>>>> 2/1/2019
=======
        ButterKnife.bind( this,rootView);
>>>>>>> 2/2/2019
=======
        ButterKnife.bind( this,rootView);
>>>>>>> 2/9/2019
=======
        ButterKnife.bind( this,rootView);
>>>>>>> 2/14/2019
=======
        ButterKnife.bind( this,rootView);
>>>>>>> 2/15/2019
=======
        ButterKnife.bind( this,rootView);
>>>>>>> 2/16/2019
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
    public void initToolbar() {
        ((HomeScreenActivity) getActivity()).setUpToolbar("Earnings");
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
=======
        adapter = new EarningsListAdapter( getActivity());
        fag_earnings_listView.setAdapter(adapter);

=======
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
        adapter = new EarningsListAdapter( getActivity());
        fag_earnings_listView.setAdapter(adapter);

        fag_earnings_tv_cashOut.setOnClickListener( this );

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
        earningList = new ArrayList<>();

        EarningsModel model = new EarningsModel();
        model.setId("1");
        model.setName( "TV Mount Installation" );
        model.setTime( "01/10/2019 10 AM to 12 PM" );
        model.setAmount( "$100.00" );
        earningList.add(model);

        EarningsModel model1 = new EarningsModel();
        model1.setId("2");
        model1.setName( "Interior Painting" );
        model1.setTime( "01/09/2019 11 AM to 2 PM" );
        model1.setAmount( "$85.00" );
        earningList.add(model1);

        EarningsModel model2 = new EarningsModel();
        model2.setId("3");
        model2.setName( "TV Mount Installation" );
        model2.setTime( "01/10/2019 11 AM to 12 PM" );
        model2.setAmount( "$90.00" );
        earningList.add(model2);

        EarningsModel model3 = new EarningsModel();
        model3.setId("3");
        model3.setName( "TV Mount Installation" );
        model3.setTime( "01/10/2019 11 AM to 12 PM" );
        model3.setAmount( "$160.00" );
        earningList.add(model3);

        EarningsModel model4 = new EarningsModel();
        model4.setId("4");
        model4.setName( "Interior Painting" );
        model4.setTime( "01/10/2019 11 AM to 12 PM" );
        model4.setAmount( "$100.00" );
        earningList.add(model4);

        adapter.setList( earningList);
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 1/30/2019

    }

=======
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

    }


    @Override
    public void onClick(View v) {
        if(v==fag_earnings_tv_cashOut){
            Intent intent = new Intent( getActivity(),CashOutActivity.class );
            getActivity().startActivity(intent);

        }

    }
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
}
