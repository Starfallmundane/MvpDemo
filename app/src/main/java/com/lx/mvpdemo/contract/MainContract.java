package com.lx.mvpdemo.contract;

import com.lx.mvpdemo.bean.ArticleBean;
import com.lx.mvpdemo.bean.BannerBrandBean;

import java.util.List;

public interface MainContract {


        void showBannerDataSuccess(BannerBrandBean data);

        void showArticleDataSuccess(List<ArticleBean> data);

        void showArticleDetailsNet(ArticleBean data);

        void showHttpResult(boolean error, boolean empty);

}
