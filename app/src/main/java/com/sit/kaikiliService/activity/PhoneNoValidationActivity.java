package com.sit.kaikiliService.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import android.support.v7.widget.AppCompatEditText;
=======
>>>>>>> 2/1/2019
=======
>>>>>>> 2/2/2019
=======
>>>>>>> 2/9/2019
=======
>>>>>>> 2/14/2019
=======
>>>>>>> 2/15/2019
=======
>>>>>>> 2/16/2019
=======
>>>>>>> 2/16/2019 V1
=======
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
=======
>>>>>>> 2/28/2019
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.rilixtech.Country;
import com.rilixtech.CountryCodePicker;
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
=======
import com.sit.kaikiliService.KaikiliApplication;
>>>>>>> 2/23/2019
=======
import com.sit.kaikiliService.KaikiliApplication;
>>>>>>> 2/25/2019
=======
import com.sit.kaikiliService.KaikiliApplication;
>>>>>>> 2/26/2019
=======
import com.sit.kaikiliService.KaikiliApplication;
>>>>>>> 2/27/2019
=======
import com.sit.kaikiliService.KaikiliApplication;
>>>>>>> 2/28/2019
import com.sit.kaikiliService.R;
import com.sit.kaikiliService.font.EditTextEupheminUCASRegular;
import com.sit.kaikiliService.font.TextViewEuphemiaUCASRegular;

import butterknife.Bind;
import butterknife.ButterKnife;


/**
 * Created by ketan patel on 22/1/2019.
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
 */

public class PhoneNoValidationActivity extends BaseActivity implements View.OnClickListener {

    @Bind(R.id.top_back)
    ImageView top_back;


    @Bind(R.id.top_title)
    TextViewEuphemiaUCASRegular top_title;

    @Bind(R.id.ccp)
    CountryCodePicker ccp;

    @Bind(R.id.phone_number_next)
    FloatingActionButton phone_number_next;

    @Bind(R.id.phone_number_edt)
    EditTextEupheminUCASRegular phone_number_edt;

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
=======
    private KaikiliApplication application;
>>>>>>> 2/25/2019
=======
    private KaikiliApplication application;
>>>>>>> 2/26/2019
=======
    private KaikiliApplication application;
>>>>>>> 2/27/2019
=======
    private KaikiliApplication application;
>>>>>>> 2/28/2019
    private SharedPreferences preferences;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_phone_no_validation );
        ButterKnife.bind( this, this );

        top_title.setText( "Phone Number Validation" );

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
=======
        application = (KaikiliApplication) getApplicationContext();
>>>>>>> 2/25/2019
=======
        application = (KaikiliApplication) getApplicationContext();
>>>>>>> 2/26/2019
=======
        application = (KaikiliApplication) getApplicationContext();
>>>>>>> 2/27/2019
=======
        application = (KaikiliApplication) getApplicationContext();
>>>>>>> 2/28/2019
        preferences = application.getSharedPreferences();

        top_back.setOnClickListener( this );
        phone_number_next.setOnClickListener( this );

        ccp.registerPhoneNumberTextView( phone_number_edt );
        ccp.setOnCountryChangeListener( new CountryCodePicker.OnCountryChangeListener() {
            @Override
            public void onCountrySelected(Country selectedCountry) {
                Toast.makeText( PhoneNoValidationActivity.this, "Updated " + selectedCountry.getName(), Toast.LENGTH_SHORT ).show();
            }
        } );

    }


    @Override
    public void onClick(View view) {

        if (view == top_back) {
            finish();
        } else if (view == phone_number_next) {
            Intent intent = new Intent( PhoneNoValidationActivity.this, PhoneValidationCodeActivity.class );
            startActivity( intent );
            finish();
        }
    }
}
