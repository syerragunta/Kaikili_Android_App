package com.sit.kaikiliService.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import com.sit.kaikiliService.KetanApplication;
=======
import com.sit.kaikiliService.KaikiliApplication;
>>>>>>> 2/1/2019
=======
import com.sit.kaikiliService.KaikiliApplication;
>>>>>>> 2/2/2019
=======
import com.sit.kaikiliService.KaikiliApplication;
>>>>>>> 2/9/2019
=======
import com.sit.kaikiliService.KaikiliApplication;
>>>>>>> 2/14/2019
=======
import com.sit.kaikiliService.KaikiliApplication;
>>>>>>> 2/15/2019
=======
import com.sit.kaikiliService.KaikiliApplication;
>>>>>>> 2/16/2019
=======
import com.sit.kaikiliService.KaikiliApplication;
>>>>>>> 2/16/2019 V1
=======
import com.sit.kaikiliService.KaikiliApplication;
>>>>>>> 2/16/2019 V2
=======
import com.sit.kaikiliService.KaikiliApplication;
>>>>>>> 2/16/2019
=======
import com.sit.kaikiliService.KaikiliApplication;
>>>>>>> 2/18/2019
=======
import com.sit.kaikiliService.KaikiliApplication;
>>>>>>> 2/21/2019
=======
import com.sit.kaikiliService.KaikiliApplication;
>>>>>>> 2/22/2019
import com.sit.kaikiliService.R;
=======
import android.widget.Toast;

import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
import com.sit.kaikiliService.comman.Util;
>>>>>>> 2/23/2019
import com.sit.kaikiliService.font.TextViewEuphemiaUCASRegular;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by ketan patel on 21/1/2019.
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
 *
 */


public class RegistrationActivity extends BaseActivity implements View.OnClickListener {


    @Bind(R.id.reg_iv_addServices) ImageView reg_iv_addServices;
    @Bind(R.id.reg_iv_bankDetails) ImageView reg_iv_bankDetails;
    @Bind(R.id.reg_iv_createProfile) ImageView reg_iv_createProfile;
    @Bind(R.id.reg_iv_personalInformation) ImageView reg_iv_personalInformation;
    @Bind(R.id.reg_iv_phoneVerification)  ImageView reg_iv_phoneVerification;

    @Bind(R.id.reg_tv_addServices) TextViewEuphemiaUCASRegular reg_tv_addServices;
    @Bind(R.id.reg_tv_bankDetails) TextViewEuphemiaUCASRegular reg_tv_bankDetails;
    @Bind(R.id.reg_tv_createProfile) TextViewEuphemiaUCASRegular reg_tv_createProfile;
    @Bind(R.id.reg_tv_goHome) TextViewEuphemiaUCASRegular reg_tv_goHome;
    @Bind(R.id.reg_tv_personalInformation) TextViewEuphemiaUCASRegular reg_tv_personalInformation;
    @Bind(R.id.reg_tv_phoneVerification) TextViewEuphemiaUCASRegular reg_tv_phoneVerification;

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
=======
    private KaikiliApplication application;
>>>>>>> 2/21/2019
=======
    private KaikiliApplication application;
>>>>>>> 2/22/2019
=======
    private KaikiliApplication application;
>>>>>>> 2/23/2019
    private SharedPreferences preferences;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        ButterKnife.bind(this, this);
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
=======
        application = (KaikiliApplication) getApplicationContext();
>>>>>>> 2/21/2019
=======
        application = (KaikiliApplication) getApplicationContext();
>>>>>>> 2/22/2019
=======
        application = (KaikiliApplication) getApplicationContext();
>>>>>>> 2/23/2019
        preferences = application.getSharedPreferences();

        reg_tv_addServices.setOnClickListener( this );
        reg_tv_bankDetails.setOnClickListener( this );
        reg_tv_createProfile.setOnClickListener( this );
        reg_tv_personalInformation.setOnClickListener( this );
        reg_tv_phoneVerification.setOnClickListener( this );
        reg_tv_goHome.setOnClickListener( this );

    }


    @Override
    public void onClick(View view) {

        if(view == reg_tv_phoneVerification){
            Intent intent = new Intent(this,PhoneNoValidationActivity.class);
            startActivity(intent);
        }else if(view == reg_tv_personalInformation){
            Intent intent = new Intent(this,PersonalInformationActivity.class);
            startActivity(intent);
        }else if(view == reg_tv_createProfile){
            Intent intent = new Intent(this,ProfileEditActivity.class);
            startActivity(intent);
        }else if(view == reg_tv_addServices){
            Intent intent = new Intent(this,AddServiceActivity.class);
            startActivity(intent);
        }else if(view == reg_tv_bankDetails){
            Intent intent = new Intent(this,AddBankDetailsActivity.class);
            startActivity(intent);
        }else if(view == reg_tv_goHome){
<<<<<<< HEAD
            Intent intent = new Intent(this,HomeScreenActivity.class);
            startActivity(intent);
            finish();
=======
            if(Util.isNotEmpaty(preferences.getString( "sp_id",""))){
                Intent intent = new Intent(this,HomeScreenActivity.class);
                startActivity(intent);
                finish();
            }else {
                Toast.makeText( this,"First register personal information after active home screen",Toast.LENGTH_SHORT ).show();
            }


>>>>>>> 2/23/2019
        }

    }
}
