package com.sit.kaikiliService.adapter;

import android.app.Activity;
import android.content.Context;
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
import android.content.pm.ServiceInfo;
import android.provider.Telephony;
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
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
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
import android.widget.LinearLayout;

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
import com.sit.kaikiliService.font.TextViewEuphemiaUCASRegular;
import com.sit.kaikiliService.model.ServiceInfoModel;

import java.util.ArrayList;


/**
 * Created by ketan patel on 31/1/2019.
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
 */

public class ServiceInfoItemAdapter extends BaseAdapter {

    private Context mActivity;
    private LayoutInflater inflater;
    private ArrayList<ServiceInfoModel> servicesList = new ArrayList<>();
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


    public ServiceInfoItemAdapter(Context activity) {
        // TODO Auto-generated constructor stub
        mActivity = activity;
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
        application = (KetanApplication) mActivity.getApplicationContext();
=======
        application = (KaikiliApplication) mActivity.getApplicationContext();
>>>>>>> 2/1/2019
=======
        application = (KaikiliApplication) mActivity.getApplicationContext();
>>>>>>> 2/2/2019
=======
        application = (KaikiliApplication) mActivity.getApplicationContext();
>>>>>>> 2/9/2019
=======
        application = (KaikiliApplication) mActivity.getApplicationContext();
>>>>>>> 2/14/2019
=======
        application = (KaikiliApplication) mActivity.getApplicationContext();
>>>>>>> 2/15/2019
=======
        application = (KaikiliApplication) mActivity.getApplicationContext();
>>>>>>> 2/16/2019
=======
        application = (KaikiliApplication) mActivity.getApplicationContext();
>>>>>>> 2/16/2019 V1
=======
        application = (KaikiliApplication) mActivity.getApplicationContext();
>>>>>>> 2/16/2019 V2
=======
        application = (KaikiliApplication) mActivity.getApplicationContext();
>>>>>>> 2/16/2019
=======
        application = (KaikiliApplication) mActivity.getApplicationContext();
>>>>>>> 2/18/2019
=======
        application = (KaikiliApplication) mActivity.getApplicationContext();
>>>>>>> 2/21/2019
=======
        application = (KaikiliApplication) mActivity.getApplicationContext();
>>>>>>> 2/22/2019
        inflater = (LayoutInflater) mActivity.getSystemService( Activity.LAYOUT_INFLATER_SERVICE );

    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return servicesList.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return servicesList.get( position );
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        View row = convertView;
        RecordHolder holder = null;
        final int post = position;

        holder = new RecordHolder();
        row = inflater.inflate( R.layout.row_service_info_item, null );
        holder.tvName = (TextViewEuphemiaUCASRegular) row.findViewById( R.id.row_service_info_item_tv_name );
        holder.tvAmount = (TextViewEuphemiaUCASRegular) row.findViewById( R.id.row_service_info_item_tv_amount );

        holder.tvAmount.setText( "$ " + servicesList.get( position ).getAmount() );
        holder.tvName.setText( servicesList.get( position ).getName() );


        return row;
    }


    public void setList(ArrayList<ServiceInfoModel> servicesList) {
        // TODO Auto-generated method stub
        this.servicesList = servicesList;
        notifyDataSetChanged();
    }

    static class RecordHolder {
        TextViewEuphemiaUCASRegular tvName, tvAmount;

    }


}
