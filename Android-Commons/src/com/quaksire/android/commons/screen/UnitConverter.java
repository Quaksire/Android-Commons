package com.quaksire.android.commons.screen;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/**
 *
 * @author julio
 */
public class UnitConverter {

    
    /**
     * Convert px to dp
     * @param context
     * @param px
     * @return 
     */
    public static float pxToDp(Context context, float px) {
        Resources resources = context.getResources();
        DisplayMetrics metrics = resources.getDisplayMetrics();
        float dp = px / (metrics.densityDpi / 160f);
        return dp;
    }

    /**
     * Convert dp to px
     * @param context
     * @param dp
     * @return 
     */
    public static float dpToPx(Context context, int dp) {
        Resources resources = context.getResources();
        DisplayMetrics metrics = resources.getDisplayMetrics();
        float px = dp * (metrics.densityDpi / 160f);
        return px;
    }
    
    /**
     * Get screen width in px
     * @param context
     * @return 
     */
    public static int getWidthInPixels(Context context) {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay().getMetrics(displaymetrics);
        return displaymetrics.widthPixels;
    }

    /**
     * Get screen height in px
     * @param context
     * @return 
     */
    public static int getHeightInPixels(Context context) {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay().getMetrics(displaymetrics);
        return displaymetrics.heightPixels;
    }

    /**
     * Get width in dp
     * @param context
     * @return 
     */
    public static float getWidthInDensityPixel(Context context) {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay().getMetrics(displaymetrics);
        return displaymetrics.widthPixels / displaymetrics.density;
    }

    /**
     * Get height in dp
     * @param context
     * @return 
     */
    public static float getHeightInDensityPixel(Context context) {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay().getMetrics(displaymetrics);
        return displaymetrics.heightPixels / displaymetrics.density;
    }
    
}
