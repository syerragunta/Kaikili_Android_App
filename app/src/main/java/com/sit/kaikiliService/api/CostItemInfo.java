package com.sit.kaikiliService.api;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

import java.io.Serializable;

@JsonObject
public class CostItemInfo implements Serializable {

    @JsonField
    private String cc_id;

    @JsonField
    private String cc_title;

    @JsonField
    private String cc_rate_per_item;

    public String getCc_id() {
        return cc_id;
    }

    public void setCc_id(String cc_id) {
        this.cc_id = cc_id;
    }

    public String getCc_title() {
        return cc_title;
    }

    public void setCc_title(String cc_title) {
        this.cc_title = cc_title;
    }

    public String getCc_rate_per_item() {
        return cc_rate_per_item;
    }

    public void setCc_rate_per_item(String cc_rate_per_item) {
        this.cc_rate_per_item = cc_rate_per_item;
    }


}
