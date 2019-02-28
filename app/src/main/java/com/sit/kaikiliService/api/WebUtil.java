package com.sit.kaikiliService.api;

<<<<<<< HEAD
<<<<<<< HEAD
import java.io.IOException;
=======
=======
>>>>>>> 2/28/2019
import android.net.Uri;

import com.sit.kaikiliService.comman.AppLog;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
<<<<<<< HEAD
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
import java.util.concurrent.TimeUnit;

import okhttp3.Credentials;
import okhttp3.MediaType;
<<<<<<< HEAD
<<<<<<< HEAD
=======
import okhttp3.MultipartBody;
>>>>>>> 2/27/2019
=======
import okhttp3.MultipartBody;
>>>>>>> 2/28/2019
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
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
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
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019



=======



    public String postImagesInServer(String url, ArrayList<Uri> images) {
=======



    public String postImagesInServer(String url, ArrayList<String> images) {
>>>>>>> 2/28/2019

        RequestBody requestBody = null;

        if(images.size() == 1){
            String app1 = images.get(0).toString().substring(images.get(0).toString().lastIndexOf("."));
            requestBody = new MultipartBody.Builder()
                    .setType(MultipartBody.FORM)
                    .addFormDataPart("uploads",app1,  RequestBody.create(MultipartBody.FORM, new File(images.get(0).toString())))
                    .build();
        }else if(images.size() == 2){

            String app1 = images.get(0).toString().substring(images.get(0).toString().lastIndexOf("."));
            String app2 = images.get(1).toString().substring(images.get(1).toString().lastIndexOf("."));
            requestBody = new MultipartBody.Builder()
                    .setType(MultipartBody.FORM)
                    .addFormDataPart("uploads",app1,  RequestBody.create(MultipartBody.FORM, new File(images.get(0).toString())))
                    .addFormDataPart("uploads",app2,  RequestBody.create(MultipartBody.FORM, new File(images.get(1).toString())))
                    .build();
        }else if(images.size() == 3){
            String app1 = images.get(0).toString().substring(images.get(0).toString().lastIndexOf("."));
            String app2 = images.get(1).toString().substring(images.get(1).toString().lastIndexOf("."));
            String app3 = images.get(2).toString().substring(images.get(2).toString().lastIndexOf("."));
            requestBody = new MultipartBody.Builder()
                    .setType(MultipartBody.FORM)
                    .addFormDataPart("uploads",app1,  RequestBody.create(MultipartBody.FORM, new File(images.get(0).toString())))
                    .addFormDataPart("uploads",app2,  RequestBody.create(MultipartBody.FORM, new File(images.get(1).toString())))
                    .addFormDataPart("uploads",app3,  RequestBody.create(MultipartBody.FORM, new File(images.get(2).toString())))
                    .build();

        }else if(images.size() == 4){
            String app1 = images.get(0).toString().substring(images.get(0).toString().lastIndexOf("."));
            String app2 = images.get(1).toString().substring(images.get(1).toString().lastIndexOf("."));
            String app3 = images.get(2).toString().substring(images.get(2).toString().lastIndexOf("."));
            String app4 = images.get(3).toString().substring(images.get(3).toString().lastIndexOf("."));
            requestBody = new MultipartBody.Builder()
                    .setType(MultipartBody.FORM)
                    .addFormDataPart("uploads",app1,  RequestBody.create(MultipartBody.FORM, new File(images.get(0).toString())))
                    .addFormDataPart("uploads",app2,  RequestBody.create(MultipartBody.FORM, new File(images.get(1).toString())))
                    .addFormDataPart("uploads",app3,  RequestBody.create(MultipartBody.FORM, new File(images.get(2).toString())))
                    .addFormDataPart("uploads",app4,  RequestBody.create(MultipartBody.FORM, new File(images.get(3).toString())))
                    .build();

        }else if(images.size() == 5){
            String app1 = images.get(0).toString().substring(images.get(0).toString().lastIndexOf("."));
            String app2 = images.get(1).toString().substring(images.get(1).toString().lastIndexOf("."));
            String app3 = images.get(2).toString().substring(images.get(2).toString().lastIndexOf("."));
            String app4 = images.get(3).toString().substring(images.get(3).toString().lastIndexOf("."));
            String app5 = images.get(4).toString().substring(images.get(4).toString().lastIndexOf("."));
            requestBody = new MultipartBody.Builder()
                    .setType(MultipartBody.FORM)
                    .addFormDataPart("uploads",app1,  RequestBody.create(MultipartBody.FORM, new File(images.get(0).toString())))
                    .addFormDataPart("uploads",app2,  RequestBody.create(MultipartBody.FORM, new File(images.get(1).toString())))
                    .addFormDataPart("uploads",app3,  RequestBody.create(MultipartBody.FORM, new File(images.get(2).toString())))
                    .addFormDataPart("uploads",app4,  RequestBody.create(MultipartBody.FORM, new File(images.get(3).toString())))
                    .addFormDataPart("uploads",app5,  RequestBody.create(MultipartBody.FORM, new File(images.get(4).toString())))
                    .build();
        }else if(images.size() == 6){
            String app1 = images.get(0).toString().substring(images.get(0).toString().lastIndexOf("."));
            String app2 = images.get(1).toString().substring(images.get(1).toString().lastIndexOf("."));
            String app3 = images.get(2).toString().substring(images.get(2).toString().lastIndexOf("."));
            String app4 = images.get(3).toString().substring(images.get(3).toString().lastIndexOf("."));
            String app5 = images.get(4).toString().substring(images.get(4).toString().lastIndexOf("."));
            String app6 = images.get(5).toString().substring(images.get(5).toString().lastIndexOf("."));
            requestBody = new MultipartBody.Builder()
                    .setType(MultipartBody.FORM)
                    .addFormDataPart("uploads",app1,  RequestBody.create(MultipartBody.FORM, new File(images.get(0).toString())))
                    .addFormDataPart("uploads",app2,  RequestBody.create(MultipartBody.FORM, new File(images.get(1).toString())))
                    .addFormDataPart("uploads",app3,  RequestBody.create(MultipartBody.FORM, new File(images.get(2).toString())))
                    .addFormDataPart("uploads",app4,  RequestBody.create(MultipartBody.FORM, new File(images.get(3).toString())))
                    .addFormDataPart("uploads",app5,  RequestBody.create(MultipartBody.FORM, new File(images.get(4).toString())))
                    .addFormDataPart("uploads",app6,  RequestBody.create(MultipartBody.FORM, new File(images.get(5).toString())))
                    .build();


        }


        try {
//        OkHttpClient client = new OkHttpClient();
            OkHttpClient client = new OkHttpClient.Builder()
                    .connectTimeout(10, TimeUnit.MINUTES)
                    .writeTimeout(10, TimeUnit.MINUTES)
                    .readTimeout(20, TimeUnit.MINUTES)
                    .build();


            Request request = new Request.Builder()
                    .url(url)
                    .post(requestBody)
                    .build();


            Response response = client.newCall(request).execute();
            return response.body().string();


        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return "";
        }
    }

    public String  postProfileImagesInServer(String url, String  images) {

        Apiresponse model = new Apiresponse();
        RequestBody requestBody = null;

            String app1 = images.toString().substring(images.toString().lastIndexOf("."));
            requestBody = new MultipartBody.Builder()
                    .setType(MultipartBody.FORM)
                    .addFormDataPart("uploads",app1,  RequestBody.create(MultipartBody.FORM, new File(images.toString())))
                    .build();

        try {
//        OkHttpClient client = new OkHttpClient();
            OkHttpClient client = new OkHttpClient.Builder()
                    .connectTimeout(10, TimeUnit.MINUTES)
                    .writeTimeout(10, TimeUnit.MINUTES)
                    .readTimeout(20, TimeUnit.MINUTES)
                    .build();


            Request request = new Request.Builder()
                    .url(url)
                    .post(requestBody)
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
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019


}
