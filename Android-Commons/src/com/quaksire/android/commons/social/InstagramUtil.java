package com.quaksire.android.commons.social;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/**
 *
 * @author julio
 */
public class InstagramUtil {
    
    private static final String TAG = "GLANCE-InstagramUtil";
    
    public static void openPost(Context context, String postUrl){
        try {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(postUrl));
            context.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
