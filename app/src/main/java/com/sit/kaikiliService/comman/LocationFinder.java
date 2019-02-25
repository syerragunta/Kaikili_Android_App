package com.sit.kaikiliService.comman;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.IBinder;

import com.sit.kaikiliService.KaikiliApplication;

/**
 * Created by ketan patel on 31/7/2018.
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
 *
 */




public class LocationFinder extends Service implements LocationListener {
 
//	private final String TAG = getClass().getSimpleName();
    private final Context mContext;

    // flag for GPS status
    boolean isGPSEnabled = false;
 
    // flag for network status
    boolean isNetworkEnabled = false;
 
    // flag for GPS status
//    boolean canGetLocation = false;
 
    Location location; // location
    /*double latitude; // latitude
    double longitude; // longitude
*/ 
    // The minimum distance to change Updates in meters
    private static final long MIN_DISTANCE_CHANGE_FOR_UPDATES = 0; // meters
 
    // The minimum time between updates in milliseconds
    private static final long MIN_TIME_BW_UPDATES =  1000; // minute
 
    // Declaring a Location Manager
    protected LocationManager locationManager;
    private KaikiliApplication application;
 
    public LocationFinder(Context context) {
        this.mContext = context;
        this.application = (KaikiliApplication) this.mContext.getApplicationContext();
        getLocation();
    }
 
    public Location getLocation() {
        try {
            locationManager = (LocationManager) mContext.getSystemService(LOCATION_SERVICE);
 
            // getting GPS status
            isGPSEnabled = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);
 
            // getting network status
            isNetworkEnabled = locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER);
            
//            Log.v(TAG, "isGPSEnabled : " + isGPSEnabled + "\tisNetworkEnabled : " + isNetworkEnabled);
 
            if (!isGPSEnabled && !isNetworkEnabled) {
                // no network provider is enabled
            } else if(isNetworkEnabled && isGPSEnabled) {
            	locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, MIN_TIME_BW_UPDATES, MIN_DISTANCE_CHANGE_FOR_UPDATES, this);

//            	Log.e(TAG, "GPS Enabled : " + locationManager);

            	if (locationManager != null) {
            		location = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
//            		Log.e(TAG, "Location (if) : " + location);
            		if (location != null) {
            			application.setLatitude(location.getLatitude());
            			application.setLongitude(location.getLongitude());
            		} else {
            			location = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
                        if (location != null) {
                            application.setLatitude(location.getLatitude());
                            application.setLongitude(location.getLongitude());
                        }
//                        Log.e(TAG, "Location (else) : " + location);
            		}
            	}
            	if(location == null) {
            		locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, MIN_TIME_BW_UPDATES, MIN_DISTANCE_CHANGE_FOR_UPDATES, this);
            		if (locationManager != null) {
                        location = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
                        if (location != null) {
                            application.setLatitude(location.getLatitude());
                            application.setLongitude(location.getLongitude());
                        }
                    }
            	}
            } else if (isNetworkEnabled) {
                locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, MIN_TIME_BW_UPDATES, MIN_DISTANCE_CHANGE_FOR_UPDATES, this);
                
//                Log.e(TAG, "Network");
                
                if (locationManager != null) {
                    location = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
                    if (location != null) {
                        application.setLatitude(location.getLatitude());
                        application.setLongitude(location.getLongitude());
                    } else {
                    	location = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
                		if (location != null) {
                            application.setLatitude(location.getLatitude());
                            application.setLongitude(location.getLongitude());
                		}
                    }
                }
            } else if (isGPSEnabled) { // if GPS Enabled get lat/long using GPS Services
            	locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, MIN_TIME_BW_UPDATES, MIN_DISTANCE_CHANGE_FOR_UPDATES, this);

//            	Log.e(TAG, "GPS Enabled");

            	if (locationManager != null) {
            		location = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
//            		Log.e(TAG, "G - Location : " + location);
            		if (location != null) {
                        application.setLatitude(location.getLatitude());
                        application.setLongitude(location.getLongitude());
            		} else {
            			location = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
                        if (location != null) {
                            application.setLatitude(location.getLatitude());
                            application.setLongitude(location.getLongitude());
                        }
            		}
            	}
            }
            
//            Log.e(TAG, "Location : " + location);

        } catch (Exception e) {
            e.printStackTrace();
        }
 
        return location;
    }
     
    /**
     * Stop using GPS listener
     * Calling this function will stop using GPS in your app
     * */
    public void stopLocationUpdates(){
        if(locationManager != null){
            locationManager.removeUpdates(LocationFinder.this);
        }       
    }
     
    /**
     * Function to get latitude
     * */
//    public double getLatitude(){
//        if(location != null){
//        	clickApplication.setLatitude(location.getLatitude());
//        }
//
//        // return latitude
//        return clickApplication.getLatitude();
//    }
//
//     ///Function to get longitude
//
//    public double getLongitude() {
//        if (location != null) {
//            clickApplication.setLongitude(location.getLongitude());
//        }
//
//        // return longitude
//        return clickApplication.getLongitude();
//    }
     
    /**
     * Function to check GPS/wifi enabled
     * @return boolean
     * */
    /*public boolean canGetLocation() {
        return this.canGetLocation;
    }*/
     
    /**
     * Function to show settings alert dialog
     * On pressing Settings button will lauch Settings Options
     * */
    /*public void showSettingsAlert(){
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(mContext);
      
        // Setting Dialog Title
        alertDialog.setTitle("GPS is settings");
  
        // Setting Dialog Message
        alertDialog.setMessage("GPS is not enabled. Do you want to go to settings menu?");
  
        // On pressing Settings button
        alertDialog.setPositiveButton("Settings", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog,int which) {
                Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                mContext.startActivity(intent);
            }
        });
  
        // on pressing cancel button
        alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            dialog.cancel();
            }
        });
  
        // Showing Alert Message
        alertDialog.show();
    }*/
 
    @Override
    public void onLocationChanged(Location location) {
    	getLocation();
    }
 
    @Override
    public void onProviderDisabled(String provider) {
    }
 
    @Override
    public void onProviderEnabled(String provider) {
    }
 
    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {
    }
 
    @Override
    public IBinder onBind(Intent arg0) {
        return null;
    }
}