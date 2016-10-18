package com.tnc.mvppattern.di.component;

import com.tnc.mvppattern.di.ActivityScope;
import com.tnc.mvppattern.di.module.ActivityModule;
import com.tnc.mvppattern.feature.main.MainActivity;

import dagger.Component;

/**
 * Created by CUSDungVT on 10/3/2016.
 */
@ActivityScope
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(MainActivity mainActivity);
}
