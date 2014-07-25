package com.quaksire.android.commons.net;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 *
 * @author julio
 */
public class ConnectionUtil {

    /**
     * Check if the mobile has Internet connection
     * @param context
     * @return true if has internet connection
     */
    public static boolean isConnectedToInternet(Context context) {
        ConnectivityManager cm
                = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        return netInfo != null && netInfo.isConnectedOrConnecting();
    }
}
