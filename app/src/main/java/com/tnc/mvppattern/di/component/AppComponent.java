package com.tnc.mvppattern.di.component;

import android.app.Application;
import android.content.Context;

import com.tnc.mvppattern.App;
import com.tnc.mvppattern.data.local.AppPrefs;
import com.tnc.mvppattern.di.AppContext;
import com.tnc.mvppattern.di.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by CUSDungVT on 10/3/2016.
 */

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    @AppContext
    Context context();
    Application application();
    AppPrefs appPrefs();

    void inject(App app);
}
