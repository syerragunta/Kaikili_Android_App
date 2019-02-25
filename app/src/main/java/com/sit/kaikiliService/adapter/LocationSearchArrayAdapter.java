package com.sit.kaikiliService.adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.sit.kaikiliService.R;

import java.util.ArrayList;

public class LocationSearchArrayAdapter extends  ArrayAdapter<String> {

    private Activity mActivity;
    private ArrayList<String> resultList = new ArrayList<>();
    int layoutResourceId;

    public LocationSearchArrayAdapter(Activity _activity, int textViewResourceId) {
        super(_activity, textViewResourceId);
         layoutResourceId = textViewResourceId;
        mActivity = _activity;
    }

    @Override
    public int getCount() {
        return resultList.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        try{

            if(convertView==null){
                // inflate the layout
                LayoutInflater inflater = ((mActivity).getLayoutInflater());
                convertView = inflater.inflate(layoutResourceId, parent, false);
            }

//            // object item based on the position
//            MyObject objectItem = data[position];

            // get the TextView and then set the text (item name) and tag (item ID) values
            TextView textViewItem = (TextView) convertView.findViewById( R.id.row_item_autocomplete_title);
            textViewItem.setText(resultList.get(position).toString());

//            textViewItem.setBackgroundColor( Color.CYAN);

        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return convertView;

    }

    @Override
    public String getItem(int index) {
        return resultList.get(index);
    }



    public void updateListItem(ArrayList<String> _items) {
        resultList.clear();
        resultList.addAll(_items);
        notifyDataSetChanged();
    }
}