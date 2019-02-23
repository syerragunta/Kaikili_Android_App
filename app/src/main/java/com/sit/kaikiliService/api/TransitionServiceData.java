package com.sit.kaikiliService.api;


import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.sit.kaikiliService.api.ServiceInfo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by ketan patel on 18/2/2019.
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
 */

@JsonObject
public class TransitionServiceData implements Serializable {

    @JsonField
    private String _id;

    @JsonField
    private String cust_id;

    @JsonField
    private String cust_first_name;

    @JsonField
    private String cust_last_name;

    @JsonField
    private String sp_id;

    @JsonField
    private String sp_first_name;

    @JsonField
    private String sp_Last_name;

    @JsonField
    private String tran_id;

    @JsonField
    private String sr_status;

    @JsonField
    private String txn_status;

    @JsonField
    private String date;

    @JsonField
    private String time;

    @JsonField
    private String address;

    @JsonField
    private String sr_id;

    @JsonField
    private String sr_title;

    @JsonField
    private String sr_type;

    @JsonField
    private String sr_total;

    @JsonField
    private String sp_net_pay;

    @JsonField
    private String creationDate;

    @JsonField
    private String updateDate;

    @JsonField
    private ArrayList<CostCompsPerItem> cost_comps_per_item;

    @JsonField
    private DiscountTS discount;

    @JsonField
    private KaikiliCommission kaikili_commission;

    @JsonField
    private CoordinatePoint coordinatePoint;





    @JsonObject
    public static class CostCompsPerItem implements Serializable {

        @JsonField
        private String cc_title;

        @JsonField
        private String cc_rate_per_item;

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

    @JsonObject
    public static class DiscountTS implements Serializable {

        @JsonField
        private String ds_title;

        @JsonField
        private String ds_rate_per_item;

        public String getDs_title() {
            return ds_title;
        }

        public void setDs_title(String ds_title) {
            this.ds_title = ds_title;
        }

        public String getDs_rate_per_item() {
            return ds_rate_per_item;
        }

        public void setDs_rate_per_item(String ds_rate_per_item) {
            this.ds_rate_per_item = ds_rate_per_item;
        }
    }

    @JsonObject
    public static class KaikiliCommission implements Serializable{

        @JsonField
        private String kk_title;

        @JsonField
        private String kk_rate_per_item;

        public String getKk_title() {
            return kk_title;
        }

        public void setKk_title(String kk_title) {
            this.kk_title = kk_title;
        }

        public String getKk_rate_per_item() {
            return kk_rate_per_item;
        }

        public void setKk_rate_per_item(String kk_rate_per_item) {
            this.kk_rate_per_item = kk_rate_per_item;
        }
    }

    @JsonObject
    public static class CoordinatePoint implements Serializable{

        @JsonField
        private String latitude;

        @JsonField
        private String longitude;

        public String getLatitude() {
            return latitude;
        }

        public void setLatitude(String latitude) {
            this.latitude = latitude;
        }

        public String getLongitude() {
            return longitude;
        }

        public void setLongitude(String longitude) {
            this.longitude = longitude;
        }
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getCust_id() {
        return cust_id;
    }

    public void setCust_id(String cust_id) {
        this.cust_id = cust_id;
    }

    public String getCust_first_name() {
        return cust_first_name;
    }

    public void setCust_first_name(String cust_first_name) {
        this.cust_first_name = cust_first_name;
    }

    public String getCust_last_name() {
        return cust_last_name;
    }

    public void setCust_last_name(String cust_last_name) {
        this.cust_last_name = cust_last_name;
    }

    public String getSp_id() {
        return sp_id;
    }

    public void setSp_id(String sp_id) {
        this.sp_id = sp_id;
    }

    public String getSp_first_name() {
        return sp_first_name;
    }

    public void setSp_first_name(String sp_first_name) {
        this.sp_first_name = sp_first_name;
    }

    public String getSp_Last_name() {
        return sp_Last_name;
    }

    public void setSp_Last_name(String sp_Last_name) {
        this.sp_Last_name = sp_Last_name;
    }

    public String getTran_id() {
        return tran_id;
    }

    public void setTran_id(String tran_id) {
        this.tran_id = tran_id;
    }

    public String getSr_status() {
        return sr_status;
    }

    public void setSr_status(String sr_status) {
        this.sr_status = sr_status;
    }

    public String getTxn_status() {
        return txn_status;
    }

    public void setTxn_status(String txn_status) {
        this.txn_status = txn_status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSr_id() {
        return sr_id;
    }

    public void setSr_id(String sr_id) {
        this.sr_id = sr_id;
    }

    public String getSr_title() {
        return sr_title;
    }

    public void setSr_title(String sr_title) {
        this.sr_title = sr_title;
    }

    public String getSr_type() {
        return sr_type;
    }

    public void setSr_type(String sr_type) {
        this.sr_type = sr_type;
    }

    public String getSr_total() {
        return sr_total;
    }

    public void setSr_total(String sr_total) {
        this.sr_total = sr_total;
    }

    public String getSp_net_pay() {
        return sp_net_pay;
    }

    public void setSp_net_pay(String sp_net_pay) {
        this.sp_net_pay = sp_net_pay;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public ArrayList<CostCompsPerItem> getCost_comps_per_item() {
        return cost_comps_per_item;
    }

    public void setCost_comps_per_item(ArrayList<CostCompsPerItem> cost_comps_per_item) {
        this.cost_comps_per_item = cost_comps_per_item;
    }

    public DiscountTS getDiscount() {
        return discount;
    }

    public void setDiscount(DiscountTS discount) {
        this.discount = discount;
    }

    public KaikiliCommission getKaikili_commission() {
        return kaikili_commission;
    }

    public void setKaikili_commission(KaikiliCommission kaikili_commission) {
        this.kaikili_commission = kaikili_commission;
    }

    public CoordinatePoint getCoordinatePoint() {
        return coordinatePoint;
    }

    public void setCoordinatePoint(CoordinatePoint coordinatePoint) {
        this.coordinatePoint = coordinatePoint;
    }
}
