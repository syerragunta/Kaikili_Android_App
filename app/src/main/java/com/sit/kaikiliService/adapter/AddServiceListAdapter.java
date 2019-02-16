package com.sit.kaikiliService.adapter;

import android.app.Activity;
import android.content.Context;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
import android.content.Intent;
>>>>>>> 1/29/2019
=======
import android.content.Intent;
>>>>>>> 1/30/2019
=======
import android.content.Intent;
>>>>>>> 1/31/2019
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.sit.kaikiliService.KetanApplication;
import com.sit.kaikiliService.R;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
import com.sit.kaikiliService.activity.AddServiceDataActivity;
>>>>>>> 1/29/2019
=======
import com.sit.kaikiliService.activity.AddServiceDataActivity;
>>>>>>> 1/30/2019
=======
import com.sit.kaikiliService.activity.AddServiceDataActivity;
>>>>>>> 1/31/2019
import com.sit.kaikiliService.font.TextViewEuphemiaUCASRegular;

import java.util.ArrayList;


<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 1/31/2019
/**
 * Created by ketan patel on 30/1/2019.
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
 */

<<<<<<< HEAD
>>>>>>> 1/30/2019
=======
>>>>>>> 1/31/2019
public class AddServiceListAdapter extends BaseAdapter {

	private Context mActivity;
	private LayoutInflater inflater;
	private ArrayList<String > servicesList = new ArrayList<>();
    private KetanApplication application;


	public AddServiceListAdapter(Context activity) {
		// TODO Auto-generated constructor stub
		mActivity = activity;
        application = (KetanApplication)mActivity.getApplicationContext();
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
            row = inflater.inflate(R.layout.row_add_services, null);
            holder.tvName = (TextViewEuphemiaUCASRegular)row.findViewById( R.id.row_add_service_tv_title );
            holder.frameLayout = (LinearLayout)row.findViewById( R.id.row_add_service_ll_row );
            row.setTag(holder);
            holder.tvName.setText( servicesList.get( position ).toString());



		row.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
//				((MainActivity)mActivity).callGroupLink(servicesList.get(post).getCategory_title(),servicesList.get(post).getCategory_id());

//				Intent intent = new Intent(mActivity, GroupListActivity.class);
//				intent.putExtra("categoriesName",servicesList.get(post).getCategory_title());
//				intent.putExtra("categoriesId",servicesList.get(post).getCategory_id());
//				mActivity.startActivity(intent);
=======
				Intent intent = new Intent(mActivity, AddServiceDataActivity.class);
				intent.putExtra("serviceName",servicesList.get(post).toString());
				mActivity.startActivity(intent);
>>>>>>> 1/29/2019
=======
				Intent intent = new Intent(mActivity, AddServiceDataActivity.class);
				intent.putExtra("serviceName",servicesList.get(post).toString());
				mActivity.startActivity(intent);
>>>>>>> 1/30/2019
=======
				Intent intent = new Intent(mActivity, AddServiceDataActivity.class);
				intent.putExtra("serviceName",servicesList.get(post).toString());
				mActivity.startActivity(intent);
>>>>>>> 1/31/2019
			}
		});


        return row;
    }



	public void setList(ArrayList<String > servicesList) {
		// TODO Auto-generated method stub
		this.servicesList = servicesList;
		notifyDataSetChanged();
	}

	static class RecordHolder {
		TextViewEuphemiaUCASRegular tvName;
		LinearLayout frameLayout;

	}

	
}
