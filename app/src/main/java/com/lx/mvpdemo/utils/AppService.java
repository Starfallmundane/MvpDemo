package com.lx.mvpdemo.utils;

import com.lx.mvpdemo.bean.ArticleBean;
import com.lx.mvpdemo.bean.BannerBrandBean;
import com.lx.mvpdemo.bean.BaseResponse;
import com.lx.mvpdemo.bean.BaseResponse2;
import com.lx.mvpdemo.bean.BaseResponse3;
import com.lx.mvpdemo.bean.ReportBean;
import com.lx.mvpdemo.bean.UserBean;

import java.util.List;
import java.util.Map;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Streaming;
import retrofit2.http.Url;
import rx.Observable;

public interface AppService {

    /**
     * 首页轮播图和品牌
     */
    @POST("/kjzj_app/homePage/open/getBanner")
    Observable<BaseResponse<BannerBrandBean>> getBannerNet();

    /**
     * 登陆 http://182.254.174.100:8080/pintuan/user/login
     */
    @Multipart
    @POST("/pintuan/user/login")
    Observable<BaseResponse2<UserBean>> loginData(@PartMap Map<String, RequestBody> bodyMap);


    /**
     * 首页资讯列表
     */
    @Multipart
    @POST("/kjzj_app/homePage/open/getHomePageNews")
    Observable<BaseResponse<List<ArticleBean>>> getArticleNet(@PartMap Map<String, RequestBody> bodyMap);

    @Multipart
    @POST("/kjzj_app/news/open/selectNewsDetails")
    Observable<BaseResponse<ArticleBean>> getArticleDetailsNet(@PartMap Map<String, RequestBody> bodyMap);

    @Multipart
    @POST("/Home/Index/reportTaskInfo")
    Observable<BaseResponse3<ReportBean>> getReportNet(@PartMap Map<String, RequestBody> bodyMap);


    /**
     * 上传文件
     */
    @Multipart
    @POST("/kjzj_app/user/updateHeadPic")
    Observable<BaseResponse<String>> putFileData(@Part MultipartBody.Part body);

    /**
     * 下载文件
     */
    @Streaming //大文件时要加不然会OOM
    @GET
    Observable<ResponseBody> downloadFile(@Url String fileUrl);
}
