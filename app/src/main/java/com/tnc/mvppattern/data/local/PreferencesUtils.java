package com.tnc.mvppattern.data.local;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by CUSDungVT on 11/18/2015.
 */
public class PreferencesUtils {

    private Context mContext;

    public PreferencesUtils(Context context) {
        this.mContext = context;
    }

    private SharedPreferences getSharePreferences() {
        return PreferenceManager.getDefaultSharedPreferences(mContext);
    }

    private SharedPreferences.Editor getPreferencesEditor() {
        return getSharePreferences().edit();
    }

    /**
     * Clear all data
     * @return
     */
    public boolean clearSharePreferences() {
        return getSharePreferences().edit().clear().commit();
    }

    /**
     * Remove data with key
     * @param key
     * @return
     */
    public boolean removeKey(String key) {
        return getSharePreferences().edit().remove(key).commit();
    }

    /**-------------------------------
     * String
     --------------------------------*/
    public boolean setStringValue(String key, String value) {
        return getPreferencesEditor().putString(key, value).commit();
    }

    public String getStringValue(String key, String defaultValue){
        return getSharePreferences().getString(key, defaultValue);
    }

    /**-------------------------------
     * Integer
     --------------------------------*/
    public boolean setIntValue(String key, int value) {
        return getPreferencesEditor().putInt(key, value).commit();
    }

    public int getIntValue(String key, int defVal) {
        return getSharePreferences().getInt(key, defVal);
    }

    /**-------------------------------
     * Long
     --------------------------------*/

    public boolean setLongValue(String key, long value) {
        return getPreferencesEditor().putLong(key, value).commit();
    }

    public long getLongValue(String key, long defVal) {
        return getSharePreferences().getLong(key, defVal);
    }

    /**-----------------------------------
     *  Boolean
     -------------------------------------*/
    public boolean getBooleanValue(String key, boolean defVal) {
        return getSharePreferences().getBoolean(key, defVal);
    }

    public boolean setBooleanValue(String key, boolean value) {
        return getPreferencesEditor().putBoolean(key, value).commit();
    }

    public boolean setStringSetValue(String key, HashSet<String> setStr) {
        return getPreferencesEditor().putStringSet(key, setStr).commit();
    }

    public Set<String> getStringSetValue(String key, Set<String> defaultValue) {
        return getSharePreferences().getStringSet(key,
                        defaultValue);
    }


}
