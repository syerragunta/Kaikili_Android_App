package com.sit.kaikiliService.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
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
import android.content.DialogInterface;
import android.content.Intent;
=======
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
>>>>>>> 2/25/2019
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
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
import android.graphics.drawable.Drawable;
import android.location.Address;
import android.location.Geocoder;
import android.location.LocationManager;
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
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
>>>>>>> 2/25/2019
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
<<<<<<< HEAD
=======
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.Patterns;
>>>>>>> 2/25/2019
import android.view.View;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.ImageView;
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
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.sit.kaikiliService.KetanApplication;
import com.sit.kaikiliService.R;
import com.sit.kaikiliService.camera.Config;
import com.sit.kaikiliService.camera.ImagePickerActivity;
import com.sit.kaikiliService.comman.AppLog;
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
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
>>>>>>> 2/25/2019
import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
import com.sit.kaikiliService.camera.Config;
import com.sit.kaikiliService.camera.ImagePickerActivity;
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
import com.sit.kaikiliService.comman.AppLog;
>>>>>>> 2/25/2019
import com.sit.kaikiliService.comman.Util;
import com.sit.kaikiliService.font.EditTextEupheminUCASRegular;
import com.sit.kaikiliService.font.TextViewEuphemiaUCASRegular;

import org.adw.library.widgets.discreteseekbar.DiscreteSeekBar;

import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
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
import java.util.List;
import java.util.Locale;
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
import java.util.List;
import java.util.Locale;
>>>>>>> 2/25/2019

import butterknife.Bind;
import butterknife.ButterKnife;


/**
 * Created by ketan patel on 23/1/2019 - 25-1/2019.
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
 */

<<<<<<< HEAD
public class ProfileEditActivity extends BaseActivity implements View.OnClickListener {
=======
public class ProfileEditActivity extends BaseActivity implements View.OnClickListener,
        GoogleApiClient.OnConnectionFailedListener,
        GoogleApiClient.ConnectionCallbacks,
        LocationListener, OnMapReadyCallback {
>>>>>>> 2/25/2019

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

    @Bind(R.id.about_profile_iv_newAdd)
    ImageView about_profile_iv_newAdd;
    @Bind(R.id.about_profile_civ_profile)
    ImageView about_profile_civ_profile;


<<<<<<< HEAD
=======
    @Bind(R.id.about_profile_radioGroup_work)
    RadioGroup about_profile_radioGroup_work;

    @Bind(R.id.about_profile_rb_fullWeek)
    RadioButton about_profile_rb_fullWeek;
    @Bind(R.id.about_profile_rb_workDay)
    RadioButton about_profile_rb_workDay;


>>>>>>> 2/25/2019
    String[] perms = {"android.permission.CAMERA",
            "android.permission.WRITE_EXTERNAL_STORAGE",
            "android.permission.READ_EXTERNAL_STORAGE"};

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
=======
    private KaikiliApplication application;
>>>>>>> 2/16/2019
=======
    private KaikiliApplication application;
>>>>>>> 2/18/2019
=======
    private KaikiliApplication application;
>>>>>>> 2/21/2019
=======
    private KaikiliApplication application;
>>>>>>> 2/22/2019
=======
    private KaikiliApplication application;
>>>>>>> 2/23/2019
=======

    private KaikiliApplication application;
>>>>>>> 2/25/2019
    private SharedPreferences preferences;
    private Calendar calendar;
    private int year, month, day;
    private String date;
    private int setDatePos = 0;
    protected int mRadius = 10;
    private int MAP_CODE = 120;
    private static final int PERMISSION_REQUEST_CODE = 200;
    private String imgPicturePath1, imgPicturePath2;
<<<<<<< HEAD
=======
    private final static int CONNECTION_FAILURE_RESOLUTION_REQUEST = 9000;

    private static GoogleMap mGoogleMap;
    private static GoogleApiClient mGoogleApiClient;
    private LocationRequest mLocationRequest = new LocationRequest();
    private Circle mRadiusCircle;
    public LatLng selectedCoords = null;
>>>>>>> 2/25/2019

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_edit_profile );
        ButterKnife.bind( this, this );

        calendar = Calendar.getInstance();
        year = calendar.get( Calendar.YEAR );
        month = calendar.get( Calendar.MONTH );
        day = calendar.get( Calendar.DAY_OF_MONTH );

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
=======
        application = (KaikiliApplication) getApplicationContext();
>>>>>>> 2/16/2019
=======
        application = (KaikiliApplication) getApplicationContext();
>>>>>>> 2/18/2019
=======
        application = (KaikiliApplication) getApplicationContext();
>>>>>>> 2/21/2019
=======
        application = (KaikiliApplication) getApplicationContext();
>>>>>>> 2/22/2019
=======
        application = (KaikiliApplication) getApplicationContext();
>>>>>>> 2/23/2019
=======
        application = (KaikiliApplication) getApplicationContext();
>>>>>>> 2/25/2019
        preferences = application.getSharedPreferences();

        imgPicturePath1 = null;
        imgPicturePath2 = null;

        top_title.setText( "Create Profile" );
        top_back.setOnClickListener( this );
        about_profile_tv_backgroundCheck.setOnClickListener( this );
        about_profile_tv_leisureDayStartDate.setOnClickListener( this );
        about_profile_tv_leisureDayEndDate.setOnClickListener( this );
        about_profile_civ_profile.setOnClickListener( this );
        about_profile_iv_newAdd.setOnClickListener( this );

<<<<<<< HEAD
=======
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


>>>>>>> 2/25/2019
        about_profile_seekbar_radius.setNumericTransformer( new DiscreteSeekBar.NumericTransformer() {
            @Override
            public int transform(int value) {
                return value * 10;
            }
        } );
        about_profile_tv_radius.setText( Util.fromHtml( String.format( "Radius: %s Miles", mRadius ) ) );

<<<<<<< HEAD
=======

        if (mGoogleApiClient == null) {
            mGoogleApiClient = new GoogleApiClient.Builder( this )
                    .addApi( LocationServices.API )
                    .addConnectionCallbacks( this )
                    .addOnConnectionFailedListener( this )
                    .build();
            mGoogleApiClient.connect();
        }


>>>>>>> 2/25/2019
        about_profile_seekbar_radius.setOnProgressChangeListener( new DiscreteSeekBar.OnProgressChangeListener() {
            @Override
            public void onProgressChanged(DiscreteSeekBar seekBar, int value, boolean fromUser) {
                int convert = value * 10;
                mRadius = convert;
                about_profile_tv_radius.setText( Util.fromHtml( String.format( "Radius: %s Miles", mRadius ) ) );
<<<<<<< HEAD
//                if (mRadiusCircle == null) return;
//                mRadiusCircle.setRadius( convert );

//                LatLng myLatLng = new LatLng( application.getLatitude(), application.getLongitude() );
//                if (mRadius > 0) {
//                    int zoom = getZoomLevel( mRadiusCircle );
//                    mGoogleMap.animateCamera( CameraUpdateFactory.newLatLngZoom( selectedCoords, zoom ) );
//                } else {
//                    mGoogleMap.animateCamera( CameraUpdateFactory.newLatLngZoom( selectedCoords, 16 ) );
//                }
=======
                if (mRadiusCircle == null) return;
                mRadiusCircle.setRadius( convert );

                LatLng myLatLng = new LatLng( application.getLatitude(), application.getLongitude() );
                if (mRadius > 0 && selectedCoords != null) {
                    int zoom = getZoomLevel( mRadiusCircle );
                    mGoogleMap.animateCamera( CameraUpdateFactory.newLatLngZoom( selectedCoords, zoom ) );
                } else {
                    mGoogleMap.animateCamera( CameraUpdateFactory.newLatLngZoom( selectedCoords, 16 ) );
                }
>>>>>>> 2/25/2019
            }

            @Override
            public void onStartTrackingTouch(DiscreteSeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(DiscreteSeekBar seekBar) {
//                getNearbyTales( "Searching Nearest Tales .." );
            }
        } );


<<<<<<< HEAD
=======
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
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mGoogleMap = googleMap;
        mGoogleMap.getUiSettings().setZoomControlsEnabled( true );
        mGoogleMap.getUiSettings().setMapToolbarEnabled( false );
        mGoogleMap.getUiSettings().setCompassEnabled( false );

        mGoogleMap.clear();
//        mGoogleMap.addMarker( new MarkerOptions()
//                .position( selectedCoords )
//                .anchor( .5f, .5f )
//                .title( "My Location" ) );
//
//        mRadiusCircle = mGoogleMap.addCircle( new CircleOptions()
//                .center( selectedCoords )
//                .radius( mRadius )
//                .strokeColor( ContextCompat.getColor( ProfileEditActivity.this, R.color.map_mRadius ) )
//                .fillColor( ContextCompat.getColor( ProfileEditActivity.this, R.color.map_mRadius ) )
//                .strokeWidth( 0.1f ) );

>>>>>>> 2/25/2019
    }


    public void setLocation(View view) {
<<<<<<< HEAD
        Intent intent = new Intent( this, SelectLocationActivity.class );
        startActivity( intent );
=======
        Intent intent = new Intent( getApplicationContext(), SelectLocationActivity.class );
        intent.setFlags( Intent.FLAG_ACTIVITY_CLEAR_TOP );
        intent.putExtra( "lastLocation", about_profile_edt_area.getText().toString() );
        startActivityForResult( intent, MAP_CODE );


>>>>>>> 2/25/2019
    }

    @Override
    public void onClick(View view) {

        if (view == top_back) {
            finish();
        } else if (view == about_profile_tv_backgroundCheck) {
<<<<<<< HEAD
            Intent intent = new Intent( this, BackgroundFormActivity.class );
            startActivity( intent );
            finish();
=======

            if (valideDataInfo()) {

            }

//            Intent intent = new Intent( this, BackgroundFormActivity.class );
//            startActivity( intent );
//            finish();
>>>>>>> 2/25/2019

        } else if (about_profile_tv_leisureDayStartDate == view) {
            showDataDialog( 1 );
        } else if (about_profile_civ_profile == view) {
            if (checkAllParmisan()) {
<<<<<<< HEAD
                selectProfileImage( 201,1 );
=======
                selectProfileImage( 201, 1 );
>>>>>>> 2/25/2019
            } else {
                setAllParmisan();
            }
        } else if (about_profile_iv_newAdd == view) {
            if (checkAllParmisan()) {
<<<<<<< HEAD
                selectProfileImage( 205,5 );
=======
                selectProfileImage( 205, 5 );
>>>>>>> 2/25/2019
            } else {
                setAllParmisan();
            }

        } else if (about_profile_tv_leisureDayEndDate == view) {
            showDataDialog( 2 );
<<<<<<< HEAD
        }
    }

=======

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


    }

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
            }

            if (!Util.isNotEmpaty( about_profile_tv_monEnd.getText().toString() )) {
                Toast.makeText( this, "Please enter monday work end time", Toast.LENGTH_SHORT ).show();
                return false;
            }

            if (!Util.isValidTime( about_profile_tv_monStart.getText().toString(), about_profile_tv_monEnd.getText().toString() )) {
                Toast.makeText( this, "Please enter valid start and end time", Toast.LENGTH_SHORT ).show();
                return false;
            }


        }

        if (about_profile_cb_tue.isChecked()) {
            if (!Util.isNotEmpaty( about_profile_tv_tueStart.getText().toString() )) {
                Toast.makeText( this, "Please enter tuesday work start time", Toast.LENGTH_SHORT ).show();
                return false;
            }
            if (!Util.isNotEmpaty( about_profile_tv_tueEnd.getText().toString() )) {
                Toast.makeText( this, "Please enter tuesday work end time", Toast.LENGTH_SHORT ).show();
                return false;
            }

            if (!Util.isValidTime( about_profile_tv_tueStart.getText().toString(), about_profile_tv_tueEnd.getText().toString() )) {
                Toast.makeText( this, "Please enter valid start and end time", Toast.LENGTH_SHORT ).show();
                return false;
            }

        }

        if (about_profile_cb_wed.isChecked()) {
            if (!Util.isNotEmpaty( about_profile_tv_wedStart.getText().toString() )) {
                Toast.makeText( this, "Please enter wednesday work start time", Toast.LENGTH_SHORT ).show();
                return false;
            }
            if (!Util.isNotEmpaty( about_profile_tv_wedEnd.getText().toString() )) {
                Toast.makeText( this, "Please enter wednesday work end time", Toast.LENGTH_SHORT ).show();
                return false;
            }

            if (!Util.isValidTime( about_profile_tv_wedStart.getText().toString(), about_profile_tv_wedEnd.getText().toString() )) {
                Toast.makeText( this, "Please enter valid start and end time", Toast.LENGTH_SHORT ).show();
                return false;
            }
        }

        if (about_profile_cb_thu.isChecked()) {
            if (!Util.isNotEmpaty( about_profile_tv_thuStart.getText().toString() )) {
                Toast.makeText( this, "Please enter thursday work start time", Toast.LENGTH_SHORT ).show();
                return false;
            }
            if (!Util.isNotEmpaty( about_profile_tv_thuEnd.getText().toString() )) {
                Toast.makeText( this, "Please enter thursday work end time", Toast.LENGTH_SHORT ).show();
                return false;
            }

            if (!Util.isValidTime( about_profile_tv_thuStart.getText().toString(), about_profile_tv_thuEnd.getText().toString() )) {
                Toast.makeText( this, "Please enter valid start and end time", Toast.LENGTH_SHORT ).show();
                return false;
            }
        }

        if (about_profile_cb_fri.isChecked()) {
            if (!Util.isNotEmpaty( about_profile_tv_friStart.getText().toString() )) {
                Toast.makeText( this, "Please enter friday work start time", Toast.LENGTH_SHORT ).show();
                return false;
            }
            if (!Util.isNotEmpaty( about_profile_tv_friEnd.getText().toString() )) {
                Toast.makeText( this, "Please enter friday work end time", Toast.LENGTH_SHORT ).show();
                return false;
            }

            if (!Util.isValidTime( about_profile_tv_friStart.getText().toString(), about_profile_tv_friEnd.getText().toString() )) {
                Toast.makeText( this, "Please enter valid start and end time", Toast.LENGTH_SHORT ).show();
                return false;
            }
        }

        if (about_profile_cb_sat.isChecked()) {
            if (!Util.isNotEmpaty( about_profile_tv_satStart.getText().toString() )) {
                Toast.makeText( this, "Please enter saturday work start time", Toast.LENGTH_SHORT ).show();
                return false;
            }
            if (!Util.isNotEmpaty( about_profile_tv_satEnd.getText().toString() )) {
                Toast.makeText( this, "Please enter saturday work end time", Toast.LENGTH_SHORT ).show();
                return false;
            }

            if (!Util.isValidTime( about_profile_tv_satStart.getText().toString(), about_profile_tv_satEnd.getText().toString() )) {
                Toast.makeText( this, "Please enter valid start and end time", Toast.LENGTH_SHORT ).show();
                return false;
            }
        }

        if (about_profile_cb_sun.isChecked()) {
            if (!Util.isNotEmpaty( about_profile_tv_sunStart.getText().toString() )) {
                Toast.makeText( this, "Please enter sunday work start time", Toast.LENGTH_SHORT ).show();
                return false;
            }
            if (!Util.isNotEmpaty( about_profile_tv_sunEnd.getText().toString() )) {
                Toast.makeText( this, "Please enter sunday work end time", Toast.LENGTH_SHORT ).show();
                return false;
            }

            if (!Util.isValidTime( about_profile_tv_sunStart.getText().toString(), about_profile_tv_sunEnd.getText().toString() )) {
                Toast.makeText( this, "Please enter valid start and end time", Toast.LENGTH_SHORT ).show();
                return false;
            }
        }


        if (about_profile_cb_nearByLastMin.isChecked()) {
            if (!Util.isNotEmpaty( about_profile_edt_nearMiles.getText().toString() )) {
                Toast.makeText( this, "Please enter nearest miles", Toast.LENGTH_SHORT ).show();
                return false;
            }
            if (!Util.isNotEmpaty( about_profile_edt_nearOff.getText().toString() )) {
                Toast.makeText( this, "Please enter nearest miles offers.", Toast.LENGTH_SHORT ).show();
                return false;
            }
        }

        if (about_profile_cb_leisureDay.isChecked()) {
            if (!Util.isNotEmpaty( about_profile_tv_leisureDayStartDate.getText().toString() )) {
                Toast.makeText( this, "Please enter leisure Start date", Toast.LENGTH_SHORT ).show();
                return false;
            }
            if (!Util.isNotEmpaty( about_profile_tv_leisureDayStartTime.getText().toString() )) {
                Toast.makeText( this, "Please enter leisure date Start time", Toast.LENGTH_SHORT ).show();
                return false;
            }
            if (!Util.isNotEmpaty( about_profile_tv_leisureDayEndDate.getText().toString() )) {
                Toast.makeText( this, "Please enter leisure end date", Toast.LENGTH_SHORT ).show();
                return false;
            }
            if (!Util.isNotEmpaty( about_profile_tv_leisureDayEndTime.getText().toString() )) {
                Toast.makeText( this, "Please enter leisure end time", Toast.LENGTH_SHORT ).show();
                return false;
            }
            if (!Util.isNotEmpaty( about_profile_edt_leisureDayOff.getText().toString() )) {
                Toast.makeText( this, "Please enter leisure day off %", Toast.LENGTH_SHORT ).show();
                return false;
            }
        }


        return true;
    }


>>>>>>> 2/25/2019
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

<<<<<<< HEAD
    private void selectProfileImage(int post,int imageSize) {
=======
    private void selectProfileImage(int post, int imageSize) {
>>>>>>> 2/25/2019

        Config config = new Config();
        config.setToolbarTitleRes( R.string.app_name );
        config.setSelectionMin( 1 );
        config.setSelectionLimit( imageSize );
<<<<<<< HEAD
       config.setSelectedBottomColor( "#500b02" );
=======
        config.setSelectedBottomColor( "#500b02" );
>>>>>>> 2/25/2019
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
<<<<<<< HEAD
//
//                    double strLatitude = (double) data.getExtras().get( "location_lat" );
//                    double strLongitude = (double) data.getExtras().get( "location_lng" );
//
//                    AppLog.Log( "receive------- Latitude", strLatitude + "  ---------" );
//                    AppLog.Log( "receive------- Longitude", strLongitude + "  ---------" );
//
//                    Geocoder geocoder;
//                    List<Address> addresses;
//                    geocoder = new Geocoder( this, Locale.getDefault() );
//
//                    addresses = geocoder.getFromLocation( strLatitude, strLongitude, 1 ); // Here 1 represent max location result to returned, by documents it recommended 1 to 5
//
//                    String address = addresses.get( 0 ).getAddressLine( 0 ); // If any additional address line present than only, check with max available address lines by getMaxAddressLineIndex()
//                    String city = addresses.get( 0 ).getLocality();
//                    String state = addresses.get( 0 ).getAdminArea();
//                    strCountryName = addresses.get( 0 ).getCountryName().toLowerCase();
//                    strCountryCode = addresses.get( 0 ).getCountryCode().toLowerCase();
////                        strPostalCode = addresses.get(0).getPostalCode();
////                        String knownName = addresses.get(0).getFeatureName(); // Only if available else return NULL
//
//
//                    stBuilAddress.append( address );
////                    stBuilAddress.append(", " + city);
////                    stBuilAddress.append(", " + state);
////                        stBuilAddress.append(", " + strCountryName);
//                    tvLocation.setText( address );
//                    strLat = String.valueOf( strLatitude );
//                    strLong = String.valueOf( strLongitude );
//
//
=======

                    double strLatitude = (double) data.getExtras().get( "location_lat" );
                    double strLongitude = (double) data.getExtras().get( "location_lng" );

                    AppLog.Log( "receive------- Latitude", strLatitude + "  ---------" );
                    AppLog.Log( "receive------- Longitude", strLongitude + "  ---------" );

                    Geocoder geocoder;
                    List<Address> addresses;
                    geocoder = new Geocoder( this, Locale.getDefault() );

                    addresses = geocoder.getFromLocation( strLatitude, strLongitude, 1 ); // Here 1 represent max location result to returned, by documents it recommended 1 to 5

                    String address = addresses.get( 0 ).getAddressLine( 0 ); // If any additional address line present than only, check with max available address lines by getMaxAddressLineIndex()
                    String city = addresses.get( 0 ).getLocality();
                    String state = addresses.get( 0 ).getAdminArea();
//
                    about_profile_edt_area.setText( address );
//                    strLat = String.valueOf( strLatitude );
//                    strLong = String.valueOf( strLongitude );

                    selectedCoords = new LatLng(strLatitude, strLongitude  );
                    mGoogleMap.animateCamera( CameraUpdateFactory.newLatLngZoom( selectedCoords, 17 ) );

                    if (mGoogleMap != null) {
                        mGoogleMap.clear();
                        mGoogleMap.addMarker( new MarkerOptions()
                                .position( selectedCoords )
                                .anchor( .5f, .5f )
                                .title( "My Location" ) );

                        mRadiusCircle = mGoogleMap.addCircle( new CircleOptions()
                                .center( selectedCoords )
                                .radius(milesToMeters(mRadius) )
                                .strokeColor( ContextCompat.getColor( ProfileEditActivity.this, R.color.map_mRadius ) )
                                .fillColor( ContextCompat.getColor( ProfileEditActivity.this, R.color.map_mRadius ) )
                                .strokeWidth( 0.1f ) );


                        if (mRadius > 0 && selectedCoords != null) {
                            int zoom = getZoomLevel( mRadiusCircle );
                            mGoogleMap.animateCamera( CameraUpdateFactory.newLatLngZoom( selectedCoords, zoom ) );
                        } else {
                            mGoogleMap.animateCamera( CameraUpdateFactory.newLatLngZoom( selectedCoords, 16 ) );
                        }

                    }


>>>>>>> 2/25/2019

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

<<<<<<< HEAD



=======
    public static double milesToMeters(double miles) {
        return 0.0006213711 * miles;
    }
>>>>>>> 2/25/2019


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
<<<<<<< HEAD
    public void onRequestPermissionsResult(int permsRequestCode, String[] permissions, int[] grantResults) {
=======
    public void onRequestPermissionsResult(int permsRequestCode, String[] permissions,
                                           int[] grantResults) {
>>>>>>> 2/25/2019
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
<<<<<<< HEAD
=======

>>>>>>> 2/25/2019
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
                        Uri uri = Uri.fromParts( "package", ProfileEditActivity.this.getPackageName(), null );
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

<<<<<<< HEAD
=======
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
//            currentLatitude = location.getLatitude();
//            currentLongitude = location.getLongitude();
//            LatLng latLng = new LatLng(currentLatitude, currentLongitude);
            LatLng latLng = new LatLng( application.getLatitude(), application.getLongitude() );

            CameraPosition position = CameraPosition.builder().target( latLng ).zoom( 18f ).bearing( 0.0f ).tilt( 0.0f ).build();
            mGoogleMap.animateCamera( CameraUpdateFactory.newCameraPosition( position ) );
            // Log.d("latitude", String.valueOf(currentLatitude));
//            Toast.makeText(this, currentLatitude + " WORKS " + currentLongitude + "", Toast.LENGTH_LONG).show();
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
        int zoomLevel = 14;
        if (circle != null) {
            double radius = circle.getRadius();
            double scale = radius / 200;
            zoomLevel = (int) (14 - Math.log( scale ) / Math.log( 2 ));
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

>>>>>>> 2/25/2019

}
