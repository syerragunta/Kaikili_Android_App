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
<<<<<<< HEAD
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
=======
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
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.gson.Gson;
import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
import com.sit.kaikiliService.api.Apiresponse;
import com.sit.kaikiliService.api.CompsItme;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import com.sit.kaikiliService.api.ServiceList;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import com.sit.kaikiliService.api.WebApi;
import com.sit.kaikiliService.api.WebUtil;
import com.sit.kaikiliService.comman.Util;
>>>>>>> 2/14/2019
=======
=======
>>>>>>> 2/16/2019
=======
>>>>>>> 2/16/2019 V1
=======
import com.sit.kaikiliService.api.GetAllServiceAPI;
import com.sit.kaikiliService.api.ServiceList;
>>>>>>> 2/16/2019 V2
=======
import com.sit.kaikiliService.api.GetAllServiceAPI;
import com.sit.kaikiliService.api.ServiceList;
>>>>>>> 2/16/2019
=======
import com.sit.kaikiliService.api.GetAllServiceAPI;
import com.sit.kaikiliService.api.ServiceList;
>>>>>>> 2/18/2019
=======
import com.sit.kaikiliService.api.GetAllServiceAPI;
import com.sit.kaikiliService.api.ServiceList;
>>>>>>> 2/21/2019
=======
import com.sit.kaikiliService.api.GetAllServiceAPI;
import com.sit.kaikiliService.api.ServiceList;
>>>>>>> 2/22/2019
=======
import com.sit.kaikiliService.api.GetAllServiceAPI;
import com.sit.kaikiliService.api.ServiceList;
>>>>>>> 2/23/2019
import com.sit.kaikiliService.api.UserServiceGetAPI;
import com.sit.kaikiliService.api.WebApi;
import com.sit.kaikiliService.api.WebUtil;
import com.sit.kaikiliService.comman.Util;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
import com.sit.kaikiliService.comman.WithoutScrollListView;
import com.sit.kaikiliService.font.EditTextEupheminUCASRegular;
import com.sit.kaikiliService.font.TextViewEuphemiaUCASBola;
import com.sit.kaikiliService.font.TextViewEuphemiaUCASRegular;

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
=======
import org.json.JSONArray;
import org.json.JSONObject;

>>>>>>> 2/14/2019
=======
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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
=======
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

    @Bind(R.id.add_service_data_tv_note)
    TextViewEuphemiaUCASBola add_service_data_tv_note;

    @Bind(R.id.add_service_offer_tv_title)
    TextViewEuphemiaUCASRegular add_service_offer_tv_title;

    @Bind(R.id.add_service_data_floaButton_save)
    FloatingActionButton add_service_data_floaButton_save;

    @Bind(R.id.add_service_data_edt_offer)
    EditTextEupheminUCASRegular add_service_data_edt_offer;

    @Bind(R.id.add_service_data_ch_offer)
    CheckBox add_service_data_ch_offer;


    private KaikiliApplication application;
    private SharedPreferences preferences;
    private AddServiceItemAdapterItem adapterCostPerItme;
    private AddServiceItemAdapterSize adapterCostPerSize;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD


    private ServiceList serviceList;
>>>>>>> 2/14/2019
=======
    private String SP_ID = "SP00001";


    private ServiceList serviceList;
>>>>>>> 2/15/2019
=======
=======
>>>>>>> 2/16/2019 V1
    private String SP_ID = "SP00002";


    private ServiceList serviceList;
<<<<<<< HEAD
>>>>>>> 2/16/2019
=======
>>>>>>> 2/16/2019 V1
=======
=======
>>>>>>> 2/16/2019
=======
>>>>>>> 2/18/2019
=======
>>>>>>> 2/21/2019
=======
>>>>>>> 2/22/2019
    private String SP_ID = "SP00001";
=======
>>>>>>> 2/23/2019
    private String serviceStatus ;


    private ServiceList serviceList;
    private String Sr_ID;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_add_srevice_data );
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
=======
>>>>>>> 2/14/2019
=======
>>>>>>> 2/15/2019
=======
>>>>>>> 2/16/2019
=======
>>>>>>> 2/16/2019 V1
        application = (KaikiliApplication) getApplicationContext();
        preferences = application.getSharedPreferences();


        serviceList = (ServiceList) getIntent().getSerializableExtra( "serviceName" );

        top_title.setText( serviceList.getSr_title() );
        top_back.setOnClickListener( this );
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        add_service_data_iv_switch.setOnClickListener( this );
        add_service_data_iv_switch.setTag( "1" );

>>>>>>> 2/9/2019

        adapterCostPerItme = new AddServiceItemAdapter( this );
        adapterCostPerSize = new AddServiceItemAdapter( this );
=======
=======
>>>>>>> 2/15/2019
=======
>>>>>>> 2/16/2019
=======
>>>>>>> 2/16/2019 V1
        add_service_data_floaButton_save.setOnClickListener( this );
        add_service_data_iv_switch.setOnClickListener( this );
        add_service_data_iv_switch.setTag( "1" );

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD

        adapterCostPerItme = new AddServiceItemAdapterItem( this );
        adapterCostPerSize = new AddServiceItemAdapterSize( this );
>>>>>>> 2/14/2019
=======
=======
>>>>>>> 2/16/2019
=======
>>>>>>> 2/16/2019 V1
        new GetServiceDataTask( this ).execute();

        adapterCostPerItme = new AddServiceItemAdapterItem( this );
        adapterCostPerSize = new AddServiceItemAdapterSize( this );
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/15/2019
=======
>>>>>>> 2/16/2019
=======
>>>>>>> 2/16/2019 V1

        add_service_data_listView_costPerItem.setAdapter( adapterCostPerItme );
        add_service_data_listView_costPerSize.setAdapter( adapterCostPerSize );


<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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

=======
>>>>>>> 2/14/2019
=======
>>>>>>> 2/15/2019
=======
>>>>>>> 2/16/2019
=======
>>>>>>> 2/16/2019 V1
        add_service_data_edt_quoteService.setVisibility( View.GONE );
        add_service_data_tv_quote.setVisibility( View.GONE );
        add_service_data_listView_costPerSize.setVisibility( View.GONE );
        add_service_data_tv_costPerSize.setVisibility( View.GONE );
        add_service_data_view_costPerSize.setVisibility( View.GONE );
        add_service_data_listView_costPerItem.setVisibility( View.GONE );
        add_service_data_tv_costPerItem.setVisibility( View.GONE );
        add_service_data_view_costPerItem.setVisibility( View.GONE );

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD

<<<<<<< HEAD
        if (serviceList.getCost_comps_pro_rated().size()>0) {
=======
        if (serviceList.getCost_comps_pro_rated().size() > 0) {
>>>>>>> 2/14/2019
            add_service_data_listView_costPerSize.setVisibility( View.VISIBLE );
            add_service_data_tv_costPerSize.setVisibility( View.VISIBLE );
            add_service_data_view_costPerSize.setVisibility( View.VISIBLE );
        }

<<<<<<< HEAD
        if (serviceList.getCost_comps_per_item().size()>0 ) {
=======
        if (serviceList.getCost_comps_per_item().size() > 0) {
>>>>>>> 2/14/2019
            add_service_data_listView_costPerItem.setVisibility( View.VISIBLE );
            add_service_data_tv_costPerItem.setVisibility( View.VISIBLE );
            add_service_data_view_costPerItem.setVisibility( View.VISIBLE );
        }

        adapterCostPerSize.setList( serviceList.getCost_comps_pro_rated() );
        adapterCostPerItme.setList( serviceList.getCost_comps_per_item() );

<<<<<<< HEAD
        row_add_service_offer_tv_title.setText( serviceList.getDiscount().getDs_title() );


>>>>>>> 2/9/2019
=======
        add_service_offer_tv_title.setText( serviceList.getDiscount().getDs_title() );

        if (serviceList.getDiscount().getDs_check_box().equalsIgnoreCase( "ON" )) {
            add_service_data_ch_offer.setChecked( true );
        } else {
            add_service_data_ch_offer.setChecked( false );
        }

        if (Util.isNotEmpaty( serviceList.getDiscount().getDs_rate() )) {
            add_service_data_edt_offer.setText( serviceList.getDiscount().getDs_rate() );
        } else {
            add_service_data_edt_offer.setText( "" );
        }

=======
=======
>>>>>>> 2/16/2019
=======
>>>>>>> 2/16/2019 V1
//
//        if (serviceList.getCost_comps_pro_rated().size() > 0) {
//            add_service_data_listView_costPerSize.setVisibility( View.VISIBLE );
//            add_service_data_tv_costPerSize.setVisibility( View.VISIBLE );
//            add_service_data_view_costPerSize.setVisibility( View.VISIBLE );
//        }
//
//        if (serviceList.getCost_comps_per_item().size() > 0) {
//            add_service_data_listView_costPerItem.setVisibility( View.VISIBLE );
//            add_service_data_tv_costPerItem.setVisibility( View.VISIBLE );
//            add_service_data_view_costPerItem.setVisibility( View.VISIBLE );
//        }
//
//        add_service_offer_tv_title.setText( serviceList.getDiscount().getDs_title() );
//
//        if (serviceList.getDiscount().getDs_check_box().equalsIgnoreCase( "ON" )) {
//            add_service_data_ch_offer.setChecked( true );
//        } else {
//            add_service_data_ch_offer.setChecked( false );
//        }
//
//        if (Util.isNotEmpaty( serviceList.getDiscount().getDs_rate() )) {
//            add_service_data_edt_offer.setText( serviceList.getDiscount().getDs_rate() );
//        } else {
//            add_service_data_edt_offer.setText( "" );
//        }
//
//        adapterCostPerItme.setList( serviceList.getCost_comps_per_item() );
//        adapterCostPerSize.setList( serviceList.getCost_comps_pro_rated() );
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/15/2019
=======
>>>>>>> 2/16/2019
=======
>>>>>>> 2/16/2019 V1

        add_service_data_ch_offer.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {

                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (isChecked) {
                            serviceList.getDiscount().setDs_check_box( "ON" );
                        } else {
                            serviceList.getDiscount().setDs_check_box( "OFF" );
                        }
                    }
                }
        );

        add_service_data_edt_offer.addTextChangedListener( new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (!serviceList.getDiscount().getDs_rate().equalsIgnoreCase( editable.toString() ))
                    serviceList.getDiscount().setDs_rate( editable.toString() );
            }
        } );


<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/14/2019
=======
>>>>>>> 2/15/2019
=======
>>>>>>> 2/16/2019
=======
>>>>>>> 2/16/2019 V1
=======
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
        application = (KaikiliApplication) getApplicationContext();
        preferences = application.getSharedPreferences();

        Sr_ID =  getIntent().getStringExtra("serviceId");
//        serviceList = (ServiceList) getIntent().getSerializableExtra( "serviceName" );
        new GetServiceInfoTask( this ).execute();




<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
<<<<<<< HEAD
<<<<<<< HEAD
        }else if(view ==add_service_data_iv_switch ){
            if(view.getTag().toString().equalsIgnoreCase( "1" )){
                add_service_data_iv_switch.setTag("0");
                add_service_data_iv_switch.setImageDrawable( getDrawable( R.drawable.icon_off_swich ) );
            }else {
                add_service_data_iv_switch.setTag("1");
                add_service_data_iv_switch.setImageDrawable( getDrawable( R.drawable.icon_on_swich) );
=======
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
        } else if (view == add_service_data_iv_switch) {
            if (view.getTag().toString().equalsIgnoreCase( "1" )) {
                add_service_data_iv_switch.setTag( "0" );
                add_service_data_iv_switch.setImageDrawable( getDrawable( R.drawable.icon_off_swich ) );
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
            } else {
                add_service_data_iv_switch.setTag( "1" );
                add_service_data_iv_switch.setImageDrawable( getDrawable( R.drawable.icon_on_swich ) );
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/9/2019
            }
=======
=======
>>>>>>> 2/15/2019
=======
>>>>>>> 2/16/2019
=======
>>>>>>> 2/16/2019 V1
=======
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
                serviceStatus = "OFF";
            } else {
                add_service_data_iv_switch.setTag( "1" );
                add_service_data_iv_switch.setImageDrawable( getDrawable( R.drawable.icon_on_swich ) );
                serviceStatus = "ON";
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
            }
        } else if (add_service_data_floaButton_save == view) {
            savedata();
        }
    }

    private void savedata() {

        try {

            JSONArray onItemArray = new JSONArray();
            JSONArray offItemArray = new JSONArray();

            for (int i = 0; i < serviceList.getCost_comps_per_item().size(); i++) {
                if (serviceList.getCost_comps_per_item().get( i ).getCc_check_box().equalsIgnoreCase( "ON" )) {
                    JSONObject jsonOnItemObject = new JSONObject();
                    jsonOnItemObject.put( "cc_id", serviceList.getCost_comps_per_item().get( i ).getCc_id() );
                    jsonOnItemObject.put( "cc_title", serviceList.getCost_comps_per_item().get( i ).getCc_title() );
                    jsonOnItemObject.put( "cc_rate_per_item", serviceList.getCost_comps_per_item().get( i ).getCc_rate() );
                    onItemArray.put( jsonOnItemObject );
                } else {
                    JSONObject jsonOffItemObject = new JSONObject();
                    jsonOffItemObject.put( "cc_id", serviceList.getCost_comps_per_item().get( i ).getCc_id() );
                    jsonOffItemObject.put( "cc_title", serviceList.getCost_comps_per_item().get( i ).getCc_title() );
                    jsonOffItemObject.put( "cc_rate_per_item", serviceList.getCost_comps_per_item().get( i ).getCc_rate() );
                    offItemArray.put( jsonOffItemObject );
                }
            }

            JSONArray onRatedArray = new JSONArray();
            JSONArray offRatedArray = new JSONArray();
            for (int i = 0; i < serviceList.getCost_comps_pro_rated().size(); i++) {
                if (serviceList.getCost_comps_pro_rated().get( i ).getCc_check_box().equalsIgnoreCase( "ON" )) {
                    JSONObject jsononRatedObject = new JSONObject();
                    jsononRatedObject.put( "cc_id", serviceList.getCost_comps_pro_rated().get( i ).getCc_id() );
                    jsononRatedObject.put( "cc_title", serviceList.getCost_comps_pro_rated().get( i ).getCc_title() );
                    jsononRatedObject.put( "cc_rate_per_item", serviceList.getCost_comps_pro_rated().get( i ).getCc_rate() );
                    onRatedArray.put( jsononRatedObject );

                } else {

                    JSONObject jsonOffRatedObject = new JSONObject();
                    jsonOffRatedObject.put( "cc_id", serviceList.getCost_comps_pro_rated().get( i ).getCc_id() );
                    jsonOffRatedObject.put( "cc_title", serviceList.getCost_comps_pro_rated().get( i ).getCc_title() );
                    jsonOffRatedObject.put( "cc_rate_per_item", serviceList.getCost_comps_pro_rated().get( i ).getCc_rate() );
                    offRatedArray.put( jsonOffRatedObject );
                }
            }

            JSONObject jsonDiscountObject = new JSONObject();
            jsonDiscountObject.put( "ds_id", serviceList.getDiscount().getDs_id() );
            jsonDiscountObject.put( "ds_title", serviceList.getDiscount().getDs_title() );
            jsonDiscountObject.put( "ds_rate_per_item", serviceList.getDiscount().getDs_rate() );
            jsonDiscountObject.put( "ds_check_box", serviceList.getDiscount().getDs_check_box() );


            JSONObject jsonObject = new JSONObject();
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
            jsonObject.put( "sp_id", "SP00001" );
=======
            jsonObject.put( "sp_id", SP_ID );
>>>>>>> 2/15/2019
=======
            jsonObject.put( "sp_id", SP_ID );
>>>>>>> 2/16/2019
=======
            jsonObject.put( "sp_id", SP_ID );
>>>>>>> 2/16/2019 V1
            jsonObject.put( "sr_id", serviceList.getSr_id() );
=======
=======
>>>>>>> 2/16/2019
=======
>>>>>>> 2/18/2019
=======
>>>>>>> 2/21/2019
=======
>>>>>>> 2/22/2019
            jsonObject.put( "sp_id", SP_ID );
            jsonObject.put( "sr_id", serviceList.getSr_id() );
            jsonObject.put( "sr_title", serviceList.getSr_title() );
            jsonObject.put( "sp_sr_status",serviceStatus);
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
            jsonObject.put( "sp_id",  preferences.getString( "sp_id","") );
            jsonObject.put( "sr_id", serviceList.getSr_id() );
            jsonObject.put( "sr_title", serviceList.getSr_title() );
            jsonObject.put( "sp_sr_status",serviceStatus);
>>>>>>> 2/23/2019
            jsonObject.put( "minimum_charge", "100.00" );
            jsonObject.put( "sr_type", serviceList.getSr_type() );
            jsonObject.put( "cost_comps_per_item_on", onItemArray );
            jsonObject.put( "cost_comps_per_item_off", offItemArray );
            jsonObject.put( "cost_comps_pro_rate_on", onRatedArray );
            jsonObject.put( "cost_comps_pro_rate_off", offRatedArray );
            jsonObject.put( "discount", jsonDiscountObject );


            Log.e( "----------------------", jsonObject.toString() );

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
//            RequestBody requestBody = RequestBody.create(MediaType.parse("text/plain"),jsonObject.toString());
////            RequestBody body = RequestBody.create( MediaType.parse("application/json; charset=utf-8"),jsonObject.toString());

            new PostApiTask( this, jsonObject.toString() ).execute();

//            MediaType JSON = MediaType.parse( "application/json; charset=utf-8" );
//            RequestBody body = RequestBody.create( JSON, jsonObject.toString() );
//
//            WebApiClient.getInstance( this ).getWebApi().userAddService( "user_add_services", "AddUserServices",
//                    jsonObject,
//                    new Callback<Apiresponse>() {
//                        @Override
//                        public void success(Apiresponse getAllServiceAPI, Response response) {
//
//                            if (getAllServiceAPI != null) {
//                                if (getAllServiceAPI.getStatus() == 1) {
//                                    Toast.makeText( AddServiceDataActivity.this, getAllServiceAPI.getMessage(), Toast.LENGTH_SHORT ).show();
//                                } else {
//                                    Toast.makeText( AddServiceDataActivity.this, getAllServiceAPI.getMessage(), Toast.LENGTH_SHORT ).show();
//                                }
//                            }
//                        }
//
//                        @Override
//                        public void failure(RetrofitError error) {
//                            Toast.makeText( AddServiceDataActivity.this, handleError( error ), Toast.LENGTH_SHORT ).show();
//                        }
//                    } );
=======
            new PostApiTask( this, jsonObject.toString() ).execute();

>>>>>>> 2/15/2019
=======
            new PostApiTask( this, jsonObject.toString() ).execute();

>>>>>>> 2/16/2019
=======
            new PostApiTask( this, jsonObject.toString() ).execute();

>>>>>>> 2/16/2019 V1
=======
            new PostApiTask( this, jsonObject.toString() ).execute();

>>>>>>> 2/16/2019 V2
=======
            new PostApiTask( this, jsonObject.toString() ).execute();

>>>>>>> 2/16/2019
=======
            new PostApiTask( this, jsonObject.toString() ).execute();

>>>>>>> 2/18/2019
=======
            new PostApiTask( this, jsonObject.toString() ).execute();

>>>>>>> 2/21/2019
=======
            new PostApiTask( this, jsonObject.toString() ).execute();

>>>>>>> 2/22/2019
=======
            new PostApiTask( this, jsonObject.toString() ).execute();

>>>>>>> 2/23/2019
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public class PostApiTask extends AsyncTask<Void, Void, String> {

        private ProgressDialog mDialog = null;
        private Activity mActivity;
        private String body;


        public PostApiTask(Activity activity, String body) {
            mActivity = activity;
            this.body = body;
            // TODO Auto-generated constructor stub
        }

        @Override
        protected void onPreExecute() {
            // TODO Auto-generated method stub
            super.onPreExecute();

            mDialog = ProgressDialog.show( mActivity, null, "please_wait.....", true, true );
            mDialog.getWindow().clearFlags( WindowManager.LayoutParams.FLAG_DIM_BEHIND );
            mDialog.setCanceledOnTouchOutside( false );
        }

        @Override
        protected String doInBackground(Void... params) {
            // TODO Auto-generated method stub

            // String response = new WebUtil().postMethod("VirtualNumber=011-392-37960&Number="+mobileNo+"&Language=en", "https://api.exotel.com/v1/Accounts/vivervatechnology/CustomerWhitelist/");
            String response = new WebUtil().postMethod( body, WebApi.URL_ADD_SERVICE_TEST );
            return response;
        }

        @Override
        protected void onPostExecute(String response) {
            // TODO Auto-generated method stub
            super.onPostExecute( response );
            if (mDialog.isShowing()) {
                mDialog.dismiss();
            }

            Gson gson = new Gson(); // Or use new GsonBuilder().create();
            Apiresponse target2 = gson.fromJson( response, Apiresponse.class );

            if (target2 != null) {
                if (target2.getStatus() == 1) {
                    Toast.makeText( AddServiceDataActivity.this, target2.getMessage(), Toast.LENGTH_SHORT ).show();
                } else {
                    Toast.makeText( AddServiceDataActivity.this, target2.getMessage(), Toast.LENGTH_SHORT ).show();
                }
            }


//            Toast.makeText( mActivity ,response,Toast.LENGTH_SHORT).show();
            Log.e( "-------  TAG", "********************** Completed Task *************" + response );
        }
    }

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
    public class GetServiceDataTask extends AsyncTask<Void, Void, String> {

        private ProgressDialog mDialog = null;
        private Activity mActivity;


        public GetServiceDataTask(Activity activity) {
            mActivity = activity;

            // TODO Auto-generated constructor stub
        }

        @Override
        protected void onPreExecute() {
            // TODO Auto-generated method stub
            super.onPreExecute();

            mDialog = ProgressDialog.show( mActivity, null, "please_wait.....", true, true );
            mDialog.getWindow().clearFlags( WindowManager.LayoutParams.FLAG_DIM_BEHIND );
            mDialog.setCanceledOnTouchOutside( false );
        }

        @Override
        protected String doInBackground(Void... params) {
            // TODO Auto-generated method stub
            try {
                JSONObject jsonObject = new JSONObject();
<<<<<<< HEAD
                jsonObject.put( "sp_id", SP_ID );
=======
                jsonObject.put( "sp_id",  preferences.getString( "sp_id","") );
>>>>>>> 2/23/2019
                jsonObject.put( "sr_id", serviceList.getSr_id() );
                Log.e( "--------------Post", jsonObject.toString() );
                String response = new WebUtil().postMethod( jsonObject.toString(), WebApi.URL_USER_SERVICE_DATA_GET );
                return response;
            } catch (JSONException e) {
                e.printStackTrace();
                return "";
            }
        }

        @Override
        protected void onPostExecute(String response) {
            // TODO Auto-generated method stub
            super.onPostExecute( response );
            if (mDialog.isShowing()) {
                mDialog.dismiss();
            }
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
            Util.hideSoftKeyboard( mActivity );
>>>>>>> 2/16/2019 V2
=======
            Util.hideSoftKeyboard( mActivity );
>>>>>>> 2/16/2019
=======
            Util.hideSoftKeyboard( mActivity );
>>>>>>> 2/18/2019
=======
            Util.hideSoftKeyboard( mActivity );
>>>>>>> 2/21/2019
=======
            Util.hideSoftKeyboard( mActivity );
>>>>>>> 2/22/2019
=======
            Util.hideSoftKeyboard( mActivity );
>>>>>>> 2/23/2019

            Log.e( "------- Response ", "-------------" + response );
            Gson gson = new Gson(); // Or use new GsonBuilder().create();
            UserServiceGetAPI target2 = gson.fromJson( response, UserServiceGetAPI.class );

            if (target2 != null) {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
                    if (target2.getData().size()>0) {

                        if (target2.getData().get( 0 ).getCost_comps_per_item_on() != null) {
                            for (int i = 0; i < target2.getData().get( 0 ).getCost_comps_per_item_on().size(); i++) {
                                for (int j = 0; j < serviceList.getCost_comps_per_item().size(); j++) {
                                    if (serviceList.getCost_comps_per_item().get( j ).getCc_id().equalsIgnoreCase( target2.getData().get( 0 ).getCost_comps_per_item_on().get( i ).getCc_id() )) {
                                        serviceList.getCost_comps_per_item().get( j ).setCc_check_box( "ON" );
                                        serviceList.getCost_comps_per_item().get( j ).setCc_rate( target2.getData().get( 0 ).getCost_comps_per_item_on().get( i ).getCc_rate_per_item() );
                                    }
                                }
                            }
                        }

                        if (target2.getData().get( 0 ).getCost_comps_pro_rate_on() != null) {
                            for (int i = 0; i < target2.getData().get( 0 ).getCost_comps_pro_rate_on().size(); i++) {
                                for (int j = 0; j < serviceList.getCost_comps_pro_rated().size(); j++) {
                                    if (serviceList.getCost_comps_pro_rated().get( j ).getCc_id().equalsIgnoreCase( target2.getData().get( 0 ).getCost_comps_pro_rate_on().get( i ).getCc_id() )) {
                                        serviceList.getCost_comps_pro_rated().get( j ).setCc_check_box( "ON" );
                                        serviceList.getCost_comps_pro_rated().get( j ).setCc_rate( target2.getData().get( 0 ).getCost_comps_pro_rate_on().get( i ).getCc_rate_per_item() );
                                    }
                                }
                            }
                        }

                        serviceList.getDiscount().setDs_rate( target2.getData().get( 0 ).getDiscount().getDs_rate_per_item() );
                        serviceList.getDiscount().setDs_check_box( target2.getData().get( 0 ).getDiscount().getDs_check_box() );
                        Log.e( "---------Data save", "---------------------------new Data ---" );

                        setDataInfo();
                    }else {
                        setDataInfo();
                    }
            }else {
                setDataInfo();
            }

        }


    }

=======
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
                if (target2.getData().size() > 0) {

                    if (target2.getData().get( 0 ).getCost_comps_per_item_on() != null) {
                        for (int i = 0; i < target2.getData().get( 0 ).getCost_comps_per_item_on().size(); i++) {
                            for (int j = 0; j < serviceList.getCost_comps_per_item().size(); j++) {
                                if (serviceList.getCost_comps_per_item().get( j ).getCc_id().equalsIgnoreCase( target2.getData().get( 0 ).getCost_comps_per_item_on().get( i ).getCc_id() )) {
                                    serviceList.getCost_comps_per_item().get( j ).setCc_check_box( "ON" );
                                    serviceList.getCost_comps_per_item().get( j ).setCc_rate( target2.getData().get( 0 ).getCost_comps_per_item_on().get( i ).getCc_rate_per_item() );
                                }
                            }
                        }
                    }

                    if (target2.getData().get( 0 ).getCost_comps_pro_rate_on() != null) {
                        for (int i = 0; i < target2.getData().get( 0 ).getCost_comps_pro_rate_on().size(); i++) {
                            for (int j = 0; j < serviceList.getCost_comps_pro_rated().size(); j++) {
                                if (serviceList.getCost_comps_pro_rated().get( j ).getCc_id().equalsIgnoreCase( target2.getData().get( 0 ).getCost_comps_pro_rate_on().get( i ).getCc_id() )) {
                                    serviceList.getCost_comps_pro_rated().get( j ).setCc_check_box( "ON" );
                                    serviceList.getCost_comps_pro_rated().get( j ).setCc_rate( target2.getData().get( 0 ).getCost_comps_pro_rate_on().get( i ).getCc_rate_per_item() );
                                }
                            }
                        }
                    }

                    serviceList.getDiscount().setDs_rate( target2.getData().get( 0 ).getDiscount().getDs_rate_per_item() );
                    serviceList.getDiscount().setDs_check_box( target2.getData().get( 0 ).getDiscount().getDs_check_box() );
                    Log.e( "---------Data save", "---------------------------new Data ---" );

                    if(target2.getData().get(0).getSp_sr_status().equalsIgnoreCase( "ON")){
                        add_service_data_iv_switch.setTag( "1" );
                        add_service_data_iv_switch.setImageDrawable( getDrawable( R.drawable.icon_on_swich ) );
                        serviceStatus = "ON";
                    }else{
                        add_service_data_iv_switch.setTag( "0" );
                        add_service_data_iv_switch.setImageDrawable( getDrawable( R.drawable.icon_off_swich ) );
                        serviceStatus = "OFF";
                    }


                    setDataInfo();
                } else {
                    setDataInfo();
                }
            } else {
                setDataInfo();
            }
        }
    }

    public class GetServiceInfoTask extends AsyncTask<Void, Void, String> {

        private ProgressDialog mDialog = null;
        private Activity mActivity;


        public GetServiceInfoTask(Activity activity) {
            mActivity = activity;

            // TODO Auto-generated constructor stub
        }

        @Override
        protected void onPreExecute() {
            // TODO Auto-generated method stub
            super.onPreExecute();

            mDialog = ProgressDialog.show( mActivity, null, "Please wait...", true, true );
            mDialog.getWindow().clearFlags( WindowManager.LayoutParams.FLAG_DIM_BEHIND );
            mDialog.setCanceledOnTouchOutside( false );
        }

        @Override
        protected String doInBackground(Void... params) {
            // TODO Auto-generated method stub
            try {
                JSONObject jsonObject = new JSONObject();
                jsonObject.put( "sr_id", Sr_ID );
                Log.e( "--------------Post", jsonObject.toString() );
                String response = new WebUtil().postMethod( jsonObject.toString(), WebApi.URL_GET_SERVICE_INFO_ID );
                return response;
            } catch (JSONException e) {
                e.printStackTrace();
                return "";
            }
        }

        @Override
        protected void onPostExecute(String response) {
            // TODO Auto-generated method stub
            super.onPostExecute( response );
            if (mDialog.isShowing()) {
                mDialog.dismiss();
            }
            Util.hideSoftKeyboard( mActivity );
            Log.e( "------- Response ", "-------------" + response );
            Gson gson = new Gson(); // Or use new GsonBuilder().create();
            GetAllServiceAPI target2 = gson.fromJson( response, GetAllServiceAPI.class );
            if (target2.getData().size() > 0) {
                serviceList = target2.getData().get(0);
                setServiceInformation();
                new GetServiceDataTask( mActivity ).execute();
            } else {

                Toast.makeText( mActivity,"No Server are added in user.",Toast.LENGTH_SHORT ).show();
            }


        }


    }

    private void setServiceInformation() {
        top_title.setText( serviceList.getSr_title() );
        top_back.setOnClickListener( this );
        add_service_data_floaButton_save.setOnClickListener( this );
        add_service_data_iv_switch.setOnClickListener( this );
        add_service_data_iv_switch.setTag( "1" );
        serviceStatus = "ON";

        adapterCostPerItme = new AddServiceItemAdapterItem( this );
        adapterCostPerSize = new AddServiceItemAdapterSize( this );

        add_service_data_listView_costPerItem.setAdapter( adapterCostPerItme );
        add_service_data_listView_costPerSize.setAdapter( adapterCostPerSize );


        add_service_data_edt_quoteService.setVisibility( View.GONE );
        add_service_data_tv_quote.setVisibility( View.GONE );
        add_service_data_listView_costPerSize.setVisibility( View.GONE );
        add_service_data_tv_costPerSize.setVisibility( View.GONE );
        add_service_data_view_costPerSize.setVisibility( View.GONE );
        add_service_data_listView_costPerItem.setVisibility( View.GONE );
        add_service_data_tv_costPerItem.setVisibility( View.GONE );
        add_service_data_view_costPerItem.setVisibility( View.GONE );

        adapterCostPerSize.setList( serviceList.getCost_comps_pro_rated() );

        add_service_data_ch_offer.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {

                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (isChecked) {
                            serviceList.getDiscount().setDs_check_box( "ON" );
                        } else {
                            serviceList.getDiscount().setDs_check_box( "OFF" );
                        }
                    }
                }
        );

        add_service_data_edt_offer.addTextChangedListener( new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (!serviceList.getDiscount().getDs_rate().equalsIgnoreCase( editable.toString() ))
                    serviceList.getDiscount().setDs_rate( editable.toString() );
            }
        } );
    }


<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
    private void setDataInfo() {

        if (serviceList.getCost_comps_pro_rated().size() > 0) {
            add_service_data_listView_costPerSize.setVisibility( View.VISIBLE );
            add_service_data_tv_costPerSize.setVisibility( View.VISIBLE );
            add_service_data_view_costPerSize.setVisibility( View.VISIBLE );
        }

        if (serviceList.getCost_comps_per_item().size() > 0) {
            add_service_data_listView_costPerItem.setVisibility( View.VISIBLE );
            add_service_data_tv_costPerItem.setVisibility( View.VISIBLE );
            add_service_data_view_costPerItem.setVisibility( View.VISIBLE );
        }

        add_service_offer_tv_title.setText( serviceList.getDiscount().getDs_title() );

        if (serviceList.getDiscount().getDs_check_box().equalsIgnoreCase( "ON" )) {
            add_service_data_ch_offer.setChecked( true );
        } else {
            add_service_data_ch_offer.setChecked( false );
        }

        if (Util.isNotEmpaty( serviceList.getDiscount().getDs_rate() )) {
            add_service_data_edt_offer.setText( serviceList.getDiscount().getDs_rate() );
        } else {
            add_service_data_edt_offer.setText( "" );
        }

        adapterCostPerItme.setList( serviceList.getCost_comps_per_item() );
        adapterCostPerSize.setList( serviceList.getCost_comps_pro_rated() );
    }

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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

    public class AddServiceItemAdapterItem extends BaseAdapter {

        private Context mActivity;
        private LayoutInflater inflater;
        private ArrayList<CompsItme> compsItmeList = new ArrayList<>();


        public AddServiceItemAdapterItem(Context activity) {
            // TODO Auto-generated constructor stub
            mActivity = activity;
            application = (KaikiliApplication) mActivity.getApplicationContext();
            inflater = (LayoutInflater) mActivity.getSystemService( Activity.LAYOUT_INFLATER_SERVICE );
        }

        @Override
        public int getCount() {
            // TODO Auto-generated method stub
            return compsItmeList.size();
        }

        @Override
        public Object getItem(int position) {
            // TODO Auto-generated method stub
            return compsItmeList.get( position );
        }

        @Override
        public long getItemId(int position) {
            // TODO Auto-generated method stub
            return position;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            // TODO Auto-generated method stub
            View row = convertView;
            RecordHolder holder;
            final int post = position;


            holder = new RecordHolder();
            row = inflater.inflate( R.layout.row_add_services_item, null );
            holder.tvName = (TextViewEuphemiaUCASRegular) row.findViewById( R.id.row_add_service_item_tv_title );
            holder.frameLayout = (LinearLayout) row.findViewById( R.id.row_add_service_item_ll_row );
            holder.checkBox = (CheckBox) row.findViewById( R.id.row_add_service_item_cb );
            holder.edtAmount = (EditTextEupheminUCASRegular) row.findViewById( R.id.row_add_service_item_edt_amount );

            row.setTag( holder );
            holder.tvName.setText( compsItmeList.get( post ).getCc_title() );

            if (compsItmeList.get( post ).getCc_check_box().equalsIgnoreCase( "ON" )) {
                holder.checkBox.setChecked( true );
            } else {
                holder.checkBox.setChecked( false );
            }

            if (Util.isNotEmpaty( compsItmeList.get( post ).getCc_rate() )) {
                holder.edtAmount.setText( compsItmeList.get( post ).getCc_rate() );
            } else {
                holder.edtAmount.setText( "" );
            }


            holder.checkBox.setOnCheckedChangeListener(
                    new CompoundButton.OnCheckedChangeListener() {

                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            if (isChecked) {
                                serviceList.getCost_comps_per_item().get( position ).setCc_check_box( "ON" );
                            } else {
                                serviceList.getCost_comps_per_item().get( position ).setCc_check_box( "OFF" );
                            }
                        }
                    }
            );

            holder.edtAmount.addTextChangedListener( new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void afterTextChanged(Editable editable) {
                    if (!compsItmeList.get( post ).getCc_rate().equalsIgnoreCase( editable.toString() ))
                        serviceList.getCost_comps_per_item().get( position ).setCc_rate( editable.toString() );
                }
            } );


            return row;
        }


        public void setList(ArrayList<CompsItme> compsItmeList) {
            // TODO Auto-generated method stub
            this.compsItmeList = compsItmeList;
            notifyDataSetChanged();
        }

        class RecordHolder {
            TextViewEuphemiaUCASRegular tvName;
            LinearLayout frameLayout;
            CheckBox checkBox;
            EditTextEupheminUCASRegular edtAmount;


        }
    }

    public class AddServiceItemAdapterSize extends BaseAdapter {

        private Context mActivity;
        private LayoutInflater inflater;
        private ArrayList<CompsItme> compsItmeList = new ArrayList<>();


        public AddServiceItemAdapterSize(Context activity) {
            // TODO Auto-generated constructor stub
            mActivity = activity;
            application = (KaikiliApplication) mActivity.getApplicationContext();
            inflater = (LayoutInflater) mActivity.getSystemService( Activity.LAYOUT_INFLATER_SERVICE );
        }

        @Override
        public int getCount() {
            // TODO Auto-generated method stub
            return compsItmeList.size();
        }

        @Override
        public Object getItem(int position) {
            // TODO Auto-generated method stub
            return compsItmeList.get( position );
        }

        @Override
        public long getItemId(int position) {
            // TODO Auto-generated method stub
            return position;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            // TODO Auto-generated method stub
            View row = convertView;
            RecordHolder holder;
            final int post = position;


            holder = new RecordHolder();
            row = inflater.inflate( R.layout.row_add_services_item, null );
            holder.tvName = (TextViewEuphemiaUCASRegular) row.findViewById( R.id.row_add_service_item_tv_title );
            holder.frameLayout = (LinearLayout) row.findViewById( R.id.row_add_service_item_ll_row );
            holder.checkBox = (CheckBox) row.findViewById( R.id.row_add_service_item_cb );
            holder.edtAmount = (EditTextEupheminUCASRegular) row.findViewById( R.id.row_add_service_item_edt_amount );

            row.setTag( holder );
            holder.tvName.setText( compsItmeList.get( post ).getCc_title() );

            if (compsItmeList.get( post ).getCc_check_box().equalsIgnoreCase( "ON" )) {
                holder.checkBox.setChecked( true );
            } else {
                holder.checkBox.setChecked( false );
            }

            if (Util.isNotEmpaty( compsItmeList.get( post ).getCc_rate() )) {
                holder.edtAmount.setText( compsItmeList.get( post ).getCc_rate() );
            } else {
                holder.edtAmount.setText( "" );
            }


            holder.checkBox.setOnCheckedChangeListener(
                    new CompoundButton.OnCheckedChangeListener() {

                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            if (isChecked) {
                                serviceList.getCost_comps_pro_rated().get( position ).setCc_check_box( "ON" );
                            } else {
                                serviceList.getCost_comps_pro_rated().get( position ).setCc_check_box( "OFF" );
                            }
                        }
                    }
            );

            holder.edtAmount.addTextChangedListener( new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void afterTextChanged(Editable editable) {
                    if (!compsItmeList.get( post ).getCc_rate().equalsIgnoreCase( editable.toString() ))
                        serviceList.getCost_comps_pro_rated().get( position ).setCc_rate( editable.toString() );
                }
            } );


            return row;
        }


        public void setList(ArrayList<CompsItme> compsItmeList) {
            // TODO Auto-generated method stub
            this.compsItmeList = compsItmeList;
            notifyDataSetChanged();
        }

        class RecordHolder {
            TextViewEuphemiaUCASRegular tvName;
            LinearLayout frameLayout;
            CheckBox checkBox;
            EditTextEupheminUCASRegular edtAmount;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
        }
    }
}
