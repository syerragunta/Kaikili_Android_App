package com.sit.kaikiliService.api;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class UserCreateAPI {
    @JsonField
    private String message;

    @JsonField
    private int status;

    @JsonField
    private ProfileInfo data;


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

    public ProfileInfo getData() {
        return data;
    }

    public void setData(ProfileInfo data) {
        this.data = data;
    }
}

