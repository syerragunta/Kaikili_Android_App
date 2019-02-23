package com.sit.kaikiliService.api;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

import java.util.ArrayList;

/**
 * Created by ketan patel on 19/2/2019.
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
 *
 */

@JsonObject
public class GetNotificationAPI {

          @JsonField
        private String message;

        @JsonField
        private int status;

        @JsonField
        private ArrayList<NotificationInfo> data;


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

    public ArrayList<NotificationInfo> getData() {
        return data;
    }

    public void setData(ArrayList<NotificationInfo> data) {
        this.data = data;
    }
}
