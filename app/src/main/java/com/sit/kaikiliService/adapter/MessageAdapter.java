package com.sit.kaikiliService.adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.support.annotation.RequiresApi;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.sit.kaikiliService.R;
import com.sit.kaikiliService.api.Message;
import com.sit.kaikiliService.font.TextViewEuphemiaUCASRegular;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class MessageAdapter extends BaseAdapter {
    private final int TYPE_MESSAGE = 0;
    private final int TYPE_STATUS = 1;

    private ArrayList<Message> messages;
    private LayoutInflater layoutInflater;

    private int selectedViewType;
    private Activity activity;

    private Context context;

    public MessageAdapter(Activity activity) {
        layoutInflater = activity.getLayoutInflater();
        this.activity = activity;
        messages = new ArrayList<>();

    }

    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
         notifyDataSetChanged();
    }

//    public void addMessage(Message message) {
//        messages.add(new UserMessage(message));
//        notifyDataSetChanged();
//    }

//    public void addStatusMessage(StatusMessage message) {
//        messages.add(message);
//        statusMessageSet.add(messages.size() - 1);
//        notifyDataSetChanged();
//    }

//    public void removeMessage(Message message) {
//        messages.remove(messages.indexOf(message));
//        notifyDataSetChanged();
//    }


    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public int getItemViewType(int position) {
        String uid = messages.get( position ).getAuthor_type();
        if (uid.contains( "SP" )) {
            selectedViewType = 10;
        } else {
            selectedViewType = 20;
        }
        return TYPE_MESSAGE;
    }

    @Override
    public int getCount() {
        return messages.size();
    }

    @Override
    public Object getItem(int i) {
        return messages.get( i );
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        int type = getItemViewType( position );
        int res;
        switch (type) {
            case TYPE_MESSAGE:
                final Message message = messages.get( position );
                if (selectedViewType == 10) {
                    res = R.layout.row_right_chat;
                    convertView = layoutInflater.inflate( res, viewGroup, false );
                    LinearLayout llRight = (LinearLayout) convertView.findViewById( R.id.chat_llRight );


//                    Drawable drawableMain = context.getApplicationContext().getDrawable( R.drawable.message_sent_2 );
//                    Drawable drawable = tintDrawable( drawableMain, ColorStateList.valueOf( context.getColor( R.color.colorPrimary ) ) );
//                    llRight.setBackground( drawable );

                    TextViewEuphemiaUCASRegular textViewMessage = (TextViewEuphemiaUCASRegular) convertView.findViewById( R.id.adp_right_chat_txt_sent );
                    TextViewEuphemiaUCASRegular textViewDate = (TextViewEuphemiaUCASRegular) convertView.findViewById( R.id.adp_right_chat_txt_time );
                    textViewMessage.setText( message.getBody() );
                    textViewDate.setText( message.getCreated_on());


                } else {
                    res = R.layout.row_left_chat;
                    convertView = layoutInflater.inflate( res, viewGroup, false );
                    LinearLayout llRight = (LinearLayout) convertView.findViewById( R.id.adp_left_crd_ll );


//                        Drawable drawableMain = context.getApplicationContext().getDrawable( R.drawable.message_received_2 );
//                        @SuppressLint("NewApi")
//                        Drawable drawable = tintDrawable( drawableMain, ColorStateList.valueOf( context.getColor( R.color.ripal_color ) ) );
//                        llRight.setBackground( drawable );


                    TextViewEuphemiaUCASRegular textViewMessage1 = (TextViewEuphemiaUCASRegular) convertView.findViewById( R.id.adp_left_chat_txt_receive );
                    TextViewEuphemiaUCASRegular textViewDate1 = (TextViewEuphemiaUCASRegular) convertView.findViewById( R.id.adp_left_chat_txt_time );
                        textViewMessage1.setText( message.getBody());
                        textViewDate1.setText(message.getCreated_on());


                }

                break;

        }
        return convertView;
    }

    public Drawable tintDrawable(Drawable drawable, ColorStateList colors) {
        final Drawable wrappedDrawable = DrawableCompat.wrap( drawable );
        DrawableCompat.setTintList( wrappedDrawable, colors );
        return wrappedDrawable;
    }


}
