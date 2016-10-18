package com.tnc.mvppattern.base;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tnc.mvppattern.di.component.ActivityComponent;

import butterknife.ButterKnife;

/**
 * Created by CUSDungVT on 10/3/2016.
 */

public abstract class BaseFragment extends Fragment{
    protected abstract @LayoutRes int layoutRes();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        int layoutRes = layoutRes();
        if(layoutRes != 0){
            View v = inflater.inflate(layoutRes, container, false);
            ButterKnife.bind(this, v);
            return v;
        }else {
            return super.onCreateView(inflater, container, savedInstanceState);
        }
    }

    public ActivityComponent getActivityComponent(){
        return ((BaseActivity)getActivity()).getActivityComponent();
    }
}
