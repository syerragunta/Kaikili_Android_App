package com.sit.kaikiliService.api;

import android.content.Context;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.squareup.okhttp.OkHttpClient;

import java.lang.reflect.Type;

import retrofit.RestAdapter;
import retrofit.client.OkClient;
=======
=======
>>>>>>> 2/15/2019
=======
>>>>>>> 2/16/2019
=======
>>>>>>> 2/16/2019 V1
=======
>>>>>>> 2/16/2019 V2
import com.squareup.okhttp.OkHttpClient;

import retrofit.RestAdapter;
import retrofit.client.OkClient;
import retrofit2.converter.gson.GsonConverterFactory;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/14/2019
=======
>>>>>>> 2/15/2019
=======
>>>>>>> 2/16/2019
=======
>>>>>>> 2/16/2019 V1
=======
>>>>>>> 2/16/2019 V2

/**
 * Created by ketan patel on 9/2/2019.
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
 *
 */

public class WebApiClient {

    private WebApi webApi;
    private static WebApiClient webApiClient;
    private static Context mcontext;

    public static WebApiClient getInstance(Context context) {
        if (webApiClient == null) webApiClient = new WebApiClient();
        mcontext = context;
        return webApiClient;
    }

    private WebApiClient() {
        //just an empty constructor for now
    }

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    public WebApi getWebApi() {
        Log.e("Call URL -------","777777777777777777777777777777777777777777777777777777777777");
=======

    public WebApi getWebApi() {

>>>>>>> 2/14/2019
=======

    public WebApi getWebApi() {

>>>>>>> 2/15/2019
=======

    public WebApi getWebApi() {

>>>>>>> 2/16/2019
=======

    public WebApi getWebApi() {

>>>>>>> 2/16/2019 V1
=======

    public WebApi getWebApi() {

>>>>>>> 2/16/2019 V2
        if (webApi == null) {
            Log.e("Call webApi ----","Calling webApi = null");
            OkHttpClient client = new OkHttpClient();

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
           /* client.setConnectTimeout(15, TimeUnit.SECONDS); // connect timeout
            client.setReadTimeout(15, TimeUnit.SECONDS);*/

            Gson gson = new GsonBuilder().registerTypeHierarchyAdapter(String.class,
                    new JsonDeserializer() {

                        @Override
                        public String deserialize(JsonElement json, Type typeOfT,
                                                  JsonDeserializationContext context)
                                throws JsonParseException {
                            return null;
                        }
                    }).create();
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

//            JacksonConverter jacksonConverter = new JacksonConverter();
            RestAdapter restAdapter = new RestAdapter.Builder()
                    .setClient(new OkClient(client))
                    .setConverter(new LoganSquareConverter())
//                    .addConverterFactory(GsonConverterFactory.create())
//                    .setConverter(new GsonConverter(gson))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
//                    .setConverter(GsonConverterFactory.create(gson))


>>>>>>> 2/14/2019
=======
//                    .setConverter(GsonConverterFactory.create(gson))


>>>>>>> 2/15/2019
=======
//                    .setConverter(GsonConverterFactory.create(gson))


>>>>>>> 2/16/2019
=======
//                    .setConverter(GsonConverterFactory.create(gson))


>>>>>>> 2/16/2019 V1
=======
//                    .setConverter(GsonConverterFactory.create(gson))


>>>>>>> 2/16/2019 V2
                    .setEndpoint(WebApi.BASE_URL)
                    .setLogLevel(RestAdapter.LogLevel.FULL).setLog( new RestAdapter.Log() {
                        @Override
                        public void log(String msg) {
                            Log.e("Call URL Log-------",msg);
                        }
                    })
                    .build();


<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD

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
//            restAdapter.setLogLevel(RestAdapter.LogLevel.FULL);
            Log.e("Call URL -------",restAdapter.getLogLevel().toString());

            webApi = restAdapter.create(WebApi.class);

        }else {
            Log.e("Call webApi else----","Calling webApi != null");
        }
        return webApi;
    }


}
