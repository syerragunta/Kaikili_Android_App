package com.sit.kaikiliService.api;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

import java.util.ArrayList;

@JsonObject
public class ProfileWorkInfo {

    @JsonField
    private String _id;

    @JsonField
    private String sp_id;

    @JsonField
    private String email;

    @JsonField
    private String phone;

    @JsonField
    private String profile_status;

    @JsonField
    private String about_sp_profile;


    @JsonField
    private String website;

    @JsonField
    private String linkedin;

    @JsonField
    private String service_area;

    @JsonField
    private String radius;

    @JsonField
    private String leisure_day_offer;

    @JsonField
    private String near_offer_selected;

    @JsonField
    private String working_hours_24_7;

    @JsonField
    private String custom_work_hours;


    @JsonField
    private CoordinatePoint coordinatePoint;


    @JsonField
    private LeisureDay leisure_day_offer_on;


    @JsonField
    private NearOfferData near_offer_selected_on;

    @JsonField
<<<<<<< HEAD
    private ArrayList<CustomWorkPerDay> custom_work_per_day;

=======
    private String profile_image;

    @JsonField
    private ArrayList<CustomWorkPerDay> custom_work_per_day;

    @JsonField
    private ArrayList<String> workImages;

    public String getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(String profile_image) {
        this.profile_image = profile_image;
    }

    public ArrayList<String> getWorkImages() {
        return workImages;
    }

    public void setWorkImages(ArrayList<String> workImages) {
        this.workImages = workImages;
    }

>>>>>>> 2/28/2019
    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getSp_id() {
        return sp_id;
    }

    public void setSp_id(String sp_id) {
        this.sp_id = sp_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProfile_status() {
        return profile_status;
    }

    public void setProfile_status(String profile_status) {
        this.profile_status = profile_status;
    }

    public String getAbout_sp_profile() {
        return about_sp_profile;
    }

    public void setAbout_sp_profile(String about_sp_profile) {
        this.about_sp_profile = about_sp_profile;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getService_area() {
        return service_area;
    }

    public void setService_area(String service_area) {
        this.service_area = service_area;
    }

    public String getRadius() {
        return radius;
    }

    public void setRadius(String radius) {
        this.radius = radius;
    }

    public String getLeisure_day_offer() {
        return leisure_day_offer;
    }

    public void setLeisure_day_offer(String leisure_day_offer) {
        this.leisure_day_offer = leisure_day_offer;
    }

    public String getNear_offer_selected() {
        return near_offer_selected;
    }

    public void setNear_offer_selected(String near_offer_selected) {
        this.near_offer_selected = near_offer_selected;
    }

    public String getWorking_hours_24_7() {
        return working_hours_24_7;
    }

    public void setWorking_hours_24_7(String working_hours_24_7) {
        this.working_hours_24_7 = working_hours_24_7;
    }

    public String getCustom_work_hours() {
        return custom_work_hours;
    }

    public void setCustom_work_hours(String custom_work_hours) {
        this.custom_work_hours = custom_work_hours;
    }

    public CoordinatePoint getCoordinatePoint() {
        return coordinatePoint;
    }

    public void setCoordinatePoint(CoordinatePoint coordinatePoint) {
        this.coordinatePoint = coordinatePoint;
    }

    public LeisureDay getLeisure_day_offer_on() {
        return leisure_day_offer_on;
    }

    public void setLeisure_day_offer_on(LeisureDay leisure_day_offer_on) {
        this.leisure_day_offer_on = leisure_day_offer_on;
    }

    public NearOfferData getNear_offer_selected_on() {
        return near_offer_selected_on;
    }

    public void setNear_offer_selected_on(NearOfferData near_offer_selected_on) {
        this.near_offer_selected_on = near_offer_selected_on;
    }

    public ArrayList<CustomWorkPerDay> getCustom_work_per_day() {
        return custom_work_per_day;
    }

    public void setCustom_work_per_day(ArrayList<CustomWorkPerDay> custom_work_per_day) {
        this.custom_work_per_day = custom_work_per_day;
    }
}
