package com.tnc.mvppattern.util;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by CUSDungVT on 1/13/2016.
 */
public class ToastUtils {
    public static void showShort(Context context, String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
    public static void showShort(Context context, int resStr){
        Toast.makeText(context, context.getResources().getString(resStr), Toast.LENGTH_SHORT).show();
    }
    public static void showLong(Context context, String msg){
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
    }
    public static void showLong(Context context, int resStr){
        Toast.makeText(context, context.getResources().getString(resStr), Toast.LENGTH_LONG).show();
    }

}
