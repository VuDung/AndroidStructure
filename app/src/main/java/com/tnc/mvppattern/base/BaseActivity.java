package com.tnc.mvppattern.base;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;


import com.tnc.mvppattern.App;
import com.tnc.mvppattern.di.component.ActivityComponent;
import com.tnc.mvppattern.di.component.DaggerActivityComponent;
import com.tnc.mvppattern.di.module.ActivityModule;

import butterknife.ButterKnife;

/**
 * Created by CUSDungVT on 10/3/2016.
 */

public abstract class BaseActivity extends AppCompatActivity{
    protected abstract @LayoutRes int layoutRes();
    protected abstract void afterBind();

    private ActivityComponent mActivityComponent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int layoutRes = layoutRes();
        if(layoutRes != 0){
            setContentView(layoutRes);
            ButterKnife.bind(this);
        }
        afterBind();
    }

    public ActivityComponent getActivityComponent(){
        if(mActivityComponent == null) {
            mActivityComponent = DaggerActivityComponent.builder()
                    .appComponent(App.get(this).getAppComponent())
                    .activityModule(new ActivityModule(this))
                    .build();
        }
        return mActivityComponent;
    }
}
