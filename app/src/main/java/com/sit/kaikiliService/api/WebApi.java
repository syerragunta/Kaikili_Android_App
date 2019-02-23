package com.sit.kaikiliService.api;


<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
<<<<<<< HEAD
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
=======
>>>>>>> 2/16/2019
=======
>>>>>>> 2/18/2019
=======
>>>>>>> 2/21/2019
=======
>>>>>>> 2/22/2019

/**
 * Created by ketan patel on 9/2/2019.
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
 */

public interface WebApi {

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
    public static final String BASE_URL = "http://157.230.188.53:3000/";

    public static final String URL = "/{tag}/{getAllAddService}";
    public static final String URL_ADD_SERVICE = "/{tag}/{AddUserServices}";
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
=======
=======
>>>>>>> 2/16/2019
=======
>>>>>>> 2/18/2019
=======
>>>>>>> 2/21/2019
=======
>>>>>>> 2/22/2019
    public static final String URL_ADD_SERVICE_TEST = "http://157.230.188.53:3000/users/AddUserServices";
    public static final String URL_ADD_NEW_USER = "http://157.230.188.53:3000/users/AddNewUser";
    public static final String URL_USER_SERVICE_DATA_GET = "http://157.230.188.53:3000/users/GetUserServices";
    public static final String URL_USER_SERVICE_CATALOG = "http://157.230.188.53:3000/users/getUserServiceCatalogue";
    public static final String URL_GET_SERVICE_INFO_ID = "http://157.230.188.53:3000/subservices/getServiceIdInfo";
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/16/2019 V2
=======
    public static final String URL_GET_SCHEDULED_SERVICE = "http://157.230.188.53:3000/users/getUserTransitionSL";
    public static final String URL_TRANSITION_UPDATE = "http://157.230.188.53:3000/users/userTransitionUpdate";
>>>>>>> 2/16/2019
=======
=======
>>>>>>> 2/21/2019
=======
>>>>>>> 2/22/2019
    public static final String URL_GET_SCHEDULED_SERVICE = "http://157.230.188.53:3000/users/getUserTransitionSL";
    public static final String URL_TRANSITION_UPDATE = "http://157.230.188.53:3000/users/userTransitionUpdate";
    public static final String URL_NOTIFICATION_LIST = "http://157.230.188.53:3000/users/userNotificationList";
    public static final String URL_NOTIFICATION_MESSAGE = "http://157.230.188.53:3000/users/userSingleNotification";
    public static final String URL_MESSAGE_POST = "http://157.230.188.53:3000/users/userPostMessages";
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/18/2019
=======
=======
>>>>>>> 2/22/2019
    public static final String URL_TRANSITION_COMPLETED = "http://157.230.188.53:3000/users/userTransitionCompleted";
    public static final String URL_COMPLETED_TRANSITION_LIST = "http://157.230.188.53:3000/users/getUserCompletedTransition";
    public static final String URL_ADD_SERVICE_REVIEW = "http://157.230.188.53:3000/users/userAddServiceReview";
    public static final String URL_COMPLETED_SERVICE = "http://157.230.188.53:3000/users/userCompletedService";
    public static final String URL_SINGLE_TRANSITION = "http://157.230.188.53:3000/users/getSingleTransitionInfo";
<<<<<<< HEAD

>>>>>>> 2/21/2019
=======
    public static final String URL_ADD_BANK_INFO = "http://157.230.188.53:3000/users/SPAddBankInfo";
    public static final String URL_USER_BANK_INFO_LIST = "http://157.230.188.53:3000/users/SPUserBankInfoList";
    public static final String URL_DELETE_BANK_INFO = "http://157.230.188.53:3000/users/SPUserDeleteBankInfo";
    public static final String URL_SET_DEFAULT_BANK_INFO = "http://157.230.188.53:3000/users/SPUserSetDefaultBankInfo";

>>>>>>> 2/22/2019

    //3000/subservices/getAllAddService
    //LOGIN
    public static final String TAG = "tag";
    public static final String GET_ALL_ADD_SERVICE = "getAllAddService";
    public static final String ADD_USER_SERVICES = "AddUserServices";
//    /subservices/AddUserServices/user_add_services 404 315.508 ms - 1541
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
=======
>>>>>>> 2/16/2019
=======
>>>>>>> 2/18/2019
=======
>>>>>>> 2/21/2019
=======
>>>>>>> 2/22/2019


    @GET(URL)
    void getAllAddService(@Path(TAG) String tag,
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
<<<<<<< HEAD
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
=======
>>>>>>> 2/16/2019
=======
>>>>>>> 2/18/2019
=======
>>>>>>> 2/21/2019
=======
>>>>>>> 2/22/2019


}
