package com.lx.mvpdemo.presenter;

import android.util.Log;

import com.lx.mvpdemo.bean.BaseResponse;
import com.lx.mvpdemo.bean.BaseResponse2;
import com.lx.mvpdemo.bean.BaseResponse3;
import com.lx.mvpdemo.bean.ReportBean;
import com.lx.mvpdemo.bean.UserBean;
import com.lx.mvpdemo.contract.ReportContract;
import com.lx.mvpdemo.utils.RetrofitUtils;

import java.util.HashMap;
import java.util.Map;

import okhttp3.RequestBody;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

public class ReportPresenter {

    private ReportContract mRootView;


    public ReportPresenter(ReportContract mRootView) {
        this.mRootView = mRootView;
    }


    /**
     * 模拟网络请求得到数据
     */
    public void getData(boolean isRefresh) {
            //?uid=3&id=82
            Map<String, RequestBody> map = new HashMap<>();
            map.put("uid", RequestBody.create(null,  "3"));
            map.put("id", RequestBody.create(null,  "82"));
            Observable<BaseResponse3<ReportBean>> observable = RetrofitUtils.initRetrofit().getReportNet(map);
            observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1<BaseResponse3<ReportBean>>() {


                @Override
                public void call(BaseResponse3<ReportBean> baseResponse) {
                    if (baseResponse != null && baseResponse.isSuccess()) {
                        Log.e("liuxing", "举报--请求成功" + baseResponse.toString());
//                        mRootView.showLoginSuccess(baseResponse.getData());
                    } else {
                        Log.e("liuxing", "举报--服务器错误" + baseResponse.getMsg());
                    }
                }

            }, new Action1<Throwable>() {
                @Override
                public void call(Throwable throwable) {
                    Log.e("liuxing", "举报--请求失败" + throwable.toString());
                }
            });

    }
}
