package com.sit.kaikiliService.api;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class LeisureDay {

    @JsonField
    private String leisure_day_discount;

    @JsonField
    private String start_date;

    @JsonField
    private String start_time;

    @JsonField
    private String end_date;

    @JsonField
    private String end_time;

    public String getLeisure_day_discount() {
        return leisure_day_discount;
    }

    public void setLeisure_day_discount(String leisure_day_discount) {
        this.leisure_day_discount = leisure_day_discount;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }
}
