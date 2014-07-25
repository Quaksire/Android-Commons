package com.quaksire.android.commons.social;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/**
 *
 * @author julio
 */
public class TwitterUtil {

    public static void openTwit(Context context, String userId, String postId) {
        Intent intent;
        try {
            // get the Twitter app if possible
            context.getPackageManager().getPackageInfo("com.twitter.android", 0);
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("twitter://status?status_id=" + postId));
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        } catch (Exception e) {
            // no Twitter app, revert to browser
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/#!/" + userId + "/status/" + postId));
        }

        context.startActivity(intent);
    }
}
