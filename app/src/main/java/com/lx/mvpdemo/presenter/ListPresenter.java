package com.lx.mvpdemo.presenter;

import android.os.Environment;
import android.os.Handler;
import android.util.Log;

import com.lx.mvpdemo.bean.BaseResponse;
import com.lx.mvpdemo.contract.FileContract;
import com.lx.mvpdemo.contract.ListContract;
import com.lx.mvpdemo.listener.DownloadListener;
import com.lx.mvpdemo.utils.FileUtils;
import com.lx.mvpdemo.utils.RetrofitUtils;
import com.lx.mvpdemo.utils.ToastUtils;

import java.io.File;
import java.util.ArrayList;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

public class ListPresenter {

    private ListContract mRootView;
    private int page=1;


    public ListPresenter(ListContract mRootView) {
        this.mRootView = mRootView;
    }


    /**
     * 模拟网络请求得到数据
     */
    public void getData(boolean isRefresh) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //要执行的操作
                if (isRefresh){
                    page=1;
                }
                ArrayList<String> newData=new ArrayList();
                for (int i = 1; i <21 ; i++) {
                    newData.add("第"+page+"页,,,,第"+i+"条数据");
                }
                page++;
                mRootView.getDataSuccess(isRefresh,newData);
            }
        }, 1500);//2秒后执行Runnable中的run方法

    }
}
