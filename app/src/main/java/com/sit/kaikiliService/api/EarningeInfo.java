package com.sit.kaikiliService.api;


import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

/**
 * Created by ketan patel on 20/2/2019.
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
 */

@JsonObject
public class EarningeInfo {

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
    private String date;

    @JsonField
    private String time;

    @JsonField
    private String sr_id;

    @JsonField
    private String sr_title;

    @JsonField
    private String sr_status;

    @JsonField
    private String txn_status;

    @JsonField
    private String payment_type;

    @JsonField
    private String net_payment;

    @JsonField
    private String kaikili_comm;

    @JsonField
    private String discount;

    @JsonField
    private String total;

    @JsonField
    private String updateDate;

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

    public String getPayment_type() {
        return payment_type;
    }

    public void setPayment_type(String payment_type) {
        this.payment_type = payment_type;
    }

    public String getNet_payment() {
        return net_payment;
    }

    public void setNet_payment(String net_payment) {
        this.net_payment = net_payment;
    }

    public String getKaikili_comm() {
        return kaikili_comm;
    }

    public void setKaikili_comm(String kaikili_comm) {
        this.kaikili_comm = kaikili_comm;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }
}
