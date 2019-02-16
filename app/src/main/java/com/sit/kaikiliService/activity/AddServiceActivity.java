package com.sit.kaikiliService.activity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ImageView;

<<<<<<< HEAD
<<<<<<< HEAD
import com.sit.kaikiliService.KetanApplication;
=======
import com.sit.kaikiliService.KaikiliApplication;
>>>>>>> 2/1/2019
=======
import com.sit.kaikiliService.KaikiliApplication;
>>>>>>> 2/2/2019
import com.sit.kaikiliService.R;
import com.sit.kaikiliService.adapter.AddServiceListAdapter;
import com.sit.kaikiliService.comman.WithoutScrollListView;
import com.sit.kaikiliService.font.EditTextEupheminUCASRegular;
import com.sit.kaikiliService.font.TextViewEuphemiaUCASRegular;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;


/**
 * Created by ketan patel on 28/1/2019.
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
 */

public class AddServiceActivity extends BaseActivity implements View.OnClickListener {

    @Bind(R.id.top_back) ImageView top_back;
    @Bind(R.id.top_title) TextViewEuphemiaUCASRegular top_title;


    @Bind(R.id.add_service_edt_search) EditTextEupheminUCASRegular add_service_edt_search;
    @Bind(R.id.add_service_iv_remove) ImageView add_service_iv_remove;
    @Bind(R.id.add_service_listView_serviceList) WithoutScrollListView add_service_listView_serviceList;
    @Bind(R.id.add_service_listView_searchList) WithoutScrollListView add_service_listView_searchList;





<<<<<<< HEAD
<<<<<<< HEAD
    private KetanApplication application;
=======
    private KaikiliApplication application;
>>>>>>> 2/1/2019
=======
    private KaikiliApplication application;
>>>>>>> 2/2/2019
    private SharedPreferences preferences;
    private ArrayList<String> serviceList;
    private ArrayList<String> filterList;
    private AddServiceListAdapter adapter;
    private AddServiceListAdapter adapterSearch;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_add_srevice );
        ButterKnife.bind( this, this );

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

        top_title.setText( "Add Services" );
        top_back.setOnClickListener( this );
        add_service_iv_remove.setOnClickListener( this );

        filterList = new ArrayList<>();

        serviceList = new ArrayList<>();
        serviceList.add("TV Mount Installation");
        serviceList.add("Carpet Cleaning");
        serviceList.add("Lawn Mowing");
        serviceList.add("Dishwasher Installation");
        serviceList.add("Interior Painting");
        serviceList.add("Water Heater Installation");
        serviceList.add("Fireplace Cleaning");
        serviceList.add("Moving Service");
        serviceList.add("Hair Cutting at Salon");
        serviceList.add("Custom Cabinet Building");
        serviceList.add("Water Softener Installation");
        serviceList.add("Fence Painting");
        serviceList.add("Home Theater System Installation");
        serviceList.add("Roof Installation or Replacement");
        serviceList.add("Upholstery and Furniture Cleaning");
        serviceList.add("Lawn Mowing and Trimming");
        serviceList.add("Popcorn Texture Removal");
        serviceList.add("Drywall Repair and Texturing");
        serviceList.add("Solar Panel Cleaning");

        adapter = new AddServiceListAdapter( this );
        adapterSearch = new AddServiceListAdapter( this );
        add_service_listView_serviceList.setAdapter(adapter);
        add_service_listView_searchList.setAdapter(adapterSearch);
        adapter.setList(serviceList);
        adapterSearch.setList(filterList);



        add_service_edt_search.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                //after the change calling the method and passing the search input
                filter(editable.toString());
            }
        });
    }


    private void filter(String text) {
        //new array list that will hold the filtered data
        ArrayList<String> filterdNames = new ArrayList<>();

        //looping through existing elements
        for (String s : serviceList) {
            //if the existing elements contains the search input
            if (s.toLowerCase().contains(text.toLowerCase())) {
                //adding the element to filtered list
                filterdNames.add(s);
            }
        }

        //calling a method of the adapter class and passing the filtered list
        adapterSearch.setList(filterdNames);
    }

    @Override
    public void onClick(View view) {

        if (view == top_back) {
            finish();
        } else if (view == add_service_iv_remove) {
           add_service_edt_search.setText("");
            filterList = new ArrayList<>();
            adapterSearch.setList(filterList);
        }
    }
}
