package com.lx.mvpdemo.utils;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitUtils {

    public static AppService service;

    public static  AppService initRetrofit(){
        //添加一个log拦截器,打印所有的log
//        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        //可以设置请求过滤的水平,body,basic,headers
//        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        Retrofit retrofit = new Retrofit.Builder()
                .client(getOkHttpClient())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .baseUrl(Api.BASE_URL)
                .build();

      return  service = retrofit.create(AppService.class);
    }

    private static OkHttpClient getOkHttpClient() {
        //添加一个log拦截器,打印所有的log
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        //可以设置请求过滤的水平,body,basic,headers
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        //设置 请求的缓存的大小跟位置
//        val cacheFile = File(MyApplication.context.cacheDir, "cache")
//        val cache = Cache(cacheFile, 1024 * 1024 * 50) //50Mb 缓存的大小

        return new OkHttpClient.Builder()
                .addInterceptor(interceptor) //日志,所有的请求响应度看到
                .connectTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .writeTimeout(60, TimeUnit.SECONDS)
                .build();
    }

}
