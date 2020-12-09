package com.lx.mvpdemo.ui;

import android.util.Log;

import com.lx.mvpdemo.R;
import com.lx.mvpdemo.adapter.BannerHuiAdapter;
import com.lx.mvpdemo.base.BaseActivity;
import com.lx.mvpdemo.bean.HuiBean;
import com.youth.banner.Banner;
import com.youth.banner.listener.OnBannerListener;
import com.youth.banner.listener.OnPageChangeListener;

import java.util.ArrayList;

import butterknife.BindView;

public class HuiActivity extends BaseActivity {

    @BindView(R.id.banner)
    Banner banner;

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_hui;
    }

    @Override
    protected void initView()  {
        ArrayList<HuiBean> huiData=new ArrayList();
        for (int i = 1; i <100 ; i++) {
            huiData.add(new HuiBean("Lv."+i));
        }
        //设置适配器
        BannerHuiAdapter bannerHomeAdapter = new BannerHuiAdapter(huiData,this);
        banner.setAdapter(bannerHomeAdapter);

        //添加画廊效果
        banner.setBannerGalleryEffect(140, 10);

        banner.addOnPageChangeListener(new OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                Log.e("liuxing","onPageScrolled==="+position);
//                bannerHomeAdapter.setSelect(position);
            }

            @Override
            public void onPageSelected(int position) {

                Log.e("liuxing","onPageSelected==="+position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                Log.e("liuxing","onPageScrollStateChanged==="+state);
            }
        });

    }

}