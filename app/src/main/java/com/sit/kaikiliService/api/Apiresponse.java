package com.sit.kaikiliService.api;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class Apiresponse {
    @JsonField
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @JsonField
    private int status;

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
    public int getCode() {
        return Code;
    }

    public void setCode(int code) {
        Code = code;
    }

    @JsonField
    private int Code;

    @JsonField
    private String Response;

    public String getResponse() {
        return Response;
    }

    public void setResponse(String response) {
        Response = response;
    }


<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019

}
