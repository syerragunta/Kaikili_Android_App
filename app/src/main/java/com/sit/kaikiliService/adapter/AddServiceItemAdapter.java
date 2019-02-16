package com.sit.kaikiliService.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;

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
=======
import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
import com.sit.kaikiliService.api.CompsItme;
>>>>>>> 2/9/2019
import com.sit.kaikiliService.font.TextViewEuphemiaUCASRegular;

import java.util.ArrayList;


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
/**
 * Created by ketan patel on 28/1/2019.
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
 */

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
public class AddServiceItemAdapter extends BaseAdapter {

	private Context mActivity;
	private LayoutInflater inflater;
<<<<<<< HEAD
	private ArrayList<String > servicesList = new ArrayList<>();
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
	private ArrayList<CompsItme> compsItmeList = new ArrayList<>();
    private KaikiliApplication application;
>>>>>>> 2/9/2019


	public AddServiceItemAdapter(Context activity) {
		// TODO Auto-generated constructor stub
		mActivity = activity;
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
		inflater = (LayoutInflater) mActivity.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		return servicesList.size();
=======
		return compsItmeList.size();
>>>>>>> 2/9/2019
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		return servicesList.get(position);
=======
		return compsItmeList.get(position);
>>>>>>> 2/9/2019
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
            row = inflater.inflate(R.layout.row_add_services_item, null);
            holder.tvName = (TextViewEuphemiaUCASRegular)row.findViewById( R.id.row_add_service_item_tv_title );
            holder.frameLayout = (LinearLayout)row.findViewById( R.id.row_add_service_item_ll_row );
            row.setTag(holder);
<<<<<<< HEAD
            holder.tvName.setText( servicesList.get( position ).toString());
=======
            holder.tvName.setText( compsItmeList.get( post ).getCc_title());
>>>>>>> 2/9/2019



		row.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {

<<<<<<< HEAD
//				((MainActivity)mActivity).callGroupLink(servicesList.get(post).getCategory_title(),servicesList.get(post).getCategory_id());

//				Intent intent = new Intent(mActivity, GroupListActivity.class);
//				intent.putExtra("categoriesName",servicesList.get(post).getCategory_title());
//				intent.putExtra("categoriesId",servicesList.get(post).getCategory_id());
=======
//				((MainActivity)mActivity).callGroupLink(compsItmeList.get(post).getCategory_title(),compsItmeList.get(post).getCategory_id());

//				Intent intent = new Intent(mActivity, GroupListActivity.class);
//				intent.putExtra("categoriesName",compsItmeList.get(post).getCategory_title());
//				intent.putExtra("categoriesId",compsItmeList.get(post).getCategory_id());
>>>>>>> 2/9/2019
//				mActivity.startActivity(intent);
			}
		});


        return row;
    }



<<<<<<< HEAD
	public void setList(ArrayList<String > servicesList) {
		// TODO Auto-generated method stub
		this.servicesList = servicesList;
=======
	public void setList(ArrayList<CompsItme> compsItmeList) {
		// TODO Auto-generated method stub
		this.compsItmeList = compsItmeList;
>>>>>>> 2/9/2019
		notifyDataSetChanged();
	}

	static class RecordHolder {
		TextViewEuphemiaUCASRegular tvName;
		LinearLayout frameLayout;

	}

	
}
