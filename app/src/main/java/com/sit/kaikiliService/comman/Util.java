package com.sit.kaikiliService.comman;


import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.NotificationManager;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.media.ExifInterface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

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
=======
import com.sit.kaikiliService.KaikiliApplication;
>>>>>>> 2/23/2019
=======
import com.sit.kaikiliService.KaikiliApplication;
>>>>>>> 2/25/2019
=======
import com.sit.kaikiliService.KaikiliApplication;
>>>>>>> 2/26/2019
=======
import com.sit.kaikiliService.KaikiliApplication;
>>>>>>> 2/27/2019
=======
import com.sit.kaikiliService.KaikiliApplication;
>>>>>>> 2/28/2019
import com.sit.kaikiliService.R;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URLDecoder;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Created by ketan patel on 21/1/2019.
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
 *
 */



public class Util {

	public static String gcmId = "";
	public static String projectGCMiD;
	public static String DATEFORMAT = "yyyy-MM-dd HH:mm";
=======
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
 */


public class Util {

    public static String gcmId = "";
    public static String projectGCMiD;
    public static String DATEFORMAT = "yyyy-MM-dd HH:mm aa";
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
    private static ProgressDialog mProgressDialog;
    private static Dialog mDialog;
    private static OnProgressCancelListener progressCancelListener;
    public static final int PROFILE_CAMERA_IMAGE = 101, PROFILE_GALLERY_IMAGE = 102;


<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD


    public static void displayDialog(String title, String msg, final Context context, final boolean isFinsActivity) {

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
        KetanApplication application = (KetanApplication)context.getApplicationContext();
=======
        KaikiliApplication application = (KaikiliApplication)context.getApplicationContext();
>>>>>>> 2/1/2019
=======
        KaikiliApplication application = (KaikiliApplication)context.getApplicationContext();
>>>>>>> 2/2/2019
=======
        KaikiliApplication application = (KaikiliApplication)context.getApplicationContext();
>>>>>>> 2/9/2019
=======
        KaikiliApplication application = (KaikiliApplication)context.getApplicationContext();
>>>>>>> 2/14/2019
=======
        KaikiliApplication application = (KaikiliApplication)context.getApplicationContext();
>>>>>>> 2/15/2019
=======
        KaikiliApplication application = (KaikiliApplication)context.getApplicationContext();
>>>>>>> 2/16/2019
=======
        KaikiliApplication application = (KaikiliApplication)context.getApplicationContext();
>>>>>>> 2/16/2019 V1
=======
        KaikiliApplication application = (KaikiliApplication)context.getApplicationContext();
>>>>>>> 2/16/2019 V2
=======
        KaikiliApplication application = (KaikiliApplication)context.getApplicationContext();
>>>>>>> 2/16/2019
=======
        KaikiliApplication application = (KaikiliApplication)context.getApplicationContext();
>>>>>>> 2/18/2019
=======
        KaikiliApplication application = (KaikiliApplication)context.getApplicationContext();
>>>>>>> 2/21/2019
=======
        KaikiliApplication application = (KaikiliApplication)context.getApplicationContext();
>>>>>>> 2/22/2019
=======
        KaikiliApplication application = (KaikiliApplication)context.getApplicationContext();
>>>>>>> 2/23/2019
=======
    public static void displayDialog(String title, String msg, final Context context, final boolean isFinsActivity) {

        KaikiliApplication application = (KaikiliApplication) context.getApplicationContext();
>>>>>>> 2/25/2019
=======
    public static void displayDialog(String title, String msg, final Context context, final boolean isFinsActivity) {

        KaikiliApplication application = (KaikiliApplication) context.getApplicationContext();
>>>>>>> 2/26/2019
=======
    public static void displayDialog(String title, String msg, final Context context, final boolean isFinsActivity) {

        KaikiliApplication application = (KaikiliApplication) context.getApplicationContext();
>>>>>>> 2/27/2019
=======
    public static void displayDialog(String title, String msg, final Context context, final boolean isFinsActivity) {

        KaikiliApplication application = (KaikiliApplication) context.getApplicationContext();
>>>>>>> 2/28/2019
        SharedPreferences preferences = application.getSharedPreferences();


        AlertDialog.Builder builder;


<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        builder = new AlertDialog.Builder(context);
        builder.setTitle(title);
                    //Setting message manually and performing action on button click
        builder.setMessage(msg)
                .setCancelable(false)
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
=======
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
        builder = new AlertDialog.Builder( context );
        builder.setTitle( title );
        //Setting message manually and performing action on button click
        builder.setMessage( msg )
                .setCancelable( false )
                .setPositiveButton( "Ok", new DialogInterface.OnClickListener() {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                        if (isFinsActivity) {
                            ((Activity) context).finish();
                        }

                    }
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
                });
=======
                } );
>>>>>>> 2/25/2019
=======
                } );
>>>>>>> 2/26/2019
=======
                } );
>>>>>>> 2/27/2019
=======
                } );
>>>>>>> 2/28/2019

        //Creating dialog box
        AlertDialog alert = builder.create();
        //Setting the title manually
        alert.show();
        if (!((Activity) context).isFinishing()) {
            if (!alert.isShowing()) {
                alert.show();
            }
        }
    }


    public static int getScreenWidth(Context ctx) {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        WindowManager wm = (WindowManager) ctx.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics dm = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(dm);
=======
        WindowManager wm = (WindowManager) ctx.getSystemService( Context.WINDOW_SERVICE );
        DisplayMetrics dm = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics( dm );
>>>>>>> 2/25/2019
=======
        WindowManager wm = (WindowManager) ctx.getSystemService( Context.WINDOW_SERVICE );
        DisplayMetrics dm = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics( dm );
>>>>>>> 2/26/2019
=======
        WindowManager wm = (WindowManager) ctx.getSystemService( Context.WINDOW_SERVICE );
        DisplayMetrics dm = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics( dm );
>>>>>>> 2/27/2019
=======
        WindowManager wm = (WindowManager) ctx.getSystemService( Context.WINDOW_SERVICE );
        DisplayMetrics dm = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics( dm );
>>>>>>> 2/28/2019
        return dm.widthPixels;
    }


    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }


<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD

    public static String setPadding(int data) {
		String result = "";
		if (data < 10)
			result = "0" + data;
		else
			result = String.valueOf(data);
		return result;
	}

	public static int getIndex(Spinner spinner, String myString) {
		int index = 0;

		for (int i = 0; i < spinner.getCount(); i++) {
			if (spinner.getItemAtPosition(i).equals(myString)) {
				index = i;
			}
		}
		return index;
	}

	public static Date addDays(Date date, int days) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, days); // minus number would decrement the days
		return cal.getTime();
	}

	public static String changeDateFormat(String OLD_PATTERN, String NEW_PATTERN, String date) {

		SimpleDateFormat sdf = new SimpleDateFormat();
		String newDate = "";
		try {
			sdf.applyPattern(OLD_PATTERN);
			Date d = sdf.parse(date);
			sdf.applyPattern(NEW_PATTERN);
			newDate = sdf.format(d);
		} catch (Exception e) {
		}
		return newDate;
	}

	/**
	 * method is checking is network availability in device
	 * 
	 * @param context
	 * @return
     *
     *
     *
	 */
	public static boolean isNetworkAvailable(Context context) {
		boolean isNetAvailable = false;
		if (context != null) {
			final ConnectivityManager mConnectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

			if (mConnectivityManager != null) {
				boolean mobileNetwork = false;
				boolean wifiNetwork = false;

				boolean mobileNetworkConnecetd = false;
				boolean wifiNetworkConnecetd = false;

				final NetworkInfo mobileInfo = mConnectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
				final NetworkInfo wifiInfo = mConnectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);

				if (mobileInfo != null) {
					mobileNetwork = mobileInfo.isAvailable();
				}

				if (wifiInfo != null) {
					wifiNetwork = wifiInfo.isAvailable();
				}

				if (wifiNetwork || mobileNetwork) {
					if (mobileInfo != null)
						mobileNetworkConnecetd = mobileInfo.isConnectedOrConnecting();
					wifiNetworkConnecetd = wifiInfo.isConnectedOrConnecting();
				}

				isNetAvailable = (mobileNetworkConnecetd || wifiNetworkConnecetd);
			}
		}

		return isNetAvailable;
	}


=======
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
    public static String setPadding(int data) {
        String result = "";
        if (data < 10)
            result = "0" + data;
        else
            result = String.valueOf( data );
        return result;
    }

    public static int getIndex(Spinner spinner, String myString) {
        int index = 0;

        for (int i = 0; i < spinner.getCount(); i++) {
            if (spinner.getItemAtPosition( i ).equals( myString )) {
                index = i;
            }
        }
        return index;
    }

    public static Date addDays(Date date, int days) {
        Calendar cal = Calendar.getInstance();
        cal.setTime( date );
        cal.add( Calendar.DATE, days ); // minus number would decrement the days
        return cal.getTime();
    }

    public static String changeDateFormat(String OLD_PATTERN, String NEW_PATTERN, String date) {

        SimpleDateFormat sdf = new SimpleDateFormat();
        String newDate = "";
        try {
            sdf.applyPattern( OLD_PATTERN );
            Date d = sdf.parse( date );
            sdf.applyPattern( NEW_PATTERN );
            newDate = sdf.format( d );
        } catch (Exception e) {
        }
        return newDate;
    }

    /**
     * method is checking is network availability in device
     *
     * @param context
     * @return
     */
    public static boolean isNetworkAvailable(Context context) {
        boolean isNetAvailable = false;
        if (context != null) {
            final ConnectivityManager mConnectivityManager = (ConnectivityManager) context.getSystemService( Context.CONNECTIVITY_SERVICE );

            if (mConnectivityManager != null) {
                boolean mobileNetwork = false;
                boolean wifiNetwork = false;

                boolean mobileNetworkConnecetd = false;
                boolean wifiNetworkConnecetd = false;

                final NetworkInfo mobileInfo = mConnectivityManager.getNetworkInfo( ConnectivityManager.TYPE_MOBILE );
                final NetworkInfo wifiInfo = mConnectivityManager.getNetworkInfo( ConnectivityManager.TYPE_WIFI );

                if (mobileInfo != null) {
                    mobileNetwork = mobileInfo.isAvailable();
                }

                if (wifiInfo != null) {
                    wifiNetwork = wifiInfo.isAvailable();
                }

                if (wifiNetwork || mobileNetwork) {
                    if (mobileInfo != null)
                        mobileNetworkConnecetd = mobileInfo.isConnectedOrConnecting();
                    wifiNetworkConnecetd = wifiInfo.isConnectedOrConnecting();
                }

                isNetAvailable = (mobileNetworkConnecetd || wifiNetworkConnecetd);
            }
        }

        return isNetAvailable;
    }
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019


    public static Calendar getCalendarData(String date) {

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
		Calendar cal = Calendar.getInstance();

		cal.setFirstDayOfWeek(Calendar.MONDAY);
		cal.set(Integer.parseInt(date.substring(6)), (Integer.parseInt(date.substring(3, 5)) - 1), Integer.parseInt(date.substring(0, 2)));

		return cal;
	}

	/**
	 * Comma replace method
	 * 
	 * @param tempProjectCount
	 * @return
	 */
	public static String newComaReplaceString(String tempProjectCount) {
		// String newString = tempProjectCount.replace(".", ",");
		// return newString;
		return tempProjectCount;
	}
=======
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
        Calendar cal = Calendar.getInstance();

        cal.setFirstDayOfWeek( Calendar.MONDAY );
        cal.set( Integer.parseInt( date.substring( 6 ) ), (Integer.parseInt( date.substring( 3, 5 ) ) - 1), Integer.parseInt( date.substring( 0, 2 ) ) );

        return cal;
    }

    /**
     * Comma replace method
     *
     * @param tempProjectCount
     * @return
     */
    public static String newComaReplaceString(String tempProjectCount) {
        // String newString = tempProjectCount.replace(".", ",");
        // return newString;
        return tempProjectCount;
    }
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019

    public static boolean isLacationValid(String email) {
        boolean isValid = false;

        // String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        // /^[_a-z0-9-]+(\.[_a-z0-9-]+)*@[a-z0-9-]+(\.[a-z0-9-]+)*(\.[a-z]{2,3})$/
        String expression = "[0-9].,";
        CharSequence inputStr = email;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputStr);
=======
        Pattern pattern = Pattern.compile( expression, Pattern.CASE_INSENSITIVE );
        Matcher matcher = pattern.matcher( inputStr );
>>>>>>> 2/25/2019
=======
        Pattern pattern = Pattern.compile( expression, Pattern.CASE_INSENSITIVE );
        Matcher matcher = pattern.matcher( inputStr );
>>>>>>> 2/26/2019
=======
        Pattern pattern = Pattern.compile( expression, Pattern.CASE_INSENSITIVE );
        Matcher matcher = pattern.matcher( inputStr );
>>>>>>> 2/27/2019
=======
        Pattern pattern = Pattern.compile( expression, Pattern.CASE_INSENSITIVE );
        Matcher matcher = pattern.matcher( inputStr );
>>>>>>> 2/28/2019
        if (matcher.matches()) {
            isValid = true;
        }
        return isValid;
    }

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    public boolean isValidLatLng(double lat, double lng){
        if(lat < -90 || lat > 90)
        {
            return false;
        }
        else if(lng < -180 || lng > 180)
        {
=======
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
    public boolean isValidLatLng(double lat, double lng) {
        if (lat < -90 || lat > 90) {
            return false;
        } else if (lng < -180 || lng > 180) {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
            return false;
        }
        return true;
    }


<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
	/**
	 * Function is use for Email Id Valid.
	 * 
	 */

	public static boolean isEmailValid(String email) {
		boolean isValid = false;

		// String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
		// /^[_a-z0-9-]+(\.[_a-z0-9-]+)*@[a-z0-9-]+(\.[a-z0-9-]+)*(\.[a-z]{2,3})$/
		String expression = "[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}";
		CharSequence inputStr = email;

		Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(inputStr);
		if (matcher.matches()) {
			isValid = true;
		}
		return isValid;
	}

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
=======
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
=======
>>>>>>> 2/23/2019
=======
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
    /**
     * Function is use for Email Id Valid.
     */

    public static boolean isEmailValid(String email) {
        boolean isValid = false;

        // String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        // /^[_a-z0-9-]+(\.[_a-z0-9-]+)*@[a-z0-9-]+(\.[a-z0-9-]+)*(\.[a-z]{2,3})$/
        String expression = "[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}";
        CharSequence inputStr = email;

        Pattern pattern = Pattern.compile( expression, Pattern.CASE_INSENSITIVE );
        Matcher matcher = pattern.matcher( inputStr );
        if (matcher.matches()) {
            isValid = true;
        }
        return isValid;
    }

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019

    public static boolean isDateValid(String date) {
        boolean isValid = false;

        // String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        // /^[_a-z0-9-]+(\.[_a-z0-9-]+)*@[a-z0-9-]+(\.[a-z0-9-]+)*(\.[a-z]{2,3})$/
        String expression = "([0-9]{2})/([0-9]{2})/([0-9]{4})";
        CharSequence inputStr = date;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputStr);
=======
        Pattern pattern = Pattern.compile( expression, Pattern.CASE_INSENSITIVE );
        Matcher matcher = pattern.matcher( inputStr );
>>>>>>> 2/25/2019
=======
        Pattern pattern = Pattern.compile( expression, Pattern.CASE_INSENSITIVE );
        Matcher matcher = pattern.matcher( inputStr );
>>>>>>> 2/26/2019
=======
        Pattern pattern = Pattern.compile( expression, Pattern.CASE_INSENSITIVE );
        Matcher matcher = pattern.matcher( inputStr );
>>>>>>> 2/27/2019
=======
        Pattern pattern = Pattern.compile( expression, Pattern.CASE_INSENSITIVE );
        Matcher matcher = pattern.matcher( inputStr );
>>>>>>> 2/28/2019
        if (matcher.matches()) {
            isValid = true;
        }
        return isValid;
    }
//
//    boolean checkFormat;
//
//if (input.matches("([0-9]{2})/([0-9]{2})/([0-9]{4})"))
//    checkFormat=true;
//else
//    checkFormat=false;


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
=======
>>>>>>> 2/23/2019
	public static boolean isNumberValid(String valus) {
		boolean isValid = false;

		// String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
		// /^[_a-z0-9-]+(\.[_a-z0-9-]+)*@[a-z0-9-]+(\.[a-z0-9-]+)*(\.[a-z]{2,3})$/
		String expression = "[0-9]+\\.[0-9]{1,2}";
		CharSequence inputStr = valus;

		Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(inputStr);
		if (matcher.matches()) {
			isValid = true;
		}
		return isValid;
	}

	public static boolean isNotEmpaty(String valus) {
		boolean isValid = false;
		if (valus.trim().toString().length() > 0) {
			isValid = true;
		}
		return isValid;
	}


	public static String setNameToCapital(String name) {
		String tempName = name.trim().substring(0, 1);
		return tempName.toUpperCase() + name.substring(1);
	}

	public static String setZero(int values) {
		String setString = null;
		if (values < 10) {
			setString = "0" + values;
		} else {
			setString = "" + values;
		}

		return setString;
	}



	public static void hideSoftKeyboard(Activity activity) {
		final InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService(Activity.INPUT_METHOD_SERVICE);
		if (inputMethodManager.isActive()) {
			if (activity.getCurrentFocus() != null) {
				inputMethodManager.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
			}
		}
	}

	public static Boolean isVelideDateBoth(String frome, String to) {

		try {
            DateFormat formatter = new SimpleDateFormat(DATEFORMAT);// 2015-02-10 00:00:00 yyyy-MM-dd 00:00:00

            Calendar c = Calendar.getInstance();
            String strCurrent = formatter.format(c.getTime());


            if((formatter.parse(frome)).after(formatter.parse(strCurrent)) && (formatter.parse(to)).after(formatter.parse(frome))){
				return true;
			} else {
				return false;
			}

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}










    public static boolean checkStartDate(String setDate){
=======
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
    public static boolean isNumberValid(String valus) {
        boolean isValid = false;

        // String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        // /^[_a-z0-9-]+(\.[_a-z0-9-]+)*@[a-z0-9-]+(\.[a-z0-9-]+)*(\.[a-z]{2,3})$/
        String expression = "[0-9]+\\.[0-9]{1,2}";
        CharSequence inputStr = valus;

        Pattern pattern = Pattern.compile( expression, Pattern.CASE_INSENSITIVE );
        Matcher matcher = pattern.matcher( inputStr );
        if (matcher.matches()) {
            isValid = true;
        }
        return isValid;
    }

    public static boolean isNotEmpaty(String valus) {
        boolean isValid = false;
        if (valus.trim().toString().length() > 0) {
            isValid = true;
        }
        return isValid;
    }


    public static String setNameToCapital(String name) {
        String tempName = name.trim().substring( 0, 1 );
        return tempName.toUpperCase() + name.substring( 1 );
    }

    public static String setZero(int values) {
        String setString = null;
        if (values < 10) {
            setString = "0" + values;
        } else {
            setString = "" + values;
        }

        return setString;
    }


    public static void hideSoftKeyboard(Activity activity) {
        final InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService( Activity.INPUT_METHOD_SERVICE );
        if (inputMethodManager.isActive()) {
            if (activity.getCurrentFocus() != null) {
                inputMethodManager.hideSoftInputFromWindow( activity.getCurrentFocus().getWindowToken(), 0 );
            }
        }
    }

    public static Boolean isVelideDateBoth(String frome, String to) {

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        try {
            DateFormat formatter = new SimpleDateFormat( DATEFORMAT );// 2015-02-10 00:00:00 yyyy-MM-dd 00:00:00
=======
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
//
//        Log.e( "-------------------", frome);
//        Log.e( "-------------------", to);
////        Log.e( "-------------------", selectedDate1.before(selectedDate2)+" -----------");

        try {
            DateFormat formatter = new SimpleDateFormat( "MM/dd/yyyy hh:mm a");// 2015-02-10 00:00:00 yyyy-MM-dd 00:00:00
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019

            Calendar c = Calendar.getInstance();
            String strCurrent = formatter.format( c.getTime() );

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD

=======
//               Log.e( "-------------------", (formatter.parse( frome )).after( formatter.parse( strCurrent ) )+"  "+ (formatter.parse( to )).after( formatter.parse( frome ) )+" -----------");
//               Log.e( "-------------------",  formatter.parse( to )+" -----------");
//               Log.e( "-------------------",  formatter.parse( frome ) +" -----------");
>>>>>>> 2/26/2019
=======
//               Log.e( "-------------------", (formatter.parse( frome )).after( formatter.parse( strCurrent ) )+"  "+ (formatter.parse( to )).after( formatter.parse( frome ) )+" -----------");
//               Log.e( "-------------------",  formatter.parse( to )+" -----------");
//               Log.e( "-------------------",  formatter.parse( frome ) +" -----------");
>>>>>>> 2/27/2019
=======
//               Log.e( "-------------------", (formatter.parse( frome )).after( formatter.parse( strCurrent ) )+"  "+ (formatter.parse( to )).after( formatter.parse( frome ) )+" -----------");
//               Log.e( "-------------------",  formatter.parse( to )+" -----------");
//               Log.e( "-------------------",  formatter.parse( frome ) +" -----------");
>>>>>>> 2/28/2019
            if ((formatter.parse( frome )).after( formatter.parse( strCurrent ) ) && (formatter.parse( to )).after( formatter.parse( frome ) )) {
                return true;
            } else {
                return false;
            }

        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }


    public static boolean checkStartDate(String setDate) {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019

        try {

            Calendar c = Calendar.getInstance();
            Calendar calendar = Calendar.getInstance();
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
            SimpleDateFormat format = new SimpleDateFormat(Util.DATEFORMAT);

            Date date = format.parse(setDate);
            c.setTime(date);

            if((calendar.getTimeInMillis()+1000)<=c.getTimeInMillis()){
                return true;
            } else
            {
=======
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
            SimpleDateFormat format = new SimpleDateFormat( Util.DATEFORMAT );

            Date date = format.parse( setDate );
            c.setTime( date );

            if ((calendar.getTimeInMillis() + 1000) <= c.getTimeInMillis()) {
                return true;
            } else {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    public static String setDateFormat(String strDate){

        String setFormatDate ="",setFormatTime="";

        try {
            SimpleDateFormat format = new SimpleDateFormat(Util.DATEFORMAT);
            DateFormat showDate = new SimpleDateFormat("dd-MMM-yyyy");
            DateFormat showTime = new SimpleDateFormat("HH:mm aa");
            Date date = format.parse(strDate);

            //formatting time to have AM/PM text using 'a' format
            String strDateFormat = "HH:mm aa";
            SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);

       //     System.out.println("Time with AM/PM field : " + sdf.format(date));

            setFormatDate = showDate.format(date);
            setFormatTime = showTime.format(date);
=======
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
    public static String setDateFormat(String strDate) {

        String setFormatDate = "", setFormatTime = "";

        try {
            SimpleDateFormat format = new SimpleDateFormat( Util.DATEFORMAT );
            DateFormat showDate = new SimpleDateFormat( "dd-MMM-yyyy" );
            DateFormat showTime = new SimpleDateFormat( "HH:mm aa" );
            Date date = format.parse( strDate );

            //formatting time to have AM/PM text using 'a' format
            String strDateFormat = "HH:mm aa";
            SimpleDateFormat sdf = new SimpleDateFormat( strDateFormat );

            //     System.out.println("Time with AM/PM field : " + sdf.format(date));

            setFormatDate = showDate.format( date );
            setFormatTime = showTime.format( date );
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019

        } catch (Exception e) {
        }


<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        return setFormatDate+" "+setFormatTime;

    }

=======
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
        return setFormatDate + " " + setFormatTime;

    }


    public static boolean isValidTime(String startTime, String endTime) {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        SimpleDateFormat sdf = new SimpleDateFormat( "HH:mm aa" );
=======
        SimpleDateFormat sdf = new SimpleDateFormat( "hh:mm a" );
>>>>>>> 2/26/2019
=======
        SimpleDateFormat sdf = new SimpleDateFormat( "hh:mm a" );
>>>>>>> 2/27/2019
=======
        SimpleDateFormat sdf = new SimpleDateFormat( "hh:mm a" );
>>>>>>> 2/28/2019
        try {
            Date inTime = sdf.parse( startTime );
            Date outTime = sdf.parse( endTime );

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
            if (outTime.before( inTime )) { //Same way you can check with after() method also.
                return false;
            } else {
                return true;
=======
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
            Calendar selectedDate1 = Calendar.getInstance();
            selectedDate1.setTime(inTime);
            Calendar selectedDate2 = Calendar.getInstance();
            selectedDate2.setTime(outTime);


            if (selectedDate1.before(selectedDate2)) { //Same way you can check with after() method also.
                return true;
            } else {
                return false;
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
            }
        } catch (Exception e) {
            return false;
        }
    }


<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
    private static final int MINUTES_IN_AN_HOUR = 60;
    private static final int SECONDS_IN_A_MINUTE = 60;


    public static String timeConversion(int totalSeconds) {
        int hours = totalSeconds / MINUTES_IN_AN_HOUR / SECONDS_IN_A_MINUTE;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        int minutes = (totalSeconds - (hoursToSeconds(hours)))
                / SECONDS_IN_A_MINUTE;
        int seconds = totalSeconds
                - ((hoursToSeconds(hours)) + (minutesToSeconds(minutes)));

        if(hours>0){
            return hours + " hours " + minutes + " minutes " + seconds + " seconds";
        }else if(minutes>0){
            return minutes + " minutes " + seconds + " seconds";

        }else {
=======
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
        int minutes = (totalSeconds - (hoursToSeconds( hours )))
                / SECONDS_IN_A_MINUTE;
        int seconds = totalSeconds
                - ((hoursToSeconds( hours )) + (minutesToSeconds( minutes )));

        if (hours > 0) {
            return hours + " hours " + minutes + " minutes " + seconds + " seconds";
        } else if (minutes > 0) {
            return minutes + " minutes " + seconds + " seconds";

        } else {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
            return seconds + " seconds";

        }

    }

    public static Spanned fromHtml(String html) {
        Spanned result;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
            result = Html.fromHtml(html, Html.FROM_HTML_MODE_LEGACY);
        } else {
            result = Html.fromHtml(html);
=======
            result = Html.fromHtml( html, Html.FROM_HTML_MODE_LEGACY );
        } else {
            result = Html.fromHtml( html );
>>>>>>> 2/25/2019
=======
            result = Html.fromHtml( html, Html.FROM_HTML_MODE_LEGACY );
        } else {
            result = Html.fromHtml( html );
>>>>>>> 2/26/2019
=======
            result = Html.fromHtml( html, Html.FROM_HTML_MODE_LEGACY );
        } else {
            result = Html.fromHtml( html );
>>>>>>> 2/27/2019
=======
            result = Html.fromHtml( html, Html.FROM_HTML_MODE_LEGACY );
        } else {
            result = Html.fromHtml( html );
>>>>>>> 2/28/2019
        }
        return result;
    }

    public static int hoursToSeconds(int hours) {
        return hours * MINUTES_IN_AN_HOUR * SECONDS_IN_A_MINUTE;
    }

    public static int minutesToSeconds(int minutes) {
        return minutes * SECONDS_IN_A_MINUTE;
    }


<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    public static boolean isMyServiceRunning(Class<?> serviceClass,Context context) {
        ActivityManager manager = (ActivityManager)context.getSystemService(Context.ACTIVITY_SERVICE);
        for (ActivityManager.RunningServiceInfo service : manager.getRunningServices(Integer.MAX_VALUE)) {
            if (serviceClass.getName().equals(service.service.getClassName())) {
=======
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
    public static boolean isMyServiceRunning(Class<?> serviceClass, Context context) {
        ActivityManager manager = (ActivityManager) context.getSystemService( Context.ACTIVITY_SERVICE );
        for (ActivityManager.RunningServiceInfo service : manager.getRunningServices( Integer.MAX_VALUE )) {
            if (serviceClass.getName().equals( service.service.getClassName() )) {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
                return true;
            }
        }
        return false;
    }

    public static String getDateTime() {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public static void showToast(String msg, Context ctx) {
        Toast.makeText(ctx, msg, Toast.LENGTH_SHORT).show();
    }



    public static Drawable getButtonTheme(String appTheme) {

        if(!isNotEmpaty(appTheme)){
=======
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
        DateFormat dateFormat = new SimpleDateFormat( "yyyy-MM-dd" );
        Date date = new Date();
        return dateFormat.format( date );
    }

    public static void showToast(String msg, Context ctx) {
        Toast.makeText( ctx, msg, Toast.LENGTH_SHORT ).show();
    }


    public static Drawable getButtonTheme(String appTheme) {

        if (!isNotEmpaty( appTheme )) {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
            appTheme = "#ff80ff";
        }


<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        GradientDrawable gd =  new GradientDrawable();
        gd.setColor(Color.parseColor(appTheme));
        gd.setCornerRadii(new float[]{10, 10, 10, 10, 10, 10, 10, 10});
=======
        GradientDrawable gd = new GradientDrawable();
        gd.setColor( Color.parseColor( appTheme ) );
        gd.setCornerRadii( new float[]{10, 10, 10, 10, 10, 10, 10, 10} );
>>>>>>> 2/25/2019
=======
        GradientDrawable gd = new GradientDrawable();
        gd.setColor( Color.parseColor( appTheme ) );
        gd.setCornerRadii( new float[]{10, 10, 10, 10, 10, 10, 10, 10} );
>>>>>>> 2/26/2019
=======
        GradientDrawable gd = new GradientDrawable();
        gd.setColor( Color.parseColor( appTheme ) );
        gd.setCornerRadii( new float[]{10, 10, 10, 10, 10, 10, 10, 10} );
>>>>>>> 2/27/2019
=======
        GradientDrawable gd = new GradientDrawable();
        gd.setColor( Color.parseColor( appTheme ) );
        gd.setCornerRadii( new float[]{10, 10, 10, 10, 10, 10, 10, 10} );
>>>>>>> 2/28/2019
//        gd.setStroke(2, Color.parseColor("#00FFFF"), 5, 6);

        return gd;
    }


    public static Drawable getRaoundButtonTheme(String appTheme) {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        GradientDrawable gd =  new GradientDrawable();
        gd.setColor(Color.parseColor(appTheme));
        gd.setCornerRadii(new float[]{50, 50, 50, 50, 50, 50, 50, 50});
=======
        GradientDrawable gd = new GradientDrawable();
        gd.setColor( Color.parseColor( appTheme ) );
        gd.setCornerRadii( new float[]{50, 50, 50, 50, 50, 50, 50, 50} );
>>>>>>> 2/25/2019
=======
        GradientDrawable gd = new GradientDrawable();
        gd.setColor( Color.parseColor( appTheme ) );
        gd.setCornerRadii( new float[]{50, 50, 50, 50, 50, 50, 50, 50} );
>>>>>>> 2/26/2019
=======
        GradientDrawable gd = new GradientDrawable();
        gd.setColor( Color.parseColor( appTheme ) );
        gd.setCornerRadii( new float[]{50, 50, 50, 50, 50, 50, 50, 50} );
>>>>>>> 2/27/2019
=======
        GradientDrawable gd = new GradientDrawable();
        gd.setColor( Color.parseColor( appTheme ) );
        gd.setCornerRadii( new float[]{50, 50, 50, 50, 50, 50, 50, 50} );
>>>>>>> 2/28/2019
//        gd.setStroke(2, Color.parseColor("#00FFFF"), 5, 6);

        return gd;
    }


    public static Bitmap getBitmap(String appTheme) {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        byte[] decodedString = Base64.decode(appTheme, Base64.DEFAULT);
        Bitmap decodedByte = BitmapFactory.decodeByteArray(decodedString, 0, decodedString.length);
=======
        byte[] decodedString = Base64.decode( appTheme, Base64.DEFAULT );
        Bitmap decodedByte = BitmapFactory.decodeByteArray( decodedString, 0, decodedString.length );
>>>>>>> 2/25/2019
=======
        byte[] decodedString = Base64.decode( appTheme, Base64.DEFAULT );
        Bitmap decodedByte = BitmapFactory.decodeByteArray( decodedString, 0, decodedString.length );
>>>>>>> 2/26/2019
=======
        byte[] decodedString = Base64.decode( appTheme, Base64.DEFAULT );
        Bitmap decodedByte = BitmapFactory.decodeByteArray( decodedString, 0, decodedString.length );
>>>>>>> 2/27/2019
=======
        byte[] decodedString = Base64.decode( appTheme, Base64.DEFAULT );
        Bitmap decodedByte = BitmapFactory.decodeByteArray( decodedString, 0, decodedString.length );
>>>>>>> 2/28/2019
        return decodedByte;
    }


<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD






    public static String getDate(String dateString) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        formatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date value = null;
        try {
            value = formatter.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        dateFormatter.setTimeZone(TimeZone.getDefault());
        String dt = dateFormatter.format(value);
=======
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
    public static String getDate(String dateString) {
        SimpleDateFormat formatter = new SimpleDateFormat( "yyyy-MM-dd'T'HH:mm:ss" );
        formatter.setTimeZone( TimeZone.getTimeZone( "UTC" ) );
        Date value = null;
        try {
            value = formatter.parse( dateString );
        } catch (ParseException e) {
            e.printStackTrace();
        }
        SimpleDateFormat dateFormatter = new SimpleDateFormat( "yyyy-MM-dd hh:mm:ss" );
        dateFormatter.setTimeZone( TimeZone.getDefault() );
        String dt = dateFormatter.format( value );
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019

        return dt;
    }


<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD


    public static String getDateNew(String dateString) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        formatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date value = null;
        try {
            value = formatter.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
        dateFormatter.setTimeZone(TimeZone.getDefault());
        String dt = dateFormatter.format(value);
=======
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
    public static String getDateNew(String dateString) {
        SimpleDateFormat formatter = new SimpleDateFormat( "yyyy-MM-dd'T'HH:mm:ss" );
        formatter.setTimeZone( TimeZone.getTimeZone( "UTC" ) );
        Date value = null;
        try {
            value = formatter.parse( dateString );
        } catch (ParseException e) {
            e.printStackTrace();
        }
        SimpleDateFormat dateFormatter = new SimpleDateFormat( "dd/MM/yyyy" );
        dateFormatter.setTimeZone( TimeZone.getDefault() );
        String dt = dateFormatter.format( value );
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019

        return dt;
    }


    public static double meterDistanceBetweenPoints(double lat_a, double lng_a, double lat_b, double lng_b) {
        float pk = (float) (180.f / Math.PI);

        double a1 = lat_a / pk;
        double a2 = lng_a / pk;
        double b1 = lat_b / pk;
        double b2 = lng_b / pk;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        double t1 = Math.cos(a1) * Math.cos(a2) * Math.cos(b1) * Math.cos(b2);
        double t2 = Math.cos(a1) * Math.sin(a2) * Math.cos(b1) * Math.sin(b2);
        double t3 = Math.sin(a1) * Math.sin(b1);
        double tt = Math.acos(t1 + t2 + t3);
=======
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
        double t1 = Math.cos( a1 ) * Math.cos( a2 ) * Math.cos( b1 ) * Math.cos( b2 );
        double t2 = Math.cos( a1 ) * Math.sin( a2 ) * Math.cos( b1 ) * Math.sin( b2 );
        double t3 = Math.sin( a1 ) * Math.sin( b1 );
        double tt = Math.acos( t1 + t2 + t3 );
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019

        return 6366000 * tt;
    }


    public static String getEncoded64ImageStringFromBitmap(Bitmap bitmap) {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        bitmap.compress(Bitmap.CompressFormat.JPEG, 40, stream);
        byte[] byteFormat = stream.toByteArray();
        // get the base 64 string
        String imgString = Base64.encodeToString(byteFormat, Base64.NO_WRAP);
=======
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
        bitmap.compress( Bitmap.CompressFormat.JPEG, 40, stream );
        byte[] byteFormat = stream.toByteArray();
        // get the base 64 string
        String imgString = Base64.encodeToString( byteFormat, Base64.NO_WRAP );
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019

        return imgString;
    }


<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD

    public static boolean isMyServiceRunning(Context context) {
        ActivityManager manager = (ActivityManager)context.getSystemService(Context.ACTIVITY_SERVICE);
        for (ActivityManager.RunningServiceInfo service : manager.getRunningServices(Integer.MAX_VALUE)) {
            if ("com.transcan.webservice.DataUploadService".equals(service.service.getClassName())) {
=======
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
    public static boolean isMyServiceRunning(Context context) {
        ActivityManager manager = (ActivityManager) context.getSystemService( Context.ACTIVITY_SERVICE );
        for (ActivityManager.RunningServiceInfo service : manager.getRunningServices( Integer.MAX_VALUE )) {
            if ("com.transcan.webservice.DataUploadService".equals( service.service.getClassName() )) {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
                return true;
            }
        }
        return false;
    }


<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    public static String  stringDecode(String string) {

        try {
//            return URLDecoder.decode(string, "UTF-8");
            return URLDecoder.decode(string, "UTF-8");

        }catch (Exception e){
=======
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
    public static String stringDecode(String string) {

        try {
//            return URLDecoder.decode(string, "UTF-8");
            return URLDecoder.decode( string, "UTF-8" );

        } catch (Exception e) {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
            return "";
        }
    }


<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD

//    String s = ;

    public static boolean isUpdateAssignmentRunning(Context context) {
        ActivityManager manager = (ActivityManager)context.getSystemService(Context.ACTIVITY_SERVICE);
        for (ActivityManager.RunningServiceInfo service : manager.getRunningServices(Integer.MAX_VALUE)) {
            if ("com.transcan.webservice.UpdateAssignmentService".equals(service.service.getClassName())) {
=======
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
//    String s = ;

    public static boolean isUpdateAssignmentRunning(Context context) {
        ActivityManager manager = (ActivityManager) context.getSystemService( Context.ACTIVITY_SERVICE );
        for (ActivityManager.RunningServiceInfo service : manager.getRunningServices( Integer.MAX_VALUE )) {
            if ("com.transcan.webservice.UpdateAssignmentService".equals( service.service.getClassName() )) {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
                return true;
            }
        }
        return false;
    }


<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    public static  int isCalculatingDaysBetweenTwoDates(String updateOn) {

        final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        String inputString2 = sdf.format(new Date());

        try {
            Date date1 = sdf.parse(updateOn);
            Date date2 = sdf.parse(inputString2);
            long diff = date2.getTime() - date1.getTime();
            System.out.println("Days: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
            long count = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

            return (int)count;
=======
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
    public static int isCalculatingDaysBetweenTwoDates(String updateOn) {

        final SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd'T'HH:mm:ss.SSS" );
        sdf.setTimeZone( TimeZone.getTimeZone( "UTC" ) );
        String inputString2 = sdf.format( new Date() );

        try {
            Date date1 = sdf.parse( updateOn );
            Date date2 = sdf.parse( inputString2 );
            long diff = date2.getTime() - date1.getTime();
            System.out.println( "Days: " + TimeUnit.DAYS.convert( diff, TimeUnit.MILLISECONDS ) );
            long count = TimeUnit.DAYS.convert( diff, TimeUnit.MILLISECONDS );

            return (int) count;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
        } catch (ParseException e) {
            e.printStackTrace();
            return 0;
        }

    }


<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD

    public static void ClearAllNotification(Context context){

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
        KetanApplication application = (KetanApplication) context.getApplicationContext();
=======
        KaikiliApplication application = (KaikiliApplication) context.getApplicationContext();
>>>>>>> 2/1/2019
=======
        KaikiliApplication application = (KaikiliApplication) context.getApplicationContext();
>>>>>>> 2/2/2019
=======
        KaikiliApplication application = (KaikiliApplication) context.getApplicationContext();
>>>>>>> 2/9/2019
=======
        KaikiliApplication application = (KaikiliApplication) context.getApplicationContext();
>>>>>>> 2/14/2019
=======
        KaikiliApplication application = (KaikiliApplication) context.getApplicationContext();
>>>>>>> 2/15/2019
=======
        KaikiliApplication application = (KaikiliApplication) context.getApplicationContext();
>>>>>>> 2/16/2019
=======
        KaikiliApplication application = (KaikiliApplication) context.getApplicationContext();
>>>>>>> 2/16/2019 V1
=======
        KaikiliApplication application = (KaikiliApplication) context.getApplicationContext();
>>>>>>> 2/16/2019 V2
=======
        KaikiliApplication application = (KaikiliApplication) context.getApplicationContext();
>>>>>>> 2/16/2019
=======
        KaikiliApplication application = (KaikiliApplication) context.getApplicationContext();
>>>>>>> 2/18/2019
=======
        KaikiliApplication application = (KaikiliApplication) context.getApplicationContext();
>>>>>>> 2/21/2019
=======
        KaikiliApplication application = (KaikiliApplication) context.getApplicationContext();
>>>>>>> 2/22/2019
=======
        KaikiliApplication application = (KaikiliApplication) context.getApplicationContext();
>>>>>>> 2/23/2019
        SharedPreferences preferences = application.getSharedPreferences();
        String ns = Context.NOTIFICATION_SERVICE;
        NotificationManager nMgr = (NotificationManager)context.getSystemService(ns);
        nMgr.cancel(0);
=======
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
    public static void ClearAllNotification(Context context) {

        KaikiliApplication application = (KaikiliApplication) context.getApplicationContext();
        SharedPreferences preferences = application.getSharedPreferences();
        String ns = Context.NOTIFICATION_SERVICE;
        NotificationManager nMgr = (NotificationManager) context.getSystemService( ns );
        nMgr.cancel( 0 );
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019

    }


<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD



//    public static void displayDialog(String url, final Context context) {
//
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
//        KetanApplication application = (KetanApplication)context.getApplicationContext();
=======
//        KaikiliApplication application = (KaikiliApplication)context.getApplicationContext();
>>>>>>> 2/1/2019
=======
//        KaikiliApplication application = (KaikiliApplication)context.getApplicationContext();
>>>>>>> 2/2/2019
=======
//        KaikiliApplication application = (KaikiliApplication)context.getApplicationContext();
>>>>>>> 2/9/2019
=======
//        KaikiliApplication application = (KaikiliApplication)context.getApplicationContext();
>>>>>>> 2/14/2019
=======
//        KaikiliApplication application = (KaikiliApplication)context.getApplicationContext();
>>>>>>> 2/15/2019
=======
//        KaikiliApplication application = (KaikiliApplication)context.getApplicationContext();
>>>>>>> 2/16/2019
=======
//        KaikiliApplication application = (KaikiliApplication)context.getApplicationContext();
>>>>>>> 2/16/2019 V1
=======
//        KaikiliApplication application = (KaikiliApplication)context.getApplicationContext();
>>>>>>> 2/16/2019 V2
=======
//        KaikiliApplication application = (KaikiliApplication)context.getApplicationContext();
>>>>>>> 2/16/2019
=======
//        KaikiliApplication application = (KaikiliApplication)context.getApplicationContext();
>>>>>>> 2/18/2019
=======
//        KaikiliApplication application = (KaikiliApplication)context.getApplicationContext();
>>>>>>> 2/21/2019
=======
//        KaikiliApplication application = (KaikiliApplication)context.getApplicationContext();
>>>>>>> 2/22/2019
=======
//        KaikiliApplication application = (KaikiliApplication)context.getApplicationContext();
>>>>>>> 2/23/2019
=======
//    public static void displayDialog(String url, final Context context) {
//
//        KaikiliApplication application = (KaikiliApplication)context.getApplicationContext();
>>>>>>> 2/25/2019
=======
//    public static void displayDialog(String url, final Context context) {
//
//        KaikiliApplication application = (KaikiliApplication)context.getApplicationContext();
>>>>>>> 2/26/2019
=======
//    public static void displayDialog(String url, final Context context) {
//
//        KaikiliApplication application = (KaikiliApplication)context.getApplicationContext();
>>>>>>> 2/27/2019
=======
//    public static void displayDialog(String url, final Context context) {
//
//        KaikiliApplication application = (KaikiliApplication)context.getApplicationContext();
>>>>>>> 2/28/2019
//        SharedPreferences preferences = application.getSharedPreferences();
//
//        final Dialog dialog = new Dialog(context, R.style.TransparantBlackDialog);
//        LayoutInflater li = LayoutInflater.from(context);
//        View view = li.inflate(R.layout.alert_dialog, null);
//        dialog.setContentView(view);
//        dialog.setCancelable(true);
//        AppLog.Log( "----------------- image url",url);
//        ImageView ivImage = (ImageView)view.findViewById( R.id.alert_dialog_iv_image);
//
//        dialog.show();
//        Picasso.with(context).load(url)
//                .into(ivImage);
//
//    }


<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    public static String compressImage(String imageUri,Activity mActivity) {

        String filePath = getRealPathFromURI(imageUri,mActivity);
=======
    public static String compressImage(String imageUri, Activity mActivity) {

        String filePath = getRealPathFromURI( imageUri, mActivity );
>>>>>>> 2/25/2019
=======
    public static String compressImage(String imageUri, Activity mActivity) {

        String filePath = getRealPathFromURI( imageUri, mActivity );
>>>>>>> 2/26/2019
=======
    public static String compressImage(String imageUri, Activity mActivity) {

        String filePath = getRealPathFromURI( imageUri, mActivity );
>>>>>>> 2/27/2019
=======
    public static String compressImage(String imageUri, Activity mActivity) {

        String filePath = getRealPathFromURI( imageUri, mActivity );
>>>>>>> 2/28/2019
        Bitmap scaledBitmap = null;

        BitmapFactory.Options options = new BitmapFactory.Options();

//      by setting this field as true, the actual bitmap pixels are not loaded in the memory. Just the bounds are loaded. If
//      you try the use the bitmap here, you will get null.
        options.inJustDecodeBounds = true;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        Bitmap bmp = BitmapFactory.decodeFile(filePath, options);
=======
        Bitmap bmp = BitmapFactory.decodeFile( filePath, options );
>>>>>>> 2/25/2019
=======
        Bitmap bmp = BitmapFactory.decodeFile( filePath, options );
>>>>>>> 2/26/2019
=======
        Bitmap bmp = BitmapFactory.decodeFile( filePath, options );
>>>>>>> 2/27/2019
=======
        Bitmap bmp = BitmapFactory.decodeFile( filePath, options );
>>>>>>> 2/28/2019

        int actualHeight = options.outHeight;
        int actualWidth = options.outWidth;

//      max Height and width values of the compressed image is taken as 816x612

        float maxHeight = 816.0f;
        float maxWidth = 612.0f;
        float imgRatio = actualWidth / actualHeight;
        float maxRatio = maxWidth / maxHeight;

//      width and height values are set maintaining the aspect ratio of the image

        if (actualHeight > maxHeight || actualWidth > maxWidth) {
            if (imgRatio < maxRatio) {
                imgRatio = maxHeight / actualHeight;
                actualWidth = (int) (imgRatio * actualWidth);
                actualHeight = (int) maxHeight;
            } else if (imgRatio > maxRatio) {
                imgRatio = maxWidth / actualWidth;
                actualHeight = (int) (imgRatio * actualHeight);
                actualWidth = (int) maxWidth;
            } else {
                actualHeight = (int) maxHeight;
                actualWidth = (int) maxWidth;

            }
        }

//      setting inSampleSize value allows to load a scaled down version of the original image

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        options.inSampleSize = calculateInSampleSize(options, actualWidth, actualHeight);
=======
        options.inSampleSize = calculateInSampleSize( options, actualWidth, actualHeight );
>>>>>>> 2/25/2019
=======
        options.inSampleSize = calculateInSampleSize( options, actualWidth, actualHeight );
>>>>>>> 2/26/2019
=======
        options.inSampleSize = calculateInSampleSize( options, actualWidth, actualHeight );
>>>>>>> 2/27/2019
=======
        options.inSampleSize = calculateInSampleSize( options, actualWidth, actualHeight );
>>>>>>> 2/28/2019

//      inJustDecodeBounds set to false to load the actual bitmap
        options.inJustDecodeBounds = false;

//      this options allow android to claim the bitmap memory if it runs low on memory
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inTempStorage = new byte[16 * 1024];

        try {
//          load the bitmap from its path
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
            bmp = BitmapFactory.decodeFile(filePath, options);
=======
            bmp = BitmapFactory.decodeFile( filePath, options );
>>>>>>> 2/25/2019
=======
            bmp = BitmapFactory.decodeFile( filePath, options );
>>>>>>> 2/26/2019
=======
            bmp = BitmapFactory.decodeFile( filePath, options );
>>>>>>> 2/27/2019
=======
            bmp = BitmapFactory.decodeFile( filePath, options );
>>>>>>> 2/28/2019
        } catch (OutOfMemoryError exception) {
            exception.printStackTrace();

        }
        try {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
            scaledBitmap = Bitmap.createBitmap(actualWidth, actualHeight, Bitmap.Config.ARGB_8888);
=======
            scaledBitmap = Bitmap.createBitmap( actualWidth, actualHeight, Bitmap.Config.ARGB_8888 );
>>>>>>> 2/25/2019
=======
            scaledBitmap = Bitmap.createBitmap( actualWidth, actualHeight, Bitmap.Config.ARGB_8888 );
>>>>>>> 2/26/2019
=======
            scaledBitmap = Bitmap.createBitmap( actualWidth, actualHeight, Bitmap.Config.ARGB_8888 );
>>>>>>> 2/27/2019
=======
            scaledBitmap = Bitmap.createBitmap( actualWidth, actualHeight, Bitmap.Config.ARGB_8888 );
>>>>>>> 2/28/2019
        } catch (OutOfMemoryError exception) {
            exception.printStackTrace();
        }

        float ratioX = actualWidth / (float) options.outWidth;
        float ratioY = actualHeight / (float) options.outHeight;
        float middleX = actualWidth / 2.0f;
        float middleY = actualHeight / 2.0f;

        Matrix scaleMatrix = new Matrix();
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        scaleMatrix.setScale(ratioX, ratioY, middleX, middleY);

        Canvas canvas = new Canvas(scaledBitmap);
        canvas.setMatrix(scaleMatrix);
        canvas.drawBitmap(bmp, middleX - bmp.getWidth() / 2, middleY - bmp.getHeight() / 2, new Paint(Paint.FILTER_BITMAP_FLAG));
=======
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
        scaleMatrix.setScale( ratioX, ratioY, middleX, middleY );

        Canvas canvas = new Canvas( scaledBitmap );
        canvas.setMatrix( scaleMatrix );
        canvas.drawBitmap( bmp, middleX - bmp.getWidth() / 2, middleY - bmp.getHeight() / 2, new Paint( Paint.FILTER_BITMAP_FLAG ) );
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019

//      check the rotation of the image and display it properly
        ExifInterface exif;
        try {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
            exif = new ExifInterface(filePath);

            int orientation = exif.getAttributeInt(
                    ExifInterface.TAG_ORIENTATION, 0);
            Log.d("EXIF", "Exif: " + orientation);
            Matrix matrix = new Matrix();
            if (orientation == 6) {
                matrix.postRotate(90);
                Log.d("EXIF", "Exif: " + orientation);
            } else if (orientation == 3) {
                matrix.postRotate(180);
                Log.d("EXIF", "Exif: " + orientation);
            } else if (orientation == 8) {
                matrix.postRotate(270);
                Log.d("EXIF", "Exif: " + orientation);
            }
            scaledBitmap = Bitmap.createBitmap(scaledBitmap, 0, 0,
                    scaledBitmap.getWidth(), scaledBitmap.getHeight(), matrix,
                    true);
=======
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
            exif = new ExifInterface( filePath );

            int orientation = exif.getAttributeInt(
                    ExifInterface.TAG_ORIENTATION, 0 );
            Log.d( "EXIF", "Exif: " + orientation );
            Matrix matrix = new Matrix();
            if (orientation == 6) {
                matrix.postRotate( 90 );
                Log.d( "EXIF", "Exif: " + orientation );
            } else if (orientation == 3) {
                matrix.postRotate( 180 );
                Log.d( "EXIF", "Exif: " + orientation );
            } else if (orientation == 8) {
                matrix.postRotate( 270 );
                Log.d( "EXIF", "Exif: " + orientation );
            }
            scaledBitmap = Bitmap.createBitmap( scaledBitmap, 0, 0,
                    scaledBitmap.getWidth(), scaledBitmap.getHeight(), matrix,
                    true );
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileOutputStream out = null;
        String filename = getFilename();
        try {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
            out = new FileOutputStream(filename);

//          write the compressed bitmap at the destination specified by filename.
            scaledBitmap.compress(Bitmap.CompressFormat.JPEG, 80, out);
=======
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
            out = new FileOutputStream( filename );

//          write the compressed bitmap at the destination specified by filename.
            scaledBitmap.compress( Bitmap.CompressFormat.JPEG, 80, out );
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return filename;

    }

    public static String getFilename() {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        File file = new File( Environment.getExternalStorageDirectory().getPath(), "MyFolder/Images");
=======
        File file = new File( Environment.getExternalStorageDirectory().getPath(), "MyFolder/Images" );
>>>>>>> 2/25/2019
=======
        File file = new File( Environment.getExternalStorageDirectory().getPath(), "MyFolder/Images" );
>>>>>>> 2/26/2019
=======
        File file = new File( Environment.getExternalStorageDirectory().getPath(), "MyFolder/Images" );
>>>>>>> 2/27/2019
=======
        File file = new File( Environment.getExternalStorageDirectory().getPath(), "MyFolder/Images" );
>>>>>>> 2/28/2019
        if (!file.exists()) {
            file.mkdirs();
        }
        String uriSting = (file.getAbsolutePath() + "/" + System.currentTimeMillis() + ".jpg");
        return uriSting;

    }

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    public static String getRealPathFromURI(String contentURI,Activity mActivity) {
        Uri contentUri = Uri.parse(contentURI);
        Cursor cursor = mActivity.getApplicationContext().getContentResolver().query(contentUri, null, null, null, null);
=======
    public static String getRealPathFromURI(String contentURI, Activity mActivity) {
        Uri contentUri = Uri.parse( contentURI );
        Cursor cursor = mActivity.getApplicationContext().getContentResolver().query( contentUri, null, null, null, null );
>>>>>>> 2/25/2019
=======
    public static String getRealPathFromURI(String contentURI, Activity mActivity) {
        Uri contentUri = Uri.parse( contentURI );
        Cursor cursor = mActivity.getApplicationContext().getContentResolver().query( contentUri, null, null, null, null );
>>>>>>> 2/26/2019
=======
    public static String getRealPathFromURI(String contentURI, Activity mActivity) {
        Uri contentUri = Uri.parse( contentURI );
        Cursor cursor = mActivity.getApplicationContext().getContentResolver().query( contentUri, null, null, null, null );
>>>>>>> 2/27/2019
=======
    public static String getRealPathFromURI(String contentURI, Activity mActivity) {
        Uri contentUri = Uri.parse( contentURI );
        Cursor cursor = mActivity.getApplicationContext().getContentResolver().query( contentUri, null, null, null, null );
>>>>>>> 2/28/2019
        if (cursor == null) {
            return contentUri.getPath();
        } else {
            cursor.moveToFirst();
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
            int index = cursor.getColumnIndex( MediaStore.Images.ImageColumns.DATA);
            return cursor.getString(index);
=======
            int index = cursor.getColumnIndex( MediaStore.Images.ImageColumns.DATA );
            return cursor.getString( index );
>>>>>>> 2/25/2019
=======
            int index = cursor.getColumnIndex( MediaStore.Images.ImageColumns.DATA );
            return cursor.getString( index );
>>>>>>> 2/26/2019
=======
            int index = cursor.getColumnIndex( MediaStore.Images.ImageColumns.DATA );
            return cursor.getString( index );
>>>>>>> 2/27/2019
=======
            int index = cursor.getColumnIndex( MediaStore.Images.ImageColumns.DATA );
            return cursor.getString( index );
>>>>>>> 2/28/2019
        }
    }

    public static int calculateInSampleSize(BitmapFactory.Options options, int reqWidth, int reqHeight) {
        final int height = options.outHeight;
        final int width = options.outWidth;
        int inSampleSize = 1;

        if (height > reqHeight || width > reqWidth) {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
            final int heightRatio = Math.round((float) height / (float) reqHeight);
            final int widthRatio = Math.round((float) width / (float) reqWidth);
=======
            final int heightRatio = Math.round( (float) height / (float) reqHeight );
            final int widthRatio = Math.round( (float) width / (float) reqWidth );
>>>>>>> 2/25/2019
=======
            final int heightRatio = Math.round( (float) height / (float) reqHeight );
            final int widthRatio = Math.round( (float) width / (float) reqWidth );
>>>>>>> 2/26/2019
=======
            final int heightRatio = Math.round( (float) height / (float) reqHeight );
            final int widthRatio = Math.round( (float) width / (float) reqWidth );
>>>>>>> 2/27/2019
=======
            final int heightRatio = Math.round( (float) height / (float) reqHeight );
            final int widthRatio = Math.round( (float) width / (float) reqWidth );
>>>>>>> 2/28/2019
            inSampleSize = heightRatio < widthRatio ? heightRatio : widthRatio;
        }
        final float totalPixels = width * height;
        final float totalReqPixelsCap = reqWidth * reqHeight * 2;
        while (totalPixels / (inSampleSize * inSampleSize) > totalReqPixelsCap) {
            inSampleSize++;
        }

        return inSampleSize;
    }

    public static String getDateWithFormate(String date, String currentFormate, String requireFormate) {
        String final_date = "";
        try {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
            SimpleDateFormat formatter = new SimpleDateFormat(currentFormate);
            Date utilDate = formatter.parse(date);
            SimpleDateFormat formatter1 = new SimpleDateFormat(requireFormate);
            final_date = formatter1.format(utilDate);
=======
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
            SimpleDateFormat formatter = new SimpleDateFormat( currentFormate );
            Date utilDate = formatter.parse( date );
            SimpleDateFormat formatter1 = new SimpleDateFormat( requireFormate );
            final_date = formatter1.format( utilDate );
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
        } catch (Exception e) {
            e.printStackTrace();
        }
        return final_date;
    }

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    public static void showCustomProgressDialog(Context context, String title,boolean iscancelable,
=======
    public static void showCustomProgressDialog(Context context, String title, boolean iscancelable,
>>>>>>> 2/25/2019
=======
    public static void showCustomProgressDialog(Context context, String title, boolean iscancelable,
>>>>>>> 2/26/2019
=======
    public static void showCustomProgressDialog(Context context, String title, boolean iscancelable,
>>>>>>> 2/27/2019
=======
    public static void showCustomProgressDialog(Context context, String title, boolean iscancelable,
>>>>>>> 2/28/2019
                                                OnProgressCancelListener progressCancelListener) {
        if (mDialog != null && mDialog.isShowing())
            return;
        Util.progressCancelListener = progressCancelListener;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        mDialog = new Dialog(context, R.style.MyDialog);
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mDialog.setContentView(R.layout.progress_bar_dalog);

//        ImageView imageView = (ImageView) mDialog.findViewById(R.id.ivProgressBar);
        if (!TextUtils.isEmpty(title)) {
            TextView tvTitle = (TextView) mDialog.findViewById(R.id.tvTitle);
            tvTitle.setText(title);
        }
        mDialog.setCancelable(iscancelable);
=======
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
        mDialog = new Dialog( context, R.style.MyDialog );
        mDialog.requestWindowFeature( Window.FEATURE_NO_TITLE );
        mDialog.getWindow().setBackgroundDrawable( new ColorDrawable( Color.TRANSPARENT ) );
        mDialog.setContentView( R.layout.progress_bar_dalog );

//        ImageView imageView = (ImageView) mDialog.findViewById(R.id.ivProgressBar);
        if (!TextUtils.isEmpty( title )) {
            TextView tvTitle = (TextView) mDialog.findViewById( R.id.tvTitle );
            tvTitle.setText( title );
        }
        mDialog.setCancelable( iscancelable );
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
        mDialog.show();
    }

    public static void removeCustomProgressDialog() {
        try {
            if (mDialog != null) {
                mDialog.dismiss();
                mDialog = null;
            }
        } catch (IllegalArgumentException ie) {
            ie.printStackTrace();

        } catch (RuntimeException re) {
            re.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static ProgressHUD mProgressHUD;

    public static void isProgressShow(Context mContext) {
        if (mProgressHUD == null) {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
            mProgressHUD = ProgressHUD.show(mContext,
                    "Loading...", false, false, null);
        } else {
            if (!mProgressHUD.isShowing()) {
                mProgressHUD = ProgressHUD.show(mContext,
                        "Loading...", false, false, null);
=======
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
            mProgressHUD = ProgressHUD.show( mContext,
                    "Loading...", false, false, null );
        } else {
            if (!mProgressHUD.isShowing()) {
                mProgressHUD = ProgressHUD.show( mContext,
                        "Loading...", false, false, null );
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2/25/2019
=======
>>>>>>> 2/26/2019
=======
>>>>>>> 2/27/2019
=======
>>>>>>> 2/28/2019
            }
        }
    }

    public static void isProgressHide() {
        if (mProgressHUD != null) {

            if (mProgressHUD.isShowing()) {
                mProgressHUD.dismiss();
            }
        }
    }
}
