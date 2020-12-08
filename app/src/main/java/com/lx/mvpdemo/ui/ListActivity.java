package com.lx.mvpdemo.ui;

import android.app.Activity;
import android.util.Log;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.lx.mvpdemo.R;
import com.lx.mvpdemo.adapter.TextAdapter;
import com.lx.mvpdemo.base.BaseActivity;
import com.lx.mvpdemo.contract.ListContract;
import com.lx.mvpdemo.presenter.ListPresenter;
import com.lx.mvpdemo.view.DefaultFooter;
import com.lx.mvpdemo.view.DefaultHeader;
import com.lx.mvpdemo.view.SpringView;

import java.util.ArrayList;

import butterknife.BindView;

public class ListActivity extends BaseActivity implements ListContract, SpringView.OnFreshListener {

    @BindView(R.id.rl_list)
    RecyclerView mRecyclerView;
    @BindView(R.id.sv_fresh)
    SpringView mSpringView;
    private TextAdapter mQuickAdapter;
    private ListPresenter mPresenter;

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_list;
    }

    @Override
    protected void initView() {
        mPresenter = new ListPresenter(this);

        mSpringView.setType(SpringView.Type.FOLLOW);
        mSpringView.setHeader(new DefaultHeader(this));
        mSpringView.setFooter(new DefaultFooter(this));
        mSpringView.setListener(this);

        mQuickAdapter = new TextAdapter();
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setAdapter(mQuickAdapter);

    }

    @Override
    protected void initData() {
        mPresenter.getData(true);
    }

    @Override
    public void onRefresh() {
        Log.e("liuxing","刷新数据");
        mPresenter.getData(true);
    }

    @Override
    public void onLoadmore() {
        Log.e("liuxing","加载更多");
        mPresenter.getData(false);
    }

    @Override
    public Activity getActivity() {
        return this;
    }

    @Override
    public void getDataSuccess(boolean isRefresh,ArrayList<String> newData) {
        mSpringView.onFinishFreshAndLoad();//刷新完成
        if (isRefresh){     //刷新，清除数据，再重新添加新数据
            mQuickAdapter.setList(newData);
        }else{      //加载更多
            mQuickAdapter.addData(newData);
        }
    }
}