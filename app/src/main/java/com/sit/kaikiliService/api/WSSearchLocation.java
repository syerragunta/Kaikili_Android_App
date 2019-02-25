package com.sit.kaikiliService.api;

import android.content.Context;

import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.comman.AppLog;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;

/**
 * Created by ketan patel on 25/2/2019.
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
 */

public class WSSearchLocation {

    private Context context;

    public ArrayList<String> getResultList() {
        return resultList;
    }

    private String message = "";
    private int status;
    private boolean isAdmin = false;
    private ArrayList<String> resultList;
    private Apiresponse apiResponse;

    public Apiresponse getApiResponse() {
        return apiResponse;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public Integer getStatus() {
        return status;
    }

    private KaikiliApplication application;

    public WSSearchLocation(Context context) {
        this.context = context;

        application = (KaikiliApplication) context.getApplicationContext();
    }

    public String getMessage() {
        return message;
    }

    public int executeWebservice(String searchKey) {

        String key = "";
        try {
             key = URLEncoder.encode( searchKey, "UTF-8" );
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            key = searchKey;
            return 0;
        }

        String url = "https://maps.googleapis.com/maps/api/place/autocomplete/json?input="+key.replace( " ","%20" )+"&key=AIzaSyCJ9Hc1VDWHzInIP6PRKZD6qX3MpF4Eu0M";
//        String url = "https://maps.googleapis.com/maps/api/place/autocomplete/json?input="+key.replace( " ","%20" )+"&key=AIzaSyDV-siHexyTrxnqNq4HUFFcyEi8AXGAMZA";

        AppLog.Log( "Url", url );
        Apiresponse response = new WebUtil().getJSONFromUrl( url );
        return parseJSONResponse( response );
    }


    private int parseJSONResponse(Apiresponse response) {
        AppLog.Log( "TAG-responseStatusCode", response.getCode() + "" );
        AppLog.Log( "TAG-Response", response.getResponse() );
        apiResponse = response;

        if (response.getCode() >= 200) {

            resultList = new ArrayList<>();
            try {
                JSONObject jsonObj = new JSONObject( response.getResponse() );
                JSONArray predsJsonArray = jsonObj.getJSONArray( "predictions" );
                for (int i = 0; i < predsJsonArray.length(); i++) {
                    resultList.add( predsJsonArray.getJSONObject( i ).getString( "description" ) );
                }

                AppLog.Log( "Get result Size", resultList.size() + "  ---------------------------" );
                return 1;
            } catch (Exception ex) {
                return 0;
            }
        } else {
            return -1;
        }


    }
}
