package com.lx.mvpdemo.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.lx.mvpdemo.R;
import com.lx.mvpdemo.base.BaseActivity;
import com.lx.mvpdemo.bean.User2Bean;
import com.lx.mvpdemo.contract.HearderContract;
import com.lx.mvpdemo.presenter.HeaderPresenter;
import com.lx.mvpdemo.utils.ConstantsUtils;
import com.lx.mvpdemo.utils.PrefUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HeaderActivity extends BaseActivity implements HearderContract {


    @BindView(R.id.bt_test1)
    Button btTest1;
    @BindView(R.id.bt_test2)
    Button btTest2;
    @BindView(R.id.tv_result1)
    TextView tvResult1;
    @BindView(R.id.tv_result2)
    TextView tvResult2;
    private HeaderPresenter mPresenter;
    private String bkbsessionid;

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_header;
    }

    @Override
    protected void initView() {
        mPresenter = new HeaderPresenter(this);

    }

    @Override
    public Activity getActivity() {
        return null;
    }

    @Override
    public void showLoginSuccess(String bkbsessionid) {
        this.bkbsessionid = bkbsessionid;
        PrefUtils.getInstance(this).put(ConstantsUtils.bkbsessionid2, bkbsessionid);
        tvResult1.setText(bkbsessionid);
    }

    @Override
    public void showIsLoginSuccess(User2Bean mUser2Bean) {
        tvResult2.setText(mUser2Bean.toString());
    }


    @OnClick({R.id.bt_test1, R.id.bt_test2})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.bt_test1:
                mPresenter.loginNet();
                break;
            case R.id.bt_test2:
                mPresenter.isloginNet();
                break;
        }
    }


}