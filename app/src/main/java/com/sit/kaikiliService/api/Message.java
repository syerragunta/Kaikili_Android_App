package com.sit.kaikiliService.api;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by ketan patel on 19/2/2019.
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
 */

@JsonObject
public class Message implements Serializable {

    @JsonField
    private String author;

    @JsonField
    private String author_type;

    @JsonField
    private String sp_delet;

    @JsonField
    private String cu_delte;

    @JsonField
    private String sp_read;

    @JsonField
    private String cu_read;

    @JsonField
    private String body;

    @JsonField
    private String created_on;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor_type() {
        return author_type;
    }

    public void setAuthor_type(String author_type) {
        this.author_type = author_type;
    }

    public String getSp_delet() {
        return sp_delet;
    }

    public void setSp_delet(String sp_delet) {
        this.sp_delet = sp_delet;
    }

    public String getCu_delte() {
        return cu_delte;
    }

    public void setCu_delte(String cu_delte) {
        this.cu_delte = cu_delte;
    }

    public String getSp_read() {
        return sp_read;
    }

    public void setSp_read(String sp_read) {
        this.sp_read = sp_read;
    }

    public String getCu_read() {
        return cu_read;
    }

    public void setCu_read(String cu_read) {
        this.cu_read = cu_read;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getCreated_on() {
        return created_on;
    }

    public void setCreated_on(String created_on) {
        this.created_on = created_on;
    }
}
