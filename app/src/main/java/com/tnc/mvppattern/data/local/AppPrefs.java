package com.tnc.mvppattern.data.local;

import android.content.Context;

import javax.inject.Inject;

/**
 * Created by CUSDungVT on 10/3/2016.
 */

public class AppPrefs {
    private PreferencesUtils mPrefUtils;
    private Context mContext;
    private static final String KEY_ID = "id";
    private static final String KEY_USER_NAME = "user_name";
    private static final String KEY_EMAIL = "email";
    private static final String KEY_USER_IMG = "user_img";
    private static final String KEY_AGE = "age";
    private static final String KEY_SEX = "sex";
    private static final String KEY_USER_NUMBER = "user_number";

    private static final String KEY_UM_ID = "um_id";
    private static final String KEY_UM_USER_NAME = "um_user_name";
    private static final String KEY_UM_EMAIL = "um_email";
    private static final String KEY_UM_IMG = "um_img";

    @Inject
    public AppPrefs(Context context){
        mPrefUtils = new PreferencesUtils(context);
        mContext = context;
    }

}
