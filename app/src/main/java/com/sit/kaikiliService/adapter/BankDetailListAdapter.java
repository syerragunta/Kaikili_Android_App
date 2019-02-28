package com.sit.kaikiliService.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
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
=======
import android.widget.ImageView;
>>>>>>> 2/22/2019
=======
import android.widget.ImageView;
>>>>>>> 2/23/2019
=======
import android.widget.ImageView;
>>>>>>> 2/25/2019
=======
import android.widget.ImageView;
>>>>>>> 2/26/2019
=======
import android.widget.ImageView;
>>>>>>> 2/27/2019
=======
import android.widget.ImageView;
>>>>>>> 2/28/2019
import android.widget.LinearLayout;

import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
import com.sit.kaikiliService.activity.AddServiceDataActivity;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import com.sit.kaikiliService.font.TextViewEuphemiaUCASRegular;

=======
=======
>>>>>>> 2/23/2019
=======
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
import com.sit.kaikiliService.activity.BankViewDetailsActivity;
import com.sit.kaikiliService.api.BankInfo;
import com.sit.kaikiliService.font.TextViewEuphemiaUCASRegular;

import java.io.Serializable;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/22/2019
=======
>>>>>>> 2/23/2019
=======
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
import java.util.ArrayList;


/**
 * Created by ketan patel on 30/1/2019.
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
 */

public class BankDetailListAdapter extends BaseAdapter {

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
	private Context mActivity;
	private LayoutInflater inflater;
	private ArrayList<String > servicesList = new ArrayList<>();
    private KaikiliApplication application;


	public BankDetailListAdapter(Context activity) {
		// TODO Auto-generated constructor stub
		mActivity = activity;
        application = (KaikiliApplication)mActivity.getApplicationContext();
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
            row = inflater.inflate(R.layout.row_bank_info_item, null);
//            holder.tvName = (TextViewEuphemiaUCASRegular)row.findViewById( R.id.row_add_service_tv_title );
//            holder.frameLayout = (LinearLayout)row.findViewById( R.id.row_add_service_ll_row );
//            row.setTag(holder);
//            holder.tvName.setText( servicesList.get( position ).toString());



//		row.setOnClickListener(new View.OnClickListener() {
//			@Override
//			public void onClick(View v) {
//
//				Intent intent = new Intent(mActivity, AddServiceDataActivity.class);
//				intent.putExtra("serviceName",servicesList.get(post).toString());
//				mActivity.startActivity(intent);
//			}
//		});

=======
=======
>>>>>>> 2/23/2019
=======
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
    private Context mActivity;
    private LayoutInflater inflater;
    private ArrayList<BankInfo> bankList = new ArrayList<>();
    private KaikiliApplication application;


    public BankDetailListAdapter(Context activity) {
        // TODO Auto-generated constructor stub
        mActivity = activity;
        application = (KaikiliApplication) mActivity.getApplicationContext();
        inflater = (LayoutInflater) mActivity.getSystemService( Activity.LAYOUT_INFLATER_SERVICE );

    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return bankList.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return bankList.get( position );
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
        row = inflater.inflate( R.layout.row_bank_info_item, null );
        holder.tvName = (TextViewEuphemiaUCASRegular) row.findViewById( R.id.row_bank_info_tv_name );
        holder.tvCard = (TextViewEuphemiaUCASRegular) row.findViewById( R.id.row_bank_info_tv_card );
        holder.llrow = (LinearLayout) row.findViewById( R.id.row_bank_info_ll_row );
        holder.ivSelected = (ImageView) row.findViewById( R.id.row_bank_info_iv_isSelected );
        row.setTag( holder );

        holder.tvName.setText( bankList.get( position ).getBank_name() + " - " + bankList.get( position ).getCard_holder_name() );
        holder.tvCard.setText( "XXXX XXXX XXXX " + bankList.get( position ).getCard_no().substring( (bankList.get( position ).getCard_no().length() - 4), bankList.get( position ).getCard_no().length() ) );
        holder.llrow.setTag( position );

        if(Boolean.parseBoolean( bankList.get( position ).getIsUsed())){
            holder.ivSelected.setVisibility( View.VISIBLE );
        }else {
            holder.ivSelected.setVisibility( View.INVISIBLE );
        }


        holder.llrow.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 int pos = Integer.parseInt( v.getTag().toString());
                 Intent intent = new Intent( mActivity, BankViewDetailsActivity.class );
                intent.putExtra( "bankInfo", bankList.get(pos) );
                mActivity.startActivity( intent );
            }
        } );
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/22/2019
=======
>>>>>>> 2/23/2019
=======
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019

        return row;
    }


<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
		LinearLayout frameLayout;

	}

	
=======
=======
>>>>>>> 2/23/2019
=======
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
    public void setList(ArrayList<BankInfo> bankList) {
        // TODO Auto-generated method stub
        this.bankList = bankList;
        notifyDataSetChanged();
    }

    static class RecordHolder {
        TextViewEuphemiaUCASRegular tvName;
        TextViewEuphemiaUCASRegular tvCard;
        LinearLayout llrow;
        ImageView ivSelected;
    }

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/22/2019
=======
>>>>>>> 2/23/2019
=======
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
}
