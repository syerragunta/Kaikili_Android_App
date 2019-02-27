package com.sit.kaikiliService.api;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

import java.util.ArrayList;

@JsonObject
public class ProfileWorkApi {

    @JsonField
    private String message;

    @JsonField
    private int status;

    @JsonField
    private ArrayList<ProfileWorkInfo> data;

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

    public ArrayList<ProfileWorkInfo> getData() {
        return data;
    }

    public void setData(ArrayList<ProfileWorkInfo> data) {
        this.data = data;
    }
}
