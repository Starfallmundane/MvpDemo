package com.lx.mvpdemo.listener;

/**
 * 文件下载的监听
 */
public interface DownloadListener {

    void onStart();//下载开始

    void onProgress(long currentLength, long totalLength);//下载进度

    void onFinish(String path);//下载完成

    void onFail(String errorInfo);//下载失败
}
