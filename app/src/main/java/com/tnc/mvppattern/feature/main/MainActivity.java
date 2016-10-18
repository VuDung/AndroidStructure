package com.tnc.mvppattern.feature.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tnc.mvppattern.R;
import com.tnc.mvppattern.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected int layoutRes() {
        return R.layout.activity_main;
    }

    @Override
    protected void afterBind() {
        getActivityComponent().inject(this);
    }

}
