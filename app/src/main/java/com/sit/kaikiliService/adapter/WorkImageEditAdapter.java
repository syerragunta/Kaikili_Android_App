package com.sit.kaikiliService.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.sit.kaikiliService.R;
import com.sit.kaikiliService.activity.ProfileAddActivity;
import com.sit.kaikiliService.comman.Util;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class WorkImageEditAdapter extends RecyclerView.Adapter<WorkImageEditAdapter.ViewHolder> {

    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;
    private ArrayList<Uri> fileList;
    private Context mContext;

    // data is passed into the constructor
    public WorkImageEditAdapter(Context context) {
        this.mContext = context;
        this.mInflater = LayoutInflater.from( context );
        this.fileList = new ArrayList<>();
    }

    // inflates the cell layout from xml when needed
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate( R.layout.row_add_image_item, parent, false );
        return new ViewHolder( view );
    }

    // binds the data to the TextView in each cell
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
//        holder.ivImages.setc(fileList.get(position));

        Log.e( "------------------", fileList.get( position ).toString() );
        if (!fileList.get( position ).toString().equals( "no" )) {
            if (fileList.get( position ).toString().contains( "http" )) {
                Picasso.with( mContext ).load( fileList.get( position ).toString() )
                        .into( holder.ivImages );
            } else {
                Picasso.with( mContext ).load( "file://" + fileList.get( position ).toString() )
                        .into( holder.ivImages );
            }
            holder.ivImages.setTag( 1 );
            holder.ivDelete.setTag( position );
            holder.ivDelete.setVisibility( View.VISIBLE );
        } else {
            holder.ivImages.setTag( 0 );
            holder.ivImages.setImageDrawable(mContext.getDrawable(R.drawable.ic_add_photo_black_24dp) );
            holder.ivDelete.setVisibility( View.GONE );
        }

        holder.ivImages.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int poi = Integer.parseInt( view.getTag().toString() );
                if (poi == 0) {
                    ((ProfileAddActivity) mContext).ImageAdd();
                }
            }
        } );

        holder.ivDelete.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int poi = Integer.parseInt( view.getTag().toString() );
                ((ProfileAddActivity) mContext).ImageDelete( poi );
            }
        } );


    }

    // total number of cells
    @Override
    public int getItemCount() {
        return fileList.size();
    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView ivImages;
        ImageView ivDelete;

        ViewHolder(View itemView) {
            super( itemView );
            ivImages = itemView.findViewById( R.id.row_add_image_iv );
            ivDelete = itemView.findViewById( R.id.row_add_image_iv_delete );
//            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick( view, getAdapterPosition() );
        }
    }

    // convenience method for getting data at click position
    String getItem(int id) {
        return fileList.get( id ).toString();
    }

    // allows clicks events to be caught
    public void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    // parent activity will implement this method to respond to click events
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }

    // parent activity will implement this method to respond to click events
    public void setData(ArrayList<Uri> fileList) {
        this.fileList.clear();
        this.fileList.addAll( fileList );
        if (fileList.size() < 6) {
            Uri myUri = Uri.parse( "no" );
            this.fileList.add( myUri );
        }
        notifyDataSetChanged();
    }
}
