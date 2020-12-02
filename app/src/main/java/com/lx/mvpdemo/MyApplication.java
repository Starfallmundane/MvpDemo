package com.lx.mvpdemo;

import android.app.Application;

public class MyApplication extends Application {

    private static MyApplication instance;

    public static boolean isFreshCollet=false;
    public static boolean isFreshCategoryCollet=false;


    @Override
    public void onCreate() {
        super.onCreate();
        instance=this;

    }

    /**
     * 获得实例
     *
     * @return
     */
    public static MyApplication getInstance() {
        return instance;
    }
}
