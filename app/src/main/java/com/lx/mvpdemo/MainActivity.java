package com.lx.mvpdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.lx.mvpdemo.base.BaseActivity;
import com.lx.mvpdemo.bean.ArticleBean;
import com.lx.mvpdemo.bean.BannerBrandBean;
import com.lx.mvpdemo.contract.MainContract;
import com.lx.mvpdemo.presenter.MainPresenter;
import com.lx.mvpdemo.utils.ToastUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity implements MainContract {

    @BindView(R.id.bt_banner)
    Button btBanner;
    @BindView(R.id.bt_article)
    Button btArticle;
    @BindView(R.id.tv_result)
    TextView tvResult;
    @BindView(R.id.bt_details)
    Button btDetails;
    private MainPresenter mPresenter;
    private int pageNumb = 1;

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        //ButterKnife.bind(this);
        mPresenter = new MainPresenter(this);
    }

    @OnClick({R.id.bt_banner, R.id.bt_article,R.id.bt_details})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.bt_banner:
                requestBannerNet();
                break;
            case R.id.bt_article:
                requestArticleNet();
                break;
            case R.id.bt_details:
                requestArticleDetailsNet();
                break;
        }
    }

    //调用P层，请求轮播图数据
    private void requestBannerNet() {
        mPresenter.getBannerData();
    }

    //调用P层，请求文章列表数据
    private void requestArticleNet() {
        mPresenter.getArticleData(pageNumb);
    }

    //调用P层，请求文章详情数据
    private void requestArticleDetailsNet() {
        mPresenter.requestArticleDetailsNet(185);
    }

    /**
     * P层请求数据后得到结果，会交给Contract，返给V层来处理数据显示效果
     * 轮播图请求成功，得到数据
     */
    @Override
    public void showBannerDataSuccess(BannerBrandBean data) {
        tvResult.setTextColor(getResources().getColor(R.color.blue));
        tvResult.setText("请求轮播图数据成功：\n" + data.toString());
    }

    /**
     * P层请求数据后得到结果，会交给Contract，返给V层来处理数据显示效果
     * 文章列表请求成功，得到数据
     */
    @Override
    public void showArticleDataSuccess(List<ArticleBean> data) {
        tvResult.setTextColor(getResources().getColor(R.color.green));
        tvResult.setText("请求文章列表数据成功：\n" + data.toString());
    }

    /**
     * P层请求数据后得到结果，会交给Contract，返给V层来处理数据显示效果
     * 文章详情请求成功，得到数据
     */
    @Override
    public void showArticleDetailsNet(ArticleBean data) {
        tvResult.setTextColor(getResources().getColor(R.color.red));
        tvResult.setText("请求文章详情数据成功：\n" + data.toString());
    }

    /**
     * P层请求数据后得到结果，会交给Contract，返给V层来处理数据显示效果
     * 数据请求失败，显示空界面或者错误界面
     */
    @Override
    public void showHttpResult(boolean error, boolean empty) {
        /**
         * 真正开发中，项目都会要求做这个空界面和错误界面效果，
         * 但是这个效果都是最后在开发设置，当然前期能准备好就准备好，最后直接改界面就行
         * 这个现在有自定义好的控件，直接一个控件搞定，要做找我要
         */
        if (error) {
            ToastUtils.showToast(this, "请求服务器错误，显示错误界面");
        } else if (empty) {
            ToastUtils.showToast(this, "没有数据啦，显示空界面");
        }

    }

}