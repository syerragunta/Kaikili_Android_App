package com.sit.kaikiliService.activity;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import android.app.DatePickerDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import android.support.annotation.Nullable;
=======
>>>>>>> 2/1/2019
=======
>>>>>>> 2/2/2019
=======
>>>>>>> 2/9/2019
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.ImageView;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import com.sit.kaikiliService.KetanApplication;
import com.sit.kaikiliService.R;
import com.sit.kaikiliService.activity.BaseActivity;
import com.sit.kaikiliService.activity.PhoneNoValidationActivity;
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
=======
>>>>>>> 2/15/2019
=======
>>>>>>> 2/16/2019
=======
>>>>>>> 2/16/2019 V1
=======
>>>>>>> 2/16/2019 V2
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
import com.sit.kaikiliService.api.Apiresponse;
import com.sit.kaikiliService.api.WebApi;
import com.sit.kaikiliService.api.WebUtil;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/14/2019
=======
>>>>>>> 2/15/2019
=======
>>>>>>> 2/16/2019
=======
>>>>>>> 2/16/2019 V1
=======
>>>>>>> 2/16/2019 V2
import com.sit.kaikiliService.comman.BetterSpinner;
import com.sit.kaikiliService.comman.Util;
import com.sit.kaikiliService.font.EditTextEupheminUCASRegular;
import com.sit.kaikiliService.font.TextViewEuphemiaUCASRegular;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
import org.json.JSONArray;
import org.json.JSONObject;

>>>>>>> 2/14/2019
=======
import org.json.JSONArray;
import org.json.JSONObject;

>>>>>>> 2/15/2019
=======
import org.json.JSONArray;
import org.json.JSONObject;

>>>>>>> 2/16/2019
=======
import org.json.JSONArray;
import org.json.JSONObject;

>>>>>>> 2/16/2019 V1
=======
import org.json.JSONArray;
import org.json.JSONObject;

>>>>>>> 2/16/2019 V2
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;


/**
 * Created by ketan patel on 22/1/2019.
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
 */

public class PersonalInformationActivity extends BaseActivity implements View.OnClickListener {

    @Bind(R.id.top_back)
    ImageView top_back;
    @Bind(R.id.top_title)
    TextViewEuphemiaUCASRegular top_title;
    @Bind(R.id.personal_info_edit_first)
    EditTextEupheminUCASRegular personal_info_edit_first;
    @Bind(R.id.personal_info_edit_last)
    EditTextEupheminUCASRegular personal_info_edit_last;
    @Bind(R.id.personal_info_edit_email)
    EditTextEupheminUCASRegular personal_info_edit_email;
    @Bind(R.id.personal_info_edit_dob)
    EditTextEupheminUCASRegular personal_info_edit_dob;
    @Bind(R.id.personal_info_bs_gender)
    BetterSpinner personal_info_bs_gender;

    @Bind(R.id.personal_info_fb_next)
    FloatingActionButton personal_info_fb_next;

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
    private SharedPreferences preferences;

    private Calendar calendar;
    private int year, month, day;

    private String from = null;

    String date;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_personal_information );
        ButterKnife.bind( this, this );

<<<<<<< HEAD
<<<<<<< HEAD
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
=======
        application = (KaikiliApplication) getApplicationContext();
>>>>>>> 2/16/2019 V1
=======
        application = (KaikiliApplication) getApplicationContext();
>>>>>>> 2/16/2019 V2
        preferences = application.getSharedPreferences();

        top_title.setText( "Enter Personal Information" );

        calendar = Calendar.getInstance();
        year = calendar.get( Calendar.YEAR );
        month = calendar.get( Calendar.MONTH );
        day = calendar.get( Calendar.DAY_OF_MONTH );


        top_back.setOnClickListener( this );
        personal_info_fb_next.setOnClickListener( this );
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        personal_info_edit_dob.setOnClickListener( this );
=======
//        personal_info_edit_dob.setOnClickListener( this );
>>>>>>> 2/2/2019
=======
//        personal_info_edit_dob.setOnClickListener( this );
>>>>>>> 2/9/2019
=======
//        personal_info_edit_dob.setOnClickListener( this );
>>>>>>> 2/14/2019
=======
//        personal_info_edit_dob.setOnClickListener( this );
>>>>>>> 2/15/2019
=======
//        personal_info_edit_dob.setOnClickListener( this );
>>>>>>> 2/16/2019
=======
//        personal_info_edit_dob.setOnClickListener( this );
>>>>>>> 2/16/2019 V1
=======
//        personal_info_edit_dob.setOnClickListener( this );
>>>>>>> 2/16/2019 V2

        List<String> nameList = new ArrayList<>();
        nameList.add( "Male" );
        nameList.add( "Female " );

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_dropdown_item,
                nameList );

        personal_info_bs_gender.setAdapter( arrayAdapter );

    }


    private DatePickerDialog.OnDateSetListener myDateListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker arg0, int arg1, int arg2, int arg3) {
            // arg1 = year
            // arg2 = month
            // arg3 = daya
            showDate( arg1, arg2 + 1, arg3 );
        }
    };

    public void showDate(int year, int month, int day) {

        date = year + "-" + month + "-" + day;
        personal_info_edit_dob.setText( Util.getDateWithFormate( date, "yyyy-MM-dd", "MM/dd/yyyy" ) );
    }


    @Override
    public void onClick(View view) {

        if (view == top_back) {
            finish();
        } else if (view == personal_info_fb_next) {

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
            Intent intent = new Intent( this, TermsConditionsActivity.class );
            startActivity( intent );
            finish();
=======
=======
>>>>>>> 2/15/2019
=======
>>>>>>> 2/16/2019
=======
>>>>>>> 2/16/2019 V1
=======
>>>>>>> 2/16/2019 V2
            if (isValidData()) {
                savedata();
            }

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/14/2019
=======
>>>>>>> 2/15/2019
=======
>>>>>>> 2/16/2019
=======
>>>>>>> 2/16/2019 V1
=======
>>>>>>> 2/16/2019 V2
        } else if (view == personal_info_edit_dob) {
            DatePickerDialog datePickerDialog = new DatePickerDialog( this, myDateListener, year, month, day );
            //datePickerDialog.getDatePicker().setMaxDate(new Date().getTime());
//                if (PreferenceHelper.getInstance(mainActivity).getString(Common.LOGIN_GENDER).equals("Female")) {
            datePickerDialog.getDatePicker().setMaxDate( (long) (System.currentTimeMillis() - 5.676e+11) );
//                } else {
//                    datePickerDialog.getDatePicker().setMaxDate((long) (System.currentTimeMillis() - 6.623e+11));
//                }
            datePickerDialog.show();
            datePickerDialog.getButton( DatePickerDialog.BUTTON_NEGATIVE ).setTextColor( Color.RED );
            datePickerDialog.getButton( DatePickerDialog.BUTTON_POSITIVE ).setTextColor( Color.RED );
        }
    }
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 2/15/2019
=======
>>>>>>> 2/16/2019
=======
>>>>>>> 2/16/2019 V1
=======
>>>>>>> 2/16/2019 V2

    private boolean isValidData() {
        if (!Util.isNotEmpaty( personal_info_edit_first.getText().toString() )) {
            Toast.makeText( this, "Please enter valid first name.", Toast.LENGTH_SHORT ).show();
            return false;
        } else if (!Util.isNotEmpaty( personal_info_edit_last.getText().toString() )) {
            Toast.makeText( this, "Please enter valid last name.", Toast.LENGTH_SHORT ).show();
            return false;
        } else if (!Util.isEmailValid( personal_info_edit_email.getText().toString() )) {
            Toast.makeText( this, "Please enter valid email id.", Toast.LENGTH_SHORT ).show();
            return false;
        } else if (!Util.isDateValid( personal_info_edit_dob.getText().toString() )) {
            Toast.makeText( this, "Please enter valid dob.", Toast.LENGTH_SHORT ).show();
            return false;
        } else if (!Util.isNotEmpaty( personal_info_bs_gender.getText().toString() )) {
            Toast.makeText( this, "Please select gender.", Toast.LENGTH_SHORT ).show();
            return false;
        }else {
            return true;
        }
    }

    private void savedata() {

        try {

            JSONObject jsonObject = new JSONObject();
            jsonObject.put( "sp_id", "SP00001" );
            jsonObject.put( "first_name", personal_info_edit_first.getText().toString() );
            jsonObject.put( "last_name",  personal_info_edit_last.getText().toString() );
            jsonObject.put( "email",personal_info_edit_email.getText().toString()  );
            jsonObject.put( "dob",  personal_info_edit_dob.getText().toString());
            jsonObject.put( "gender", personal_info_bs_gender.getText().toString());
            jsonObject.put( "mobile_no", "");

            Log.e( "--------Post",jsonObject.toString());
            new PostApiTask( this, jsonObject.toString() ).execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public class PostApiTask extends AsyncTask<Void, Void, String> {

        private ProgressDialog mDialog = null;
        private Activity mActivity;
        private String body;


        public PostApiTask(Activity activity, String body) {
            mActivity = activity;
            this.body = body;
            // TODO Auto-generated constructor stub
        }

        @Override
        protected void onPreExecute() {
            // TODO Auto-generated method stub
            super.onPreExecute();

            mDialog = ProgressDialog.show( mActivity, null, "please_wait.....", true, true );
            mDialog.getWindow().clearFlags( WindowManager.LayoutParams.FLAG_DIM_BEHIND );
            mDialog.setCanceledOnTouchOutside( false );
        }

        @Override
        protected String doInBackground(Void... params) {
            // TODO Auto-generated method stub

            // String response = new WebUtil().postMethod("VirtualNumber=011-392-37960&Number="+mobileNo+"&Language=en", "https://api.exotel.com/v1/Accounts/vivervatechnology/CustomerWhitelist/");
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
            String response = new WebUtil().postMethod( body, WebApi.URL_ADD_NEW_USER );
=======
            String response = new WebUtil().postMethod( body, WebApi.URL_ADD_SERVICE_TEST );
>>>>>>> 2/15/2019
=======
            String response = new WebUtil().postMethod( body, WebApi.URL_ADD_SERVICE_TEST );
>>>>>>> 2/16/2019
=======
            String response = new WebUtil().postMethod( body, WebApi.URL_ADD_SERVICE_TEST );
>>>>>>> 2/16/2019 V1
=======
            String response = new WebUtil().postMethod( body, WebApi.URL_ADD_SERVICE_TEST );
>>>>>>> 2/16/2019 V2
            return response;
        }

        @Override
        protected void onPostExecute(String response) {
            // TODO Auto-generated method stub
            super.onPostExecute( response );
            if (mDialog.isShowing()) {
                mDialog.dismiss();
            }

            Gson gson = new Gson(); // Or use new GsonBuilder().create();
            Apiresponse target2 = gson.fromJson( response, Apiresponse.class );

            if (target2 != null) {
                if (target2.getStatus() == 1) {
                    Toast.makeText( mActivity, target2.getMessage(), Toast.LENGTH_SHORT ).show();
                    Intent intent = new Intent( mActivity, TermsConditionsActivity.class );
                    mActivity.startActivity( intent );
                    mActivity.finish();

                } else {
                    Toast.makeText( mActivity, target2.getMessage(), Toast.LENGTH_SHORT ).show();
                }
            }

        }
    }
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/14/2019
=======
>>>>>>> 2/15/2019
=======
>>>>>>> 2/16/2019
=======
>>>>>>> 2/16/2019 V1
=======
>>>>>>> 2/16/2019 V2
}
