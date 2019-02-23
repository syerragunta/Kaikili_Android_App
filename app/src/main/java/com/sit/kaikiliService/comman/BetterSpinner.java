package com.sit.kaikiliService.comman;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;


import com.sit.kaikiliService.R;

import java.util.Calendar;


/**
 * Created by ketan patel on 21/1/2019.
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
 *
 */


public class BetterSpinner extends AutoCompleteTextView implements AdapterView.OnItemClickListener {

    private static final int MAX_CLICK_DURATION = 200;
    private long startClickTime;
    private boolean isPopup;

    public BetterSpinner(Context context) {
        super(context);
        setOnItemClickListener(this);
    }

    public BetterSpinner(Context arg0, AttributeSet arg1) {
        super(arg0, arg1);
        setOnItemClickListener(this);
    }

    public BetterSpinner(Context arg0, AttributeSet arg1, int arg2) {
        super(arg0, arg1, arg2);
        setOnItemClickListener(this);
    }

    @Override
    public boolean enoughToFilter() {
        return true;
    }

    @Override
    protected void onFocusChanged(boolean focused, int direction,
                                  Rect previouslyFocusedRect) {
        super.onFocusChanged(focused, direction, previouslyFocusedRect);
        if (focused) {
            performFiltering("", 0);
            InputMethodManager imm = (InputMethodManager) getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(getWindowToken(), 0);
            setKeyListener(null);
            dismissDropDown();
        } else {
            isPopup = false;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN: {
                startClickTime = Calendar.getInstance().getTimeInMillis();
                break;
            }
            case MotionEvent.ACTION_UP: {
                long clickDuration = Calendar.getInstance().getTimeInMillis() - startClickTime;
                if (clickDuration < MAX_CLICK_DURATION) {
                    if (isPopup) {
                        dismissDropDown();
                        isPopup = false;
                    } else {
                        requestFocus();
                        showDropDown();
                        isPopup = true;
                    }
                }
            }
        }

        return super.onTouchEvent(event);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        isPopup = false;
    }

    @Override
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable left, Drawable top, Drawable right, Drawable bottom) {
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
        Drawable dropdownIcon = ContextCompat.getDrawable(getContext(), R.drawable.new_arrow_bottom);
=======
        Drawable dropdownIcon = ContextCompat.getDrawable(getContext(), R.drawable.ic_down_arrow_24dp);
>>>>>>> 2/2/2019
=======
        Drawable dropdownIcon = ContextCompat.getDrawable(getContext(), R.drawable.ic_down_arrow_24dp);
>>>>>>> 2/9/2019
=======
        Drawable dropdownIcon = ContextCompat.getDrawable(getContext(), R.drawable.ic_down_arrow_24dp);
>>>>>>> 2/14/2019
=======
        Drawable dropdownIcon = ContextCompat.getDrawable(getContext(), R.drawable.ic_down_arrow_24dp);
>>>>>>> 2/15/2019
=======
        Drawable dropdownIcon = ContextCompat.getDrawable(getContext(), R.drawable.ic_down_arrow_24dp);
>>>>>>> 2/16/2019
=======
        Drawable dropdownIcon = ContextCompat.getDrawable(getContext(), R.drawable.ic_down_arrow_24dp);
>>>>>>> 2/16/2019 V1
=======
        Drawable dropdownIcon = ContextCompat.getDrawable(getContext(), R.drawable.ic_down_arrow_24dp);
>>>>>>> 2/16/2019 V2
=======
        Drawable dropdownIcon = ContextCompat.getDrawable(getContext(), R.drawable.ic_down_arrow_24dp);
>>>>>>> 2/16/2019
=======
        Drawable dropdownIcon = ContextCompat.getDrawable(getContext(), R.drawable.ic_down_arrow_24dp);
>>>>>>> 2/18/2019
=======
        Drawable dropdownIcon = ContextCompat.getDrawable(getContext(), R.drawable.ic_down_arrow_24dp);
>>>>>>> 2/21/2019
=======
        Drawable dropdownIcon = ContextCompat.getDrawable(getContext(), R.drawable.ic_down_arrow_24dp);
>>>>>>> 2/22/2019
        if (dropdownIcon != null) {
            right = dropdownIcon;
            right.mutate().setAlpha(128);
        }
        super.setCompoundDrawablesWithIntrinsicBounds(left, top, right, bottom);
    }

}
