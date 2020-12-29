package com.lx.mvpdemo.presenter;

import android.util.Log;

import com.lx.mvpdemo.bean.BaseResponse3;
import com.lx.mvpdemo.bean.BaseResponse4;
import com.lx.mvpdemo.bean.ReportBean;
import com.lx.mvpdemo.bean.User2Bean;
import com.lx.mvpdemo.contract.HearderContract;
import com.lx.mvpdemo.contract.ReportContract;
import com.lx.mvpdemo.utils.RetrofitUtils;

import java.util.HashMap;
import java.util.Map;

import okhttp3.RequestBody;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

public class HeaderPresenter {

    private HearderContract mRootView;


    public HeaderPresenter(HearderContract mRootView) {
        this.mRootView = mRootView;
    }


    /**
     * 测试1
     */
    public void loginNet() {
            Map<String, RequestBody> map = new HashMap<>();
            map.put("channel", RequestBody.create(null,  "android"));
            map.put("phone", RequestBody.create(null,  "13293062616"));
            map.put("password", RequestBody.create(null,  "12345"));
            Observable<BaseResponse4<User2Bean>> observable = RetrofitUtils.initRetrofit().loginNet(map);
            observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1<BaseResponse4<User2Bean>>() {


                @Override
                public void call(BaseResponse4<User2Bean> baseResponse) {
                    if (baseResponse != null && baseResponse.isSuccess()) {
                        Log.e("liuxing", "登陆--请求成功" + baseResponse.toString());
                        mRootView.showLoginSuccess(baseResponse.getData().getSessionId());
                    } else {
                        Log.e("liuxing", "登陆--服务器错误" + baseResponse.getMsg());
                    }
                }

            }, new Action1<Throwable>() {
                @Override
                public void call(Throwable throwable) {
                    Log.e("liuxing", "登陆--请求失败" + throwable.toString());
                }
            });

    }

    /**
     * 测试2
     */
    public void isloginNet() {
        Map<String, RequestBody> map = new HashMap<>();
        map.put("channel", RequestBody.create(null,  "android"));
        Observable<BaseResponse4<User2Bean>> observable = RetrofitUtils.initRetrofit().isloginNet(map);
        observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1<BaseResponse4<User2Bean>>() {


            @Override
            public void call(BaseResponse4<User2Bean> baseResponse) {
                if (baseResponse != null && baseResponse.isSuccess()) {
                    Log.e("liuxing", "检查--请求成功" + baseResponse.toString());
                    mRootView.showIsLoginSuccess(baseResponse.getData());
                } else {
                    Log.e("liuxing", "检查--服务器错误" + baseResponse.getMsg());
                }
            }

        }, new Action1<Throwable>() {
            @Override
            public void call(Throwable throwable) {
                Log.e("liuxing", "检查--请求失败" + throwable.toString());
            }
        });

    }
}
