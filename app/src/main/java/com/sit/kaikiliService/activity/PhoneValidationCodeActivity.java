package com.sit.kaikiliService.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.widget.ImageView;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import android.widget.Toast;

import com.rilixtech.Country;
import com.rilixtech.CountryCodePicker;
import com.sit.kaikiliService.KetanApplication;
import com.sit.kaikiliService.R;
import com.sit.kaikiliService.font.EditTextEupheminUCASRegular;
=======

import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
>>>>>>> 2/1/2019
=======

import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
>>>>>>> 2/2/2019
=======

import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
>>>>>>> 2/9/2019
=======

import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
>>>>>>> 2/14/2019
=======

import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
>>>>>>> 2/15/2019
=======

import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
>>>>>>> 2/16/2019
=======

import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
>>>>>>> 2/16/2019 V1
=======

import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
>>>>>>> 2/16/2019 V2
=======

import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
>>>>>>> 2/16/2019
=======

import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
>>>>>>> 2/18/2019
import com.sit.kaikiliService.font.TextViewEuphemiaUCASRegular;
import com.sit.kaikiliService.font.VerificationCodeEditText;

import butterknife.Bind;
import butterknife.ButterKnife;


/**
 * Created by ketan patel on 22/1/2019.
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
 *
 */

public class PhoneValidationCodeActivity extends BaseActivity implements View.OnClickListener {

    @Bind(R.id.top_back) ImageView top_back;

    @Bind(R.id.top_title) TextViewEuphemiaUCASRegular top_title;


    @Bind(R.id.phone_code_tv_message)  TextViewEuphemiaUCASRegular phone_code_tv_message;
    @Bind(R.id.phone_code_tv_resendCode)  TextViewEuphemiaUCASRegular phone_code_tv_resendCode;
    @Bind(R.id.phone_code_tv_editNumber)  TextViewEuphemiaUCASRegular phone_code_tv_editNumber;


    @Bind(R.id.phone_code_edt_code)
    VerificationCodeEditText phone_code_edt_code;


    @Bind(R.id.phone_code_fb_next)  FloatingActionButton phone_code_fb_next;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    private KetanApplication application;
=======
    private KaikiliApplication application;
>>>>>>> 2/1/2019
=======
    private KaikiliApplication application;
>>>>>>> 2/2/2019
=======
    private KaikiliApplication application;
>>>>>>> 2/9/2019
=======
    private KaikiliApplication application;
>>>>>>> 2/14/2019
=======
    private KaikiliApplication application;
>>>>>>> 2/15/2019
=======
    private KaikiliApplication application;
>>>>>>> 2/16/2019
=======
    private KaikiliApplication application;
>>>>>>> 2/16/2019 V1
=======
    private KaikiliApplication application;
>>>>>>> 2/16/2019 V2
=======
    private KaikiliApplication application;
>>>>>>> 2/16/2019
=======
    private KaikiliApplication application;
>>>>>>> 2/18/2019
    private SharedPreferences preferences;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_validation_code);
        ButterKnife.bind( this,this );

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        application = (KetanApplication) getApplicationContext();
=======
        application = (KaikiliApplication) getApplicationContext();
>>>>>>> 2/1/2019
=======
        application = (KaikiliApplication) getApplicationContext();
>>>>>>> 2/2/2019
=======
        application = (KaikiliApplication) getApplicationContext();
>>>>>>> 2/9/2019
=======
        application = (KaikiliApplication) getApplicationContext();
>>>>>>> 2/14/2019
=======
        application = (KaikiliApplication) getApplicationContext();
>>>>>>> 2/15/2019
=======
        application = (KaikiliApplication) getApplicationContext();
>>>>>>> 2/16/2019
=======
        application = (KaikiliApplication) getApplicationContext();
>>>>>>> 2/16/2019 V1
=======
        application = (KaikiliApplication) getApplicationContext();
>>>>>>> 2/16/2019 V2
=======
        application = (KaikiliApplication) getApplicationContext();
>>>>>>> 2/16/2019
=======
        application = (KaikiliApplication) getApplicationContext();
>>>>>>> 2/18/2019
        preferences = application.getSharedPreferences();

        top_title.setText( "Phone Number Validation" );

        phone_code_tv_message.setText( "Enter the 5 digit code sent you at +1 (201)-301-4001." );
        top_back.setOnClickListener( this );
        phone_code_fb_next.setOnClickListener( this );
        phone_code_tv_resendCode.setOnClickListener( this );
        phone_code_tv_editNumber.setOnClickListener( this );


    }


    @Override
    public void onClick(View view) {

        if(view == top_back){
            finish();
        }else if(view == phone_code_fb_next){
            Intent intent = new Intent( PhoneValidationCodeActivity.this,RegistrationActivity.class );
            startActivity( intent );
            finish();
        }else if(view == phone_code_tv_resendCode){

        }else if(view == phone_code_tv_editNumber){
            Intent intent = new Intent( PhoneValidationCodeActivity.this,PhoneNoValidationActivity.class );
            startActivity( intent );
            finish();
        }
    }
}
