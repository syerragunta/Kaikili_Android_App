package com.sit.kaikiliService.api;


import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

import java.util.ArrayList;

/**
 * Created by ketan patel on 18/2/2019.
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
 */

@JsonObject
public class ScheduledTSApi {

    @JsonField
    private String message;

    @JsonField
    private int status;

    @JsonField
    private ArrayList<TransitionServiceData> data;

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

    public ArrayList<TransitionServiceData> getData() {
        return data;
    }

    public void setData(ArrayList<TransitionServiceData> data) {
        this.data = data;
    }
}
