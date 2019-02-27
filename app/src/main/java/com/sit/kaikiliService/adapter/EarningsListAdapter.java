package com.sit.kaikiliService.adapter;

import android.app.Activity;
import android.content.Context;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
import android.content.Intent;
>>>>>>> 2/21/2019
=======
import android.content.Intent;
>>>>>>> 2/22/2019
=======
import android.content.Intent;
>>>>>>> 2/23/2019
=======
import android.content.Intent;
>>>>>>> 2/25/2019
=======
import android.content.Intent;
>>>>>>> 2/26/2019
=======
import android.content.Intent;
>>>>>>> 2/27/2019
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
import com.sit.kaikiliService.R;
import com.sit.kaikiliService.font.TextViewEuphemiaUCASRegular;
import com.sit.kaikiliService.model.EarningsModel;
=======
=======
>>>>>>> 2/22/2019
=======
>>>>>>> 2/23/2019
=======
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019

import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
import com.sit.kaikiliService.activity.ServiceInfoViewActivity;
import com.sit.kaikiliService.api.EarningeInfo;
import com.sit.kaikiliService.font.TextViewEuphemiaUCASRegular;
import com.sit.kaikiliService.api.EarningeInfoApi;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/21/2019
=======
>>>>>>> 2/22/2019
=======
>>>>>>> 2/23/2019
=======
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019

import java.util.ArrayList;


/**
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
 * Created by ketan patel on 30/1/2019.
=======
 * Created by ketan patel on 20/2/2019.
>>>>>>> 2/21/2019
=======
 * Created by ketan patel on 20/2/2019.
>>>>>>> 2/22/2019
=======
 * Created by ketan patel on 20/2/2019.
>>>>>>> 2/23/2019
=======
 * Created by ketan patel on 20/2/2019.
>>>>>>> 2/25/2019
=======
 * Created by ketan patel on 20/2/2019.
>>>>>>> 2/26/2019
=======
 * Created by ketan patel on 20/2/2019.
>>>>>>> 2/27/2019
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
 */

public class EarningsListAdapter extends BaseAdapter {

	private Context mActivity;
	private LayoutInflater inflater;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
	private ArrayList<EarningsModel> earningList = new ArrayList<>();
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
	private ArrayList<EarningeInfo> earningList = new ArrayList<>();
    private KaikiliApplication application;
>>>>>>> 2/21/2019
=======
	private ArrayList<EarningeInfo> earningList = new ArrayList<>();
    private KaikiliApplication application;
>>>>>>> 2/22/2019
=======
	private ArrayList<EarningeInfo> earningList = new ArrayList<>();
    private KaikiliApplication application;
>>>>>>> 2/23/2019
=======
	private ArrayList<EarningeInfo> earningList = new ArrayList<>();
    private KaikiliApplication application;
>>>>>>> 2/25/2019
=======
	private ArrayList<EarningeInfo> earningList = new ArrayList<>();
    private KaikiliApplication application;
>>>>>>> 2/26/2019
=======
	private ArrayList<EarningeInfo> earningList = new ArrayList<>();
    private KaikiliApplication application;
>>>>>>> 2/27/2019


	public EarningsListAdapter(Context activity) {
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
=======
        application = (KaikiliApplication)mActivity.getApplicationContext();
>>>>>>> 2/16/2019 V2
=======
        application = (KaikiliApplication)mActivity.getApplicationContext();
>>>>>>> 2/16/2019
=======
        application = (KaikiliApplication)mActivity.getApplicationContext();
>>>>>>> 2/18/2019
=======
        application = (KaikiliApplication)mActivity.getApplicationContext();
>>>>>>> 2/21/2019
=======
        application = (KaikiliApplication)mActivity.getApplicationContext();
>>>>>>> 2/22/2019
=======
        application = (KaikiliApplication)mActivity.getApplicationContext();
>>>>>>> 2/23/2019
=======
        application = (KaikiliApplication)mActivity.getApplicationContext();
>>>>>>> 2/25/2019
=======
        application = (KaikiliApplication)mActivity.getApplicationContext();
>>>>>>> 2/26/2019
=======
        application = (KaikiliApplication)mActivity.getApplicationContext();
>>>>>>> 2/27/2019
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
            holder.tvName.setText( earningList.get( position ).getName());
            holder.tvTime.setText( earningList.get( position ).getTime());
            holder.tvAmount.setText( earningList.get( position ).getAmount());


=======
            holder.tvName.setText( earningList.get( position ).getSr_title());
            holder.tvTime.setText( earningList.get( position ).getDate() +" " +earningList.get( position ).getTime());
            holder.tvAmount.setText( earningList.get( position ).getNet_payment());
>>>>>>> 2/21/2019
=======
            holder.tvName.setText( earningList.get( position ).getSr_title());
            holder.tvTime.setText( earningList.get( position ).getDate() +" " +earningList.get( position ).getTime());
            holder.tvAmount.setText( earningList.get( position ).getNet_payment());
>>>>>>> 2/22/2019
=======
            holder.tvName.setText( earningList.get( position ).getSr_title());
            holder.tvTime.setText( earningList.get( position ).getDate() +" " +earningList.get( position ).getTime());
            holder.tvAmount.setText( earningList.get( position ).getNet_payment());
>>>>>>> 2/23/2019
=======
            holder.tvName.setText( earningList.get( position ).getSr_title());
            holder.tvTime.setText( earningList.get( position ).getDate() +" " +earningList.get( position ).getTime());
            holder.tvAmount.setText( earningList.get( position ).getNet_payment());
>>>>>>> 2/25/2019
=======
            holder.tvName.setText( earningList.get( position ).getSr_title());
            holder.tvTime.setText( earningList.get( position ).getDate() +" " +earningList.get( position ).getTime());
            holder.tvAmount.setText( earningList.get( position ).getNet_payment());
>>>>>>> 2/26/2019
=======
            holder.tvName.setText( earningList.get( position ).getSr_title());
            holder.tvTime.setText( earningList.get( position ).getDate() +" " +earningList.get( position ).getTime());
            holder.tvAmount.setText( earningList.get( position ).getNet_payment());
>>>>>>> 2/27/2019

		row.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
//				((MainActivity)mActivity).callGroupLink(earningList.get(post).getCategory_title(),earningList.get(post).getCategory_id());

//				Intent intent = new Intent(mActivity, GroupListActivity.class);
//				intent.putExtra("categoriesName",earningList.get(post).getCategory_title());
//				intent.putExtra("categoriesId",earningList.get(post).getCategory_id());
//				mActivity.startActivity(intent);
=======
				Intent intent = new Intent( mActivity, ServiceInfoViewActivity.class );
				intent.putExtra("tran_id",earningList.get(post).getTran_id());
				mActivity.startActivity( intent );
>>>>>>> 2/21/2019
=======
				Intent intent = new Intent( mActivity, ServiceInfoViewActivity.class );
				intent.putExtra("tran_id",earningList.get(post).getTran_id());
				mActivity.startActivity( intent );
>>>>>>> 2/22/2019
=======
				Intent intent = new Intent( mActivity, ServiceInfoViewActivity.class );
				intent.putExtra("tran_id",earningList.get(post).getTran_id());
				mActivity.startActivity( intent );
>>>>>>> 2/23/2019
=======
				Intent intent = new Intent( mActivity, ServiceInfoViewActivity.class );
				intent.putExtra("tran_id",earningList.get(post).getTran_id());
				mActivity.startActivity( intent );
>>>>>>> 2/25/2019
=======
				Intent intent = new Intent( mActivity, ServiceInfoViewActivity.class );
				intent.putExtra("tran_id",earningList.get(post).getTran_id());
				mActivity.startActivity( intent );
>>>>>>> 2/26/2019
=======
				Intent intent = new Intent( mActivity, ServiceInfoViewActivity.class );
				intent.putExtra("tran_id",earningList.get(post).getTran_id());
				mActivity.startActivity( intent );
>>>>>>> 2/27/2019
			}
		});


        return row;
    }



<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
	public void setList(ArrayList<EarningsModel > earningList) {
=======
	public void setList(ArrayList<EarningeInfo> earningList) {
>>>>>>> 2/21/2019
=======
	public void setList(ArrayList<EarningeInfo> earningList) {
>>>>>>> 2/22/2019
=======
	public void setList(ArrayList<EarningeInfo> earningList) {
>>>>>>> 2/23/2019
=======
	public void setList(ArrayList<EarningeInfo> earningList) {
>>>>>>> 2/25/2019
=======
	public void setList(ArrayList<EarningeInfo> earningList) {
>>>>>>> 2/26/2019
=======
	public void setList(ArrayList<EarningeInfo> earningList) {
>>>>>>> 2/27/2019
		// TODO Auto-generated method stub
		this.earningList = earningList;
		notifyDataSetChanged();
	}

	static class RecordHolder {
		TextViewEuphemiaUCASRegular tvName,tvTime,tvAmount;

	}

	
}
