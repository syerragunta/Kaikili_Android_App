package com.sit.kaikiliService.api;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Credentials;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;


/**
 * Created by Ketan patel on 2/1/19.
 * ketan_patel25@yahoo.com
 * copy right to ketan patel
 */

public class WebUtil {

	public static final int AUTH_FAIL = -1;
	public static final int RESULT_FAIL = 0;
	public static final int RESULT_SUCCESS = 1;
	public static final int SERVER_EXCEPTION = 0;


    public String postMethod(String post, String url) {
//        MediaType JSON   = MediaType.parse("application/x-www-form-urlencoded; charset=utf-8");
       MediaType JSON = MediaType.parse( "application/json; charset=utf-8" );

        try {
            OkHttpClient client = new OkHttpClient.Builder()
                    .connectTimeout(20, TimeUnit.SECONDS)
                    .writeTimeout(20, TimeUnit.SECONDS)
                    .readTimeout(40, TimeUnit.SECONDS)
                    .build();

            RequestBody body = RequestBody.create(JSON, post);
            Request request = new Request.Builder()
                    .url(url)
                    .post(body)
                    .build();
            Response response = client.newCall(request).execute();
            return response.body().string();


        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return "";
        }

    }

<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 2/26/2019
    public static Apiresponse getJSONFromUrl(String url) {

        Apiresponse model = new Apiresponse();

//        OkHttpClient client = new OkHttpClient();
        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(100, TimeUnit.SECONDS)
                .writeTimeout(100, TimeUnit.SECONDS)
                .readTimeout(200, TimeUnit.SECONDS)
                .build();

        try {

            Request request = new Request.Builder()
                    .url(url)
                    .build();

            Response response = client.newCall(request).execute();
            model.setCode(response.code());
            model.setResponse(response.body().string());
            return model;

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            model.setCode(123);
            model.setResponse("");

            return model;
        }

    }
<<<<<<< HEAD
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019





}
