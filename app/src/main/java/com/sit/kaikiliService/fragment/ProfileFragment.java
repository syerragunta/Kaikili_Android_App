package com.sit.kaikiliService.fragment;

<<<<<<< HEAD
<<<<<<< HEAD
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
=======
import android.os.Bundle;
>>>>>>> 1/30/2019
=======
import android.os.Bundle;
>>>>>>> 1/31/2019
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sit.kaikiliService.R;
import com.sit.kaikiliService.activity.HomeScreenActivity;

<<<<<<< HEAD
<<<<<<< HEAD
public class ProfileFragment extends BaseFragment {
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

/**
 * Created by ketan patel on 30/1/2019.
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
 */

public class ProfileFragment extends BaseFragment {
<<<<<<< HEAD
>>>>>>> 1/30/2019
=======
>>>>>>> 1/31/2019


    public ProfileFragment() {
        // Required empty public constructor
    }


<<<<<<< HEAD
<<<<<<< HEAD
    public static ProfileFragment newInstance(String param1, String param2) {
        ProfileFragment fragment = new ProfileFragment();
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

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
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
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
<<<<<<< HEAD
<<<<<<< HEAD
        final View rootView = inflater.inflate( R.layout.fragment_earnings, container, false );
       // initToolbar();
=======
        final View rootView = inflater.inflate( R.layout.fragment_profile, container, false );

>>>>>>> 1/30/2019
=======
        final View rootView = inflater.inflate( R.layout.fragment_profile, container, false );

>>>>>>> 1/31/2019
        initComponents( rootView );
        return rootView;
    }



<<<<<<< HEAD
<<<<<<< HEAD
    public void initToolbar() {
        ((HomeScreenActivity) getActivity()).setUpToolbar("Profile");

    }
=======
>>>>>>> 1/30/2019
=======
>>>>>>> 1/31/2019

    @Override
    public void initComponents(View rootView) {

    }

}
