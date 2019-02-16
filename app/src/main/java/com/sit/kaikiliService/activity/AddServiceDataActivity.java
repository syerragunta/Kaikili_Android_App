package com.sit.kaikiliService.activity;

import android.content.SharedPreferences;
import android.os.Bundle;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ImageView;

import com.sit.kaikiliService.KetanApplication;
import com.sit.kaikiliService.R;
import com.sit.kaikiliService.adapter.AddServiceItemAdapter;
import com.sit.kaikiliService.adapter.AddServiceListAdapter;
=======
=======
>>>>>>> 2/2/2019
=======
import android.util.Log;
>>>>>>> 2/9/2019
import android.view.View;
import android.widget.ImageView;

import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
import com.sit.kaikiliService.adapter.AddServiceItemAdapter;
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/1/2019
=======
>>>>>>> 2/2/2019
=======
import com.sit.kaikiliService.api.ServiceList;
>>>>>>> 2/9/2019
import com.sit.kaikiliService.comman.WithoutScrollListView;
import com.sit.kaikiliService.font.EditTextEupheminUCASRegular;
import com.sit.kaikiliService.font.TextViewEuphemiaUCASBola;
import com.sit.kaikiliService.font.TextViewEuphemiaUCASRegular;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;


/**
 * Created by ketan patel on 29/1/2019.
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
 */

public class AddServiceDataActivity extends BaseActivity implements View.OnClickListener {

    @Bind(R.id.top_back)
    ImageView top_back;
    @Bind(R.id.top_title)
    TextViewEuphemiaUCASRegular top_title;


<<<<<<< HEAD
    @Bind(R.id.add_service_data_iv_switch) ImageView add_service_data_iv_switch;
    @Bind(R.id.add_service_data_listView_costPerItem)  WithoutScrollListView add_service_data_listView_costPerItem;
    @Bind(R.id.add_service_data_tv_costPerItem)  TextViewEuphemiaUCASRegular add_service_data_tv_costPerItem;
    @Bind(R.id.add_service_data_view_costPerItem)  View add_service_data_view_costPerItem;
    @Bind(R.id.add_service_data_listView_costPerSize)  WithoutScrollListView add_service_data_listView_costPerSize;
    @Bind(R.id.add_service_data_tv_costPerSize)  TextViewEuphemiaUCASRegular add_service_data_tv_costPerSize;
    @Bind(R.id.add_service_data_view_costPerSize)  View add_service_data_view_costPerSize;


    @Bind(R.id.add_service_data_edt_quoteService)  EditTextEupheminUCASRegular add_service_data_edt_quoteService;
    @Bind(R.id.add_service_data_tv_quote)  TextViewEuphemiaUCASRegular add_service_data_tv_quote;
    @Bind(R.id.add_service_data_tv_costHelper)  TextViewEuphemiaUCASRegular add_service_data_tv_costHelper;
    @Bind(R.id.add_service_data_tv_note)   TextViewEuphemiaUCASBola add_service_data_tv_note;


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
    @Bind(R.id.add_service_data_iv_switch)
    ImageView add_service_data_iv_switch;
    @Bind(R.id.add_service_data_listView_costPerItem)
    WithoutScrollListView add_service_data_listView_costPerItem;
    @Bind(R.id.add_service_data_tv_costPerItem)
    TextViewEuphemiaUCASRegular add_service_data_tv_costPerItem;
    @Bind(R.id.add_service_data_view_costPerItem)
    View add_service_data_view_costPerItem;
    @Bind(R.id.add_service_data_listView_costPerSize)
    WithoutScrollListView add_service_data_listView_costPerSize;
    @Bind(R.id.add_service_data_tv_costPerSize)
    TextViewEuphemiaUCASRegular add_service_data_tv_costPerSize;
    @Bind(R.id.add_service_data_view_costPerSize)
    View add_service_data_view_costPerSize;


    @Bind(R.id.add_service_data_edt_quoteService)
    EditTextEupheminUCASRegular add_service_data_edt_quoteService;
    @Bind(R.id.add_service_data_tv_quote)
    TextViewEuphemiaUCASRegular add_service_data_tv_quote;
    @Bind(R.id.add_service_data_tv_costHelper)
    TextViewEuphemiaUCASRegular add_service_data_tv_costHelper;
    @Bind(R.id.add_service_data_tv_note)
    TextViewEuphemiaUCASBola add_service_data_tv_note;

    @Bind(R.id.row_add_service_offer_tv_title)
    TextViewEuphemiaUCASRegular row_add_service_offer_tv_title;


    private KaikiliApplication application;
>>>>>>> 2/9/2019
    private SharedPreferences preferences;
    private AddServiceItemAdapter adapterCostPerItme;
    private AddServiceItemAdapter adapterCostPerSize;

    private ArrayList<String> costPerItem;
    private ArrayList<String> costPerItem1;
    private ArrayList<String> costPerItem2;
    private ArrayList<String> costPerItem3;
    private ArrayList<String> costPerSize;
<<<<<<< HEAD
=======
    private ServiceList serviceList;
>>>>>>> 2/9/2019


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_add_srevice_data );
        ButterKnife.bind( this, this );

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
        preferences = application.getSharedPreferences();


        top_title.setText( getIntent().getStringExtra( "serviceName" ) );
        top_back.setOnClickListener( this );
        add_service_data_iv_switch.setOnClickListener( this );
        add_service_data_iv_switch.setTag("1");

        costPerItem3 = new ArrayList<>();
        costPerItem3.add( "Sub Service Name 1" );
        costPerItem3.add( "Sub Service Name 2" );
        costPerItem3.add( "Sub Service Name 3" );
        costPerItem3.add( "Sub Service Name 4" );

        costPerItem2 = new ArrayList<>();
        costPerItem2.add( "Men Hair Cutting" );
        costPerItem2.add( "Men Hair Cutting & Shaving" );
        costPerItem2.add( "Boy Hair Cutting" );
        costPerItem2.add( "Women Hair Cutting" );
        costPerItem2.add( "Girl Hair Cutting" );

        costPerItem1 = new ArrayList<>();
        costPerItem1.add( "Up to 65 Inch" );
        costPerItem1.add( "65+ Inch to 95 Inch" );
        costPerItem1.add( "Installation height > 3 feet" );
        costPerItem1.add( "Inst. on brick/concrete" );

        costPerItem = new ArrayList<>();
        costPerItem.add( "Cost per door" );
        costPerItem.add( "Cost per window" );
        costPerItem.add( "Cost per closet" );

        costPerSize = new ArrayList<>();
        costPerSize.add( "Single Coat" );
        costPerSize.add( "Extra Coat" );
        costPerSize.add( "Top Trim Painting" );
        costPerSize.add( "Bottom Trim Painting" );
=======
        application = (KaikiliApplication) getApplicationContext();
        preferences = application.getSharedPreferences();


        serviceList = (ServiceList) getIntent().getSerializableExtra( "serviceName" );

        top_title.setText( serviceList.getSr_title() );
        top_back.setOnClickListener( this );
        add_service_data_iv_switch.setOnClickListener( this );
        add_service_data_iv_switch.setTag( "1" );

>>>>>>> 2/9/2019

        adapterCostPerItme = new AddServiceItemAdapter( this );
        adapterCostPerSize = new AddServiceItemAdapter( this );

        add_service_data_listView_costPerItem.setAdapter( adapterCostPerItme );
        add_service_data_listView_costPerSize.setAdapter( adapterCostPerSize );


<<<<<<< HEAD

        if (top_title.getText().toString().equalsIgnoreCase( "Hair Cutting at Salon" )) {
            add_service_data_tv_note.setVisibility( View.VISIBLE );
            adapterCostPerItme.setList( costPerItem2 );
            add_service_data_listView_costPerSize.setVisibility( View.GONE );
            add_service_data_tv_costPerSize.setVisibility( View.GONE );
            add_service_data_view_costPerSize.setVisibility( View.GONE );
            add_service_data_edt_quoteService.setVisibility( View.GONE );
            add_service_data_tv_quote.setVisibility( View.GONE );

        }else if(top_title.getText().toString().equalsIgnoreCase( "Interior Painting" )) {
            add_service_data_listView_costPerItem.setAdapter( adapterCostPerItme );
            add_service_data_listView_costPerSize.setAdapter( adapterCostPerSize );
            adapterCostPerItme.setList( costPerItem );
            adapterCostPerSize.setList( costPerSize );
            add_service_data_edt_quoteService.setVisibility( View.GONE );
            add_service_data_tv_quote.setVisibility( View.GONE );
        }else if(top_title.getText().toString().equalsIgnoreCase( "TV Mount Installation" )) {
            add_service_data_listView_costPerItem.setAdapter( adapterCostPerItme );
            adapterCostPerItme.setList( costPerItem1 );
            add_service_data_listView_costPerSize.setVisibility( View.GONE );
            add_service_data_tv_costPerSize.setVisibility( View.GONE );
            add_service_data_view_costPerSize.setVisibility( View.GONE );
            add_service_data_edt_quoteService.setVisibility( View.GONE );
            add_service_data_tv_quote.setVisibility( View.GONE );

        }else if(top_title.getText().toString().equalsIgnoreCase( "Custom Cabinet Building" )) {
            add_service_data_listView_costPerItem.setAdapter( adapterCostPerItme );
            adapterCostPerItme.setList( costPerItem1 );
            add_service_data_listView_costPerSize.setVisibility( View.GONE );
            add_service_data_tv_costPerSize.setVisibility( View.GONE );
            add_service_data_view_costPerSize.setVisibility( View.GONE );

            add_service_data_listView_costPerItem.setVisibility( View.GONE );
            add_service_data_tv_costPerItem.setVisibility( View.GONE );
            add_service_data_view_costPerItem.setVisibility( View.GONE );

            add_service_data_edt_quoteService.setVisibility( View.VISIBLE );
            add_service_data_tv_quote.setVisibility( View.VISIBLE );


        }else {
            add_service_data_listView_costPerItem.setAdapter( adapterCostPerItme );
            adapterCostPerItme.setList( costPerItem3 );
            add_service_data_listView_costPerSize.setVisibility( View.GONE );
            add_service_data_tv_costPerSize.setVisibility( View.GONE );
            add_service_data_view_costPerSize.setVisibility( View.GONE );
            add_service_data_edt_quoteService.setVisibility( View.GONE );
            add_service_data_tv_quote.setVisibility( View.GONE );
        }
=======
        Log.e( "------------", serviceList.getCost_comps_per_item().size() +" item");
        Log.e( "------------", serviceList.getCost_comps_pro_rated().size() +" item");

        add_service_data_edt_quoteService.setVisibility( View.GONE );
        add_service_data_tv_quote.setVisibility( View.GONE );
        add_service_data_listView_costPerSize.setVisibility( View.GONE );
        add_service_data_tv_costPerSize.setVisibility( View.GONE );
        add_service_data_view_costPerSize.setVisibility( View.GONE );
        add_service_data_listView_costPerItem.setVisibility( View.GONE );
        add_service_data_tv_costPerItem.setVisibility( View.GONE );
        add_service_data_view_costPerItem.setVisibility( View.GONE );


        if (serviceList.getCost_comps_pro_rated().size()>0) {
            add_service_data_listView_costPerSize.setVisibility( View.VISIBLE );
            add_service_data_tv_costPerSize.setVisibility( View.VISIBLE );
            add_service_data_view_costPerSize.setVisibility( View.VISIBLE );
        }

        if (serviceList.getCost_comps_per_item().size()>0 ) {
            add_service_data_listView_costPerItem.setVisibility( View.VISIBLE );
            add_service_data_tv_costPerItem.setVisibility( View.VISIBLE );
            add_service_data_view_costPerItem.setVisibility( View.VISIBLE );
        }

        adapterCostPerSize.setList( serviceList.getCost_comps_pro_rated() );
        adapterCostPerItme.setList( serviceList.getCost_comps_per_item() );

        row_add_service_offer_tv_title.setText( serviceList.getDiscount().getDs_title() );


>>>>>>> 2/9/2019
    }


    @Override
    public void onClick(View view) {

        if (view == top_back) {
            finish();

<<<<<<< HEAD
        }else if(view ==add_service_data_iv_switch ){
            if(view.getTag().toString().equalsIgnoreCase( "1" )){
                add_service_data_iv_switch.setTag("0");
                add_service_data_iv_switch.setImageDrawable( getDrawable( R.drawable.icon_off_swich ) );
            }else {
                add_service_data_iv_switch.setTag("1");
                add_service_data_iv_switch.setImageDrawable( getDrawable( R.drawable.icon_on_swich) );
=======
        } else if (view == add_service_data_iv_switch) {
            if (view.getTag().toString().equalsIgnoreCase( "1" )) {
                add_service_data_iv_switch.setTag( "0" );
                add_service_data_iv_switch.setImageDrawable( getDrawable( R.drawable.icon_off_swich ) );
            } else {
                add_service_data_iv_switch.setTag( "1" );
                add_service_data_iv_switch.setImageDrawable( getDrawable( R.drawable.icon_on_swich ) );
>>>>>>> 2/9/2019
            }
        }
    }
}
