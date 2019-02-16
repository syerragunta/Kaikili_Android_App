package com.sit.kaikiliService.fragment;

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


    public EarningsFragment() {
        // Required empty public constructor
    }


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
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_earnings, container, false);
       // initToolbar();
        initComponents(rootView);
        return rootView;
    }

    public void initToolbar() {
        ((HomeScreenActivity) getActivity()).setUpToolbar("Earnings");
    }


    @Override
    public void initComponents(View rootView) {

    }

}
