package com.lx.mvpdemo.utils;

import android.text.TextUtils;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.lx.mvpdemo.MyApplication;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitUtils {

    public static AppService service;

    public static AppService initRetrofit() {
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

        return service = retrofit.create(AppService.class);
    }

    private static OkHttpClient getOkHttpClient() {
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

        //添加一个log拦截器,打印所有的log
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        //可以设置请求过滤的水平,body,basic,headers
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        httpClient.addInterceptor(interceptor); //日志,所有的请求响应度看到

        /**
         *  方案一：Retrofit请求头上添加cookie，持久化token
         *  效果：Adding Header: bkbsessionid=feccf707-3209-42a7-9e36-777a12af54b0; Path=/; Domain=zhaobanzhilian.com; Expires=Fri, 08 Jan 2021 01:34:12 GMT; Max-Age=863999; HttpOnly; SameSite=Lax
         */
//        httpClient.addInterceptor(new AddCookiesInterceptor()); //日志,所有的请求响应度看到
//        httpClient.addInterceptor(new ReceivedCookiesInterceptor()); //日志,所有的请求响应度看到

        /**
         * 方案二：Cookie的缓存处理
         * cookieJar: 设置Cookie处理器，用于从HTTP响应中接收Cookie，并且可以将Cookie提供给即将发起的请求。该参数默认值为
         */
//        httpClient.cookieJar(new CookieJar() {
//            @Override
//            public void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {    //保存cookie
//                if (list != null && list.size() > 0 && list.toString().contains("JSESSIONID")) {
//                    cookieStore.put(httpUrl.host(), list);
//                    Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
//                    PrefUtils.getInstance(MyApplication.getInstance()).put(ConstantsUtils.bkbsessionid, gson.toJson(cookieStore));
//                }
//            }
//
//            @Override
//            public List<Cookie> loadForRequest(HttpUrl httpUrl) {       //加载cookie
//                List<Cookie> cookies = cookieStore.get(httpUrl.host());
//                Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
//                String bkbsessionid = PrefUtils.getInstance(MyApplication.getInstance()).getString(ConstantsUtils.bkbsessionid2);
//                if (!TextUtils.isEmpty(bkbsessionid)) {
//                    Type type = new TypeToken<Map<String, List<Cookie>>>() {}.getType();
//                    Map<String, List<Cookie>> map = gson.fromJson(bkbsessionid, type);
//                    cookies = map.get(httpUrl.host());
//                }
//                return cookies != null ? cookies : new ArrayList<Cookie>();
//            }
//        });

        /**
         * 方案二：Retrofit请求头上添加请求头
         * 效果：Set-Cookie: bkbsessionid=d3b1f5ab-2656-4fe6-ad5b-5e0daadcaf0f; Path=/; Domain=zhaobanzhilian.com; Expires=Fri, 08 Jan 2021 01:38:29 GMT; Max-Age=863999; HttpOnly; SameSite=Lax
         */
//        String bkbsessionid2 = PrefUtils.getInstance(MyApplication.getInstance()).getString(ConstantsUtils.bkbsessionid2);
//        if (!TextUtils.isEmpty(bkbsessionid2)) {
//            Log.e("liuxing", "请求头==" + bkbsessionid2);
//            httpClient.addInterceptor(new Interceptor() {
//                @Override
//                public Response intercept(Interceptor.Chain chain) throws IOException {
//                    Request oldRequest = chain.request();
//                    HashMap<String, String> headersMap = new HashMap<>();
//                    headersMap.put("bkbsessionid", bkbsessionid2);
//                    Request request = oldRequest.newBuilder()
//                            .headers(Headers.of(headersMap))//注入头信息
//                            .build();
//                    return chain.proceed(request);
//                }
//            });
//        }


        return httpClient
                .connectTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .writeTimeout(60, TimeUnit.SECONDS)
                .build();

    }

}
