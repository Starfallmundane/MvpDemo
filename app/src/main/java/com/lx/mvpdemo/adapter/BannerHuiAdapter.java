package com.lx.mvpdemo.adapter;

import android.content.Context;
import android.view.ViewGroup;

import com.lx.mvpdemo.R;
import com.lx.mvpdemo.bean.HuiBean;
import com.youth.banner.adapter.BannerAdapter;
import com.youth.banner.util.BannerUtils;

import java.util.List;

/**
 * 自定义布局，图片
 */
public class BannerHuiAdapter extends BannerAdapter<HuiBean, BannerHuiHolder> {

    private Context mContext;
    public BannerHuiAdapter(List<HuiBean> mDatas, Context mContext) {
        //设置数据，也可以调用banner提供的方法,或者自己在adapter中实现
        super(mDatas);
        this.mContext=mContext;
    }

    //更新数据
    public void updateData(List<HuiBean> data) {
        //这里的代码自己发挥，比如如下的写法等等
        mDatas.clear();
        mDatas.addAll(data);
        notifyDataSetChanged();
    }

    //创建ViewHolder，可以用viewType这个字段来区分不同的ViewHolder
    @Override
    public BannerHuiHolder onCreateHolder(ViewGroup parent, int viewType) {
        return new BannerHuiHolder(BannerUtils.getView(parent, R.layout.item_hui_banner));
    }

    @Override
    public void onBindView(BannerHuiHolder holder, HuiBean item, int position, int size) {
        holder.tv_item_hui_name.setText(item.getName());
        if (position<5){
            holder.tv_item_hui_name.setBackgroundResource(R.drawable.orange_cir_11);
        }else{
            holder.tv_item_hui_name.setBackgroundResource(R.drawable.gray_cir_11);
        }
    }
}
