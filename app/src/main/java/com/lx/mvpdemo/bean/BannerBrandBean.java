package com.lx.mvpdemo.bean;

import java.util.ArrayList;

public class BannerBrandBean {

    public ArrayList<BannerBean> bannerList;

    public ArrayList<BrandBean> hotEntList;

    public ArrayList<BannerBean> getBannerList() {
        return bannerList;
    }

    public void setBannerList(ArrayList<BannerBean> bannerList) {
        this.bannerList = bannerList;
    }

    public ArrayList<BrandBean> getHotEntList() {
        return hotEntList;
    }

    public void setHotEntList(ArrayList<BrandBean> hotEntList) {
        this.hotEntList = hotEntList;
    }

    @Override
    public String toString() {
        return "BannerBrandBean{" +
                "bannerList=" + bannerList.toString() +
                ", hotEntList=" + hotEntList.toString() +
                '}';
    }
}
