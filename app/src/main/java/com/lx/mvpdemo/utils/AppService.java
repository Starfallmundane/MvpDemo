package com.lx.mvpdemo.utils;

import com.lx.mvpdemo.bean.ArticleBean;
import com.lx.mvpdemo.bean.BannerBrandBean;
import com.lx.mvpdemo.bean.BaseResponse;

import java.util.List;
import java.util.Map;

import okhttp3.RequestBody;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PartMap;
import rx.Observable;

public interface AppService {

    /**
     * 首页轮播图和品牌
     */
    @POST("/kjzj_app/homePage/open/getBanner")
    Observable<BaseResponse<BannerBrandBean>> getBannerNet();

    /**
     * 首页资讯列表
     */
    @Multipart
    @POST("/kjzj_app/homePage/open/getHomePageNews")
    Observable<BaseResponse<List<ArticleBean>>> getArticleNet(@PartMap Map<String, RequestBody> bodyMap);

    @Multipart
    @POST("/kjzj_app/news/open/selectNewsDetails")
    Observable<BaseResponse<ArticleBean>> getArticleDetailsNet(@PartMap Map<String, RequestBody> bodyMap);
}
