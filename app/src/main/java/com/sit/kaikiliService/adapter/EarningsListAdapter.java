package com.sit.kaikiliService.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
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
import com.sit.kaikiliService.R;
import com.sit.kaikiliService.font.TextViewEuphemiaUCASRegular;
import com.sit.kaikiliService.model.EarningsModel;

import java.util.ArrayList;


/**
 * Created by ketan patel on 30/1/2019.
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
 */

public class EarningsListAdapter extends BaseAdapter {

	private Context mActivity;
	private LayoutInflater inflater;
	private ArrayList<EarningsModel> earningList = new ArrayList<>();
<<<<<<< HEAD
<<<<<<< HEAD
    private KetanApplication application;
=======
    private KaikiliApplication application;
>>>>>>> 2/1/2019
=======
    private KaikiliApplication application;
>>>>>>> 2/2/2019


	public EarningsListAdapter(Context activity) {
		// TODO Auto-generated constructor stub
		mActivity = activity;
<<<<<<< HEAD
<<<<<<< HEAD
        application = (KetanApplication)mActivity.getApplicationContext();
=======
        application = (KaikiliApplication)mActivity.getApplicationContext();
>>>>>>> 2/1/2019
=======
        application = (KaikiliApplication)mActivity.getApplicationContext();
>>>>>>> 2/2/2019
		inflater = (LayoutInflater) mActivity.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return earningList.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return earningList.get(position);
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
            row = inflater.inflate(R.layout.row_earning_item, null);
            holder.tvName = (TextViewEuphemiaUCASRegular)row.findViewById( R.id.row_earning_item_tv_title );
            holder.tvTime = (TextViewEuphemiaUCASRegular)row.findViewById( R.id.row_earning_item_tv_time );
            holder.tvAmount = (TextViewEuphemiaUCASRegular)row.findViewById( R.id.row_earning_item_tv_amount );
            row.setTag(holder);
            holder.tvName.setText( earningList.get( position ).getName());
            holder.tvTime.setText( earningList.get( position ).getTime());
            holder.tvAmount.setText( earningList.get( position ).getAmount());



		row.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {

//				((MainActivity)mActivity).callGroupLink(earningList.get(post).getCategory_title(),earningList.get(post).getCategory_id());

//				Intent intent = new Intent(mActivity, GroupListActivity.class);
//				intent.putExtra("categoriesName",earningList.get(post).getCategory_title());
//				intent.putExtra("categoriesId",earningList.get(post).getCategory_id());
//				mActivity.startActivity(intent);
			}
		});


        return row;
    }



	public void setList(ArrayList<EarningsModel > earningList) {
		// TODO Auto-generated method stub
		this.earningList = earningList;
		notifyDataSetChanged();
	}

	static class RecordHolder {
		TextViewEuphemiaUCASRegular tvName,tvTime,tvAmount;

	}

	
}
