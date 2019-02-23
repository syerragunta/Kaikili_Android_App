package com.sit.kaikiliService.activity;

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
import android.content.Intent;
>>>>>>> 2/1/2019
=======
import android.content.Intent;
>>>>>>> 2/2/2019
=======
import android.content.Intent;
>>>>>>> 2/9/2019
=======
import android.content.Intent;
>>>>>>> 2/14/2019
=======
import android.content.Intent;
>>>>>>> 2/15/2019
=======
import android.content.Intent;
>>>>>>> 2/16/2019
=======
import android.content.Intent;
>>>>>>> 2/16/2019 V1
=======
import android.content.Intent;
>>>>>>> 2/16/2019 V2
=======
import android.content.Intent;
>>>>>>> 2/16/2019
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
import com.sit.kaikiliService.R;
import com.sit.kaikiliService.font.TextViewEuphemiaUCASRegular;

import butterknife.Bind;
import butterknife.ButterKnife;


/**
 * Created by ketan patel on 31/1/2019.
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
 */

public class CashOutActivity extends BaseActivity implements View.OnClickListener {

    @Bind(R.id.top_back) ImageView top_back;
    @Bind(R.id.top_title) TextViewEuphemiaUCASRegular top_title;
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
    @Bind(R.id.cash_out_tv_changed) TextViewEuphemiaUCASRegular cash_out_tv_changed;

    private KaikiliApplication application;
>>>>>>> 2/1/2019
=======
    @Bind(R.id.cash_out_tv_changed) TextViewEuphemiaUCASRegular cash_out_tv_changed;

    private KaikiliApplication application;
>>>>>>> 2/2/2019
=======
    @Bind(R.id.cash_out_tv_changed) TextViewEuphemiaUCASRegular cash_out_tv_changed;

    private KaikiliApplication application;
>>>>>>> 2/9/2019
=======
    @Bind(R.id.cash_out_tv_changed) TextViewEuphemiaUCASRegular cash_out_tv_changed;

    private KaikiliApplication application;
>>>>>>> 2/14/2019
=======
    @Bind(R.id.cash_out_tv_changed) TextViewEuphemiaUCASRegular cash_out_tv_changed;

    private KaikiliApplication application;
>>>>>>> 2/15/2019
=======
    @Bind(R.id.cash_out_tv_changed) TextViewEuphemiaUCASRegular cash_out_tv_changed;

    private KaikiliApplication application;
>>>>>>> 2/16/2019
=======
    @Bind(R.id.cash_out_tv_changed) TextViewEuphemiaUCASRegular cash_out_tv_changed;

    private KaikiliApplication application;
>>>>>>> 2/16/2019 V1
=======
    @Bind(R.id.cash_out_tv_changed) TextViewEuphemiaUCASRegular cash_out_tv_changed;

    private KaikiliApplication application;
>>>>>>> 2/16/2019 V2
=======
    @Bind(R.id.cash_out_tv_changed) TextViewEuphemiaUCASRegular cash_out_tv_changed;

    private KaikiliApplication application;
>>>>>>> 2/16/2019
    private SharedPreferences preferences;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_cash_out );
        ButterKnife.bind( this, this );

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
        preferences = application.getSharedPreferences();

        top_title.setText( "Cash Out" );
        top_back.setOnClickListener( this );
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
        cash_out_tv_changed.setOnClickListener( this );
>>>>>>> 2/1/2019
=======
        cash_out_tv_changed.setOnClickListener( this );
>>>>>>> 2/2/2019
=======
        cash_out_tv_changed.setOnClickListener( this );
>>>>>>> 2/9/2019
=======
        cash_out_tv_changed.setOnClickListener( this );
>>>>>>> 2/14/2019
=======
        cash_out_tv_changed.setOnClickListener( this );
>>>>>>> 2/15/2019
=======
        cash_out_tv_changed.setOnClickListener( this );
>>>>>>> 2/16/2019
=======
        cash_out_tv_changed.setOnClickListener( this );
>>>>>>> 2/16/2019 V1
=======
        cash_out_tv_changed.setOnClickListener( this );
>>>>>>> 2/16/2019 V2
=======
        cash_out_tv_changed.setOnClickListener( this );
>>>>>>> 2/16/2019


    }


    @Override
    public void onClick(View view) {

        if (view == top_back) {
            finish();

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
        }else if(cash_out_tv_changed == view){
            Intent intent = new Intent( this,BankDetailsActivity.class );
            startActivity( intent );
>>>>>>> 2/1/2019
=======
        }else if(cash_out_tv_changed == view){
            Intent intent = new Intent( this,BankDetailsActivity.class );
            startActivity( intent );
>>>>>>> 2/2/2019
=======
        }else if(cash_out_tv_changed == view){
            Intent intent = new Intent( this,BankDetailsActivity.class );
            startActivity( intent );
>>>>>>> 2/9/2019
=======
        }else if(cash_out_tv_changed == view){
            Intent intent = new Intent( this,BankDetailsActivity.class );
            startActivity( intent );
>>>>>>> 2/14/2019
=======
        }else if(cash_out_tv_changed == view){
            Intent intent = new Intent( this,BankDetailsActivity.class );
            startActivity( intent );
>>>>>>> 2/15/2019
=======
        }else if(cash_out_tv_changed == view){
            Intent intent = new Intent( this,BankDetailsActivity.class );
            startActivity( intent );
>>>>>>> 2/16/2019
=======
        }else if(cash_out_tv_changed == view){
            Intent intent = new Intent( this,BankDetailsActivity.class );
            startActivity( intent );
>>>>>>> 2/16/2019 V1
=======
        }else if(cash_out_tv_changed == view){
            Intent intent = new Intent( this,BankDetailsActivity.class );
            startActivity( intent );
>>>>>>> 2/16/2019 V2
=======
        }else if(cash_out_tv_changed == view){
            Intent intent = new Intent( this,BankDetailsActivity.class );
            startActivity( intent );
>>>>>>> 2/16/2019
        }
    }
}
