package com.sit.kaikiliService.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

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

import java.util.ArrayList;

import com.sit.kaikiliService.model.NotificationModel;
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
import com.sit.kaikiliService.model.ServiceModel;
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


/**
 * Created by ketan patel on 30/1/2019.
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
 */

public class NotificationListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context mActivity;
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
    private ArrayList <NotificationModel> notificationList;

    public NotificationListAdapter(Context activity) {
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
        notificationList = new ArrayList<>( );
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder viewHolder = null;
        LayoutInflater inflater = LayoutInflater.from( parent.getContext() );
        View v = inflater.inflate( R.layout.row_notification_item, parent, false );
        viewHolder = new MyViewHolder( v );
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {

        MyViewHolder viewHolder = (MyViewHolder) holder;
        viewHolder.tvTitle.setText( notificationList.get( position ).getTitle());
        viewHolder.tvTime.setText( notificationList.get( position ).getTime());

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

        if(notificationList.get( position ).isReadStatus()){
            viewHolder.ivRead.setVisibility( View.VISIBLE );
            viewHolder.tvTitle.setTextColor(mActivity.getResources().getColor(R.color.message_unread));
            viewHolder.tvTime.setTextColor(mActivity.getResources().getColor(R.color.message_unread));
        }else {
            viewHolder.ivRead.setVisibility( View.INVISIBLE );
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
=======
>>>>>>> 2/16/2019
=======
>>>>>>> 2/18/2019
=======
>>>>>>> 2/21/2019
=======
>>>>>>> 2/22/2019
        viewHolder.ivRead.setVisibility( View.GONE );
        if(notificationList.get( position ).isReadStatus()){
//            viewHolder.ivRead.setVisibility( View.VISIBLE );
            viewHolder.tvTitle.setTextColor(mActivity.getResources().getColor(R.color.message_unread));
            viewHolder.tvTime.setTextColor(mActivity.getResources().getColor(R.color.message_unread));
        }else {
//            viewHolder.ivRead.setVisibility( View.INVISIBLE );
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
            viewHolder.tvTitle.setTextColor(mActivity.getResources().getColor(R.color.black_87));
            viewHolder.tvTime.setTextColor(mActivity.getResources().getColor(R.color.black_87));
        }

//
//        viewHolder.cardView.setTag( position );
//
//        viewHolder.cardView.setOnClickListener( new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////                Intent intent = new Intent( mActivity, TalesInfoActivity.class );
////                intent.putExtra( "TaleModel", taleList.get( Integer.valueOf( view.getTag().toString())));
////                mActivity.startActivity( intent );
//
//            }
//        } );
////
//        viewHolder.mainLinLayout.setOnLongClickListener( new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View view) {
//                int p = Integer.valueOf( view.getTag().toString() );
//                System.out.println( "LongClick: " + p );
//                ((FavoritesTaleListActivity) mActivity).deleteTale( taleList.get( p ).getTaleId() );
//                return false;// returning true instead of false, works for me
//            }
//        } );


    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }


    @Override
    public int getItemCount() {
        return notificationList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextViewEuphemiaUCASRegular tvTitle,tvTime;
        private ImageView ivRead;
//        private CardView cardView;


        public MyViewHolder(View itemView) {
            super( itemView );

            tvTitle = (TextViewEuphemiaUCASRegular) itemView.findViewById( R.id.row_noti_tv_title );
            tvTime = (TextViewEuphemiaUCASRegular) itemView.findViewById( R.id.row_noti_tv_time );
            ivRead = (ImageView) itemView.findViewById( R.id.row_noti_iv_read );
//            cardView = (CardView) itemView.findViewById( R.id.row_service_cardView );



        }

    }

    public void setList(ArrayList<NotificationModel> notificationList) {
        // TODO Auto-generated method stub
        this.notificationList = notificationList;
        notifyDataSetChanged();
    }



}




