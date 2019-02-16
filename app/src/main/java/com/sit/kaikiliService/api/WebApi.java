package com.sit.kaikiliService.api;


<<<<<<< HEAD
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Multipart;
import retrofit.http.POST;
import retrofit.http.Part;
import retrofit.http.Path;
import retrofit.http.Query;
import retrofit.mime.TypedFile;
=======

import com.google.gson.JsonObject;
import com.squareup.okhttp.RequestBody;

import org.json.JSONObject;

import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Path;
import retrofit.http.Query;
import retrofit.mime.TypedInput;
import retrofit.mime.TypedOutput;
>>>>>>> 2/14/2019

/**
 * Created by ketan patel on 9/2/2019.
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
<<<<<<< HEAD
 *
=======
>>>>>>> 2/14/2019
 */

public interface WebApi {

<<<<<<< HEAD
      public static final String BASE_URL = "http://157.230.188.53:3000/subservices/";

    public static final String URL = "/{tag}";


    //LOGIN
    public static final String TAG = "tag";


=======
    public static final String BASE_URL = "http://157.230.188.53:3000/";

    public static final String URL = "/{tag}/{getAllAddService}";
    public static final String URL_ADD_SERVICE = "/{tag}/{AddUserServices}";
    public static final String URL_ADD_SERVICE_TEST = "http://157.230.188.53:3000/user_add_services/AddUserServices";
    public static final String URL_ADD_NEW_USER = "http://157.230.188.53:3000/user_add_services/AddNewUser";



    //3000/subservices/getAllAddService
    //LOGIN
    public static final String TAG = "tag";
    public static final String GET_ALL_ADD_SERVICE = "getAllAddService";
    public static final String ADD_USER_SERVICES = "AddUserServices";
//    /subservices/AddUserServices/user_add_services 404 315.508 ms - 1541
>>>>>>> 2/14/2019


    @GET(URL)
    void getAllAddService(@Path(TAG) String tag,
<<<<<<< HEAD
                     Callback<GetAllServiceAPI> callback
    );

=======
                          @Path(GET_ALL_ADD_SERVICE) String getAllAddService,
                          Callback<GetAllServiceAPI> callback);


    @POST(URL_ADD_SERVICE)
    void userAddService(@Path(TAG) String tag,
                        @Path(ADD_USER_SERVICES) String AddUserServices,
//                        @Body RequestBody requestBody,
                        @Body JSONObject body,
                        Callback<Apiresponse> callback);
>>>>>>> 2/14/2019


}
