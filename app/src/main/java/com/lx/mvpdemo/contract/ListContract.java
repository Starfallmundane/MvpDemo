package com.lx.mvpdemo.contract;

import android.app.Activity;

import java.util.ArrayList;

public interface ListContract {

        Activity getActivity();

       void  getDataSuccess(boolean isRefresh,ArrayList<String> mData);
}
