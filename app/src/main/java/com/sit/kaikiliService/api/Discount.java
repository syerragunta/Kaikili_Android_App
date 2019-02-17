package com.sit.kaikiliService.api;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by ketan patel on 9/2/2019.
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
 *
 */

@JsonObject
public class Discount implements Serializable {

    @JsonField
    private String ds_id;

    @JsonField
    private String ds_title;

    @JsonField
    private String ds_rate_num_field;

    @JsonField
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
    private String ds_rate = "";

    public String getDs_rate() {
        return ds_rate;
    }

    public void setDs_rate(String ds_rate) {
        this.ds_rate = ds_rate;
    }

    @JsonField
>>>>>>> 2/14/2019
    private String ds_check_box;
=======
=======
>>>>>>> 2/16/2019
=======
>>>>>>> 2/16/2019 V1
    private String ds_rate = "";

    @JsonField
    private String ds_check_box;

    public String getDs_rate_per_item() {
        return ds_rate_per_item;
    }

    public void setDs_rate_per_item(String ds_rate_per_item) {
        this.ds_rate_per_item = ds_rate_per_item;
    }

    @JsonField
    private String ds_rate_per_item;
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/15/2019
=======
>>>>>>> 2/16/2019
=======
>>>>>>> 2/16/2019 V1

    public String getDs_id() {
        return ds_id;
    }

    public void setDs_id(String ds_id) {
        this.ds_id = ds_id;
    }

    public String getDs_title() {
        return ds_title;
    }

    public void setDs_title(String ds_title) {
        this.ds_title = ds_title;
    }

    public String getDs_rate_num_field() {
        return ds_rate_num_field;
    }

    public void setDs_rate_num_field(String ds_rate_num_field) {
        this.ds_rate_num_field = ds_rate_num_field;
    }

    public String getDs_check_box() {
        return ds_check_box;
    }

    public void setDs_check_box(String ds_check_box) {
        this.ds_check_box = ds_check_box;
    }
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 2/16/2019
=======
>>>>>>> 2/16/2019 V1

    public String getDs_rate() {
        return ds_rate;
    }

    public void setDs_rate(String ds_rate) {
        this.ds_rate = ds_rate;
    }

<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/15/2019
=======
>>>>>>> 2/16/2019
=======
>>>>>>> 2/16/2019 V1
}
