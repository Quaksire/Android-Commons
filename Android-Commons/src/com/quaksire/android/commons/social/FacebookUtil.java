package com.quaksire.android.commons.social;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/**
 *
 * @author julio
 */
public class FacebookUtil {
    
    private static final String TAG = "GLANCE-FacebookUtil";
    
    public static void openPost(Context context, String socialEventId, String socialUserId){
        String postUrl = String.format("fb://post/%s?owner=%s", socialEventId, socialUserId);
        openPost(context, postUrl);
    }
    
    public static void openPost(Context context, String postUrl){
        try {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(postUrl));
            context.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
