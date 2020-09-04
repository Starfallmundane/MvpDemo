package com.lx.mvpdemo.base;

import android.app.ProgressDialog;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseActivity extends AppCompatActivity {

    private ProgressDialog progress;
    private Unbinder bind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResId());
        //绑定ButterKnife
        bind = ButterKnife.bind(this);
        initView();
        initData();
        initListener();
    }

    protected abstract int getLayoutResId();

    protected abstract void initView();

    protected void initData() {

    }

    protected void initListener() {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //解除绑定ButterKnife
        bind.unbind();
    }

    void showProgress() {
        progress = new ProgressDialog(this);
        progress.show();

    }

    void dissProgress() {
        if (progress != null) {
            progress.dismiss();
        }
    }


}