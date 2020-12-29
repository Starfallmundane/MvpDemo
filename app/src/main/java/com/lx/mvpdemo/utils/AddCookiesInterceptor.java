package com.lx.mvpdemo.utils;

import android.util.Log;

import com.lx.mvpdemo.MyApplication;

import java.io.IOException;
import java.util.HashSet;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class AddCookiesInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request.Builder builder = chain.request().newBuilder();
        HashSet<String>  bkbsessionid = (HashSet<String>) PrefUtils.getInstance(MyApplication.getInstance()).getStringSet(ConstantsUtils.bkbsessionid);
        if (bkbsessionid != null) {
            for (String cookie : bkbsessionid) {
                builder.addHeader("Cookie", cookie);
                Log.v("OkHttp", "Adding Header: " + cookie); // This is done so I know which headers are being added; this interceptor is used after the normal logging of OkHttp
            }
        }
        return chain.proceed(builder.build());
    }
}
