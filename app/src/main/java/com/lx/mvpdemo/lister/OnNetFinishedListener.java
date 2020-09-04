package com.lx.mvpdemo.lister;

public interface OnNetFinishedListener<T> {

    void onNetSuccess(T data);

    void onNetError(boolean error, boolean empty);
}
