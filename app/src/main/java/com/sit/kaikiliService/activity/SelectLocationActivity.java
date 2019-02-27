package com.sit.kaikiliService.activity;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import android.content.SharedPreferences;
import android.os.Bundle;
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
import android.support.design.widget.FloatingActionButton;
=======
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.AsyncTask;
import android.os.Bundle;
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.AdapterView;
import android.widget.ImageView;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.sit.kaikiliService.KetanApplication;
import com.sit.kaikiliService.R;
import com.sit.kaikiliService.comman.Util;
import com.sit.kaikiliService.font.CustomEditText;
import com.sit.kaikiliService.font.EditTextEupheminUCASRegular;
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
import android.view.View;
import android.widget.ImageView;

import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
import com.sit.kaikiliService.font.CustomEditText;
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
import com.sit.kaikiliService.font.TextViewEuphemiaUCASRegular;

=======
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
import com.sit.kaikiliService.adapter.LocationSearchArrayAdapter;
import com.sit.kaikiliService.api.Apiresponse;
import com.sit.kaikiliService.api.WSSearchLocation;
import com.sit.kaikiliService.comman.AppLog;
import com.sit.kaikiliService.comman.GPSLocation;
import com.sit.kaikiliService.comman.LocationFinder;
import com.sit.kaikiliService.comman.Util;
import com.sit.kaikiliService.font.CustomEditText;
import com.sit.kaikiliService.font.TextViewEuphemiaUCASRegular;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
import butterknife.Bind;
import butterknife.ButterKnife;


/**
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
 * Created by ketan patel on 25/1/2019.
=======
 * Created by ketan patel on 25/2/2019.
>>>>>>> 2/25/2019
=======
 * Created by ketan patel on 25/2/2019.
>>>>>>> 2/26/2019
=======
 * Created by ketan patel on 25/2/2019.
>>>>>>> 2/27/2019
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
 */

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
public class SelectLocationActivity extends BaseActivity implements View.OnClickListener {
=======
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
public class SelectLocationActivity extends BaseActivity implements View.OnClickListener,
        com.google.android.gms.location.LocationListener,
        OnMapReadyCallback {

//    private GoogleMap googleMap;
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019

    @Bind(R.id.top_back)
    ImageView top_back;

    @Bind(R.id.top_title)
    TextViewEuphemiaUCASRegular top_title;
    @Bind(R.id.user_location_edt_search)
    CustomEditText user_location_edt_search;
    @Bind(R.id.user_location_tv_setLocation)    TextViewEuphemiaUCASRegular user_location_tv_setLocation;


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
    private SharedPreferences preferences;
=======
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
    private KaikiliApplication application;
    private SharedPreferences preferences;
    private static GoogleMap mGoogleMap;

    private LatLng selectedCoords;
    String[] parts;
    private String strSearch = "";
    private String lastLocation = "";
    private Point poitn;
    private LocationSearchArrayAdapter mapPlaceAdapter;
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_user_location );
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
        preferences = application.getSharedPreferences();

        top_title.setText( "Set Your Work Location" );
        top_back.setOnClickListener( this );


//        user_location_edt_search.addTextChangedListener( new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//            }
//        } );
=======
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
        application = (KaikiliApplication) getApplicationContext();
        preferences = application.getSharedPreferences();
        LocationFinder locationFinder = new LocationFinder( this );

        lastLocation = getIntent().getStringExtra( "lastLocation" );

        top_title.setText( "Set Your Work Location" );
        top_back.setOnClickListener( this );
        user_location_tv_setLocation.setOnClickListener( this );

        mapPlaceAdapter = new LocationSearchArrayAdapter( this, R.layout.row_item_autocomplete );
        user_location_edt_search.setAdapter( mapPlaceAdapter );



        user_location_edt_search.addTextChangedListener( new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                if (!strSearch.equals( user_location_edt_search.getText().toString() )) {
//                    getLocationFromAddress( etSearchLocation.getText().toString() );
                    new GetSearchDataTalesTask( SelectLocationActivity.this, user_location_edt_search.getText().toString() ).execute();
                    strSearch = user_location_edt_search.getText().toString();
                }
            }

        } );


        user_location_edt_search.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Util.hideSoftKeyboard( SelectLocationActivity.this );
                getLocationFromAddress( mapPlaceAdapter.getItem( i ) );
                // hideKeyboard();
            }
        } );
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019


        user_location_edt_search.setDrawableClickListener(
                new CustomEditText.DrawableClickListener() {
                    @Override
                    public void onClick(DrawablePosition target) {
                        if (target == DrawablePosition.RIGHT) {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
//                            if (GPSLocation.getInstance().getStoredLatLng() == null) return;
//                            mGoogleMap.clear();
////                            selectedCoords = GPSLocation.getInstance().getStoredLatLng();
//                            selectedCoords = new LatLng( application.getLatitude(), application.getLongitude() );
//
//                            mGoogleMap.addMarker( new MarkerOptions().position( selectedCoords ) );
//                            mGoogleMap.animateCamera( CameraUpdateFactory.newLatLngZoom( selectedCoords, 12 ) );
//                            //    hideKeyboard();
//                            initCoordinates();
=======
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
                            Util.hideSoftKeyboard( SelectLocationActivity.this );
//                            if (GPSLocation.getInstance().getStoredLatLng() == null) return;
                            mGoogleMap.clear();
//                            selectedCoords = GPSLocation.getInstance().getStoredLatLng();
                            selectedCoords = new LatLng( application.getLatitude(), application.getLongitude() );

                            mGoogleMap.addMarker( new MarkerOptions().position( selectedCoords ) );
                            mGoogleMap.animateCamera( CameraUpdateFactory.newLatLngZoom( selectedCoords, 12 ) );
                            //    hideKeyboard();
                            initCoordinates();
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
                            // etSearchLocation.setText("");
                        }
                        if (target == DrawablePosition.LEFT) {
                            user_location_edt_search.setText( "" );
                        }
                    }
                } );
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019

        user_location_edt_search.setOnEditorActionListener( new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_SEARCH) {
//                    getLocationFromAddress(etSearchLocation.toString());
                    new GetSearchDataTalesTask( SelectLocationActivity.this, user_location_edt_search.getText().toString() ).execute();
                    return true;
                }
                return false;
            }
        } );


        SupportMapFragment fm = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById( R.id.user_location_mapView );
        fm.getMapAsync( this );
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
    }


    @Override
    public void onClick(View view) {

        if (view == top_back) {
            finish();
        }else if(view == user_location_tv_setLocation) {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
            finish();
        }
    }
=======
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
            Intent intent = getIntent();

            AppLog.Log( "send------- Latitude", selectedCoords.latitude + "  ---------" );
            AppLog.Log( "send------- Longitude", selectedCoords.longitude + "  ---------" );

            intent.putExtra( "location_lat", selectedCoords.latitude );
            intent.putExtra( "location_lng", selectedCoords.longitude );
            setResult( RESULT_OK, intent );
            finish();
        }
    }


    public void onMapReady(GoogleMap googleMap) {
        mGoogleMap = googleMap;
        mGoogleMap.getUiSettings().setZoomControlsEnabled( true );
        mGoogleMap.getUiSettings().setMapToolbarEnabled( false );
        mGoogleMap.getUiSettings().setCompassEnabled( true );
        mGoogleMap.setOnMapClickListener( new GoogleMap.OnMapClickListener() {

            @Override
            public void onMapClick(LatLng latLng) {
                selectedCoords = latLng;
                mGoogleMap.clear();
                mGoogleMap.addMarker( new MarkerOptions().position( latLng ) );
                mGoogleMap.animateCamera( CameraUpdateFactory.newLatLngZoom( latLng, 12 ) );
                initCoordinates();
            }


        } );

        mGoogleMap.clear();

        if (Util.isNotEmpaty( lastLocation )) {
//            etSearchLocation.setText(lastLocation);
            getLocationFromAddress( lastLocation );
        } else {
            selectedCoords = new LatLng( application.getLatitude(), application.getLongitude() );
            mGoogleMap.addMarker( new MarkerOptions().position( selectedCoords ) );
            mGoogleMap.animateCamera( CameraUpdateFactory.newLatLngZoom( selectedCoords, 12 ) );
            initCoordinates();
        }


    }


    public void getLocationFromAddress(String strAddress) {

        Geocoder coder = new Geocoder( this );
        List<Address> address;
//        GeoPoint p1 = null;

        try {
            if (Util.isNotEmpaty( strAddress )) {
                address = coder.getFromLocationName( strAddress, 5 );
                AppLog.Log( "-------------", address.toString() );
                if (address.size() > 0) {
                    Address location = address.get( 0 );
                    location.getLatitude();
                    location.getLongitude();
                    mGoogleMap.clear();
                    selectedCoords = new LatLng( location.getLatitude(), location.getLongitude() );
                    mGoogleMap.addMarker( new MarkerOptions().position( selectedCoords ) );
                    mGoogleMap.animateCamera( CameraUpdateFactory.newLatLngZoom( selectedCoords, 12 ) );
                    initCoordinates();
                } else {

                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void onLocationChanged(Location location) {
        LatLng latLng = new LatLng( location.getLatitude(), location.getLongitude() );

        mGoogleMap.moveCamera( CameraUpdateFactory.newLatLng( latLng ) );
        mGoogleMap.animateCamera( CameraUpdateFactory.zoomTo( 12 ) );

    }


    //Display the address by current location
    public void initCoordinates() {
        Geocoder gcd = new Geocoder( this, Locale.ENGLISH );
        //   Log.e(TAG, "lat" + AppModels.getInstance().getMylocation().latitude);
        try {
            List<Address> addresses = gcd.getFromLocation( selectedCoords.latitude, selectedCoords.longitude, 1 );
            if (addresses.size() > 0) {
                String countryName = addresses.get( 0 ).getCountryName().toLowerCase();
                String countryCode = addresses.get( 0 ).getCountryCode().toLowerCase();

//                Log.i( "TAG", "CountryName: " + countryName + " ; " + "CountryCode: " + countryCode );
                String address = addresses.get( 0 ).getAddressLine( 0 );
                parts = address.split( "," );
                strSearch = address;
                user_location_edt_search.setText( address );

            }
        } catch (IOException e) {
            e.printStackTrace();
//            etPlaceNameInput.setText(etSearchLocation.getText());
        }
    }


    public class GetSearchDataTalesTask extends AsyncTask<Void, Void, Integer> {

        private Activity mActivity;
        private String searchKey;
        private Apiresponse response;
        private WSSearchLocation wsSearchLocation;
        private ArrayList<String> addressArra;

        public GetSearchDataTalesTask(Activity activity, String searchKey) {
            mActivity = activity;
            this.searchKey = searchKey;
            // TODO Auto-generated constructor stub
        }

        @Override
        protected void onPreExecute() {
            // TODO Auto-generated method stub
            super.onPreExecute();
//            searchProgress.setVisibility( View.VISIBLE );
//            Util.showCustomProgressDialog( mActivity, "User Tales ....", false, null );
        }

        @Override
        protected Integer doInBackground(Void... params) {
            // TODO Auto-generated method stub
            Geocoder coder = new Geocoder( mActivity );
            List<Address> address;
            addressArra = new ArrayList<String>();
            try {
                if (Util.isNotEmpaty( searchKey )) {
                    address = coder.getFromLocationName( searchKey, 10 );
                    AppLog.Log( "-------------", address.toString() );
                    for (int i = 0; i < address.size(); i++) {
                        addressArra.add( address.get( i ).getAddressLine( 0 ) );
                    }
                }

            } catch (IOException e) {
                e.printStackTrace();
//            etPlaceNameInput.setText(etSearchLocation.getText());
            }

            return 1;
//            wsSearchLocation = new WSSearchLocation( mActivity );
//            return wsSearchLocation.executeWebservice( searchKey );
        }

        @Override
        protected void onPostExecute(Integer resul) {
            // TODO Auto-generated method stub
            super.onPostExecute( resul );
            Util.removeCustomProgressDialog();
//            searchProgress.setVisibility( View.GONE );

            mapPlaceAdapter.updateListItem( addressArra );

        }
    }

<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
}
