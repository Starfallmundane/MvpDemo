package com.lx.mvpdemo.model;

import android.util.Log;

import com.lx.mvpdemo.bean.ArticleBean;
import com.lx.mvpdemo.bean.BaseResponse;
import com.lx.mvpdemo.lister.OnNetFinishedListener;
import com.lx.mvpdemo.model.impi.MainModelImpi;
import com.lx.mvpdemo.utils.RetrofitUtils;

import java.util.Map;

import okhttp3.RequestBody;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

public class MainModel implements MainModelImpi {

    public void getArticleDetailsData(Map<String, RequestBody> map, OnNetFinishedListener listener) {
        Observable<BaseResponse<ArticleBean>> observable = RetrofitUtils.initRetrofit().getArticleDetailsNet(map);
        observable.subscribeOn(Schedulers.io()).
                observeOn(AndroidSchedulers.mainThread()).
                subscribe(new Action1<BaseResponse<ArticleBean>>() {
                    @Override
                    public void call(BaseResponse<ArticleBean> baseResponse) {
                        if (baseResponse != null && baseResponse.isSuccess()) {
                            Log.e("liuxing", "文章详情--请求成功" + baseResponse.toString());
                            if (baseResponse.getData() != null) {
                                listener.onNetSuccess(baseResponse.getData());
                            } else {
                                listener.onNetError(false, false);       //数据为空
                            }
                        } else {
                            listener.onNetError(true, false);
                            Log.e("liuxing", "文章详情--服务器错误" + baseResponse.getMsg());
                        }
                    }

                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        Log.e("liuxing", "文章详情--请求失败" + throwable.toString());
                        listener.onNetError(true, false);
                    }
                });
    }
}
