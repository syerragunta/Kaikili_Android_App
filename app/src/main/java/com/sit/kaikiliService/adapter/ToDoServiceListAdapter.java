package com.sit.kaikiliService.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import com.sit.kaikiliService.activity.ServiceInfoActivity;
=======
import com.sit.kaikiliService.activity.ServiceHistoryActivity;
import com.sit.kaikiliService.activity.ServiceInfoActivity;
import com.sit.kaikiliService.activity.ServiceInfoViewActivity;
>>>>>>> 2/21/2019
=======
import com.sit.kaikiliService.activity.ServiceHistoryActivity;
import com.sit.kaikiliService.activity.ServiceInfoActivity;
import com.sit.kaikiliService.activity.ServiceInfoViewActivity;
>>>>>>> 2/22/2019
=======
import com.sit.kaikiliService.activity.ServiceHistoryActivity;
import com.sit.kaikiliService.activity.ServiceInfoActivity;
import com.sit.kaikiliService.activity.ServiceInfoViewActivity;
>>>>>>> 2/23/2019
=======
import com.sit.kaikiliService.activity.ServiceHistoryActivity;
import com.sit.kaikiliService.activity.ServiceInfoActivity;
import com.sit.kaikiliService.activity.ServiceInfoViewActivity;
>>>>>>> 2/25/2019
=======
import com.sit.kaikiliService.activity.ServiceHistoryActivity;
import com.sit.kaikiliService.activity.ServiceInfoActivity;
import com.sit.kaikiliService.activity.ServiceInfoViewActivity;
>>>>>>> 2/26/2019
=======
import com.sit.kaikiliService.activity.ServiceHistoryActivity;
import com.sit.kaikiliService.activity.ServiceInfoActivity;
import com.sit.kaikiliService.activity.ServiceInfoViewActivity;
>>>>>>> 2/27/2019
=======
import com.sit.kaikiliService.activity.ServiceHistoryActivity;
import com.sit.kaikiliService.activity.ServiceInfoActivity;
import com.sit.kaikiliService.activity.ServiceInfoViewActivity;
>>>>>>> 2/28/2019
import com.sit.kaikiliService.font.TextViewEuphemiaUCASRegular;
import com.sit.kaikiliService.api.TransitionServiceData;

import java.util.ArrayList;


/**
 * Created by ketan patel on 31/1/2019.
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
 */

public class ToDoServiceListAdapter extends BaseAdapter {

    private Context mActivity;
    private LayoutInflater inflater;
    private ArrayList<TransitionServiceData> transitionService = new ArrayList<>();
    private KaikiliApplication application;


    public ToDoServiceListAdapter(Context activity) {
        // TODO Auto-generated constructor stub
        mActivity = activity;
        application = (KaikiliApplication) mActivity.getApplicationContext();
        inflater = (LayoutInflater) mActivity.getSystemService( Activity.LAYOUT_INFLATER_SERVICE );

    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return transitionService.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return transitionService.get( position );
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
        row = inflater.inflate( R.layout.row_services_book, null );
        holder.tvTitle = (TextViewEuphemiaUCASRegular) row.findViewById( R.id.row_service_book_item_tv_title );
        holder.tvTime = (TextViewEuphemiaUCASRegular) row.findViewById( R.id.row_service_book_item_tv_time );
        holder.cardView = (CardView) row.findViewById( R.id.row_service_book_cardView );

        holder.tvTitle.setText( transitionService.get( position ).getSr_title());
        holder.tvTime.setText( transitionService.get( position ).getDate()+" "+transitionService.get( position ).getTime());
        holder.cardView.setTag(post);

        holder.cardView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int pos = Integer.parseInt( view.getTag().toString());

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
                Intent intent = new Intent( mActivity, ServiceInfoActivity.class );
                intent.putExtra("data",transitionService.get( pos));
                mActivity.startActivity( intent );
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
=======
>>>>>>> 2/28/2019
                if(mActivity instanceof ServiceHistoryActivity){
                    Intent intent = new Intent( mActivity, ServiceInfoViewActivity.class );
                    intent.putExtra("tran_id",transitionService.get( pos).getTran_id());
                    mActivity.startActivity( intent );
                }else {
                    Intent intent = new Intent( mActivity, ServiceInfoActivity.class );
                    intent.putExtra("data",transitionService.get( pos));
                    mActivity.startActivity( intent );
                }
<<<<<<< HEAD
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
=======
>>>>>>> 2/28/2019
            }
        } );

        return row;
    }


    public void setList(ArrayList<TransitionServiceData> servicesList) {
        // TODO Auto-generated method stub
        this.transitionService = servicesList;
        notifyDataSetChanged();
    }

    static class RecordHolder {
        private TextViewEuphemiaUCASRegular tvTitle,tvTime;
        private CardView cardView;


    }


}
