package com.tnc.mvppattern;

import android.app.Application;
import android.content.Context;

import com.tnc.mvppattern.di.component.AppComponent;
import com.tnc.mvppattern.di.component.DaggerAppComponent;
import com.tnc.mvppattern.di.module.AppModule;

/**
 * Created by CUSDungVT on 10/18/2016.
 */

public class App extends Application{
    private AppComponent mAppComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public static App get(Context context){
        return (App)context.getApplicationContext();
    }
    public AppComponent getAppComponent(){
        return mAppComponent;
    }
}
