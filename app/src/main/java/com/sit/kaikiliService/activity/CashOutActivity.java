package com.sit.kaikiliService.activity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.sit.kaikiliService.KetanApplication;
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

    private KetanApplication application;
    private SharedPreferences preferences;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_cash_out );
        ButterKnife.bind( this, this );

        application = (KetanApplication) getApplicationContext();
        preferences = application.getSharedPreferences();

        top_title.setText( "Cash Out" );
        top_back.setOnClickListener( this );


    }


    @Override
    public void onClick(View view) {

        if (view == top_back) {
            finish();

        }
    }
}
