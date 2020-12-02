package com.lx.mvpdemo.presenter;

import android.os.Environment;
import android.util.Log;

import com.lx.mvpdemo.bean.BaseResponse;
import com.lx.mvpdemo.contract.FileContract;
import com.lx.mvpdemo.listener.DownloadListener;
import com.lx.mvpdemo.utils.FileUtils;
import com.lx.mvpdemo.utils.RetrofitUtils;

import java.io.File;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

public class FilePresenter {

    private FileContract mRootView;



    public FilePresenter(FileContract mRootView) {
        this.mRootView = mRootView;
    }



    //上传图片
    public void putFile(String selectImagePath) {
        File file = new File(selectImagePath);
        RequestBody requestFile = RequestBody.create(MediaType.parse("image/*"), file);
        MultipartBody.Part map = MultipartBody.Part.createFormData("file", file.getName(), requestFile);
        Observable<BaseResponse<String>> observable = RetrofitUtils.initRetrofit().putFileData(map);
        observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1<BaseResponse<String>>() {

            @Override
            public void call(BaseResponse<String> baseResponse) {
                if (baseResponse != null && baseResponse.isSuccess()) {
                    Log.e("liuxing", "上传--请求成功" + baseResponse.toString());
                } else {
                    Log.e("liuxing", "上传--服务器错误" + baseResponse.getMsg());
                }
            }

        }, new Action1<Throwable>() {
            @Override
            public void call(Throwable throwable) {
                Log.e("liuxing", "上传--请求失败" + throwable.toString());
            }
        });
    }

    public void downloadFileNet(String downUrl) {
        String apkPath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath();
        String apkName = FileUtils.getFileName(downUrl);
        File savefile = new File(apkPath, apkName);
//        Timber.tag(MyApplication.tag).e("APK文件下载路径----" + downUrl);
        Observable<ResponseBody> observable = RetrofitUtils.initRetrofit().downloadFile(downUrl);
        observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1<ResponseBody>() {

            @Override
            public void call(ResponseBody baseResponse) {
                //下载文件放在子线程
                new Thread() {
                    @Override
                    public void run() {
                        super.run();
                        //保存到本地
                        FileUtils.writeFile2Disk2(baseResponse, savefile, new DownloadListener() {
                            @Override
                            public void onStart() {
                                Log.e("liuxing","开始下载");
                            }

                            @Override
                            public void onProgress(long currentLength, long totalLength) {
                                if (mRootView != null) {
                                    if (totalLength > 0) {
                                        Log.e("liuxing","下载进度=="+(int) (100 * currentLength / totalLength) + "%");
                                    }
                                }
                            }


                            @Override
                            public void onFinish(String path) {
                                Log.e("liuxing","下载完成");
                            }

                            @Override
                            public void onFail(String errorInfo) {
                                Log.e("liuxing","下载失败");
                            }
                        });

                    }
                }.start();


            }

        }, new Action1<Throwable>() {
            @Override
            public void call(Throwable throwable) {
                Log.e("liuxing", "上传--请求失败" + throwable.toString());
            }
        });
    }

}
