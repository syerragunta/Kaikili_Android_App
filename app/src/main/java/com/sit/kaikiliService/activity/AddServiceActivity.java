package com.sit.kaikiliService.activity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
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
=======
>>>>>>> 2/25/2019
import android.widget.Toast;

import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
import com.sit.kaikiliService.adapter.AddServiceListAdapter;
import com.sit.kaikiliService.api.GetAllServiceAPI;
import com.sit.kaikiliService.api.ServiceList;
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
import com.sit.kaikiliService.api.WebApiClient;
>>>>>>> 2/9/2019
=======
import com.sit.kaikiliService.api.WebApi;
import com.sit.kaikiliService.api.WebApiClient;
>>>>>>> 2/14/2019
=======
import com.sit.kaikiliService.api.WebApi;
import com.sit.kaikiliService.api.WebApiClient;
>>>>>>> 2/15/2019
=======
import com.sit.kaikiliService.api.WebApi;
import com.sit.kaikiliService.api.WebApiClient;
>>>>>>> 2/16/2019
=======
import com.sit.kaikiliService.api.WebApi;
import com.sit.kaikiliService.api.WebApiClient;
>>>>>>> 2/16/2019 V1
=======
import com.sit.kaikiliService.api.WebApi;
import com.sit.kaikiliService.api.WebApiClient;
>>>>>>> 2/16/2019 V2
=======
import com.sit.kaikiliService.api.WebApi;
import com.sit.kaikiliService.api.WebApiClient;
>>>>>>> 2/16/2019
=======
import com.sit.kaikiliService.api.WebApi;
import com.sit.kaikiliService.api.WebApiClient;
>>>>>>> 2/18/2019
=======
import com.sit.kaikiliService.api.WebApi;
import com.sit.kaikiliService.api.WebApiClient;
>>>>>>> 2/21/2019
=======
import com.sit.kaikiliService.api.WebApi;
import com.sit.kaikiliService.api.WebApiClient;
>>>>>>> 2/22/2019
=======
import com.sit.kaikiliService.api.WebApi;
import com.sit.kaikiliService.api.WebApiClient;
>>>>>>> 2/23/2019
=======
import com.sit.kaikiliService.api.WebApi;
import com.sit.kaikiliService.api.WebApiClient;
>>>>>>> 2/25/2019
import com.sit.kaikiliService.comman.WithoutScrollListView;
import com.sit.kaikiliService.font.EditTextEupheminUCASRegular;
import com.sit.kaikiliService.font.TextViewEuphemiaUCASRegular;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
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
=======
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;
>>>>>>> 2/9/2019
=======
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;
>>>>>>> 2/14/2019
=======
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;
>>>>>>> 2/15/2019
=======
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;
>>>>>>> 2/16/2019
=======
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;
>>>>>>> 2/16/2019 V1
=======
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;
>>>>>>> 2/16/2019 V2
=======
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;
>>>>>>> 2/16/2019
=======
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;
>>>>>>> 2/18/2019
=======
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;
>>>>>>> 2/21/2019
=======
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;
>>>>>>> 2/22/2019
=======
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;
>>>>>>> 2/23/2019
=======
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;
>>>>>>> 2/25/2019


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
    private SharedPreferences preferences;
    private ArrayList<String> serviceList;
    private ArrayList<String> filterList;
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
=======
>>>>>>> 2/25/2019
    private KaikiliApplication application;
    private SharedPreferences preferences;
    private ArrayList<ServiceList> serviceList = new ArrayList<>(  );
    private ArrayList<ServiceList> filterList = new ArrayList<>(  );
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
    private AddServiceListAdapter adapter;
    private AddServiceListAdapter adapterSearch;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_add_srevice );
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
        preferences = application.getSharedPreferences();

        top_title.setText( "Add Services" );
        top_back.setOnClickListener( this );
        add_service_iv_remove.setOnClickListener( this );

        filterList = new ArrayList<>();

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
=======
=======
>>>>>>> 2/14/2019
//        serviceList = new ArrayList<>();
//        serviceList.add("TV Mount Installation");
//        serviceList.add("Carpet Cleaning");
//        serviceList.add("Lawn Mowing");
//        serviceList.add("Dishwasher Installation");
//        serviceList.add("Interior Painting");
//        serviceList.add("Water Heater Installation");
//        serviceList.add("Fireplace Cleaning");
//        serviceList.add("Moving Service");
//        serviceList.add("Hair Cutting at Salon");
//        serviceList.add("Custom Cabinet Building");
//        serviceList.add("Water Softener Installation");
//        serviceList.add("Fence Painting");
//        serviceList.add("Home Theater System Installation");
//        serviceList.add("Roof Installation or Replacement");
//        serviceList.add("Upholstery and Furniture Cleaning");
//        serviceList.add("Lawn Mowing and Trimming");
//        serviceList.add("Popcorn Texture Removal");
//        serviceList.add("Drywall Repair and Texturing");
//        serviceList.add("Solar Panel Cleaning");
<<<<<<< HEAD
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
        adapter = new AddServiceListAdapter( this );
        adapterSearch = new AddServiceListAdapter( this );
        add_service_listView_serviceList.setAdapter(adapter);
        add_service_listView_searchList.setAdapter(adapterSearch);
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
        adapter.setList(serviceList);
=======
        GetAllServiceAPI();
>>>>>>> 2/9/2019
=======
        GetAllServiceAPI();
>>>>>>> 2/14/2019
        adapterSearch.setList(filterList);



<<<<<<< HEAD
<<<<<<< HEAD
=======

>>>>>>> 2/9/2019
=======

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
        GetAllServiceAPI();
        adapterSearch.setList(filterList);


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
=======
>>>>>>> 2/25/2019
        GetAllServiceAPI();
        adapterSearch.setList(filterList);


<<<<<<< HEAD
>>>>>>> 2/22/2019
=======
        GetAllServiceAPI();
        adapterSearch.setList(filterList);


>>>>>>> 2/23/2019
=======
>>>>>>> 2/25/2019
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
        ArrayList<String> filterdNames = new ArrayList<>();

        //looping through existing elements
        for (String s : serviceList) {
            //if the existing elements contains the search input
            if (s.toLowerCase().contains(text.toLowerCase())) {
                //adding the element to filtered list
                filterdNames.add(s);
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
=======
>>>>>>> 2/25/2019
        ArrayList<ServiceList> filterdNames = new ArrayList<>();

        //looping through existing elements
        for (int i=0;i<serviceList.size();i++) {
            //if the existing elements contains the search input
            if (serviceList.get(i).getSr_title().toLowerCase().contains(text.toLowerCase())) {
                //adding the element to filtered list
                filterdNames.add(serviceList.get(i));
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
           add_service_edt_search.setText("");
=======
            add_service_edt_search.setText("");
>>>>>>> 2/15/2019
=======
            add_service_edt_search.setText("");
>>>>>>> 2/16/2019
=======
            add_service_edt_search.setText("");
>>>>>>> 2/16/2019 V1
=======
            add_service_edt_search.setText("");
>>>>>>> 2/16/2019 V2
=======
            add_service_edt_search.setText("");
>>>>>>> 2/16/2019
=======
            add_service_edt_search.setText("");
>>>>>>> 2/18/2019
=======
            add_service_edt_search.setText("");
>>>>>>> 2/21/2019
=======
            add_service_edt_search.setText("");
>>>>>>> 2/22/2019
=======
            add_service_edt_search.setText("");
>>>>>>> 2/23/2019
=======
            add_service_edt_search.setText("");
>>>>>>> 2/25/2019
            filterList = new ArrayList<>();
            adapterSearch.setList(filterList);
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
=======
>>>>>>> 2/25/2019


    public void GetAllServiceAPI() {
        try {
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
            WebApiClient.getInstance( this ).getWebApi().getAllAddService( "getAllAddService",
=======
            WebApiClient.getInstance( this ).getWebApi().getAllAddService( "subservices","getAllAddService",
>>>>>>> 2/14/2019
=======
            WebApiClient.getInstance( this ).getWebApi().getAllAddService( "subservices","getAllAddService",
>>>>>>> 2/15/2019
=======
            WebApiClient.getInstance( this ).getWebApi().getAllAddService( "subservices","getAllAddService",
>>>>>>> 2/16/2019
=======
            WebApiClient.getInstance( this ).getWebApi().getAllAddService( "subservices","getAllAddService",
>>>>>>> 2/16/2019 V1
=======
            WebApiClient.getInstance( this ).getWebApi().getAllAddService( "subservices","getAllAddService",
>>>>>>> 2/16/2019 V2
=======
            WebApiClient.getInstance( this ).getWebApi().getAllAddService( "subservices","getAllAddService",
>>>>>>> 2/16/2019
=======
            WebApiClient.getInstance( this ).getWebApi().getAllAddService( "subservices","getAllAddService",
>>>>>>> 2/18/2019
=======
            WebApiClient.getInstance( this ).getWebApi().getAllAddService( "subservices","getAllAddService",
>>>>>>> 2/21/2019
=======
            WebApiClient.getInstance( this ).getWebApi().getAllAddService( "subservices","getAllAddService",
>>>>>>> 2/22/2019
=======
            WebApiClient.getInstance( this ).getWebApi().getAllAddService( "subservices","getAllAddService",
>>>>>>> 2/23/2019
=======
            WebApiClient.getInstance( this ).getWebApi().getAllAddService( "subservices","getAllAddService",
>>>>>>> 2/25/2019
                    new Callback<GetAllServiceAPI>() {
                        @Override
                        public void success(GetAllServiceAPI getAllServiceAPI, Response response) {

                            if (getAllServiceAPI != null) {
                                if (getAllServiceAPI.getStatus() == 1) {
                                    serviceList = getAllServiceAPI.getData();
                                    adapter.setList(serviceList);
                                } else {
                                    Toast.makeText(AddServiceActivity.this, getAllServiceAPI.getMessage(), Toast.LENGTH_SHORT).show();
                                }
                            }
                        }

                        @Override
                        public void failure(RetrofitError error) {
                            Toast.makeText(AddServiceActivity.this, handleError(error), Toast.LENGTH_SHORT).show();
                        }
                    } );
        } catch (Exception e) {
            e.printStackTrace();
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
<<<<<<< HEAD
<<<<<<< HEAD
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
}
