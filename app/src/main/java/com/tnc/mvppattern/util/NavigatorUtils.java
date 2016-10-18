package com.tnc.mvppattern.util;

import android.content.Context;
import android.content.Intent;

/**
 * Created by CUSDungVT on 10/4/2016.
 */

public class NavigatorUtils {

    public static void goToActivity(Context context, Class<?> clss){
        Intent i = new Intent(context, clss);
        context.startActivity(i);
    }
    public static void goToActivityWithClearHistory(Context context, Class<?> clss){
        Intent i = new Intent(context, clss);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        context.startActivity(i);
    }
}
