package com.lx.mvpdemo.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.lx.mvpdemo.R;
import com.lx.mvpdemo.base.BaseActivity;

import cn.iwgang.countdownview.CountdownView;

public class TimeActivity extends BaseActivity {

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_time;
    }

    @Override
    protected void initView() {

        long time1 = (long) 2 * 24 * 60 * 60 * 1000;
        CountdownView cv_convertDaysToHours1 = (CountdownView) findViewById(R.id.cv_convertDaysToHours1);
        cv_convertDaysToHours1.start(time1);

        CountdownView cv_convertDaysToHours2 = (CountdownView) findViewById(R.id.cv_convertDaysToHours2);
        long time2 = (long) 1 * 24 * 60 * 60 * 1000;
        cv_convertDaysToHours2.start(time2);
    }
}