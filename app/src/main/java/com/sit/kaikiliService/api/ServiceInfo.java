package com.sit.kaikiliService.api;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by ketan patel on 15/2/2019.
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
 */

@JsonObject
public class ServiceInfo implements Serializable {

    @JsonField
    private String _id;

    @JsonField
    private String sr_id;

    @JsonField
    private String sp_id;

    @JsonField
    private String minimum_charge;

    @JsonField
    private String sr_type;

    @JsonField
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 2/16/2019
=======
>>>>>>> 2/18/2019
=======
>>>>>>> 2/21/2019
=======
>>>>>>> 2/22/2019
=======
>>>>>>> 2/23/2019
=======
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
    private String sp_sr_status;


    @JsonField
    private String sr_title;


    @JsonField
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/16/2019 V2
=======
>>>>>>> 2/16/2019
=======
>>>>>>> 2/18/2019
=======
>>>>>>> 2/21/2019
=======
>>>>>>> 2/22/2019
=======
>>>>>>> 2/23/2019
=======
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
    private ArrayList<CostItemInfo> cost_comps_per_item_on = new ArrayList<>(  );

    @JsonField
    private ArrayList<CostItemInfo> cost_comps_per_item_off = new ArrayList<>(  );

    @JsonField
    private ArrayList<CostItemInfo> cost_comps_pro_rate_on = new ArrayList<>(  );

    @JsonField
    private ArrayList<CostItemInfo> cost_comps_pro_rate_off = new ArrayList<>(  );

    @JsonField
    private Discount discount;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getSr_id() {
        return sr_id;
    }

    public void setSr_id(String sr_id) {
        this.sr_id = sr_id;
    }

    public String getSp_id() {
        return sp_id;
    }

    public void setSp_id(String sp_id) {
        this.sp_id = sp_id;
    }

    public String getMinimum_charge() {
        return minimum_charge;
    }

    public void setMinimum_charge(String minimum_charge) {
        this.minimum_charge = minimum_charge;
    }

    public String getSr_type() {
        return sr_type;
    }

    public void setSr_type(String sr_type) {
        this.sr_type = sr_type;
    }

    public ArrayList<CostItemInfo> getCost_comps_per_item_on() {
        return cost_comps_per_item_on;
    }

    public void setCost_comps_per_item_on(ArrayList<CostItemInfo> cost_comps_per_item_on) {
        this.cost_comps_per_item_on = cost_comps_per_item_on;
    }

    public ArrayList<CostItemInfo> getCost_comps_per_item_off() {
        return cost_comps_per_item_off;
    }

    public void setCost_comps_per_item_off(ArrayList<CostItemInfo> cost_comps_per_item_off) {
        this.cost_comps_per_item_off = cost_comps_per_item_off;
    }

    public ArrayList<CostItemInfo> getCost_comps_pro_rate_on() {
        return cost_comps_pro_rate_on;
    }

    public void setCost_comps_pro_rate_on(ArrayList<CostItemInfo> cost_comps_pro_rate_on) {
        this.cost_comps_pro_rate_on = cost_comps_pro_rate_on;
    }

    public ArrayList<CostItemInfo> getCost_comps_pro_rate_off() {
        return cost_comps_pro_rate_off;
    }

    public void setCost_comps_pro_rate_off(ArrayList<CostItemInfo> cost_comps_pro_rate_off) {
        this.cost_comps_pro_rate_off = cost_comps_pro_rate_off;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD



=======
=======
>>>>>>> 2/16/2019
=======
>>>>>>> 2/18/2019
=======
>>>>>>> 2/21/2019
=======
>>>>>>> 2/22/2019
=======
>>>>>>> 2/23/2019
=======
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
    public String getSp_sr_status() {
        return sp_sr_status;
    }

    public void setSp_sr_status(String sp_sr_status) {
        this.sp_sr_status = sp_sr_status;
    }

    public String getSr_title() {
        return sr_title;
    }

    public void setSr_title(String sr_title) {
        this.sr_title = sr_title;
    }
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/16/2019 V2
=======
>>>>>>> 2/16/2019
=======
>>>>>>> 2/18/2019
=======
>>>>>>> 2/21/2019
=======
>>>>>>> 2/22/2019
=======
>>>>>>> 2/23/2019
=======
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
//    @JsonObject
//    public class Discount implements Serializable {
//
//        @JsonField
//        private String ds_id;
//
//        @JsonField
//        private String ds_title;
//
//        @JsonField
//        private String ds_rate_per_item;
//
//        @JsonField
//        private String ds_check_box;
//
//        public String getDs_id() {
//            return ds_id;
//        }
//
//        public void setDs_id(String ds_id) {
//            this.ds_id = ds_id;
//        }
//
//        public String getDs_title() {
//            return ds_title;
//        }
//
//        public void setDs_title(String ds_title) {
//            this.ds_title = ds_title;
//        }
//
//        public String getDs_rate_per_item() {
//            return ds_rate_per_item;
//        }
//
//        public void setDs_rate_per_item(String ds_rate_per_item) {
//            this.ds_rate_per_item = ds_rate_per_item;
//        }
//
//        public String getDs_check_box() {
//            return ds_check_box;
//        }
//
//        public void setDs_check_box(String ds_check_box) {
//            this.ds_check_box = ds_check_box;
//        }
//    }

}
