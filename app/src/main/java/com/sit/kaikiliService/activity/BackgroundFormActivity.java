package com.sit.kaikiliService.activity;

<<<<<<< HEAD
import android.app.DatePickerDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.ImageView;

import com.sit.kaikiliService.KetanApplication;
import com.sit.kaikiliService.R;
import com.sit.kaikiliService.comman.BetterSpinner;
import com.sit.kaikiliService.comman.Util;
import com.sit.kaikiliService.font.EditTextEupheminUCASRegular;
import com.sit.kaikiliService.font.TextViewEuphemiaUCASRegular;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

=======
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
import com.sit.kaikiliService.font.EditTextEupheminUCASRegular;
import com.sit.kaikiliService.font.TextViewEuphemiaUCASRegular;

>>>>>>> 2/1/2019
import butterknife.Bind;
import butterknife.ButterKnife;


/**
 * Created by ketan patel on 24/1/2019.
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
 */

public class BackgroundFormActivity extends BaseActivity implements View.OnClickListener {

    @Bind(R.id.top_back) ImageView top_back;
    @Bind(R.id.top_title) TextViewEuphemiaUCASRegular top_title;

    @Bind( R.id.background_form_edit_first) EditTextEupheminUCASRegular background_form_edit_first;
    @Bind( R.id.background_form_edit_middle) EditTextEupheminUCASRegular background_form_edit_middle;
    @Bind( R.id.background_form_edit_last) EditTextEupheminUCASRegular background_form_edit_last;
    @Bind( R.id.background_form_edit_address) EditTextEupheminUCASRegular background_form_edit_address;
    @Bind( R.id.background_form_edit_city) EditTextEupheminUCASRegular background_form_edit_city;
    @Bind( R.id.background_form_edit_zip) EditTextEupheminUCASRegular background_form_edit_zip;
    @Bind( R.id.background_form_edit_st) EditTextEupheminUCASRegular background_form_edit_st;
    @Bind( R.id.background_form_edit_ssn) EditTextEupheminUCASRegular background_form_edit_ssn;

        @Bind( R.id.background_form_tv_submit) TextViewEuphemiaUCASRegular background_form_tv_submit;


<<<<<<< HEAD
    private KetanApplication application;
=======
    private KaikiliApplication application;
>>>>>>> 2/1/2019
    private SharedPreferences preferences;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_background_form );
        ButterKnife.bind( this, this );

<<<<<<< HEAD
        application = (KetanApplication) getApplicationContext();
=======
        application = (KaikiliApplication) getApplicationContext();
>>>>>>> 2/1/2019
        preferences = application.getSharedPreferences();

        top_title.setText( "Background Check Form" );

        top_back.setOnClickListener( this );
        background_form_tv_submit.setOnClickListener( this );

    }




    @Override
    public void onClick(View view) {

        if (view == top_back) {
            finish();
        } else if (view == background_form_tv_submit) {
            finish();
        }
    }
}
