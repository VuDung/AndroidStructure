package com.tnc.mvppattern.feature.main;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.tnc.mvppattern.R;
import com.tnc.mvppattern.base.BaseActivity;
import com.tnc.mvppattern.widget.ViewPagerFragmentAdapter;

import butterknife.BindView;

public class MainActivity extends BaseActivity {

    @BindView(R.id.toolbar) Toolbar mToolbar;
    @BindView(R.id.tabLayout) TabLayout mTabLayout;
    @BindView(R.id.viewPager) ViewPager mViewPager;

    private ViewPagerFragmentAdapter mPagerAdapter;
    private static final String[] TITLES = new String[]{"Queue", "Finished"};
    private static final String TAG = MainActivity.class.getSimpleName();
    @Override
    protected int layoutRes() {
        return R.layout.activity_main;
    }

    @Override
    protected void afterBind() {
        getActivityComponent().inject(this);

        mPagerAdapter = new ViewPagerFragmentAdapter(getSupportFragmentManager());
        mPagerAdapter.addFragment(TITLES[0], new FragmentQueue());
        mPagerAdapter.addFragment(TITLES[1], new FragmentFinished());
        mViewPager.setAdapter(mPagerAdapter);
        mViewPager.setCurrentItem(0);
        mViewPager.addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener(){
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
            }
        });

        mTabLayout.setupWithViewPager(mViewPager);
    }

}
