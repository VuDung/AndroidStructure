package com.tnc.mvppattern.di.module;

import android.app.Application;
import android.content.Context;

import com.tnc.mvppattern.data.local.AppPrefs;
import com.tnc.mvppattern.di.AppContext;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by CUSDungVT on 10/3/2016.
 */
@Module
public class AppModule {
    private final Application mApp;
    public AppModule(Application app){
        this.mApp = app;
    }

    @Provides
    Application provideApplication(){
        return mApp;
    }

    @Provides
    @AppContext
    Context provideAppContext(){
        return mApp.getApplicationContext();
    }

    @Provides
    @Singleton
    AppPrefs provideAppPrefs(){
        return new AppPrefs(mApp);
    }

}
