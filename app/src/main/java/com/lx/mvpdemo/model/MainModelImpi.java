package com.lx.mvpdemo.model;

import com.lx.mvpdemo.lister.OnNetFinishedListener;

import java.util.Map;

import okhttp3.RequestBody;

public interface MainModelImpi {

    void getArticleDetailsData(Map<String, RequestBody> map, OnNetFinishedListener listener);
}
