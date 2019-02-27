package com.sit.kaikiliService.activity;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
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
import com.sit.kaikiliService.KetanApplication;
import com.sit.kaikiliService.R;
import com.sit.kaikiliService.font.CreditCardEditText;
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
=======
import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
>>>>>>> 2/16/2019 V1
=======
import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
>>>>>>> 2/16/2019 V2
=======
import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
>>>>>>> 2/16/2019
=======
import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
>>>>>>> 2/18/2019
=======
import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
>>>>>>> 2/21/2019
import com.sit.kaikiliService.font.EditTextEupheminUCASRegular;
import com.sit.kaikiliService.font.TextViewEuphemiaUCASRegular;

=======
=======
>>>>>>> 2/23/2019
=======
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
import com.sit.kaikiliService.api.Apiresponse;
import com.sit.kaikiliService.api.WebApi;
import com.sit.kaikiliService.api.WebUtil;
import com.sit.kaikiliService.comman.Util;
import com.sit.kaikiliService.font.EditTextEupheminUCASRegular;
import com.sit.kaikiliService.font.TextViewEuphemiaUCASRegular;

import org.json.JSONException;
import org.json.JSONObject;

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
import butterknife.Bind;
import butterknife.ButterKnife;


/**
 * Created by ketan patel on 26/1/2019.
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
 */

public class AddBankDetailsActivity extends BaseActivity implements View.OnClickListener {

    @Bind(R.id.top_back)
    ImageView top_back;
    @Bind(R.id.top_title)
    TextViewEuphemiaUCASRegular top_title;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======

>>>>>>> 2/22/2019
=======

>>>>>>> 2/23/2019
=======

>>>>>>> 2/25/2019
=======

>>>>>>> 2/26/2019
    @Bind(R.id.add_card_edit_cardNumbers)
    EditTextEupheminUCASRegular add_card_edit_cardNumbers;
    @Bind(R.id.add_card_edit_date)
    EditTextEupheminUCASRegular add_card_edit_date;
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
    private SharedPreferences preferences;
=======
=======
>>>>>>> 2/23/2019
=======
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
    @Bind(R.id.add_card_edit_holderName)
    EditTextEupheminUCASRegular add_card_edit_holderName;
    @Bind(R.id.add_card_edit_bankName)
    EditTextEupheminUCASRegular add_card_edit_bankName;
    @Bind(R.id.add_card_edit_cvc)
    EditTextEupheminUCASRegular add_card_edit_cvc;
    @Bind(R.id.add_card_fb_next)
    FloatingActionButton add_card_fb_next;


    private KaikiliApplication application;
    private SharedPreferences preferences;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    private String SP_ID = "SP00001";
>>>>>>> 2/22/2019
=======

>>>>>>> 2/23/2019
=======

>>>>>>> 2/25/2019
=======

>>>>>>> 2/26/2019


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_add_bank_details );
        ButterKnife.bind( this, this );

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
=======
        application = (KaikiliApplication) getApplicationContext();
>>>>>>> 2/16/2019
=======
        application = (KaikiliApplication) getApplicationContext();
>>>>>>> 2/18/2019
=======
        application = (KaikiliApplication) getApplicationContext();
>>>>>>> 2/21/2019
=======
        application = (KaikiliApplication) getApplicationContext();
>>>>>>> 2/22/2019
        preferences = application.getSharedPreferences();

        top_title.setText( "Add Bank Details" );

        top_back.setOnClickListener( this );
<<<<<<< HEAD
=======
        add_card_fb_next.setOnClickListener( this );
>>>>>>> 2/22/2019
=======
=======
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
        application = (KaikiliApplication) getApplicationContext();
        preferences = application.getSharedPreferences();



        top_title.setText( "Add Bank Details" );

        top_back.setOnClickListener( this );
        add_card_fb_next.setOnClickListener( this );
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/23/2019
=======
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
        add_card_edit_cardNumbers.addTextChangedListener( new CreditCardNumberFormattingTextWatcher() );
        add_card_edit_date.addTextChangedListener( new DateAndYearFormattingTextWatcher() );

    }

    public static class CreditCardNumberFormattingTextWatcher implements TextWatcher {
        private static final char space = '-';

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void afterTextChanged(Editable s) {

            if (s.length() > 0 && (s.length() % 5) == 0) {
                final char c = s.charAt( s.length() - 1 );
                if (space == c) {
                    s.delete( s.length() - 1, s.length() );
                }
            }
            // Insert char where needed.
            if (s.length() > 0 && (s.length() % 5) == 0) {
                char c = s.charAt( s.length() - 1 );
                // Only if its a digit where there should be a space we insert a space
                if (Character.isDigit( c ) && TextUtils.split( s.toString(), String.valueOf( space ) ).length <= 3) {
                    s.insert( s.length() - 1, String.valueOf( space ) );
                }

            }
        }
    }

    public static class DateAndYearFormattingTextWatcher implements TextWatcher {

        private static final char space = '/';

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void afterTextChanged(Editable s) {
            if (s.length() > 0 && (s.length() % 3) == 0) {
                final char c = s.charAt( s.length() - 1 );
                if (space == c) {
                    s.delete( s.length() - 1, s.length() );
                }
            }
            // Insert char where needed.
            if (s.length() > 0 && (s.length() % 3) == 0) {
                char c = s.charAt( s.length() - 1 );
                // Only if its a digit where there should be a space we insert a space
                if (Character.isDigit( c ) && TextUtils.split( s.toString(), String.valueOf( space ) ).length <= 3) {
                    s.insert( s.length() - 1, String.valueOf( space ) );
                }
            }
        }
    }


    @Override
    public void onClick(View view) {

        if (view == top_back) {
            finish();
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
//        } else if (view == background_form_tv_submit) {
//            finish();
        }
    }
=======
=======
>>>>>>> 2/23/2019
=======
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
        } else if (view == add_card_fb_next) {
            if (validaInfo()) {
              new AddBankInfoTask(this).execute( );
            }
        }
    }

    private boolean validaInfo() {
        if (!Util.isNotEmpaty( add_card_edit_cardNumbers.getText().toString() )) {
            Toast.makeText( this, "Pleas enter valid card numbers", Toast.LENGTH_SHORT ).show();
            return false;
        } else if (!Util.isNotEmpaty( add_card_edit_date.getText().toString() )) {
            Toast.makeText( this, "Pleas enter valid date & year", Toast.LENGTH_SHORT ).show();
            return false;
        } else if (!Util.isNotEmpaty( add_card_edit_holderName.getText().toString() )) {
            Toast.makeText( this, "Pleas enter valid bank holder name", Toast.LENGTH_SHORT ).show();
            return false;
        } else if (!Util.isNotEmpaty( add_card_edit_bankName.getText().toString() )) {
            Toast.makeText( this, "Pleas enter valid bank name", Toast.LENGTH_SHORT ).show();
            return false;
        } else if (!Util.isNotEmpaty( add_card_edit_cvc.getText().toString() )) {
            Toast.makeText( this, "Pleas enter valid cvc no.", Toast.LENGTH_SHORT ).show();
            return false;
        } else if (add_card_edit_date.getText().toString().trim().length() < 5) {
            Toast.makeText( this, "Pleas enter valid date & year", Toast.LENGTH_SHORT ).show();
            return false;
        } else if (add_card_edit_cardNumbers.getText().toString().trim().length() < 19) {
            Toast.makeText( this, "Pleas enter valid card numbers", Toast.LENGTH_SHORT ).show();
            return false;
        } else if (add_card_edit_cvc.getText().toString().trim().length() < 3) {
            Toast.makeText( this, "Pleas enter valid cvc no", Toast.LENGTH_SHORT ).show();
            return false;
        }else {
            return true;
        }

    }

    public class AddBankInfoTask extends AsyncTask<Void, Void, String> {

        private ProgressDialog mDialog = null;
        private Activity mActivity;


        public AddBankInfoTask(Activity activity) {
            mActivity = activity;

            // TODO Auto-generated constructor stub
        }

        @Override
        protected void onPreExecute() {
            // TODO Auto-generated method stub
            super.onPreExecute();

            mDialog = ProgressDialog.show( mActivity, null, "Please wait....", true, true );
            mDialog.getWindow().clearFlags( WindowManager.LayoutParams.FLAG_DIM_BEHIND );
            mDialog.setCanceledOnTouchOutside( false );
        }

        @Override
        protected String doInBackground(Void... params) {
            // TODO Auto-generated method stub
            try {

                JSONObject jsonObject = new JSONObject();
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
                jsonObject.put( "sp_id", SP_ID);
                jsonObject.put( "card_no", add_card_edit_cardNumbers.getText().toString() );
                jsonObject.put( "bank_name", add_card_edit_bankName.getText().toString());
                jsonObject.put( "card_holder_name", add_card_edit_bankName.getText().toString() );
=======
=======
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
                jsonObject.put( "sp_id", preferences.getString( "sp_id",""));
                jsonObject.put( "card_no", add_card_edit_cardNumbers.getText().toString() );
                jsonObject.put( "bank_name", add_card_edit_bankName.getText().toString());
                jsonObject.put( "card_holder_name", add_card_edit_holderName.getText().toString() );
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/23/2019
=======
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
                jsonObject.put( "month", add_card_edit_date.getText().toString().substring( 0,2 ) );
                jsonObject.put( "year", "20"+add_card_edit_date.getText().toString().substring(add_card_edit_date.getText().length()-2 ,add_card_edit_date.getText().length() ) );
                jsonObject.put( "cvc", add_card_edit_cvc.getText().toString().trim() );
                Log.e( "--------------Post", jsonObject.toString() );
                String response = new WebUtil().postMethod( jsonObject.toString(), WebApi.URL_ADD_BANK_INFO );
                return response;
            } catch (JSONException e) {
                e.printStackTrace();
                return "";
            }
        }

        @Override
        protected void onPostExecute(String response) {
            // TODO Auto-generated method stub
            super.onPostExecute( response );
            if (mDialog.isShowing()) {
                mDialog.dismiss();
            }

            Log.e( "------- Response ", "-------------" + response );
            Gson gson = new Gson(); // Or use new GsonBuilder().create();
            Apiresponse apiresponse = gson.fromJson( response, Apiresponse.class );

            if (apiresponse.getStatus() == 1) {
                Toast.makeText( mActivity, apiresponse.getMessage(), Toast.LENGTH_SHORT ).show();
                finish();
            } else {
                Toast.makeText( mActivity, apiresponse.getMessage(), Toast.LENGTH_SHORT ).show();
            }
        }
    }

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
}
