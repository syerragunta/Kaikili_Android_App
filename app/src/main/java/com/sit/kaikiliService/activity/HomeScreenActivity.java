package com.sit.kaikiliService.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.sit.kaikiliService.R;
import com.sit.kaikiliService.comman.CircularImageView;
import com.sit.kaikiliService.font.TextViewEuphemiaUCASBola;
import com.sit.kaikiliService.font.TextViewEuphemiaUCASRegular;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by ketan patel on 28/1/2019.
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
 */

public class HomeScreenActivity extends BaseActivity {
//        implements NavigationView.OnNavigationItemSelectedListener {

//    @Bind(R.id.menu_top_civ_profile) CircularImageView menu_top_civ_profile;
//    @Bind(R.id.menu_tv_top_userName) TextViewEuphemiaUCASRegular menu_tv_top_userName;
//    @Bind(R.id.menu_tv_top_ratingCount) TextViewEuphemiaUCASBola menu_tv_top_ratingCount;
//    @Bind(R.id.menu_tv_top_serviceCount) TextViewEuphemiaUCASBola menu_tv_top_serviceCount;
//
//
//    @Bind(R.id.menu_tv_addService) TextViewEuphemiaUCASRegular menu_tv_addService;
//    @Bind(R.id.menu_tv_serviceCatalogue) TextViewEuphemiaUCASRegular menu_tv_serviceCatalogue;
//    @Bind(R.id.menu_tv_serviceHistory) TextViewEuphemiaUCASRegular menu_tv_serviceHistory;
//    @Bind(R.id.menu_tv_payment) TextViewEuphemiaUCASRegular menu_tv_payment;
//    @Bind(R.id.menu_tv_profile) TextViewEuphemiaUCASRegular menu_tv_profile;
//    @Bind(R.id.menu_tv_contactUs) TextViewEuphemiaUCASRegular menu_tv_contactUs;
//    @Bind(R.id.menu_tv_logout) TextViewEuphemiaUCASRegular menu_tv_logout;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_home_screen );
        ButterKnife.bind( this, this );

        Toolbar toolbar = (Toolbar) findViewById( R.id.toolbar );
        setSupportActionBar( toolbar );


        DrawerLayout drawer = (DrawerLayout) findViewById( R.id.drawer_layout );
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close );
        drawer.addDrawerListener( toggle );
        toggle.syncState();

//        NavigationView navigationView = (NavigationView) findViewById( R.id.nav_view );
//        navigationView.setNavigationItemSelectedListener( this );
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById( R.id.drawer_layout );
        if (drawer.isDrawerOpen( GravityCompat.START )) {
            drawer.closeDrawer( GravityCompat.START );
        } else {
            super.onBackPressed();
        }
    }

    public void callAddService(View view) {
        Intent intent = new Intent( this, AddServiceActivity.class );
        startActivity( intent );
    }

    public void callServiceCatalogue(View view) {
        Intent intent = new Intent( this, ServiceCatalogueActivity.class );
        startActivity( intent );
    }


//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//
//        return super.onOptionsItemSelected( item );
//    }
//
//    @SuppressWarnings("StatementWithEmptyBody")
//    @Override
//    public boolean onNavigationItemSelected(MenuItem item) {
//        // Handle navigation view item clicks here.
//        int id = item.getItemId();
//        DrawerLayout drawer = (DrawerLayout) findViewById( R.id.drawer_layout );
//        drawer.closeDrawer( GravityCompat.START );
//        return true;
//    }
}
