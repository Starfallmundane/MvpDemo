package com.lx.mvpdemo;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.lx.mvpdemo.base.BaseActivity;
import com.lx.mvpdemo.bean.ArticleBean;
import com.lx.mvpdemo.bean.BannerBrandBean;
import com.lx.mvpdemo.bean.UserBean;
import com.lx.mvpdemo.contract.MainContract;
import com.lx.mvpdemo.event.MessageEvent;
import com.lx.mvpdemo.presenter.MainPresenter;
import com.lx.mvpdemo.ui.FileActivity;
import com.lx.mvpdemo.ui.HeaderActivity;
import com.lx.mvpdemo.ui.HuiActivity;
import com.lx.mvpdemo.ui.ListActivity;
import com.lx.mvpdemo.ui.ReportActivity;
import com.lx.mvpdemo.ui.TimeActivity;
import com.lx.mvpdemo.utils.ToastUtils;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity implements MainContract {

    @BindView(R.id.bt_banner)
    Button btBanner;
    @BindView(R.id.bt_article)
    Button btArticle;
    @BindView(R.id.bt_login)
    Button btLogin;
    @BindView(R.id.tv_result)
    TextView tvResult;
    @BindView(R.id.bt_details)
    Button btDetails;
    private MainPresenter mPresenter;
    private int pageNumb = 1;
    private int index = 0;

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        EventBus.getDefault().register(this);
        mPresenter = new MainPresenter(this);
    }

    @OnClick({R.id.bt_banner, R.id.bt_article, R.id.bt_login, R.id.bt_details, R.id.bt_eventbus,
            R.id.bt_bigpic, R.id.bt_file, R.id.bt_list, R.id.bt_huiyuan,R.id.bt_time,R.id.bt_header})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.bt_banner:
                requestBannerNet();
                break;
            case R.id.bt_article:
                requestArticleNet();
                break;
            case R.id.bt_login:
                requestLoginNet();
                break;
            case R.id.bt_details:
                requestArticleDetailsNet();
                break;
            case R.id.bt_eventbus:
                index++;
                EventBus.getDefault().post(MessageEvent.getInstance("我是刘星" + index));
                break;
            case R.id.bt_bigpic:

                break;
            case R.id.bt_file:       //跳转
                startActivity(new Intent(MainActivity.this, FileActivity.class));

                break;
            case R.id.bt_list:       //跳转
                startActivity(new Intent(MainActivity.this, ListActivity.class));

                break;
            case R.id.bt_huiyuan:       //跳转
                startActivity(new Intent(MainActivity.this, HuiActivity.class));

                break;
            case R.id.bt_time:       //倒计时
                startActivity(new Intent(MainActivity.this, TimeActivity.class));

                break;
            case R.id.bt_report:       //倒计时
                startActivity(new Intent(MainActivity.this, ReportActivity.class));

                break;
            case R.id.bt_header:       //测试cookie
                startActivity(new Intent(MainActivity.this, HeaderActivity.class));

                break;
        }
    }

    private void requestLoginNet() {
        mPresenter.loginData();
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

    @Override
    public void showLoginSuccess(UserBean data) {
        tvResult.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        tvResult.setText("请求登陆数据成功：\n" + data.toString());
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

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onGetMessage(MessageEvent message) {
        tvResult.setText(message.message);
    }
}