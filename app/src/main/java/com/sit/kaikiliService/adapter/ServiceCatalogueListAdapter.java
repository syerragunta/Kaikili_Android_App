package com.sit.kaikiliService.adapter;

import android.app.Activity;
import android.content.Context;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
import android.content.Intent;
>>>>>>> 2/16/2019 V2
=======
import android.content.Intent;
>>>>>>> 2/16/2019
=======
import android.content.Intent;
>>>>>>> 2/18/2019
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
import com.sit.kaikiliService.R;
=======
=======
>>>>>>> 2/16/2019
=======
>>>>>>> 2/18/2019

import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
import com.sit.kaikiliService.activity.AddServiceDataActivity;
import com.sit.kaikiliService.api.ServiceInfo;
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/16/2019 V2
=======
>>>>>>> 2/16/2019
=======
>>>>>>> 2/18/2019
import com.sit.kaikiliService.font.TextViewEuphemiaUCASBola;
import com.sit.kaikiliService.font.TextViewEuphemiaUCASRegular;

import java.util.ArrayList;


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
=======
>>>>>>> 2/16/2019
=======
>>>>>>> 2/18/2019
/**
 * Created by ketan patel on 30/1/2019.
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
 */

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
public class ServiceCatalogueListAdapter extends BaseAdapter {

	private Context mActivity;
	private LayoutInflater inflater;
	private ArrayList<String > servicesList = new ArrayList<>();
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


	public ServiceCatalogueListAdapter(Context activity) {
		// TODO Auto-generated constructor stub
		mActivity = activity;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        application = (KetanApplication)mActivity.getApplicationContext();
=======
        application = (KaikiliApplication)mActivity.getApplicationContext();
>>>>>>> 2/1/2019
=======
        application = (KaikiliApplication)mActivity.getApplicationContext();
>>>>>>> 2/2/2019
=======
        application = (KaikiliApplication)mActivity.getApplicationContext();
>>>>>>> 2/9/2019
=======
        application = (KaikiliApplication)mActivity.getApplicationContext();
>>>>>>> 2/14/2019
=======
        application = (KaikiliApplication)mActivity.getApplicationContext();
>>>>>>> 2/15/2019
=======
        application = (KaikiliApplication)mActivity.getApplicationContext();
>>>>>>> 2/16/2019
=======
        application = (KaikiliApplication)mActivity.getApplicationContext();
>>>>>>> 2/16/2019 V1
		inflater = (LayoutInflater) mActivity.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return servicesList.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return servicesList.get(position);
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
            row = inflater.inflate(R.layout.row_services_catalogue, null);
            holder.tvName = (TextViewEuphemiaUCASRegular)row.findViewById( R.id.row_service_catalogue_tv_title );
            holder.tvStatus = (TextViewEuphemiaUCASBola) row.findViewById( R.id.row_service_catalogue_tv_status );
            holder.tvName.setText( servicesList.get( position ).toString());

            if(position == 1 || position == 2 || position == 5 || position == 7 || position == 9){
				holder.tvStatus.setText( "ON " );
			}else {
				holder.tvStatus.setText( "OFF " );
			}



		row.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {

//				((MainActivity)mActivity).callGroupLink(servicesList.get(post).getCategory_title(),servicesList.get(post).getCategory_id());

//				Intent intent = new Intent(mActivity, GroupListActivity.class);
//				intent.putExtra("categoriesName",servicesList.get(post).getCategory_title());
//				intent.putExtra("categoriesId",servicesList.get(post).getCategory_id());
//				mActivity.startActivity(intent);
			}
		});
=======
=======
>>>>>>> 2/16/2019
=======
>>>>>>> 2/18/2019
public class ServiceCatalogueListAdapter extends BaseAdapter {

    private Context mActivity;
    private LayoutInflater inflater;
    private ArrayList<ServiceInfo> servicesList = new ArrayList<>();
    private KaikiliApplication application;


    public ServiceCatalogueListAdapter(Context activity) {
        // TODO Auto-generated constructor stub
        mActivity = activity;
        application = (KaikiliApplication) mActivity.getApplicationContext();
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
        row = inflater.inflate( R.layout.row_services_catalogue, null );
        holder.tvName = (TextViewEuphemiaUCASRegular) row.findViewById( R.id.row_service_catalogue_tv_title );
        holder.tvStatus = (TextViewEuphemiaUCASBola) row.findViewById( R.id.row_service_catalogue_tv_status );
        holder.tvName.setText( servicesList.get( position ).getSr_title());
        holder.tvStatus.setText( servicesList.get( position ).getSp_sr_status() );


        row.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//				((MainActivity)mActivity).callGroupLink(servicesList.get(post).getCategory_title(),servicesList.get(post).getCategory_id());

                Intent intent = new Intent(mActivity, AddServiceDataActivity.class);
                intent.putExtra("serviceId",  servicesList.get(post).getSr_id() );
                mActivity.startActivity(intent);
            }
        } );
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/16/2019 V2
=======
>>>>>>> 2/16/2019
=======
>>>>>>> 2/18/2019


        return row;
    }


<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD

	public void setList(ArrayList<String > servicesList) {
		// TODO Auto-generated method stub
		this.servicesList = servicesList;
		notifyDataSetChanged();
	}

	static class RecordHolder {
		TextViewEuphemiaUCASRegular tvName;
		TextViewEuphemiaUCASBola tvStatus;

	}

	
=======
=======
>>>>>>> 2/16/2019
=======
>>>>>>> 2/18/2019
    public void setList(ArrayList<ServiceInfo> servicesList) {
        // TODO Auto-generated method stub
        this.servicesList = servicesList;
        notifyDataSetChanged();
    }

    static class RecordHolder {
        TextViewEuphemiaUCASRegular tvName;
        TextViewEuphemiaUCASBola tvStatus;

    }


<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/16/2019 V2
=======
>>>>>>> 2/16/2019
=======
>>>>>>> 2/18/2019
}
