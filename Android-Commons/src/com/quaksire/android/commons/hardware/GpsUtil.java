package com.quaksire.android.commons.hardware;

import android.content.Context;
import android.provider.Settings;

/**
 *
 * @author julio
 */
public class GpsUtil {

    /**
     * Get if the GPS is active or disabled
     * @param context
     * @return true if active
     */
    public static boolean isGpsEnabled(Context context) {
        String provider = Settings.Secure.getString(context.getContentResolver(), Settings.Secure.LOCATION_PROVIDERS_ALLOWED);
        return provider.contains("gps");
    }
}
