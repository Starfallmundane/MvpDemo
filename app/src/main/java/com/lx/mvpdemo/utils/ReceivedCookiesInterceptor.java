package com.lx.mvpdemo.utils;

import android.content.SharedPreferences;


import com.lx.mvpdemo.MyApplication;

import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;

import okhttp3.Interceptor;
import okhttp3.Response;

public class ReceivedCookiesInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Response originalResponse = chain.proceed(chain.request());

        if (!originalResponse.headers("Set-Cookie").isEmpty()) {
            HashSet<String> cookies = new HashSet<>();

            for (String header : originalResponse.headers("Set-Cookie")) {
                cookies.addAll(Collections.singleton(header));
            }
            PrefUtils.getInstance(MyApplication.getInstance()).put(ConstantsUtils.bkbsessionid, cookies);
//            SharedPreferences.Editor config = MyApplication.getContext().getSharedPreferences("config", MyApplication.getContext().MODE_PRIVATE).edit();
//            config.putStringSet("cookie", cookies);
//            config.apply();
        }

        return originalResponse;
    }

}
