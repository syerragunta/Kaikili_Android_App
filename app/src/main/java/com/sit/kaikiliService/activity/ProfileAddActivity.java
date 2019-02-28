package com.sit.kaikiliService.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.app.TimePickerDialog;
<<<<<<< HEAD
<<<<<<< HEAD
=======
import android.content.Context;
>>>>>>> 2/27/2019
=======
import android.content.Context;
>>>>>>> 2/28/2019
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v4.content.ContextCompat;
<<<<<<< HEAD
<<<<<<< HEAD
=======
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
>>>>>>> 2/27/2019
=======
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
>>>>>>> 2/28/2019
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TimePicker;
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
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.gson.Gson;
import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
<<<<<<< HEAD
<<<<<<< HEAD
=======
import com.sit.kaikiliService.adapter.WorkImageEditAdapter;
>>>>>>> 2/27/2019
=======
import com.sit.kaikiliService.adapter.WorkImageEditAdapter;
>>>>>>> 2/28/2019
import com.sit.kaikiliService.api.Apiresponse;
import com.sit.kaikiliService.api.WebApi;
import com.sit.kaikiliService.api.WebUtil;
import com.sit.kaikiliService.camera.Config;
import com.sit.kaikiliService.camera.ImagePickerActivity;
<<<<<<< HEAD
<<<<<<< HEAD
=======
import com.sit.kaikiliService.comman.AppLog;
>>>>>>> 2/27/2019
=======
import com.sit.kaikiliService.comman.AppLog;
>>>>>>> 2/28/2019
import com.sit.kaikiliService.comman.LocationFinder;
import com.sit.kaikiliService.comman.Util;
import com.sit.kaikiliService.font.EditTextEupheminUCASRegular;
import com.sit.kaikiliService.font.TextViewEuphemiaUCASRegular;

import org.adw.library.widgets.discreteseekbar.DiscreteSeekBar;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import butterknife.Bind;
import butterknife.ButterKnife;


/**
 * Created by ketan patel on 23/1/2019 - 25-1/2019.
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
 */

public class ProfileAddActivity extends BaseActivity implements View.OnClickListener,
        GoogleApiClient.OnConnectionFailedListener,
        GoogleApiClient.ConnectionCallbacks,
<<<<<<< HEAD
<<<<<<< HEAD
        LocationListener, OnMapReadyCallback {
=======
        LocationListener, OnMapReadyCallback,
        WorkImageEditAdapter.ItemClickListener{
>>>>>>> 2/27/2019
=======
        LocationListener, OnMapReadyCallback,
        WorkImageEditAdapter.ItemClickListener{
>>>>>>> 2/28/2019

    @Bind(R.id.top_back)
    ImageView top_back;
    @Bind(R.id.top_title)
    TextViewEuphemiaUCASRegular top_title;


    @Bind(R.id.about_profile_cb_mon)
    CheckBox about_profile_cb_mon;
    @Bind(R.id.about_profile_cb_tue)
    CheckBox about_profile_cb_tue;
    @Bind(R.id.about_profile_cb_wed)
    CheckBox about_profile_cb_wed;
    @Bind(R.id.about_profile_cb_thu)
    CheckBox about_profile_cb_thu;
    @Bind(R.id.about_profile_cb_fri)
    CheckBox about_profile_cb_fri;
    @Bind(R.id.about_profile_cb_sat)
    CheckBox about_profile_cb_sat;
    @Bind(R.id.about_profile_cb_sun)
    CheckBox about_profile_cb_sun;

    @Bind(R.id.about_profile_tv_mon)
    TextViewEuphemiaUCASRegular about_profile_tv_mon;
    @Bind(R.id.about_profile_tv_tue)
    TextViewEuphemiaUCASRegular about_profile_tv_tue;
    @Bind(R.id.about_profile_tv_wed)
    TextViewEuphemiaUCASRegular about_profile_tv_wed;
    @Bind(R.id.about_profile_tv_thu)
    TextViewEuphemiaUCASRegular about_profile_tv_thu;
    @Bind(R.id.about_profile_tv_fri)
    TextViewEuphemiaUCASRegular about_profile_tv_fri;
    @Bind(R.id.about_profile_tv_sat)
    TextViewEuphemiaUCASRegular about_profile_tv_sat;
    @Bind(R.id.about_profile_tv_sun)
    TextViewEuphemiaUCASRegular about_profile_tv_sun;

    @Bind(R.id.about_profile_tv_monStart)
    TextViewEuphemiaUCASRegular about_profile_tv_monStart;
    @Bind(R.id.about_profile_tv_tueStart)
    TextViewEuphemiaUCASRegular about_profile_tv_tueStart;
    @Bind(R.id.about_profile_tv_wedStart)
    TextViewEuphemiaUCASRegular about_profile_tv_wedStart;
    @Bind(R.id.about_profile_tv_thuStart)
    TextViewEuphemiaUCASRegular about_profile_tv_thuStart;
    @Bind(R.id.about_profile_tv_friStart)
    TextViewEuphemiaUCASRegular about_profile_tv_friStart;
    @Bind(R.id.about_profile_tv_satStart)
    TextViewEuphemiaUCASRegular about_profile_tv_satStart;
    @Bind(R.id.about_profile_tv_sunStart)
    TextViewEuphemiaUCASRegular about_profile_tv_sunStart;

    @Bind(R.id.about_profile_tv_monEnd)
    TextViewEuphemiaUCASRegular about_profile_tv_monEnd;
    @Bind(R.id.about_profile_tv_tueEnd)
    TextViewEuphemiaUCASRegular about_profile_tv_tueEnd;
    @Bind(R.id.about_profile_tv_wedEnd)
    TextViewEuphemiaUCASRegular about_profile_tv_wedEnd;
    @Bind(R.id.about_profile_tv_thuEnd)
    TextViewEuphemiaUCASRegular about_profile_tv_thuEnd;
    @Bind(R.id.about_profile_tv_friEnd)
    TextViewEuphemiaUCASRegular about_profile_tv_friEnd;
    @Bind(R.id.about_profile_tv_satEnd)
    TextViewEuphemiaUCASRegular about_profile_tv_satEnd;
    @Bind(R.id.about_profile_tv_sunEnd)
    TextViewEuphemiaUCASRegular about_profile_tv_sunEnd;

    @Bind(R.id.about_profile_cb_leisureDay)
    CheckBox about_profile_cb_leisureDay;
    @Bind(R.id.about_profile_tv_leisureDay)
    TextViewEuphemiaUCASRegular about_profile_tv_leisureDay;
    @Bind(R.id.about_profile_tv_leisureDayStartDate)
    TextViewEuphemiaUCASRegular about_profile_tv_leisureDayStartDate;
    @Bind(R.id.about_profile_tv_leisureDayStartTime)
    TextViewEuphemiaUCASRegular about_profile_tv_leisureDayStartTime;
    @Bind(R.id.about_profile_tv_leisureDayEndDate)
    TextViewEuphemiaUCASRegular about_profile_tv_leisureDayEndDate;
    @Bind(R.id.about_profile_tv_leisureDayEndTime)
    TextViewEuphemiaUCASRegular about_profile_tv_leisureDayEndTime;

    @Bind(R.id.about_profile_cb_nearByLastMin)
    CheckBox about_profile_cb_nearByLastMin;

    @Bind(R.id.about_profile_edt_about)
    EditTextEupheminUCASRegular about_profile_edt_about;
    @Bind(R.id.about_profile_edt_website)
    EditTextEupheminUCASRegular about_profile_edt_website;
    @Bind(R.id.about_profile_edt_linkedin)
    EditTextEupheminUCASRegular about_profile_edt_linkedin;
    @Bind(R.id.about_profile_tv_radius)
    TextViewEuphemiaUCASRegular about_profile_tv_radius;
    @Bind(R.id.about_profile_edt_area)
    EditTextEupheminUCASRegular about_profile_edt_area;


    @Bind(R.id.about_profile_edt_nearMiles)
    EditTextEupheminUCASRegular about_profile_edt_nearMiles;
    @Bind(R.id.about_profile_edt_nearOff)
    EditTextEupheminUCASRegular about_profile_edt_nearOff;
    @Bind(R.id.about_profile_edt_leisureDayOff)
    EditTextEupheminUCASRegular about_profile_edt_leisureDayOff;


    @Bind(R.id.about_profile_tv_backgroundCheck)
    TextViewEuphemiaUCASRegular about_profile_tv_backgroundCheck;
    @Bind(R.id.about_profile_seekbar_radius)
    DiscreteSeekBar about_profile_seekbar_radius;

<<<<<<< HEAD
<<<<<<< HEAD
    @Bind(R.id.about_profile_iv_newAdd)
    ImageView about_profile_iv_newAdd;
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
    @Bind(R.id.about_profile_civ_profile)
    ImageView about_profile_civ_profile;

    @Bind(R.id.about_profile_tv_userName)
    TextViewEuphemiaUCASRegular about_profile_tv_userName;

    @Bind(R.id.about_profile_radioGroup_work)
    RadioGroup about_profile_radioGroup_work;

    @Bind(R.id.about_profile_rb_fullWeek)
    RadioButton about_profile_rb_fullWeek;
    @Bind(R.id.about_profile_rb_workDay)
    RadioButton about_profile_rb_workDay;


<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 2/28/2019
    @Bind(R.id.about_profile_recyclerView_workImage)
    RecyclerView about_profile_recyclerView_workImage;




<<<<<<< HEAD
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
    String[] perms = {"android.permission.CAMERA",
            "android.permission.WRITE_EXTERNAL_STORAGE",
            "android.permission.READ_EXTERNAL_STORAGE"};


    private KaikiliApplication application;
    private SharedPreferences preferences;
    private Calendar calendar;
    private int year, month, day;
    private String date;
    private int setDatePos = 0;
    protected int mRadius = 1;
    private int MAP_CODE = 120;
    private static final int PERMISSION_REQUEST_CODE = 200;
    private String imgPicturePath1, imgPicturePath2;
    private final static int CONNECTION_FAILURE_RESOLUTION_REQUEST = 9000;

    private static GoogleMap mGoogleMap;
    private static GoogleApiClient mGoogleApiClient;
    private LocationRequest mLocationRequest = new LocationRequest();
    private Circle mRadiusCircle;
    public LatLng selectedCoords = null;
    public LatLng selectedCodineters = null;
<<<<<<< HEAD
<<<<<<< HEAD
=======
    private WorkImageEditAdapter adapter;
    private ArrayList<Uri> imageSet;
>>>>>>> 2/27/2019
=======
    private WorkImageEditAdapter adapter;
    private ArrayList<String> imageSet;
>>>>>>> 2/28/2019

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_edit_profile );
        ButterKnife.bind( this, this );
        new LocationFinder( this );

        calendar = Calendar.getInstance();
        year = calendar.get( Calendar.YEAR );
        month = calendar.get( Calendar.MONTH );
        day = calendar.get( Calendar.DAY_OF_MONTH );

        application = (KaikiliApplication) getApplicationContext();
        preferences = application.getSharedPreferences();

<<<<<<< HEAD
<<<<<<< HEAD
=======
        imageSet = new ArrayList<>();

>>>>>>> 2/27/2019
=======
        imageSet = new ArrayList<>();

>>>>>>> 2/28/2019
        imgPicturePath1 = null;
        imgPicturePath2 = null;

        top_title.setText( "Create Work Profile" );
        top_back.setOnClickListener( this );
        about_profile_tv_backgroundCheck.setOnClickListener( this );
        about_profile_tv_leisureDayStartDate.setOnClickListener( this );
        about_profile_tv_leisureDayEndDate.setOnClickListener( this );
        about_profile_civ_profile.setOnClickListener( this );
<<<<<<< HEAD
<<<<<<< HEAD
        about_profile_iv_newAdd.setOnClickListener( this );
=======
=======
>>>>>>> 2/28/2019


        int numberOfColumns = 3;
        about_profile_recyclerView_workImage.setLayoutManager(new GridLayoutManager(this, numberOfColumns));
        adapter = new WorkImageEditAdapter(this);
        adapter.setClickListener(this);
        about_profile_recyclerView_workImage.setAdapter(adapter);
        about_profile_recyclerView_workImage.setNestedScrollingEnabled(false);
        adapter.setData(imageSet);
<<<<<<< HEAD
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019

        about_profile_tv_monStart.setOnClickListener( this );
        about_profile_tv_tueStart.setOnClickListener( this );
        about_profile_tv_wedStart.setOnClickListener( this );
        about_profile_tv_thuStart.setOnClickListener( this );
        about_profile_tv_friStart.setOnClickListener( this );
        about_profile_tv_satStart.setOnClickListener( this );
        about_profile_tv_sunStart.setOnClickListener( this );


        about_profile_tv_monEnd.setOnClickListener( this );
        about_profile_tv_tueEnd.setOnClickListener( this );
        about_profile_tv_wedEnd.setOnClickListener( this );
        about_profile_tv_thuEnd.setOnClickListener( this );
        about_profile_tv_friEnd.setOnClickListener( this );
        about_profile_tv_satEnd.setOnClickListener( this );
        about_profile_tv_sunEnd.setOnClickListener( this );

        about_profile_tv_mon.setOnClickListener( this );
        about_profile_tv_thu.setOnClickListener( this );
        about_profile_tv_wed.setOnClickListener( this );
        about_profile_tv_tue.setOnClickListener( this );
        about_profile_tv_fri.setOnClickListener( this );
        about_profile_tv_sat.setOnClickListener( this );
        about_profile_tv_sun.setOnClickListener( this );

        about_profile_tv_leisureDayStartTime.setOnClickListener( this );
        about_profile_tv_leisureDayEndTime.setOnClickListener( this );

<<<<<<< HEAD
<<<<<<< HEAD
        about_profile_tv_userName.setText(preferences.getString( "first_name", "" )+" "+preferences.getString( "last_name", "" ));
=======
        about_profile_tv_userName.setText( preferences.getString( "first_name", "" ) + " " + preferences.getString( "last_name", "" ) );
>>>>>>> 2/27/2019
=======
        about_profile_tv_userName.setText( preferences.getString( "first_name", "" ) + " " + preferences.getString( "last_name", "" ) );
>>>>>>> 2/28/2019


        about_profile_seekbar_radius.setNumericTransformer( new DiscreteSeekBar.NumericTransformer() {
            @Override
            public int transform(int value) {
                return value * 1;
            }
        } );
        about_profile_tv_radius.setText( Util.fromHtml( String.format( "Radius: %s Miles", mRadius ) ) );


        if (mGoogleApiClient == null) {
            mGoogleApiClient = new GoogleApiClient.Builder( this )
                    .addApi( LocationServices.API )
                    .addConnectionCallbacks( this )
                    .addOnConnectionFailedListener( this )
                    .build();
            mGoogleApiClient.connect();
        }


        about_profile_seekbar_radius.setOnProgressChangeListener( new DiscreteSeekBar.OnProgressChangeListener() {
            @Override
            public void onProgressChanged(DiscreteSeekBar seekBar, int value, boolean fromUser) {
                int convert = value * 1;
                mRadius = convert;
                about_profile_tv_radius.setText( Util.fromHtml( String.format( "Radius: %s Miles", mRadius ) ) );
                if (mRadiusCircle == null) return;
                mRadiusCircle.setRadius( convert );


                if (mRadius > 0 && selectedCoords != null) {
                    mRadiusCircle = mGoogleMap.addCircle( new CircleOptions()
                            .center( selectedCoords )
                            .radius( milesToMeters( mRadius ) )
                            .strokeColor( ContextCompat.getColor( ProfileAddActivity.this, R.color.map_mRadius ) )
                            .fillColor( ContextCompat.getColor( ProfileAddActivity.this, R.color.map_mRadius ) )
                            .strokeWidth( 0.1f ) );
                }
                if (mRadius > 0 && selectedCoords != null) {
                    int zoom = getZoomLevel( mRadiusCircle );
                    mGoogleMap.animateCamera( CameraUpdateFactory.newLatLngZoom( selectedCoords, zoom ) );
                } else {
                    mGoogleMap.animateCamera( CameraUpdateFactory.newLatLngZoom( selectedCoords, 16 ) );
                }
            }

            @Override
            public void onStartTrackingTouch(DiscreteSeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(DiscreteSeekBar seekBar) {
//                getNearbyTales( "Searching Nearest Tales .." );
            }
        } );


        about_profile_radioGroup_work.setOnCheckedChangeListener( new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // find which radio button is selected
                if (checkedId == R.id.about_profile_rb_fullWeek) {

                    about_profile_cb_mon.setChecked( false );
                    about_profile_cb_tue.setChecked( false );
                    about_profile_cb_wed.setChecked( false );
                    about_profile_cb_thu.setChecked( false );
                    about_profile_cb_fri.setChecked( false );
                    about_profile_cb_sat.setChecked( false );
                    about_profile_cb_sun.setChecked( false );

                    about_profile_tv_monStart.setText( "" );
                    about_profile_tv_tueStart.setText( "" );
                    about_profile_tv_wedStart.setText( "" );
                    about_profile_tv_thuStart.setText( "" );
                    about_profile_tv_friStart.setText( "" );
                    about_profile_tv_satStart.setText( "" );
                    about_profile_tv_sunStart.setText( "" );


                    about_profile_tv_monEnd.setText( "" );
                    about_profile_tv_tueEnd.setText( "" );
                    about_profile_tv_wedEnd.setText( "" );
                    about_profile_tv_thuEnd.setText( "" );
                    about_profile_tv_friEnd.setText( "" );
                    about_profile_tv_satEnd.setText( "" );
                    about_profile_tv_sunEnd.setText( "" );


                } else if (checkedId == R.id.about_profile_rb_workDay) {
                    about_profile_cb_mon.setChecked( true );
                    about_profile_cb_tue.setChecked( true );
                    about_profile_cb_wed.setChecked( true );
                    about_profile_cb_thu.setChecked( true );
                    about_profile_cb_fri.setChecked( true );
                    about_profile_cb_sat.setChecked( true );
                    about_profile_cb_sun.setChecked( true );

                }
            }

        } );


        about_profile_cb_mon.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (!((CheckBox) v).isChecked()) {
                    about_profile_tv_monStart.setText( "" );
                    about_profile_tv_monEnd.setText( "" );
<<<<<<< HEAD
<<<<<<< HEAD
                }else {
                        about_profile_rb_workDay.setClickable(true);
=======
                } else {
                    about_profile_rb_workDay.setClickable( true );
>>>>>>> 2/27/2019
=======
                } else {
                    about_profile_rb_workDay.setClickable( true );
>>>>>>> 2/28/2019
                }
            }
        } );


        about_profile_cb_thu.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (!((CheckBox) v).isChecked()) {
                    about_profile_tv_thuStart.setText( "" );
                    about_profile_tv_thuEnd.setText( "" );
                }
            }
        } );

        about_profile_cb_wed.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (!((CheckBox) v).isChecked()) {
                    about_profile_tv_wedStart.setText( "" );
                    about_profile_tv_wedEnd.setText( "" );
                }
            }
        } );

        about_profile_cb_tue.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (!((CheckBox) v).isChecked()) {
                    about_profile_tv_tueStart.setText( "" );
                    about_profile_tv_tueEnd.setText( "" );
                }
            }
        } );

        about_profile_cb_fri.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (!((CheckBox) v).isChecked()) {
                    about_profile_tv_friStart.setText( "" );
                    about_profile_tv_friEnd.setText( "" );
                }
            }
        } );

        about_profile_cb_sat.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (!((CheckBox) v).isChecked()) {
                    about_profile_tv_satStart.setText( "" );
                    about_profile_tv_satEnd.setText( "" );
                }
            }
        } );

        about_profile_cb_sun.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (!((CheckBox) v).isChecked()) {
                    about_profile_tv_sunStart.setText( "" );
                    about_profile_tv_sunEnd.setText( "" );
                }
            }
        } );

        about_profile_cb_nearByLastMin.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (!((CheckBox) v).isChecked()) {
                    about_profile_edt_nearMiles.setText( "" );
                    about_profile_edt_nearOff.setText( "" );
                }
            }
        } );

        about_profile_cb_leisureDay.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (!((CheckBox) v).isChecked()) {
                    about_profile_edt_leisureDayOff.setText( "" );
                    about_profile_tv_leisureDayStartDate.setText( "" );
                    about_profile_tv_leisureDayStartTime.setText( "" );
                    about_profile_tv_leisureDayEndDate.setText( "" );
                    about_profile_tv_leisureDayEndTime.setText( "" );
                }
            }
        } );

        SupportMapFragment fm = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById( R.id.about_profile_mapView );
        fm.getMapAsync( this );
<<<<<<< HEAD
<<<<<<< HEAD
=======



>>>>>>> 2/27/2019
=======



>>>>>>> 2/28/2019
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


    public void setLocation(View view) {
        Intent intent = new Intent( getApplicationContext(), SelectLocationActivity.class );
        intent.setFlags( Intent.FLAG_ACTIVITY_CLEAR_TOP );
        intent.putExtra( "lastLocation", about_profile_edt_area.getText().toString() );
        startActivityForResult( intent, MAP_CODE );


    }

    @Override
    public void onClick(View view) {

        if (view == top_back) {
            finish();
        } else if (view == about_profile_tv_backgroundCheck) {

            if (valideDataInfo()) {
                new uploadProfileInfoTask( this ).execute();
            }
<<<<<<< HEAD
<<<<<<< HEAD

=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
//

        } else if (about_profile_tv_leisureDayStartDate == view) {
            showDataDialog( 1 );
        } else if (about_profile_civ_profile == view) {
            if (checkAllParmisan()) {
                selectProfileImage( 201, 1 );
            } else {
                setAllParmisan();
            }
<<<<<<< HEAD
<<<<<<< HEAD
        } else if (about_profile_iv_newAdd == view) {
            if (checkAllParmisan()) {
                selectProfileImage( 205, 5 );
            } else {
                setAllParmisan();
            }
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019

        } else if (about_profile_tv_leisureDayEndDate == view) {
            showDataDialog( 2 );

        } else if (about_profile_tv_monStart == view) {
            showTimePick( about_profile_tv_monStart );
        } else if (about_profile_tv_monEnd == view) {
            showTimePick( about_profile_tv_monEnd );

        } else if (about_profile_tv_thuStart == view) {
            showTimePick( about_profile_tv_thuStart );
        } else if (about_profile_tv_thuEnd == view) {
            showTimePick( about_profile_tv_thuEnd );

        } else if (about_profile_tv_wedStart == view) {
            showTimePick( about_profile_tv_wedStart );
        } else if (about_profile_tv_wedEnd == view) {
            showTimePick( about_profile_tv_wedEnd );

        } else if (about_profile_tv_tueStart == view) {
            showTimePick( about_profile_tv_tueStart );
        } else if (about_profile_tv_tueEnd == view) {
            showTimePick( about_profile_tv_tueEnd );

        } else if (about_profile_tv_friStart == view) {
            showTimePick( about_profile_tv_friStart );
        } else if (about_profile_tv_friEnd == view) {
            showTimePick( about_profile_tv_friEnd );


        } else if (about_profile_tv_satStart == view) {
            showTimePick( about_profile_tv_satStart );
        } else if (about_profile_tv_satEnd == view) {
            showTimePick( about_profile_tv_satEnd );


        } else if (about_profile_tv_sunStart == view) {
            showTimePick( about_profile_tv_sunStart );
        } else if (about_profile_tv_sunEnd == view) {
            showTimePick( about_profile_tv_sunEnd );

        } else if (about_profile_tv_leisureDayStartTime == view) {
            showTimePick( about_profile_tv_leisureDayStartTime );

        } else if (about_profile_tv_leisureDayEndTime == view) {
            showTimePick( about_profile_tv_leisureDayEndTime );

        }
<<<<<<< HEAD
<<<<<<< HEAD


    }

=======
=======
>>>>>>> 2/28/2019
    }

    @Override
    public void onItemClick(View view, int position) {

    }

    public void ImageAdd() {
        if (checkAllParmisan()) {
            Log.e( "-------------------","Size off images =======  "+imageSet.size() );
            selectProfileImage( 205, 6-imageSet.size() );
        } else {
            setAllParmisan();
        }
    }

    public void ImageDelete(int pos) {
        imageSet.remove(pos);
        adapter.setData(imageSet);

    }






<<<<<<< HEAD
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
    private boolean valideDataInfo() {
        if (!Util.isNotEmpaty( about_profile_edt_about.getText().toString() )) {
            Toast.makeText( this, "Please Enter about of your work", Toast.LENGTH_SHORT ).show();
            return false;
        }

        if (Util.isNotEmpaty( about_profile_edt_website.getText().toString() )) {
            if (!Patterns.WEB_URL.matcher( about_profile_edt_website.getText().toString() ).matches()) {
                Toast.makeText( this, "Please Enter valid website link", Toast.LENGTH_SHORT ).show();
                return false;
            }
        }

        if (Util.isNotEmpaty( about_profile_edt_linkedin.getText().toString() )) {
            if (!Patterns.WEB_URL.matcher( about_profile_edt_linkedin.getText().toString() ).matches()) {
                Toast.makeText( this, "Please Enter valid linkedin link", Toast.LENGTH_SHORT ).show();
                return false;
            }
        }


        if (!Util.isNotEmpaty( about_profile_edt_area.getText().toString() )) {
            Toast.makeText( this, "Please Select your work area", Toast.LENGTH_SHORT ).show();
            return false;
        }


        if (about_profile_cb_mon.isChecked()) {
            if (!Util.isNotEmpaty( about_profile_tv_monStart.getText().toString() )) {
                Toast.makeText( this, "Please enter monday work starting time", Toast.LENGTH_SHORT ).show();
                return false;
            } else if (!Util.isNotEmpaty( about_profile_tv_monEnd.getText().toString() )) {
                Toast.makeText( this, "Please enter monday work end time", Toast.LENGTH_SHORT ).show();
                return false;
            } else if (!Util.isValidTime( about_profile_tv_monStart.getText().toString(), about_profile_tv_monEnd.getText().toString() )) {
                Toast.makeText( this, "Please enter valid start and end time - mon", Toast.LENGTH_SHORT ).show();
                return false;
            }
        }

        if (about_profile_cb_tue.isChecked()) {
            if (!Util.isNotEmpaty( about_profile_tv_tueStart.getText().toString() )) {
                Toast.makeText( this, "Please enter tuesday work start time", Toast.LENGTH_SHORT ).show();
                return false;
            } else if (!Util.isNotEmpaty( about_profile_tv_tueEnd.getText().toString() )) {
                Toast.makeText( this, "Please enter tuesday work end time", Toast.LENGTH_SHORT ).show();
                return false;
            } else if (!Util.isValidTime( about_profile_tv_tueStart.getText().toString(), about_profile_tv_tueEnd.getText().toString() )) {
                Toast.makeText( this, "Please enter valid start and end time - tue", Toast.LENGTH_SHORT ).show();
                return false;
            }

        }

        if (about_profile_cb_wed.isChecked()) {
            if (!Util.isNotEmpaty( about_profile_tv_wedStart.getText().toString() )) {
                Toast.makeText( this, "Please enter wednesday work start time", Toast.LENGTH_SHORT ).show();
                return false;
            } else if (!Util.isNotEmpaty( about_profile_tv_wedEnd.getText().toString() )) {
                Toast.makeText( this, "Please enter wednesday work end time", Toast.LENGTH_SHORT ).show();
                return false;
            } else if (!Util.isValidTime( about_profile_tv_wedStart.getText().toString(), about_profile_tv_wedEnd.getText().toString() )) {
                Toast.makeText( this, "Please enter valid start and end time - wed", Toast.LENGTH_SHORT ).show();
                return false;
            }
        }

        if (about_profile_cb_thu.isChecked()) {
            if (!Util.isNotEmpaty( about_profile_tv_thuStart.getText().toString() )) {
                Toast.makeText( this, "Please enter thursday work start time", Toast.LENGTH_SHORT ).show();
                return false;
            } else if (!Util.isNotEmpaty( about_profile_tv_thuEnd.getText().toString() )) {
                Toast.makeText( this, "Please enter thursday work end time", Toast.LENGTH_SHORT ).show();
                return false;
            } else if (!Util.isValidTime( about_profile_tv_thuStart.getText().toString(), about_profile_tv_thuEnd.getText().toString() )) {
                Toast.makeText( this, "Please enter valid start and end time - thu", Toast.LENGTH_SHORT ).show();
                return false;
            }
        }

        if (about_profile_cb_fri.isChecked()) {
            if (!Util.isNotEmpaty( about_profile_tv_friStart.getText().toString() )) {
                Toast.makeText( this, "Please enter friday work start time", Toast.LENGTH_SHORT ).show();
                return false;
            } else if (!Util.isNotEmpaty( about_profile_tv_friEnd.getText().toString() )) {
                Toast.makeText( this, "Please enter friday work end time", Toast.LENGTH_SHORT ).show();
                return false;
            } else if (!Util.isValidTime( about_profile_tv_friStart.getText().toString(), about_profile_tv_friEnd.getText().toString() )) {
                Toast.makeText( this, "Please enter valid start and end time - fri", Toast.LENGTH_SHORT ).show();
                return false;
            }
        }

        if (about_profile_cb_sat.isChecked()) {
            if (!Util.isNotEmpaty( about_profile_tv_satStart.getText().toString() )) {
                Toast.makeText( this, "Please enter saturday work start time", Toast.LENGTH_SHORT ).show();
                return false;
            } else if (!Util.isNotEmpaty( about_profile_tv_satEnd.getText().toString() )) {
                Toast.makeText( this, "Please enter saturday work end time", Toast.LENGTH_SHORT ).show();
                return false;
            } else if (!Util.isValidTime( about_profile_tv_satStart.getText().toString(), about_profile_tv_satEnd.getText().toString() )) {
                Toast.makeText( this, "Please enter valid start and end time - sat", Toast.LENGTH_SHORT ).show();
                return false;
            }
        }

        if (about_profile_cb_sun.isChecked()) {
            if (!Util.isNotEmpaty( about_profile_tv_sunStart.getText().toString() )) {
                Toast.makeText( this, "Please enter sunday work start time", Toast.LENGTH_SHORT ).show();
                return false;
            } else if (!Util.isNotEmpaty( about_profile_tv_sunEnd.getText().toString() )) {
                Toast.makeText( this, "Please enter sunday work end time", Toast.LENGTH_SHORT ).show();
                return false;
            } else if (!Util.isValidTime( about_profile_tv_sunStart.getText().toString(), about_profile_tv_sunEnd.getText().toString() )) {
                Toast.makeText( this, "Please enter valid start and end time - sun", Toast.LENGTH_SHORT ).show();
                return false;
            }
        }


        if (about_profile_cb_nearByLastMin.isChecked()) {
            if (!Util.isNotEmpaty( about_profile_edt_nearMiles.getText().toString() )) {
                Toast.makeText( this, "Please enter nearest miles", Toast.LENGTH_SHORT ).show();
                return false;
            } else if (!Util.isNotEmpaty( about_profile_edt_nearOff.getText().toString() )) {
                Toast.makeText( this, "Please enter nearest miles offers.", Toast.LENGTH_SHORT ).show();
                return false;
            }
        }

        if (about_profile_cb_leisureDay.isChecked()) {
            if (!Util.isNotEmpaty( about_profile_tv_leisureDayStartDate.getText().toString() )) {
                Toast.makeText( this, "Please enter leisure Start date", Toast.LENGTH_SHORT ).show();
                return false;
            } else if (!Util.isNotEmpaty( about_profile_tv_leisureDayStartTime.getText().toString() )) {
                Toast.makeText( this, "Please enter leisure date Start time", Toast.LENGTH_SHORT ).show();
                return false;
            } else if (!Util.isNotEmpaty( about_profile_tv_leisureDayEndDate.getText().toString() )) {
                Toast.makeText( this, "Please enter leisure end date", Toast.LENGTH_SHORT ).show();
                return false;
            } else if (!Util.isNotEmpaty( about_profile_tv_leisureDayEndTime.getText().toString() )) {
                Toast.makeText( this, "Please enter leisure end time", Toast.LENGTH_SHORT ).show();
                return false;
            } else if (!Util.isVelideDateBoth( about_profile_tv_leisureDayStartDate.getText().toString() + " " + about_profile_tv_leisureDayStartTime.getText().toString(),
                    about_profile_tv_leisureDayEndDate.getText().toString() + " " + about_profile_tv_leisureDayEndTime.getText().toString() )) {
                Toast.makeText( this, "Please enter leisure valida date and time ", Toast.LENGTH_SHORT ).show();
                return false;
            } else if (!Util.isNotEmpaty( about_profile_edt_leisureDayOff.getText().toString() )) {
                Toast.makeText( this, "Please enter leisure day off %", Toast.LENGTH_SHORT ).show();
                return false;
            }
        }


        return true;
    }


    private void showDataDialog(int setPos) {

        calendar = Calendar.getInstance();
        year = calendar.get( Calendar.YEAR );
        month = calendar.get( Calendar.MONTH );
        day = calendar.get( Calendar.DAY_OF_MONTH );
        setDatePos = setPos;
        DatePickerDialog datePickerDialog = new DatePickerDialog( this, myDateListener, year, month, day );
        datePickerDialog.getDatePicker().setMinDate( (long) (System.currentTimeMillis()) );
        datePickerDialog.setOnDismissListener( new DialogInterface.OnDismissListener() {
            @Override
            public void onDismiss(DialogInterface dialogInterface) {
                setDatePos = 0;
            }
        } );
        datePickerDialog.setOnCancelListener( new DialogInterface.OnCancelListener() {
            @Override
            public void onCancel(DialogInterface dialogInterface) {
                setDatePos = 0;
            }
        } );
        datePickerDialog.show();
        datePickerDialog.getButton( DatePickerDialog.BUTTON_NEGATIVE ).setTextColor( Color.RED );
        datePickerDialog.getButton( DatePickerDialog.BUTTON_POSITIVE ).setTextColor( Color.RED );
    }


    private DatePickerDialog.OnDateSetListener myDateListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker arg0, int arg1, int arg2, int arg3) {
            // arg1 = year
            // arg2 = month
            // arg3 = daya
            showDate( arg1, arg2 + 1, arg3 );
        }
    };

    public void showDate(int year, int month, int day) {

        date = year + "-" + month + "-" + day;
        if (setDatePos == 1) {
            about_profile_tv_leisureDayStartDate.setText( Util.getDateWithFormate( date, "yyyy-MM-dd", "MM/dd/yyyy" ) );
        } else if (setDatePos == 2) {
            about_profile_tv_leisureDayEndDate.setText( Util.getDateWithFormate( date, "yyyy-MM-dd", "MM/dd/yyyy" ) );

        }
    }

    private void selectProfileImage(int post, int imageSize) {

        Config config = new Config();
        config.setToolbarTitleRes( R.string.app_name );
        config.setSelectionMin( 1 );
        config.setSelectionLimit( imageSize );
        config.setSelectedBottomColor( "#500b02" );
        config.setTabBackgroundColor( "#D5D5D5" );
        config.setTabSelectionIndicatorColor( "#500b02" );
        config.setToolbarTitleColor( "#909090" );

        ImagePickerActivity.setConfig( config );

        Intent intent = new Intent( this, ImagePickerActivity.class );
        startActivityForResult( intent, post );

    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult( requestCode, resultCode, data );

        if (resultCode == Activity.RESULT_OK) {
            try {
                if (requestCode == MAP_CODE) {

                    double strLatitude = (double) data.getExtras().get( "location_lat" );
                    double strLongitude = (double) data.getExtras().get( "location_lng" );

                    selectedCodineters = new LatLng( strLatitude, strLongitude );

<<<<<<< HEAD
<<<<<<< HEAD
//                    AppLog.Log( "receive------- Latitude", strLatitude + "  ---------" );
//                    AppLog.Log( "receive------- Longitude", strLongitude + "  ---------" );

=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
                    Geocoder geocoder;
                    List<Address> addresses;
                    geocoder = new Geocoder( this, Locale.getDefault() );

                    addresses = geocoder.getFromLocation( strLatitude, strLongitude, 1 ); // Here 1 represent max location result to returned, by documents it recommended 1 to 5

                    String address = addresses.get( 0 ).getAddressLine( 0 ); // If any additional address line present than only, check with max available address lines by getMaxAddressLineIndex()
                    String city = addresses.get( 0 ).getLocality();
                    String state = addresses.get( 0 ).getAdminArea();
//
                    about_profile_edt_area.setText( address );

                    selectedCoords = new LatLng( strLatitude, strLongitude );
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
                                .strokeColor( ContextCompat.getColor( ProfileAddActivity.this, R.color.map_mRadius ) )
                                .fillColor( ContextCompat.getColor( ProfileAddActivity.this, R.color.map_mRadius ) )
                                .strokeWidth( 0.1f ) );


                        if (mRadius > 0 && selectedCoords != null) {
                            int zoom = getZoomLevel( mRadiusCircle );
                            mGoogleMap.animateCamera( CameraUpdateFactory.newLatLngZoom( selectedCoords, zoom ) );
                        } else {
                            mGoogleMap.animateCamera( CameraUpdateFactory.newLatLngZoom( selectedCoords, 16 ) );
                        }

                    }


                } else if (requestCode == 201) {

                    ArrayList<Uri> image_uris = data.getParcelableArrayListExtra( ImagePickerActivity.EXTRA_IMAGE_URIS );
                    imgPicturePath1 = image_uris.get( 0 ).toString();

                    if (imgPicturePath1 != null) {
                        File file = new File( imgPicturePath1 );
                        if (file.exists()) {
                            Bitmap bitmap = BitmapFactory.decodeFile( imgPicturePath1 );
                            about_profile_civ_profile.setImageBitmap( bitmap );
                        } else {
                            imgPicturePath1 = null;
                        }
                    }
                } else if (requestCode == 205) {
<<<<<<< HEAD
<<<<<<< HEAD

                    if (imgPicturePath1 == null) {
                        ArrayList<Uri> image_uris = data.getParcelableArrayListExtra( ImagePickerActivity.EXTRA_IMAGE_URIS );
//                        imgPicturePath2 = image_uris.get( 0 ).toString();
//
//                        if (imgPicturePath2 != null) {
//                            File file = new File( imgPicturePath2 );
//                            if (file.exists()) {
//                                Bitmap bitmap = BitmapFactory.decodeFile( imgPicturePath1 );
//                                ivImage1.setImageBitmap( bitmap );
//                            } else {
//                                imgPicturePath1 = null;
//                            }
//                        }
                    }
=======
                        ArrayList<Uri> image_uris = data.getParcelableArrayListExtra( ImagePickerActivity.EXTRA_IMAGE_URIS );
                        imageSet.addAll(image_uris);
                        adapter.setData(imageSet);
>>>>>>> 2/27/2019
=======
                    ArrayList<Uri> image_uris = data.getParcelableArrayListExtra( ImagePickerActivity.EXTRA_IMAGE_URIS );
                    ArrayList<String> newList = new ArrayList<>();
                    for (int i = 0;i<image_uris.size();i++){
                        newList.add(image_uris.get(i).toString());
                    }

                    imageSet.addAll(newList );
                    adapter.setData( imageSet );
>>>>>>> 2/28/2019
                }

                if (requestCode == SETTING_PERMISSION_CODE) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                        if (checkWriteExternalPermission( perms[0] ) && checkWriteExternalPermission( perms[1] ) && checkWriteExternalPermission( perms[2] )) {

                        } else {
                            displayDialog();
                        }
                    }

                }

            } catch (Exception e) {
                // TODO: handle exception
//            Util.displayDialog(getString(R.string.app_name), getString(R.string.msg_fileNotSupport), this, false);
                e.printStackTrace();
            }
        }
    }

    public static double milesToMeters(double miles) {
        return 1609.34 * miles;
    }


    private void setAllParmisan() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            requestPermissions( perms, PERMISSION_REQUEST_CODE );
        }
    }

    private boolean checkAllParmisan() {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {

            if (checkWriteExternalPermission( perms[0] ) && checkWriteExternalPermission( perms[1] ) && checkWriteExternalPermission( perms[2] )) {
                return true;
            } else {
                return false;
            }
        } else {
            return true;
        }

    }


    private boolean checkWriteExternalPermission(String permissionName) {

        String permission = permissionName;
        int res = this.checkCallingOrSelfPermission( permission );
        return (res == PackageManager.PERMISSION_GRANTED);
    }

    @Override
    public void onRequestPermissionsResult(int permsRequestCode, String[] permissions,
                                           int[] grantResults) {
//            case 200:
        if (permsRequestCode == 200) {
            boolean locationAccepted = grantResults[0] == PackageManager.PERMISSION_GRANTED;
            boolean cameraAccepted = grantResults[1] == PackageManager.PERMISSION_GRANTED;
            boolean storageAccepted = grantResults[2] == PackageManager.PERMISSION_GRANTED;

            if (locationAccepted && cameraAccepted && storageAccepted) {
                showToast( R.string.msg_permission );
            } else {
                displayDialog();
            }
        }
    }

    public static int SETTING_PERMISSION_CODE = 110;
    private AlertDialog dialog1;

    public void displayDialog() {

        dialog1 = new AlertDialog.Builder( this )
                .setTitle( "Permission needed" )
                .setCancelable( false )
                .setMessage( "All permissions are required without access to your phone. In order to identify calls you need to change your phone permission in settings." )
                .setPositiveButton( "LET'S DO THIS", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // continue with delete

                        dialog1.dismiss();
                        Intent intent = new Intent();
                        intent.setAction( Settings.ACTION_APPLICATION_DETAILS_SETTINGS );
                        Uri uri = Uri.fromParts( "package", ProfileAddActivity.this.getPackageName(), null );
                        intent.setData( uri );
                        startActivityForResult( intent, SETTING_PERMISSION_CODE );
                    }
                } )
                .setNegativeButton( "Exit", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // do nothing
                        dialog1.dismiss();
                        finish();
                    }
                } )
                .setIcon( R.mipmap.ic_launcher )
                .show();


    }

    private void showTimePick(final TextViewEuphemiaUCASRegular about_profile_tv) {

        Calendar mcurrentTime = Calendar.getInstance();
        int hour = mcurrentTime.get( Calendar.HOUR_OF_DAY );
        int minute = mcurrentTime.get( Calendar.MINUTE );
        TimePickerDialog mTimePicker;
        mTimePicker = new TimePickerDialog( this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                if (selectedHour >= 12) {
                    about_profile_tv.setText( setZero( selectedHour - 12 ) + ":" + setZero( selectedMinute ) + " PM" );
                } else {
                    about_profile_tv.setText( setZero( selectedHour ) + ":" + setZero( selectedMinute ) + " AM" );
                }
//                about_profile_tv.setText( selectedHour + ":" + selectedMinute);
            }
        }, hour, minute, true );//Yes 24 hour time
        mTimePicker.setTitle( "Select Time" );
        mTimePicker.show();
    }


    private String setZero(int getZero) {
        if (getZero < 10) {
            return "0" + getZero;
        } else {
            return getZero + "";
        }

    }


    @Override
    public void onConnected(Bundle bundle) {
//        Log.d("connected", "connected");
        Location location = LocationServices.FusedLocationApi.getLastLocation( mGoogleApiClient );

        if (location == null) {
            LocationServices.FusedLocationApi.requestLocationUpdates( mGoogleApiClient, mLocationRequest, this );
            Toast.makeText( this, "No location found", Toast.LENGTH_SHORT ).show();

        } else {
            LatLng latLng = new LatLng( application.getLatitude(), application.getLongitude() );
            CameraPosition position = CameraPosition.builder().target( latLng ).zoom( 18f ).bearing( 0.0f ).tilt( 0.0f ).build();
            mGoogleMap.animateCamera( CameraUpdateFactory.newCameraPosition( position ) );
        }
    }

    @Override
    public void onConnectionFailed(ConnectionResult connectionResult) {

        if (connectionResult.hasResolution()) {
            try {
                connectionResult.startResolutionForResult( this, CONNECTION_FAILURE_RESOLUTION_REQUEST );

            } catch (IntentSender.SendIntentException e) {
                e.printStackTrace();
            }
        } else {

//            Log.e("Error", "Location services connection failed with code " + connectionResult.getErrorCode());
        }
    }


    @Override
    public void onConnectionSuspended(int i) {
    }

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

    private void setZoom(boolean isRandom) {
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
//        for (Marker marker : nearbyMarkers) {
//            builder.include( marker.getPosition() );
//        }
        LatLngBounds bounds = builder.build();
        if (isRandom) {
            mGoogleMap.animateCamera( CameraUpdateFactory.newLatLngZoom( selectedCoords, 17 ) );
        } else {
            int padding = 200; // offset from edges of the map in pixels
            mGoogleMap.animateCamera( CameraUpdateFactory.newLatLngBounds( bounds, padding ) );
        }
    }


<<<<<<< HEAD
<<<<<<< HEAD
=======

>>>>>>> 2/27/2019
=======

>>>>>>> 2/28/2019
    public class uploadProfileInfoTask extends AsyncTask<Void, Void, String> {

        private ProgressDialog mDialog = null;
        private Activity mActivity;


        public uploadProfileInfoTask(Activity activity) {
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
                jsonObject.put( "email", preferences.getString( "email", "" ) );
                jsonObject.put( "phone", preferences.getString( "mobile_no", "" ) );
                jsonObject.put( "profile_status", "Not Verified" );
<<<<<<< HEAD
<<<<<<< HEAD
=======
                jsonObject.put( "profile_image", "" );
                jsonObject.put( "workImages", new JSONArray() );
>>>>>>> 2/27/2019
=======
                jsonObject.put( "profile_image", "" );
                jsonObject.put( "workImages", new JSONArray() );
>>>>>>> 2/28/2019
                jsonObject.put( "about_sp_profile", about_profile_edt_about.getText().toString() );
                jsonObject.put( "website", about_profile_edt_website.getText().toString() );
                jsonObject.put( "linkedin", about_profile_edt_linkedin.getText().toString() );
                jsonObject.put( "service_area", about_profile_edt_area.getText().toString() );
                jsonObject.put( "radius", about_profile_seekbar_radius.getProgress() );

                JSONObject jsonObjectCoordinatePoint = new JSONObject();
                jsonObjectCoordinatePoint.put( "latitude", selectedCodineters.latitude + "" );
                jsonObjectCoordinatePoint.put( "longitude", selectedCodineters.longitude + "" );
                jsonObject.put( "coordinatePoint", jsonObjectCoordinatePoint );

                if (about_profile_cb_leisureDay.isChecked()) {
                    jsonObject.put( "leisure_day_offer", "ON" );
                    JSONObject jsonObjectLeisureDay = new JSONObject();
                    jsonObjectLeisureDay.put( "leisure_day_discount", about_profile_edt_leisureDayOff.getText().toString() );
                    jsonObjectLeisureDay.put( "start_date", about_profile_tv_leisureDayStartDate.getText().toString() );
                    jsonObjectLeisureDay.put( "start_time", about_profile_tv_leisureDayStartTime.getText().toString() );
                    jsonObjectLeisureDay.put( "end_date", about_profile_tv_leisureDayEndDate.getText().toString() );
                    jsonObjectLeisureDay.put( "end_time", about_profile_tv_leisureDayEndTime.getText().toString() );

                    jsonObject.put( "leisure_day_offer_on", jsonObjectLeisureDay );
                } else {
                    jsonObject.put( "leisure_day_offer", "OFF" );
                    JSONObject jsonObjectLeisureDay = new JSONObject();
                    jsonObject.put( "leisure_day_offer_on", jsonObjectLeisureDay );
                }

                if (about_profile_cb_nearByLastMin.isChecked()) {
                    jsonObject.put( "near_offer_selected", "ON" );
                    JSONObject jsonObjectNearOffer = new JSONObject();
                    jsonObjectNearOffer.put( "distance", about_profile_edt_nearMiles.getText().toString() );
                    jsonObjectNearOffer.put( "offer", about_profile_edt_nearOff.getText().toString() );
                    jsonObject.put( "near_offer_selected_on", jsonObjectNearOffer );
                } else {
                    jsonObject.put( "near_offer_selected", "OFF" );
                    JSONObject jsonObjectNearOffer = new JSONObject();
                    jsonObject.put( "near_offer_selected_on", jsonObjectNearOffer );
                }

                if (about_profile_rb_fullWeek.isChecked()) {
                    jsonObject.put( "working_hours_24_7", "ON" );
                    jsonObject.put( "custom_work_hours", "OFF" );
                    JSONArray jsonWeekArray = new JSONArray();
                    jsonObject.put( "custom_work_per_day", jsonWeekArray );

                } else {
                    jsonObject.put( "working_hours_24_7", "OFF" );
                    jsonObject.put( "custom_work_hours", "ON" );

                    JSONArray jsonWeekArray = new JSONArray();

                    if (about_profile_cb_mon.isChecked()) {
                        JSONObject jsonObjectWeeek = new JSONObject();
                        jsonObjectWeeek.put( "dayName", "mon" );
                        jsonObjectWeeek.put( "start_time", about_profile_tv_monStart.getText().toString() );
                        jsonObjectWeeek.put( "end_time", about_profile_tv_monEnd.getText().toString() );
                        jsonWeekArray.put( jsonObjectWeeek );
                    }

                    if (about_profile_cb_tue.isChecked()) {
                        JSONObject jsonObjectWeeek = new JSONObject();
                        jsonObjectWeeek.put( "dayName", "tue" );
                        jsonObjectWeeek.put( "start_time", about_profile_tv_tueStart.getText().toString() );
                        jsonObjectWeeek.put( "end_time", about_profile_tv_tueEnd.getText().toString() );
                        jsonWeekArray.put( jsonObjectWeeek );
                    }

                    if (about_profile_cb_wed.isChecked()) {
                        JSONObject jsonObjectWeeek = new JSONObject();
                        jsonObjectWeeek.put( "dayName", "wed" );
                        jsonObjectWeeek.put( "start_time", about_profile_tv_wedStart.getText().toString() );
                        jsonObjectWeeek.put( "end_time", about_profile_tv_wedEnd.getText().toString() );
                        jsonWeekArray.put( jsonObjectWeeek );
                    }

                    if (about_profile_cb_thu.isChecked()) {
                        JSONObject jsonObjectWeeek = new JSONObject();
                        jsonObjectWeeek.put( "dayName", "thu" );
                        jsonObjectWeeek.put( "start_time", about_profile_tv_thuStart.getText().toString() );
                        jsonObjectWeeek.put( "end_time", about_profile_tv_thuEnd.getText().toString() );
                        jsonWeekArray.put( jsonObjectWeeek );
                    }

                    if (about_profile_cb_fri.isChecked()) {
                        JSONObject jsonObjectWeeek = new JSONObject();
                        jsonObjectWeeek.put( "dayName", "thu" );
                        jsonObjectWeeek.put( "start_time", about_profile_tv_friStart.getText().toString() );
                        jsonObjectWeeek.put( "end_time", about_profile_tv_friEnd.getText().toString() );
                        jsonWeekArray.put( jsonObjectWeeek );
                    }

                    if (about_profile_cb_sat.isChecked()) {
                        JSONObject jsonObjectWeeek = new JSONObject();
                        jsonObjectWeeek.put( "dayName", "sat" );
                        jsonObjectWeeek.put( "start_time", about_profile_tv_satStart.getText().toString() );
                        jsonObjectWeeek.put( "end_time", about_profile_tv_satEnd.getText().toString() );
                        jsonWeekArray.put( jsonObjectWeeek );
                    }

                    if (about_profile_cb_sun.isChecked()) {
                        JSONObject jsonObjectWeeek = new JSONObject();
                        jsonObjectWeeek.put( "dayName", "sun" );
                        jsonObjectWeeek.put( "start_time", about_profile_tv_sunStart.getText().toString() );
                        jsonObjectWeeek.put( "end_time", about_profile_tv_sunEnd.getText().toString() );
                        jsonWeekArray.put( jsonObjectWeeek );
                    }

                    jsonObject.put( "custom_work_per_day", jsonWeekArray );
                }

                Log.e( "--------------Post", jsonObject.toString() );
                String response = new WebUtil().postMethod( jsonObject.toString(), WebApi.URL_ADD_WORK_PROFILE );
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
            Apiresponse apiresponse = gson.fromJson( response, Apiresponse.class );

            if (apiresponse.getStatus() == 1) {
<<<<<<< HEAD
<<<<<<< HEAD
                Toast.makeText( mActivity, apiresponse.getMessage(), Toast.LENGTH_SHORT ).show();
//                Intent intent = new Intent( this, BackgroundFormActivity.class );
////            startActivity( intent );
////            finish();
=======
=======
>>>>>>> 2/28/2019
//                Toast.makeText( mActivity, apiresponse.getMessage(), Toast.LENGTH_SHORT ).show();

                if(imageSet.size()>0){
                    new WSCreateWorkProfileUploadImage(mActivity,imageSet).execute( );
                }else if(imgPicturePath1 != null) {
                    new WSCreateProfileUploadImage( mActivity, imgPicturePath1 ).execute();
                }else {
                    Toast.makeText( mActivity, apiresponse.getMessage(), Toast.LENGTH_SHORT ).show();
                    Intent intent = new Intent( mActivity, BackgroundFormActivity.class );
                    startActivity( intent );
                    mActivity.finish();
                }
//
            } else {
                Toast.makeText( mActivity, apiresponse.getMessage(), Toast.LENGTH_SHORT ).show();
            }
        }
    }


    public class WSCreateWorkProfileUploadImage extends AsyncTask<Void, String , String> {

        private ProgressDialog mDialog = null;
        private Activity mActivity;
<<<<<<< HEAD
        private ArrayList<Uri> fileList;


        public WSCreateWorkProfileUploadImage(Activity activity,ArrayList<Uri> fileData) {
=======
        private ArrayList<String> fileList;


        public WSCreateWorkProfileUploadImage(Activity activity,ArrayList<String> fileData) {
>>>>>>> 2/28/2019
            mActivity = activity;
            this.fileList = fileData;
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
            String response = new WebUtil().postImagesInServer( WebApi.URL_SP_WORK_IMAGE_UPLOAD+"/"+ preferences.getString( "sp_id", "" ), fileList );
            return response;
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
            Apiresponse apiresponse = gson.fromJson( response, Apiresponse.class );
            Log.e( "------- Response ", "------------- 0000000000000000" + apiresponse.getMessage() );
            if (apiresponse.getStatus() == 1) {

                if (imgPicturePath1 != null) {
                    new WSCreateProfileUploadImage( mActivity, imgPicturePath1 ).execute();
                }else {
                    Toast.makeText( mActivity, apiresponse.getMessage(), Toast.LENGTH_SHORT ).show();
                    Intent intent = new Intent( mActivity, BackgroundFormActivity.class );
                    startActivity( intent );
                    mActivity.finish();
                }
            } else {
                Toast.makeText( mActivity, apiresponse.getMessage(), Toast.LENGTH_SHORT ).show();
            }
        }
    }

    public class WSCreateProfileUploadImage extends AsyncTask<Void, String, String> {

        private ProgressDialog mDialog = null;
        private Activity mActivity;
        private String fileList;


        public WSCreateProfileUploadImage(Activity activity,String fileData) {
            mActivity = activity;
            this.fileList = fileData;
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
        protected String  doInBackground(Void... params) {
            // TODO Auto-generated method stub
            String  response = new WebUtil().postProfileImagesInServer( WebApi.URL_SP_PROFILE_IMAGE_UPLOAD+"/"+ preferences.getString( "sp_id", "" ), fileList );
            return response;
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
            Apiresponse apiresponse = gson.fromJson( response, Apiresponse.class );
            Log.e( "------- Response ", "------------- 22222222222222" + apiresponse.getMessage() );
            if (apiresponse.getStatus() == 1) {
                Toast.makeText( mActivity, apiresponse.getMessage(), Toast.LENGTH_SHORT ).show();
                Intent intent = new Intent( mActivity, BackgroundFormActivity.class );
                startActivity( intent );
                mActivity.finish();
<<<<<<< HEAD
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
            } else {
                Toast.makeText( mActivity, apiresponse.getMessage(), Toast.LENGTH_SHORT ).show();
            }
        }
    }

<<<<<<< HEAD
<<<<<<< HEAD
=======

>>>>>>> 2/27/2019
=======

>>>>>>> 2/28/2019
}
