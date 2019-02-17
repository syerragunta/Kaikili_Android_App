package com.sit.kaikiliService.api;


<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
=======
>>>>>>> 2/15/2019
=======
>>>>>>> 2/16/2019
=======
>>>>>>> 2/16/2019 V1

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

/**
 * Created by ketan patel on 9/2/2019.
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
 *
=======
>>>>>>> 2/14/2019
=======
>>>>>>> 2/15/2019
=======
>>>>>>> 2/16/2019
=======
>>>>>>> 2/16/2019 V1
 */

public interface WebApi {

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
      public static final String BASE_URL = "http://157.230.188.53:3000/subservices/";

    public static final String URL = "/{tag}";


    //LOGIN
    public static final String TAG = "tag";


=======
=======
>>>>>>> 2/15/2019
=======
>>>>>>> 2/16/2019
=======
>>>>>>> 2/16/2019 V1
    public static final String BASE_URL = "http://157.230.188.53:3000/";

    public static final String URL = "/{tag}/{getAllAddService}";
    public static final String URL_ADD_SERVICE = "/{tag}/{AddUserServices}";
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    public static final String URL_ADD_SERVICE_TEST = "http://157.230.188.53:3000/user_add_services/AddUserServices";
    public static final String URL_ADD_NEW_USER = "http://157.230.188.53:3000/user_add_services/AddNewUser";


=======
    public static final String URL_ADD_SERVICE_TEST = "http://157.230.188.53:3000/users/AddUserServices";
    public static final String URL_ADD_NEW_USER = "http://157.230.188.53:3000/users/AddNewUser";
    public static final String URL_USER_SERVICE_DATA_GET = "http://157.230.188.53:3000/users/GetUserServices";
>>>>>>> 2/15/2019
=======
    public static final String URL_ADD_SERVICE_TEST = "http://157.230.188.53:3000/users/AddUserServices";
    public static final String URL_ADD_NEW_USER = "http://157.230.188.53:3000/users/AddNewUser";
    public static final String URL_USER_SERVICE_DATA_GET = "http://157.230.188.53:3000/users/GetUserServices";
>>>>>>> 2/16/2019
=======
    public static final String URL_ADD_SERVICE_TEST = "http://157.230.188.53:3000/users/AddUserServices";
    public static final String URL_ADD_NEW_USER = "http://157.230.188.53:3000/users/AddNewUser";
    public static final String URL_USER_SERVICE_DATA_GET = "http://157.230.188.53:3000/users/GetUserServices";
>>>>>>> 2/16/2019 V1

    //3000/subservices/getAllAddService
    //LOGIN
    public static final String TAG = "tag";
    public static final String GET_ALL_ADD_SERVICE = "getAllAddService";
    public static final String ADD_USER_SERVICES = "AddUserServices";
//    /subservices/AddUserServices/user_add_services 404 315.508 ms - 1541
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


    @GET(URL)
    void getAllAddService(@Path(TAG) String tag,
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
                     Callback<GetAllServiceAPI> callback
    );

=======
=======
>>>>>>> 2/15/2019
=======
>>>>>>> 2/16/2019
=======
>>>>>>> 2/16/2019 V1
                          @Path(GET_ALL_ADD_SERVICE) String getAllAddService,
                          Callback<GetAllServiceAPI> callback);


    @POST(URL_ADD_SERVICE)
    void userAddService(@Path(TAG) String tag,
                        @Path(ADD_USER_SERVICES) String AddUserServices,
//                        @Body RequestBody requestBody,
                        @Body JSONObject body,
                        Callback<Apiresponse> callback);
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


}
