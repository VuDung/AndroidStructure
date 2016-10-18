package com.tnc.mvppattern.di.module;

import android.app.Activity;
import android.content.Context;

import com.tnc.mvppattern.di.ActivityContext;


import dagger.Module;
import dagger.Provides;

/**
 * Created by CUSDungVT on 10/3/2016.
 */
@Module
public class ActivityModule {
    private Activity mActivity;
    public ActivityModule(Activity activity){
        this.mActivity = activity;
    }

    @Provides
    Activity provideActivity(){
        return mActivity;
    }

    @Provides
    @ActivityContext
    Context provideContext(){
        return mActivity;
    }


}
