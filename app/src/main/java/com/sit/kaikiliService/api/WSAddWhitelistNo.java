package com.sit.kaikiliService.api;

import android.app.Activity;
import android.os.AsyncTask;
import android.util.Log;

/**
 * Created by ketan patel on 27/8/2018.
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
 */

public class WSAddWhitelistNo {


   private Activity context;
   private String mobileNo;

    public WSAddWhitelistNo(Activity context, String mobileNo) {
        this.context = context;
        this.mobileNo = mobileNo;

        new PostApiTask(context).execute();

    }

    public class PostApiTask extends AsyncTask<Void, Void, String> {

//        private ProgressDialog mDialog = null;
        private Activity mActivity;


        public PostApiTask(Activity activity) {
            mActivity = activity;
            // TODO Auto-generated constructor stub
        }

        @Override
        protected void onPreExecute() {
            // TODO Auto-generated method stub
            super.onPreExecute();

//            mDialog = ProgressDialog.show(mActivity, null, "please_wait.....", true, true);
//            mDialog.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
//            mDialog.setCanceledOnTouchOutside(false);

        }


        @Override
        protected String doInBackground(Void... params) {
            // TODO Auto-generated method stub

            Log.e("-------  TAG", "Set Data -----" + "VirtualNumber=011-411-70344&Number="+mobileNo+"&Language=en");

           // String response = new WebUtil().postMethod("VirtualNumber=011-392-37960&Number="+mobileNo+"&Language=en", "https://api.exotel.com/v1/Accounts/vivervatechnology/CustomerWhitelist/");
            String response = new WebUtil().postMethod("VirtualNumber=011-411-70344&Number="+mobileNo+"&Language=en", "https://api.exotel.com/v1/Accounts/vivervatechnology/CustomerWhitelist/");
            return response;
        }

        @Override
        protected void onPostExecute(String response) {
            // TODO Auto-generated method stub
            super.onPostExecute(response);
//            if (mDialog.isShowing()) {
//                mDialog.dismiss();
//            }

//            Toast.makeText( mActivity ,response,Toast.LENGTH_SHORT).show();
            Log.e("-------  TAG", "********************** Completed Task *************" + response);
        }
    }



}
