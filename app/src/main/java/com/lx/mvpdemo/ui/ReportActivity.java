package com.lx.mvpdemo.ui;

import android.app.Activity;

import com.lx.mvpdemo.R;
import com.lx.mvpdemo.base.BaseActivity;
import com.lx.mvpdemo.contract.ReportContract;
import com.lx.mvpdemo.presenter.ReportPresenter;

public class ReportActivity extends BaseActivity implements ReportContract {
    private ReportPresenter mPresenter;

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_report;
    }

    @Override
    protected void initView() {
        mPresenter = new ReportPresenter(this);
    }

    @Override
    public Activity getActivity() {
        return this;
    }
}