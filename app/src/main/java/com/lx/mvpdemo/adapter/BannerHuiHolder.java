package com.lx.mvpdemo.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lx.mvpdemo.R;

public class BannerHuiHolder extends RecyclerView.ViewHolder {
    public TextView tv_item_hui_name;

    public BannerHuiHolder(@NonNull View view) {
        super(view);
        this.tv_item_hui_name = (TextView) view.findViewById(R.id.tv_item_hui_name);
    }
}