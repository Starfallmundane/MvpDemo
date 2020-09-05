package com.lx.mvpdemo.presenter;

import android.util.Log;

import com.lx.mvpdemo.bean.ArticleBean;
import com.lx.mvpdemo.bean.BannerBrandBean;
import com.lx.mvpdemo.bean.BaseResponse;
import com.lx.mvpdemo.contract.MainContract;
import com.lx.mvpdemo.lister.OnNetFinishedListener;
import com.lx.mvpdemo.model.MainModel;
import com.lx.mvpdemo.utils.ConstantsUtils;
import com.lx.mvpdemo.utils.RetrofitUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import okhttp3.RequestBody;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

public class MainPresenter {

    private MainContract mRootView;
    private MainModel model;

    public MainPresenter(MainContract mRootView) {
        this.mRootView = mRootView;
        model=new MainModel();
    }


    //轮播图网络请求：get
    public void getBannerData() {
        Observable<BaseResponse<BannerBrandBean>> observable = RetrofitUtils.initRetrofit().getBannerNet();
        observable.subscribeOn(Schedulers.io()).
                observeOn(AndroidSchedulers.mainThread()).
                subscribe(new Action1<BaseResponse<BannerBrandBean>>() {
                              @Override
                              public void call(BaseResponse<BannerBrandBean> baseResponse) {
                                  Log.e("liuxing", "轮播图--请求成功" );
                                  if (baseResponse != null && baseResponse.isSuccess()) {
//                                      Log.e("liuxing", "轮播图--请求成功" + baseResponse.toString());
                                      if (baseResponse.getData()!=null){
                                          mRootView.showBannerDataSuccess(baseResponse.getData());
                                      }
                                  } else {
                                      Log.e("liuxing", "轮播图--服务器错误" + baseResponse.getMsg());
                                  }
                              }

                          }, new Action1<Throwable>() {
                              @Override
                              public void call(Throwable throwable) {
                                  mRootView.showHttpResult(true, false);
                                  Log.e("liuxing", "轮播图--请求失败" + throwable.toString());
                              }
                          }, new Action0() {
                              @Override
                              public void call() {
                                  Log.e("liuxing", "轮播图--请求完成");
                              }
                          }
                );
    }

    //文章列表的网络请求：Post
    public void getArticleData(int pageNum) {
        Map<String, RequestBody> map = new HashMap<>();
        map.put("pageNum", RequestBody.create(null, pageNum + ""));
        map.put("pageSize", RequestBody.create(null, ConstantsUtils.pageSize + ""));
        Observable<BaseResponse<List<ArticleBean>>> observable = RetrofitUtils.initRetrofit().getArticleNet(map);
        observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1<BaseResponse<List<ArticleBean>>>() {

            @Override
            public void call(BaseResponse<List<ArticleBean>> baseResponse) {
                if (baseResponse != null && baseResponse.isSuccess()) {
                    Log.e("liuxing", "文章列表--请求成功" + baseResponse.toString());
                    mRootView.showArticleDataSuccess(baseResponse.getData());
                } else {
                    Log.e("liuxing", "文章列表--服务器错误" + baseResponse.getMsg());
                }
            }

        }, new Action1<Throwable>() {
            @Override
            public void call(Throwable throwable) {
                Log.e("liuxing", "文章列表--请求失败" + throwable.toString());
            }
        });
    }

    //文章详情的网络请求：Post  （抽取了一个model）
    public void requestArticleDetailsNet(int articleID) {
        Map<String, RequestBody> map = new HashMap<>();
        map.put("newsId", RequestBody.create(null, articleID+""));
        model.getArticleDetailsData(map, new OnNetFinishedListener<ArticleBean>() {

            @Override
            public void onNetSuccess(ArticleBean data) {
                mRootView.showArticleDetailsNet(data);
            }

            @Override
            public void onNetError(boolean error, boolean empty) {
                mRootView.showHttpResult(error,empty);
            }


        });
    }
}
