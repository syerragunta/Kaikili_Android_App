package com.sit.kaikiliService.api;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

import java.util.ArrayList;

@JsonObject
public class UserServiceGetAPI {
    @JsonField
    private String message;

    @JsonField
    private int status;

    @JsonField
    private ArrayList<ServiceInfo> data;

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ArrayList<ServiceInfo> getData() {
        return data;
    }

    public void setData(ArrayList<ServiceInfo> data) {
        this.data = data;
    }
}
