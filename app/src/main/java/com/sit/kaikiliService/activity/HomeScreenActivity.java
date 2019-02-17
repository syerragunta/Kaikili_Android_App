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
<<<<<<< HEAD
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
=======
=======
>>>>>>> 1/30/2019
=======
>>>>>>> 1/31/2019
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
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
>>>>>>> 2/2/2019
=======
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
>>>>>>> 2/9/2019
=======
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
>>>>>>> 2/14/2019
=======
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
>>>>>>> 2/15/2019
=======
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
>>>>>>> 2/16/2019
=======
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
>>>>>>> 2/16/2019 V1
=======
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
>>>>>>> 2/16/2019 V2
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
import android.view.MenuItem;
>>>>>>> 2/2/2019
=======
import android.view.MenuItem;
>>>>>>> 2/9/2019
=======
import android.view.MenuItem;
>>>>>>> 2/14/2019
=======
import android.view.MenuItem;
>>>>>>> 2/15/2019
=======
import android.view.MenuItem;
>>>>>>> 2/16/2019
=======
import android.view.MenuItem;
>>>>>>> 2/16/2019 V1
=======
import android.view.MenuItem;
>>>>>>> 2/16/2019 V2
import android.view.View;

import com.sit.kaikiliService.R;
import com.sit.kaikiliService.font.TextViewEuphemiaUCASRegular;
import com.sit.kaikiliService.fragment.EarningsFragment;
import com.sit.kaikiliService.fragment.NotificationFragment;
import com.sit.kaikiliService.fragment.ProfileFragment;
import com.sit.kaikiliService.fragment.ScheduledServicesFragment;
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
>>>>>>> 1/29/2019
=======
>>>>>>> 1/30/2019
=======
>>>>>>> 1/31/2019
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

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by ketan patel on 28/1/2019.
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
 */

public class HomeScreenActivity extends BaseActivity {
//        implements NavigationView.OnNavigationItemSelectedListener {

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
=======
=======
>>>>>>> 1/30/2019
=======
>>>>>>> 1/31/2019
=======
>>>>>>> 2/1/2019
    @Bind(R.id.home_viewpager)ViewPager home_viewpager;
    @Bind(R.id.top_title)TextViewEuphemiaUCASRegular top_title;

    private Toolbar toolbar;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 1/29/2019
=======
>>>>>>> 1/30/2019
=======
>>>>>>> 1/31/2019
=======
>>>>>>> 2/1/2019
=======
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
    @Bind(R.id.home_viewpager)
    ViewPager home_viewpager;
    @Bind(R.id.top_title)
    TextViewEuphemiaUCASRegular top_title;

    private Toolbar toolbar;
    private BottomNavigationView navigation;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_home_screen );
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
        Toolbar toolbar = (Toolbar) findViewById( R.id.toolbar );
=======
        toolbar = (Toolbar) findViewById( R.id.toolbar );
>>>>>>> 1/29/2019
=======
        toolbar = (Toolbar) findViewById( R.id.toolbar );
>>>>>>> 1/30/2019
=======
        toolbar = (Toolbar) findViewById( R.id.toolbar );
>>>>>>> 1/31/2019
=======
        toolbar = (Toolbar) findViewById( R.id.toolbar );
>>>>>>> 2/1/2019
        setSupportActionBar( toolbar );

=======
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
        toolbar = (Toolbar) findViewById( R.id.toolbar );
        setSupportActionBar( toolbar );

         navigation = (BottomNavigationView) findViewById( R.id.navigation );
        navigation.setOnNavigationItemSelectedListener( mOnNavigationItemSelectedListener );

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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

        DrawerLayout drawer = (DrawerLayout) findViewById( R.id.drawer_layout );
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close );
        drawer.addDrawerListener( toggle );
        toggle.syncState();

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
//        NavigationView navigationView = (NavigationView) findViewById( R.id.nav_view );
//        navigationView.setNavigationItemSelectedListener( this );
    }

=======
=======
>>>>>>> 1/30/2019
=======
>>>>>>> 1/31/2019
=======
>>>>>>> 2/1/2019



        // Create an adapter that knows which fragment should be shown on each page
        SimpleFragmentPagerAdapter adapter = new SimpleFragmentPagerAdapter(this, getSupportFragmentManager());
        home_viewpager.setAdapter(adapter);
        home_viewpager.setCurrentItem( 0 );
        setUpToolbar("Home");
    }

    public void setUpToolbar(final String title) {
        top_title.setText(title);
=======
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

        // Create an adapter that knows which fragment should be shown on each page
        SimpleFragmentPagerAdapter adapter = new SimpleFragmentPagerAdapter( this, getSupportFragmentManager() );
        home_viewpager.setAdapter( adapter );
        home_viewpager.setCurrentItem( 0 );
        setUpToolbar( "Schedule Service" );



        home_viewpager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            public void onPageScrollStateChanged(int state) {}
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            public void onPageSelected(int position) {
                // Check if this is the page you want.
                if(position == 0){
                    navigation.setSelectedItemId(R.id.navigation_home);
                }else if (position ==1){
                    navigation.setSelectedItemId(R.id.navigation_notification);
                }else if (position ==2){
                    navigation.setSelectedItemId(R.id.navigation_earnings);
                }else if (position ==3){
                    navigation.setSelectedItemId(R.id.navigation_profile);
                }

            }
        });
    }

    public void setUpToolbar(final String title) {
        top_title.setText( title );
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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

    }


<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
//    private void setupTabIcons() {
//
//        TextViewEuphemiaUCASRegular tabOne = (TextViewEuphemiaUCASRegular) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
//        tabOne.setText("Home");
//        tabOne.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.tab_home, 0, 0);
//        home_sliding_tabs.getTabAt(0).setCustomView(tabOne);
//
//        TextViewEuphemiaUCASRegular tabTwo = (TextViewEuphemiaUCASRegular) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
//        tabTwo.setText("Notification");
//        tabTwo.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.tab_notification, 0, 0);
//        home_sliding_tabs.getTabAt(1).setCustomView(tabTwo);
//
//        TextViewEuphemiaUCASRegular tabThree = (TextViewEuphemiaUCASRegular) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
//        tabThree.setText("Earnings");
//        tabThree.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.earnings, 0, 0);
//        home_sliding_tabs.getTabAt(2).setCustomView(tabThree);
//
//        TextViewEuphemiaUCASRegular tabFore = (TextViewEuphemiaUCASRegular) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
//        tabFore.setText("Profile");
//        tabFore.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.profile, 0, 0);
//        home_sliding_tabs.getTabAt(3).setCustomView(tabFore);
//    }


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
>>>>>>> 1/29/2019
=======
>>>>>>> 1/30/2019
=======
>>>>>>> 1/31/2019
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
=======
=======
>>>>>>> 1/30/2019
=======
>>>>>>> 1/31/2019
=======
>>>>>>> 2/1/2019
    public void callTabHome(View view) {
        home_viewpager.setCurrentItem( 0 );
        top_title.setText("Home");

    }

    public void callTabNotification(View view) {
        home_viewpager.setCurrentItem(1);
        top_title.setText("Notification");

    }

    public void callTabEarnings(View view) {
        home_viewpager.setCurrentItem(2);
        top_title.setText("Earnings");

    }

    public void callTabProfile(View view) {
        home_viewpager.setCurrentItem(3);
        top_title.setText("Profile");

    }

=======
>>>>>>> 2/2/2019
=======
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
    public void callServiceHistory(View view) {
//        Intent intent = new Intent( this, ServiceCatalogueActivity.class );
//        startActivity( intent );
    }

    public void callPaymentInfo(View view) {
//        Intent intent = new Intent( this, .class );
//        startActivity( intent );
    }


    public void callProfile(View view) {
        Intent intent = new Intent( this, ProfileEditActivity.class );
        startActivity( intent );
    }

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

    public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

        private Context mContext;

        public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
            super(fm);
=======
            super( fm );
>>>>>>> 2/2/2019
=======
            super( fm );
>>>>>>> 2/9/2019
=======
            super( fm );
>>>>>>> 2/14/2019
=======
            super( fm );
>>>>>>> 2/15/2019
=======
            super( fm );
>>>>>>> 2/16/2019
=======
            super( fm );
>>>>>>> 2/16/2019 V1
=======
            super( fm );
>>>>>>> 2/16/2019 V2
            mContext = context;
        }

        // This determines the fragment for each tab
        @Override
        public android.support.v4.app.Fragment getItem(int position) {
            if (position == 0) {
                return new ScheduledServicesFragment();
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
            } else if (position == 1){
                return new NotificationFragment();
            } else if (position == 2){
                return new EarningsFragment();
            } else if (position == 3){
=======
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
            } else if (position == 1) {
                return new NotificationFragment();
            } else if (position == 2) {
                return new EarningsFragment();
            } else if (position == 3) {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
                return new ProfileFragment();
            } else {
                return new ScheduledServicesFragment();
            }
        }

        // This determines the number of tabs
        @Override
        public int getCount() {
            return 4;
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
>>>>>>> 1/29/2019
=======
>>>>>>> 1/30/2019
=======
>>>>>>> 1/31/2019
=======
>>>>>>> 2/1/2019
=======
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
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    if (home_viewpager.getCurrentItem() != 0) {
                        home_viewpager.setCurrentItem( 0 );
                        top_title.setText( "Schedule Service" );
                    }
                    return true;
                case R.id.navigation_notification:
                    if (home_viewpager.getCurrentItem() != 1) {
                        home_viewpager.setCurrentItem( 1 );
                        top_title.setText( "Notification" );
                    }
                    return true;
                case R.id.navigation_earnings:
                    if (home_viewpager.getCurrentItem() != 2) {
                        home_viewpager.setCurrentItem( 2 );
                        top_title.setText( "Earnings" );
                    }
                    return true;
                case R.id.navigation_profile:
                    if (home_viewpager.getCurrentItem() != 3) {
                        home_viewpager.setCurrentItem( 3 );
                        top_title.setText( "Profile" );
                    }
                    return true;

            }
            return false;
        }
    };



<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
}
