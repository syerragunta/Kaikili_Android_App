package com.sit.kaikiliService.activity;

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
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.gson.Gson;
import com.sit.kaikiliService.KaikiliApplication;
import com.sit.kaikiliService.R;
import com.sit.kaikiliService.api.Apiresponse;
import com.sit.kaikiliService.api.BankInfo;
import com.sit.kaikiliService.api.GetAllBankInfoAPI;
import com.sit.kaikiliService.api.WebApi;
import com.sit.kaikiliService.api.WebUtil;
import com.sit.kaikiliService.comman.Util;
import com.sit.kaikiliService.font.EditTextEupheminUCASRegular;
import com.sit.kaikiliService.font.TextViewEuphemiaUCASRegular;
import com.vinaygaba.creditcardview.CardType;
import com.vinaygaba.creditcardview.CreditCardView;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.Bind;
import butterknife.ButterKnife;


/**
 * Created by ketan patel on 26/1/2019.
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
 */

public class BankViewDetailsActivity extends BaseActivity implements View.OnClickListener {

    @Bind(R.id.top_back)
    ImageView top_back;
    @Bind(R.id.top_title)
    TextViewEuphemiaUCASRegular top_title;

    @Bind(R.id.bank_info_creditCardView)
    CreditCardView bank_info_creditCardView;
    @Bind(R.id.bank_info_tv_setAsDefault)
    TextViewEuphemiaUCASRegular bank_info_tv_setAsDefault;
    @Bind(R.id.bank_info_tv_deletCard)
    TextViewEuphemiaUCASRegular bank_info_tv_deletCard;


    private KaikiliApplication application;
    private SharedPreferences preferences;
    private BankInfo bankInfo;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_view_bank_details );
        ButterKnife.bind( this, this );

        application = (KaikiliApplication) getApplicationContext();
        preferences = application.getSharedPreferences();

        top_title.setText( "Bank Details" );
        top_back.setOnClickListener( this );

        bankInfo = (BankInfo) getIntent().getSerializableExtra( "bankInfo" );

        bank_info_creditCardView.setIsEditable( false );
        bank_info_creditCardView.setCardName( bankInfo.getCard_holder_name() );
        bank_info_creditCardView.setCardNumber( "XXXX XXXX XXXX " + bankInfo.getCard_no().substring( (bankInfo.getCard_no().length() - 4), bankInfo.getCard_no().length() ) );
        bank_info_creditCardView.setExpiryDate( bankInfo.getMonth() + "/" + bankInfo.getYear() );

        bank_info_creditCardView.setType( CardType.VISA / CardType.MASTERCARD / CardType.AMERICAN_EXPRESS / CardType.DISCOVER / CardType.AUTO );

        bank_info_tv_setAsDefault.setOnClickListener( this );
        bank_info_tv_deletCard.setOnClickListener( this );

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
        if(Boolean.parseBoolean(bankInfo.getIsUsed())){
            bank_info_tv_setAsDefault.setVisibility( View.GONE );
            bank_info_tv_deletCard.setVisibility( View.GONE );
        }
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/23/2019
=======
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
    }


    @Override
    public void onClick(View view) {

        if (view == top_back) {
            finish();
        } else if (view == bank_info_tv_deletCard) {
            new DeleteBankInfoTask( this, 1 ).execute();
        } else if (view == bank_info_tv_setAsDefault) {
            new DeleteBankInfoTask( this, 2 ).execute();
        }
    }

    public class DeleteBankInfoTask extends AsyncTask<Void, Void, String> {

        private ProgressDialog mDialog = null;
        private Activity mActivity;
        private int post;


        public DeleteBankInfoTask(Activity activity, int post) {
            mActivity = activity;
            this.post = post;
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
<<<<<<< HEAD
                jsonObject.put( "sp_id", bankInfo.getSp_id() );
=======
                jsonObject.put( "sp_id",  preferences.getString( "sp_id","") );
>>>>>>> 2/23/2019
=======
                jsonObject.put( "sp_id",  preferences.getString( "sp_id","") );
>>>>>>> 2/25/2019
=======
                jsonObject.put( "sp_id",  preferences.getString( "sp_id","") );
>>>>>>> 2/26/2019
=======
                jsonObject.put( "sp_id",  preferences.getString( "sp_id","") );
>>>>>>> 2/27/2019
                jsonObject.put( "id", bankInfo.get_id() );
                Log.e( "--------------Post", jsonObject.toString() );
                if (post == 1) {
                    String response = new WebUtil().postMethod( jsonObject.toString(), WebApi.URL_DELETE_BANK_INFO );
                    return response;
                } else {
                    String response = new WebUtil().postMethod( jsonObject.toString(), WebApi.URL_SET_DEFAULT_BANK_INFO );
                    return response;
                }
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
                if (post == 1) {
                    finish();
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
                }else {
                        bank_info_tv_setAsDefault.setVisibility( View.GONE );
                        bank_info_tv_deletCard.setVisibility( View.GONE );
>>>>>>> 2/23/2019
=======
                }else {
                        bank_info_tv_setAsDefault.setVisibility( View.GONE );
                        bank_info_tv_deletCard.setVisibility( View.GONE );
>>>>>>> 2/25/2019
=======
                }else {
                        bank_info_tv_setAsDefault.setVisibility( View.GONE );
                        bank_info_tv_deletCard.setVisibility( View.GONE );
>>>>>>> 2/26/2019
=======
                }else {
                        bank_info_tv_setAsDefault.setVisibility( View.GONE );
                        bank_info_tv_deletCard.setVisibility( View.GONE );
>>>>>>> 2/27/2019
                }
            } else {
                Toast.makeText( mActivity, apiresponse.getMessage(), Toast.LENGTH_SHORT ).show();
            }
        }
    }


}
