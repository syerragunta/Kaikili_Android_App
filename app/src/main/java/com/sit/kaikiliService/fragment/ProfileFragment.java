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
=======
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
=======
>>>>>>> 2/21/2019
=======
>>>>>>> 2/22/2019
=======
>>>>>>> 2/23/2019
=======
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.sit.kaikiliService.R;
import com.sit.kaikiliService.activity.HomeScreenActivity;
import com.sit.kaikiliService.adapter.ImageViewPagetAdapter;
import com.sit.kaikiliService.comman.CircularImageView;
import com.sit.kaikiliService.font.CirclePageIndicator;
import com.sit.kaikiliService.font.TextViewEuphemiaUCASRegular;
import com.sit.kaikiliService.font.TextViewReadMoreEuphemiaUCASRegular;

import java.util.ArrayList;
=======
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.IntentSender;
import android.content.SharedPreferences;
import android.location.Location;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.gson.Gson;
import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
import com.sit.kaikiliService.activity.HomeScreenActivity;
import com.sit.kaikiliService.activity.ProfileEditActivity;
import com.sit.kaikiliService.adapter.ImageViewPagetAdapter;
import com.sit.kaikiliService.adapter.WorkImageEditAdapter;
import com.sit.kaikiliService.api.CustomWorkPerDay;
import com.sit.kaikiliService.api.ProfileWorkApi;
import com.sit.kaikiliService.api.ProfileWorkInfo;
import com.sit.kaikiliService.api.WebApi;
import com.sit.kaikiliService.api.WebUtil;
import com.sit.kaikiliService.comman.CircularImageView;
import com.sit.kaikiliService.comman.Util;
import com.sit.kaikiliService.font.CirclePageIndicator;
import com.sit.kaikiliService.font.TextViewEuphemiaUCASRegular;
import com.sit.kaikiliService.font.TextViewReadMoreEuphemiaUCASRegular;
import com.squareup.picasso.Picasso;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
>>>>>>> 2/28/2019

import butterknife.Bind;
import butterknife.ButterKnife;

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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
=======
>>>>>>> 2/21/2019
=======
>>>>>>> 2/22/2019
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

/**
 * Created by ketan patel on 30/1/2019.
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
 */

<<<<<<< HEAD
public class ProfileFragment extends BaseFragment {
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 1/30/2019
=======
>>>>>>> 1/31/2019

=======
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
=======
>>>>>>> 2/21/2019
=======
>>>>>>> 2/22/2019
=======
>>>>>>> 2/23/2019
=======
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019

    @Bind(R.id.profile_frag_tv_userAbout )TextViewReadMoreEuphemiaUCASRegular profile_frag_tv_userAbout;
    @Bind(R.id.profile_frag_civ_profile )CircularImageView profile_frag_civ_profile;
    @Bind(R.id.profile_frag_tv_userName )TextViewEuphemiaUCASRegular profile_frag_tv_userName;
    @Bind(R.id.profile_frag_viewPager )ViewPager profile_frag_viewPager;
    @Bind(R.id.profile_frag_indicator )CirclePageIndicator profile_frag_indicator;
    @Bind(R.id.profile_frag_tv_website )TextViewEuphemiaUCASRegular profile_frag_tv_website;
    @Bind(R.id.profile_frag_tv_email )TextViewEuphemiaUCASRegular profile_frag_tv_email;
    @Bind(R.id.profile_frag_tv_phone )TextViewEuphemiaUCASRegular profile_frag_tv_phone;
    @Bind(R.id.profile_frag_tv_radius )TextViewEuphemiaUCASRegular profile_frag_tv_radius;
    @Bind(R.id.profile_frag_tv_Linkedin )TextViewEuphemiaUCASRegular profile_frag_tv_Linkedin;
    @Bind(R.id.profile_frag_tv_serviceArea )TextViewEuphemiaUCASRegular profile_frag_tv_serviceArea;
=======
public class ProfileFragment extends BaseFragment implements
        LocationListener, OnMapReadyCallback {

    @Bind(R.id.profile_frag_tv_userAbout)
    TextViewReadMoreEuphemiaUCASRegular profile_frag_tv_userAbout;
    @Bind(R.id.profile_frag_civ_profile)
    CircularImageView profile_frag_civ_profile;
    @Bind(R.id.profile_frag_tv_userName)
    TextViewEuphemiaUCASRegular profile_frag_tv_userName;
    @Bind(R.id.profile_frag_viewPager)
    ViewPager profile_frag_viewPager;
    @Bind(R.id.profile_frag_indicator)
    CirclePageIndicator profile_frag_indicator;
    @Bind(R.id.profile_frag_tv_website)
    TextViewEuphemiaUCASRegular profile_frag_tv_website;
    @Bind(R.id.profile_frag_tv_email)
    TextViewEuphemiaUCASRegular profile_frag_tv_email;
    @Bind(R.id.profile_frag_tv_phone)
    TextViewEuphemiaUCASRegular profile_frag_tv_phone;
    @Bind(R.id.profile_frag_tv_radius)
    TextViewEuphemiaUCASRegular profile_frag_tv_radius;
    @Bind(R.id.profile_frag_tv_Linkedin)
    TextViewEuphemiaUCASRegular profile_frag_tv_Linkedin;
    @Bind(R.id.profile_frag_tv_serviceArea)
    TextViewEuphemiaUCASRegular profile_frag_tv_serviceArea;
>>>>>>> 2/28/2019

    @Bind(R.id.profile_frag_cb_mon)
    CheckBox profile_frag_cb_mon;
    @Bind(R.id.profile_frag_cb_tue)
    CheckBox profile_frag_cb_tue;
    @Bind(R.id.profile_frag_cb_wed)
    CheckBox profile_frag_cb_wed;
    @Bind(R.id.profile_frag_cb_thu)
    CheckBox profile_frag_cb_thu;
    @Bind(R.id.profile_frag_cb_fri)
    CheckBox profile_frag_cb_fri;
    @Bind(R.id.profile_frag_cb_sat)
    CheckBox profile_frag_cb_sat;
    @Bind(R.id.profile_frag_cb_sun)
    CheckBox profile_frag_cb_sun;

    @Bind(R.id.profile_frag_tv_mon)
    TextViewEuphemiaUCASRegular profile_frag_tv_mon;
    @Bind(R.id.profile_frag_tv_tue)
    TextViewEuphemiaUCASRegular profile_frag_tv_tue;
    @Bind(R.id.profile_frag_tv_wed)
    TextViewEuphemiaUCASRegular profile_frag_tv_wed;
    @Bind(R.id.profile_frag_tv_thu)
    TextViewEuphemiaUCASRegular profile_frag_tv_thu;
    @Bind(R.id.profile_frag_tv_fri)
    TextViewEuphemiaUCASRegular profile_frag_tv_fri;
    @Bind(R.id.profile_frag_tv_sat)
    TextViewEuphemiaUCASRegular profile_frag_tv_sat;
    @Bind(R.id.profile_frag_tv_sun)
    TextViewEuphemiaUCASRegular profile_frag_tv_sun;

    @Bind(R.id.profile_frag_tv_monStart)
    TextViewEuphemiaUCASRegular profile_frag_tv_monStart;
    @Bind(R.id.profile_frag_tv_tueStart)
    TextViewEuphemiaUCASRegular profile_frag_tv_tueStart;
    @Bind(R.id.profile_frag_tv_wedStart)
    TextViewEuphemiaUCASRegular profile_frag_tv_wedStart;
    @Bind(R.id.profile_frag_tv_thuStart)
    TextViewEuphemiaUCASRegular profile_frag_tv_thuStart;
    @Bind(R.id.profile_frag_tv_friStart)
    TextViewEuphemiaUCASRegular profile_frag_tv_friStart;
    @Bind(R.id.profile_frag_tv_satStart)
    TextViewEuphemiaUCASRegular profile_frag_tv_satStart;
    @Bind(R.id.profile_frag_tv_sunStart)
    TextViewEuphemiaUCASRegular profile_frag_tv_sunStart;

    @Bind(R.id.profile_frag_tv_monEnd)
    TextViewEuphemiaUCASRegular profile_frag_tv_monEnd;
    @Bind(R.id.profile_frag_tv_tueEnd)
    TextViewEuphemiaUCASRegular profile_frag_tv_tueEnd;
    @Bind(R.id.profile_frag_tv_wedEnd)
    TextViewEuphemiaUCASRegular profile_frag_tv_wedEnd;
    @Bind(R.id.profile_frag_tv_thuEnd)
    TextViewEuphemiaUCASRegular profile_frag_tv_thuEnd;
    @Bind(R.id.profile_frag_tv_friEnd)
    TextViewEuphemiaUCASRegular profile_frag_tv_friEnd;
    @Bind(R.id.profile_frag_tv_satEnd)
    TextViewEuphemiaUCASRegular profile_frag_tv_satEnd;
    @Bind(R.id.profile_frag_tv_sunEnd)
    TextViewEuphemiaUCASRegular profile_frag_tv_sunEnd;

    @Bind(R.id.profile_frag_cb_leisureDay)
    CheckBox profile_frag_cb_leisureDay;
    @Bind(R.id.profile_frag_tv_leisureDay)
    TextViewEuphemiaUCASRegular profile_frag_tv_leisureDay;
    @Bind(R.id.profile_frag_tv_leisureDayStartDate)
    TextViewEuphemiaUCASRegular profile_frag_tv_leisureDayStartDate;
    @Bind(R.id.profile_frag_tv_leisureDayStartTime)
    TextViewEuphemiaUCASRegular profile_frag_tv_leisureDayStartTime;
    @Bind(R.id.profile_frag_tv_leisureDayEndDate)
    TextViewEuphemiaUCASRegular profile_frag_tv_leisureDayEndDate;
    @Bind(R.id.profile_frag_tv_leisureDayEndTime)
    TextViewEuphemiaUCASRegular profile_frag_tv_leisureDayEndTime;

<<<<<<< HEAD
=======

    @Bind(R.id.profile_frag_tv_nearMiles)
    TextViewEuphemiaUCASRegular profile_frag_tv_nearMiles;
    @Bind(R.id.profile_frag_tv_nearOff)
    TextViewEuphemiaUCASRegular profile_frag_tv_nearOff;

    @Bind(R.id.profile_frag_tv_leisureDayOff)
    TextViewEuphemiaUCASRegular profile_frag_tv_leisureDayOff;
    @Bind(R.id.profile_frag_rb_fullWeek)
    RadioButton profile_frag_rb_fullWeek;
    @Bind(R.id.profile_frag_rb_workDay)
    RadioButton profile_frag_rb_workDay;

>>>>>>> 2/28/2019
    @Bind(R.id.profile_frag_cb_nearByLastMin)
    CheckBox profile_frag_cb_nearByLastMin;

    private int postion = 0;
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
=======
>>>>>>> 2/21/2019
=======
>>>>>>> 2/22/2019
=======
>>>>>>> 2/23/2019
=======
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======

    private KaikiliApplication application;
    private SharedPreferences preferences;
    private Calendar calendar;
>>>>>>> 2/28/2019

    public ProfileFragment() {
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
=======
>>>>>>> 2/21/2019
=======
>>>>>>> 2/22/2019
=======
>>>>>>> 2/23/2019
=======
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
    protected int mRadius = 1;
    private int MAP_CODE = 120;

    private final static int CONNECTION_FAILURE_RESOLUTION_REQUEST = 9000;
    private static GoogleMap mGoogleMap;
    private static GoogleApiClient mGoogleApiClient;
    private LocationRequest mLocationRequest = new LocationRequest();
    private Circle mRadiusCircle;
    public LatLng selectedCoords = null;
    public LatLng selectedCodineters = null;
    private ImageViewPagetAdapter adapter;

>>>>>>> 2/28/2019

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
=======

>>>>>>> 2/21/2019
=======

>>>>>>> 2/22/2019
=======

>>>>>>> 2/23/2019
=======

>>>>>>> 2/25/2019
=======

>>>>>>> 2/26/2019
=======

>>>>>>> 2/27/2019
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
=======
        final View rootView = inflater.inflate( R.layout.fragment_profile, container, false );
        ButterKnife.bind( this,rootView);
>>>>>>> 2/1/2019
=======
        final View rootView = inflater.inflate( R.layout.fragment_profile, container, false );
        ButterKnife.bind( this,rootView);
>>>>>>> 2/2/2019
=======
        final View rootView = inflater.inflate( R.layout.fragment_profile, container, false );
        ButterKnife.bind( this,rootView);
>>>>>>> 2/9/2019
=======
        final View rootView = inflater.inflate( R.layout.fragment_profile, container, false );
        ButterKnife.bind( this,rootView);
>>>>>>> 2/14/2019
=======
        final View rootView = inflater.inflate( R.layout.fragment_profile, container, false );
        ButterKnife.bind( this,rootView);
>>>>>>> 2/15/2019
=======
        final View rootView = inflater.inflate( R.layout.fragment_profile, container, false );
        ButterKnife.bind( this,rootView);
>>>>>>> 2/16/2019
=======
        final View rootView = inflater.inflate( R.layout.fragment_profile, container, false );
        ButterKnife.bind( this,rootView);
>>>>>>> 2/16/2019 V1
=======
        final View rootView = inflater.inflate( R.layout.fragment_profile, container, false );
        ButterKnife.bind( this,rootView);
>>>>>>> 2/16/2019 V2
=======
        final View rootView = inflater.inflate( R.layout.fragment_profile, container, false );
        ButterKnife.bind( this,rootView);
>>>>>>> 2/16/2019
=======
        final View rootView = inflater.inflate( R.layout.fragment_profile, container, false );
        ButterKnife.bind( this,rootView);
>>>>>>> 2/18/2019
=======
        final View rootView = inflater.inflate( R.layout.fragment_profile, container, false );
        ButterKnife.bind( this,rootView);
>>>>>>> 2/21/2019
=======
        final View rootView = inflater.inflate( R.layout.fragment_profile, container, false );
        ButterKnife.bind( this,rootView);
>>>>>>> 2/22/2019
=======
        final View rootView = inflater.inflate( R.layout.fragment_profile, container, false );
        ButterKnife.bind( this,rootView);
>>>>>>> 2/23/2019
=======
        final View rootView = inflater.inflate( R.layout.fragment_profile, container, false );
        ButterKnife.bind( this,rootView);
>>>>>>> 2/25/2019
=======
        final View rootView = inflater.inflate( R.layout.fragment_profile, container, false );
        ButterKnife.bind( this,rootView);
>>>>>>> 2/26/2019
=======
        final View rootView = inflater.inflate( R.layout.fragment_profile, container, false );
        ButterKnife.bind( this,rootView);
>>>>>>> 2/27/2019
        initComponents( rootView );
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    public void initToolbar() {
        ((HomeScreenActivity) getActivity()).setUpToolbar("Profile");

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
=======
>>>>>>> 2/21/2019
=======
>>>>>>> 2/22/2019
=======
>>>>>>> 2/23/2019
=======
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019

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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
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
=======
>>>>>>> 2/21/2019
=======
>>>>>>> 2/22/2019
=======
>>>>>>> 2/23/2019
=======
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
        ArrayList<String> imageURL = new ArrayList<>();
        imageURL.add( "https://certapro.com/wp-content/uploads/cache//Screen-Shot-2018-04-02-at-10_49_06-PM/2936591281.png" );
        imageURL.add( "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR7S_Uqp2RaN1cp3ow1Nevm3ZYXlX4UFLHT8K5g2oz3UAF3LdVx" );
        imageURL.add( "https://certapro.com/wp-content/uploads/cache//z_footer/3313024203.jpg" );
        imageURL.add( "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSSTIovt6zDyWa2npaou3H77DTSO-UoPLQ4bW9MQoHDIDYWSyrnnA" );
        imageURL.add( "https://mydecorative.com/wp-content/uploads/2018/12/interior-painting-tips.jpg" );

        ImageViewPagetAdapter adapter = new ImageViewPagetAdapter(getActivity(), imageURL);
        profile_frag_viewPager.setAdapter(adapter);
        profile_frag_viewPager.setCurrentItem(postion);
        profile_frag_indicator.setViewPager(profile_frag_viewPager);

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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
=======
>>>>>>> 2/21/2019
=======
>>>>>>> 2/22/2019
=======
>>>>>>> 2/23/2019
=======
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
    }

=======

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate( R.layout.fragment_profile, container, false );
        ButterKnife.bind( this, rootView );
        initComponents( rootView );
        return rootView;
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mGoogleMap = googleMap;
        mGoogleMap.getUiSettings().setZoomControlsEnabled( true );
        mGoogleMap.getUiSettings().setMapToolbarEnabled( false );
        mGoogleMap.getUiSettings().setCompassEnabled( false );

        mGoogleMap.clear();

        LatLng latLng = new LatLng( application.getLatitude(), application.getLongitude() );

        CameraPosition position = CameraPosition.builder().target( latLng ).zoom( 18f ).bearing( 0.0f ).tilt( 0.0f ).build();
        mGoogleMap.animateCamera( CameraUpdateFactory.newCameraPosition( position ) );
//        mGoogleMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(application.getLatitude(), application.getLongitude())));


    }


    @Override
    public void initComponents(View rootView) {

        application = (KaikiliApplication) getActivity().getApplicationContext();
        preferences = application.getSharedPreferences();


        adapter = new ImageViewPagetAdapter( getActivity() );
        profile_frag_viewPager.setAdapter( adapter );
        profile_frag_viewPager.setCurrentItem( postion );
        profile_frag_indicator.setViewPager( profile_frag_viewPager );

        if (mGoogleApiClient == null) {
            mGoogleApiClient = new GoogleApiClient.Builder( getActivity() )
                    .addApi( LocationServices.API )
//                    .addConnectionCallbacks( this )
//                    .addOnConnectionFailedListener( this )
                    .build();
            mGoogleApiClient.connect();
        }

        SupportMapFragment fm = (SupportMapFragment) getChildFragmentManager().findFragmentById( R.id.profile_frag_mappView );
        fm.getMapAsync( this );

        new getProfileInfoTask( getActivity() ).execute();

    }


    public class getProfileInfoTask extends AsyncTask<Void, Void, String> {

        private ProgressDialog mDialog = null;
        private Activity mActivity;


        public getProfileInfoTask(Activity activity) {
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
                jsonObject.put( "sp_id", preferences.getString( "sp_id", "" ) );
                Log.e( "--------------Post", jsonObject.toString() );
                String response = new WebUtil().postMethod( jsonObject.toString(), WebApi.URL_GET_WORK_PROFILE );
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
            ProfileWorkApi profileWorkApi = gson.fromJson( response, ProfileWorkApi.class );

            if (profileWorkApi.getStatus() == 1 && profileWorkApi.getData().size() > 0) {

                ProfileWorkInfo infoData = profileWorkApi.getData().get( 0 );
                profile_frag_tv_userAbout.setText( infoData.getAbout_sp_profile() );
                profile_frag_tv_website.setText( infoData.getWebsite() + "" );
                profile_frag_tv_Linkedin.setText( infoData.getLinkedin() + "" );
                profile_frag_tv_serviceArea.setText( infoData.getService_area() );
                profile_frag_tv_radius.setText( infoData.getRadius() );


                adapter.setData( infoData.getWorkImages() );

                if (Util.isNotEmpaty( infoData.getProfile_image() )) {
                    Picasso.with( mActivity ).load( infoData.getProfile_image() )
                            .into( profile_frag_civ_profile );
                }
//                profileStatus = infoData.getProfile_status();

                if (infoData.getLeisure_day_offer().equalsIgnoreCase( "ON" )) {
                    profile_frag_cb_leisureDay.setChecked( true );
                    profile_frag_tv_leisureDayOff.setText( infoData.getLeisure_day_offer_on().getLeisure_day_discount() );
                    profile_frag_tv_leisureDayStartDate.setText( infoData.getLeisure_day_offer_on().getStart_date() );
                    profile_frag_tv_leisureDayStartTime.setText( infoData.getLeisure_day_offer_on().getStart_time() );
                    profile_frag_tv_leisureDayEndDate.setText( infoData.getLeisure_day_offer_on().getEnd_date() );
                    profile_frag_tv_leisureDayEndTime.setText( infoData.getLeisure_day_offer_on().getEnd_time() );
                }

                if (infoData.getNear_offer_selected().equalsIgnoreCase( "ON" )) {
                    profile_frag_cb_nearByLastMin.setChecked( true );
                    profile_frag_tv_nearMiles.setText( infoData.getNear_offer_selected_on().getDistance() );
                    profile_frag_tv_nearOff.setText( infoData.getNear_offer_selected_on().getOffer() );
                }

                if (infoData.getWorking_hours_24_7().equalsIgnoreCase( "ON" )) {
                    profile_frag_rb_fullWeek.setChecked( true );
                    profile_frag_rb_workDay.setChecked( false );
                }

                if (infoData.getCustom_work_hours().equalsIgnoreCase( "ON" )) {
                    profile_frag_rb_fullWeek.setChecked( false );
                    profile_frag_rb_workDay.setChecked( true );

                    ArrayList<CustomWorkPerDay> workPreDay = infoData.getCustom_work_per_day();

                    for (int i = 0; i < workPreDay.size(); i++) {

                        if (workPreDay.get( i ).getDayName().equalsIgnoreCase( "mon" )) {
                            profile_frag_cb_mon.setChecked( true );
                            profile_frag_tv_monStart.setText( workPreDay.get( i ).getStart_time() );
                            profile_frag_tv_monEnd.setText( workPreDay.get( i ).getEnd_time() );

                        } else if (workPreDay.get( i ).getDayName().equalsIgnoreCase( "tue" )) {
                            profile_frag_cb_tue.setChecked( true );
                            profile_frag_tv_tueStart.setText( workPreDay.get( i ).getStart_time() );
                            profile_frag_tv_tueEnd.setText( workPreDay.get( i ).getEnd_time() );

                        } else if (workPreDay.get( i ).getDayName().equalsIgnoreCase( "wed" )) {
                            profile_frag_cb_wed.setChecked( true );
                            profile_frag_tv_wedStart.setText( workPreDay.get( i ).getStart_time() );
                            profile_frag_tv_wedEnd.setText( workPreDay.get( i ).getEnd_time() );

                        } else if (workPreDay.get( i ).getDayName().equalsIgnoreCase( "thu" )) {
                            profile_frag_cb_thu.setChecked( true );
                            profile_frag_tv_thuStart.setText( workPreDay.get( i ).getStart_time() );
                            profile_frag_tv_thuEnd.setText( workPreDay.get( i ).getEnd_time() );

                        } else if (workPreDay.get( i ).getDayName().equalsIgnoreCase( "fri" )) {
                            profile_frag_cb_fri.setChecked( true );
                            profile_frag_tv_friStart.setText( workPreDay.get( i ).getStart_time() );
                            profile_frag_tv_friEnd.setText( workPreDay.get( i ).getEnd_time() );

                        } else if (workPreDay.get( i ).getDayName().equalsIgnoreCase( "sat" )) {
                            profile_frag_cb_sat.setChecked( true );
                            profile_frag_tv_satStart.setText( workPreDay.get( i ).getStart_time() );
                            profile_frag_tv_satEnd.setText( workPreDay.get( i ).getEnd_time() );

                        } else if (workPreDay.get( i ).getDayName().equalsIgnoreCase( "sun" )) {
                            profile_frag_cb_sun.setChecked( true );
                            profile_frag_tv_sunStart.setText( workPreDay.get( i ).getStart_time() );
                            profile_frag_tv_sunEnd.setText( workPreDay.get( i ).getEnd_time() );

                        }
                    }

                }


                selectedCoords = new LatLng( Double.parseDouble( infoData.getCoordinatePoint().getLatitude() ), Double.parseDouble( infoData.getCoordinatePoint().getLongitude() ) );
                selectedCodineters = new LatLng( Double.parseDouble( infoData.getCoordinatePoint().getLatitude() ), Double.parseDouble( infoData.getCoordinatePoint().getLongitude() ) );
                mGoogleMap.animateCamera( CameraUpdateFactory.newLatLngZoom( selectedCoords, 18 ) );

                if (mGoogleMap != null) {
                    mGoogleMap.clear();
                    mGoogleMap.addMarker( new MarkerOptions()
                            .position( selectedCoords )
                            .anchor( .5f, .5f )
                            .title( "My Location" ) );

                    mRadiusCircle = mGoogleMap.addCircle( new CircleOptions()
                            .center( selectedCoords )
                            .radius( milesToMeters( mRadius ) )
                            .strokeColor( ContextCompat.getColor( mActivity, R.color.map_mRadius ) )
                            .fillColor( ContextCompat.getColor( mActivity, R.color.map_mRadius ) )
                            .strokeWidth( 0.1f ) );


                    if (mRadius > 0 && selectedCoords != null) {
                        int zoom = getZoomLevel( mRadiusCircle );
                        mGoogleMap.animateCamera( CameraUpdateFactory.newLatLngZoom( selectedCoords, zoom ) );
                    } else {
                        mGoogleMap.animateCamera( CameraUpdateFactory.newLatLngZoom( selectedCoords, 16 ) );
                    }
                }

            } else {
                Toast.makeText( mActivity, profileWorkApi.getMessage(), Toast.LENGTH_SHORT ).show();
            }
        }
    }

//    @Override
//    public void onConnected(Bundle bundle) {
////        Log.d("connected", "connected");
//        Location location = LocationServices.FusedLocationApi.getLastLocation( mGoogleApiClient );
//
//        if (location == null) {
//            LocationServices.FusedLocationApi.requestLocationUpdates( mGoogleApiClient, mLocationRequest, getActivity() );
//            Toast.makeText( getActivity(), "No location found", Toast.LENGTH_SHORT ).show();
//
//        } else {
//            LatLng latLng = new LatLng( application.getLatitude(), application.getLongitude() );
//            CameraPosition position = CameraPosition.builder().target( latLng ).zoom( 18f ).bearing( 0.0f ).tilt( 0.0f ).build();
//            mGoogleMap.animateCamera( CameraUpdateFactory.newCameraPosition( position ) );
//        }
//    }
//
//    @Override
//    public void onConnectionFailed(ConnectionResult connectionResult) {
//
//        if (connectionResult.hasResolution()) {
//            try {
//                connectionResult.startResolutionForResult( getActivity(), CONNECTION_FAILURE_RESOLUTION_REQUEST );
//
//            } catch (IntentSender.SendIntentException e) {
//                e.printStackTrace();
//            }
//        } else {
//
////            Log.e("Error", "Location services connection failed with code " + connectionResult.getErrorCode());
//        }
//    }
//
//
//    @Override
//    public void onConnectionSuspended(int i) {
//    }

    @Override
    public void onLocationChanged(Location location) {

        if (location != null) {
//            currentLatitude = location.getLatitude();
//            currentLongitude = location.getLongitude();
            LatLng latLng = new LatLng( location.getLatitude(), location.getLongitude() );

            application.setLatitude( location.getLatitude() );
            application.setLongitude( location.getLongitude() );

            mGoogleMap.moveCamera( CameraUpdateFactory.newLatLng( latLng ) );
            mGoogleMap.animateCamera( CameraUpdateFactory.zoomTo( 18 ) );
        }
    }

    public int getZoomLevel(Circle circle) {
        int zoomLevel = 16;
        if (circle != null) {
            double radius = circle.getRadius();
            double scale = radius / 200;
            zoomLevel = (int) (16 - Math.log( scale ) / Math.log( 2 ));
        }
        return zoomLevel;
    }

    public static double milesToMeters(double miles) {
        return 1609.34 * miles;
    }
>>>>>>> 2/28/2019
}
