package com.lx.mvpdemo.contract;

import android.app.Activity;

import com.lx.mvpdemo.bean.User2Bean;

import java.util.ArrayList;

public interface HearderContract {

        Activity getActivity();

       void  showLoginSuccess(String bkbsessionid);

       void  showIsLoginSuccess(User2Bean mUser2Bean);
}
