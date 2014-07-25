package com.quaksire.android.commons.os;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.provider.Settings;

/**
 *
 * @author julio
 */
public class OsUtil {

    public static int getSDKVersion() {
        return android.os.Build.VERSION.SDK_INT;
    }
    
    public static String getManufacturer() {
        return android.os.Build.MANUFACTURER;
    }
    
    public static String getDeviceModel() {
        return android.os.Build.MODEL;
    }
    
    public static String getPhoneId(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID);
    }
    
    private static String showAppRunningForeground(ActivityManager am, PackageManager pm) throws SecurityException, PackageManager.NameNotFoundException {
        // The first in the list of RunningTasks is always the foreground task.
        RunningTaskInfo foregroundTaskInfo = am.getRunningTasks(1).get(0);

        String foregroundTaskPackageName = foregroundTaskInfo.topActivity.getPackageName();
        PackageInfo foregroundAppPackageInfo = pm.getPackageInfo(foregroundTaskPackageName, 0);
        return foregroundAppPackageInfo.applicationInfo.loadLabel(pm).toString(); 
    }

    /**
     * Return the name of the app that works in foreground
     * @param context
     * @return 
     */
    public static String showAppRunningForeground(Context context) throws SecurityException, PackageManager.NameNotFoundException{
        ActivityManager am = (ActivityManager) context.getSystemService(Activity.ACTIVITY_SERVICE);
        PackageManager pm = context.getPackageManager();

        return showAppRunningForeground(am, pm);
    }
}
