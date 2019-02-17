package com.sit.kaikiliService.activity;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
=======
import android.content.SharedPreferences;
import android.graphics.Color;
>>>>>>> 2/1/2019
=======
import android.content.SharedPreferences;
import android.graphics.Color;
>>>>>>> 2/2/2019
=======
import android.content.SharedPreferences;
import android.graphics.Color;
>>>>>>> 2/9/2019
=======
import android.content.SharedPreferences;
import android.graphics.Color;
>>>>>>> 2/14/2019
=======
import android.content.SharedPreferences;
import android.graphics.Color;
>>>>>>> 2/15/2019
=======
import android.content.SharedPreferences;
import android.graphics.Color;
>>>>>>> 2/16/2019
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.content.ContextCompat;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import com.sit.kaikiliService.KetanApplication;
import com.sit.kaikiliService.R;
import com.sit.kaikiliService.font.EditTextEupheminUCASRegular;
=======
import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
>>>>>>> 2/1/2019
=======
import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
>>>>>>> 2/2/2019
=======
import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
>>>>>>> 2/9/2019
=======
import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
>>>>>>> 2/14/2019
=======
import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
>>>>>>> 2/15/2019
=======
import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
>>>>>>> 2/16/2019
import com.sit.kaikiliService.font.TextViewEuphemiaUCASRegular;

import butterknife.Bind;
import butterknife.ButterKnife;


/**
 * Created by ketan patel on 22/1/2019.
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
 *
 */

public class TermsConditionsActivity extends BaseActivity implements View.OnClickListener {

    @Bind(R.id.top_back) ImageView top_back;

    @Bind(R.id.top_title) TextViewEuphemiaUCASRegular top_title;


    @Bind(R.id.terms_tv_message)  TextViewEuphemiaUCASRegular terms_tv_message;

    @Bind(R.id.terms_next)  FloatingActionButton terms_next;

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
    private SharedPreferences preferences;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_conditions);
        ButterKnife.bind( this,this );

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        application = (KetanApplication) getApplicationContext();
=======
        application = (KaikiliApplication) getApplicationContext();
>>>>>>> 2/1/2019
=======
        application = (KaikiliApplication) getApplicationContext();
>>>>>>> 2/2/2019
=======
        application = (KaikiliApplication) getApplicationContext();
>>>>>>> 2/9/2019
=======
        application = (KaikiliApplication) getApplicationContext();
>>>>>>> 2/14/2019
=======
        application = (KaikiliApplication) getApplicationContext();
>>>>>>> 2/15/2019
=======
        application = (KaikiliApplication) getApplicationContext();
>>>>>>> 2/16/2019
        preferences = application.getSharedPreferences();

        top_title.setText( "Terms and Conditions" );
        top_back.setOnClickListener( this );
        terms_next.setOnClickListener( this );
        terms_tv_message.setMovementMethod(LinkMovementMethod.getInstance());

        String messag = "By tapping arrow below you agree to the Kaikili terms of use and acknowledge that you have read the privacy policy. \n\nTo learn more, see out Terms & Conditions and Privacy Policy.";
        SpannableStringBuilder ssBuilder = new SpannableStringBuilder(messag);

        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(View view) {
                Toast.makeText(TermsConditionsActivity.this, "Terms & Conditions and Privacy Policy", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void updateDrawState(TextPaint ds) {
                super.updateDrawState(ds);
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
                int color = ContextCompat.getColor(TermsConditionsActivity.this, R.color.colorPrimary);
=======
                int color = ContextCompat.getColor(TermsConditionsActivity.this, R.color.black_87);
>>>>>>> 2/2/2019
=======
                int color = ContextCompat.getColor(TermsConditionsActivity.this, R.color.black_87);
>>>>>>> 2/9/2019
=======
                int color = ContextCompat.getColor(TermsConditionsActivity.this, R.color.black_87);
>>>>>>> 2/14/2019
=======
                int color = ContextCompat.getColor(TermsConditionsActivity.this, R.color.black_87);
>>>>>>> 2/15/2019
=======
                int color = ContextCompat.getColor(TermsConditionsActivity.this, R.color.black_87);
>>>>>>> 2/16/2019
                ds.setColor(color);
                ds.setUnderlineText(false);
            }
        };
// apply the clickable text to the span
        ssBuilder.setSpan(
                clickableSpan, // span to add
                messag.indexOf("Terms"), // start of the span (inclusive)
                messag.indexOf("Terms") + String.valueOf("Terms & Conditions and Privacy Policy").length(), // end of the span (exclusive)
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE // do not extend the span when text add later
        );

        // bold
        ssBuilder.setSpan(
                new ForegroundColorSpan(Color.BLUE),
                messag.indexOf("Terms"), // start of the span (inclusive)
                messag.indexOf("Terms") + String.valueOf("Terms & Conditions and Privacy Policy").length(), // end of the span (exclusive)
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        );
        terms_tv_message.setText(ssBuilder);


    }


    @Override
    public void onClick(View view) {

        if(view == top_back){
            finish();
        }else if(view == terms_next) {
            finish();
        }
    }
}
