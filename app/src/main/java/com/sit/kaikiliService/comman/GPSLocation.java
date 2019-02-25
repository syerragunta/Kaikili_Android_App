package com.sit.kaikiliService.comman;

import android.location.Location;

import com.google.android.gms.maps.model.LatLng;

import java.util.Locale;

/**
 * Created by GOLAN YAHAV on 2016-12-02.
 */
public class GPSLocation {

    private static GPSLocation sharedInstance;
    public static GPSLocation getInstance() {
        if (sharedInstance == null) {
            sharedInstance = new GPSLocation();
        }
        return sharedInstance;
    }

    private Location mLocation;
    public Location getStoredLocation() {
        return mLocation;
    }

    public LatLng getStoredLatLng(){
        if(mLocation == null) return null;
        LatLng latlng = new LatLng(mLocation.getLatitude(),mLocation.getLongitude());
        return latlng;
    }

    public void setMyLocation(Location mLocation) {
        this.mLocation = mLocation;
    }

    private Location mManualLocation;
    public Location getStoredManualLocation() {
        return mManualLocation;
    }

    public LatLng getStoredManualLatLng(){
        if(mManualLocation == null) return null;
        LatLng latlng = new LatLng(mManualLocation.getLatitude(),mManualLocation.getLongitude());
        return latlng;
    }

    public void setMyManualLocation(Location mManualLocation) {
        this.mManualLocation = mManualLocation;
    }

    @Override
    public String toString() {
        return String.format(Locale.getDefault(),"%1f,%2f", mLocation.getLatitude(), mLocation.getLongitude());
    }

    public String getStoredLocationAsString() {
        return toString();
    }
}
