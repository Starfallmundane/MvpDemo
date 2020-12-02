package com.lx.mvpdemo.presenter;

import android.os.Environment;
import android.util.Log;

import com.lx.mvpdemo.bean.BaseResponse;
import com.lx.mvpdemo.contract.FileContract;
import com.lx.mvpdemo.listener.DownloadListener;
import com.lx.mvpdemo.utils.FileUtils;
import com.lx.mvpdemo.utils.RetrofitUtils;
import com.lx.mvpdemo.utils.ToastUtils;

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
        //#######：记住上传文件，穿的是文件File，内部是用文件流的形式传给后台接收的，不再是普通的字符串
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

    //下载文件
    public void downloadFileNet(String downUrl) {
        //下载存储文件地址
        String apkPath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath();
        //下载存储文件名字
        String apkName = FileUtils.getFileName(downUrl);
        //下载存储的文件
        File savefile = new File(apkPath, apkName);
        //#######注意：下载的路径是一个全路径地址，和项目域名已经没有关系，注意AppService.downloadFile()的配置，已经变了形式
        Observable<ResponseBody> observable = RetrofitUtils.initRetrofit().downloadFile(downUrl);
        observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1<ResponseBody>() {

            @Override
            public void call(ResponseBody baseResponse) {
                //下载文件放在子线程
                new Thread() {
                    @Override
                    public void run() {
                        super.run();
                        //下载监听并且保存到本地，这里你用个dialog显示下载进度会更好，都是这么做的，我这里只是打印了下下载日志
                        FileUtils.writeFile2Disk2(baseResponse, savefile, new DownloadListener() {
                            @Override
                            public void onStart() {
                                ToastUtils.showToast(mRootView.getActivity(), "开始下载");
                                Log.e("liuxing", "开始下载");
                            }

                            @Override
                            public void onProgress(long currentLength, long totalLength) {
                                if (mRootView != null) {
                                    if (totalLength > 0) {
                                        Log.e("liuxing", "下载进度==" + (int) (100 * currentLength / totalLength) + "%");
                                    }
                                }
                            }


                            @Override
                            public void onFinish(String path) {
                                ToastUtils.showToast(mRootView.getActivity(), "下载完成");
                                Log.e("liuxing", "下载完成");
                            }

                            @Override
                            public void onFail(String errorInfo) {
                                ToastUtils.showToast(mRootView.getActivity(), "下载失败");
                                Log.e("liuxing", "下载失败");
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
