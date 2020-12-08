package com.lx.mvpdemo.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.lx.mvpdemo.R;

import org.jetbrains.annotations.NotNull;

public class TextAdapter extends BaseQuickAdapter<String, BaseViewHolder> {

    public TextAdapter() {
        super(R.layout.item_text);
    }

    @Override
    protected void convert(@NotNull BaseViewHolder helper, @NotNull String item) {
        int position=helper.getAdapterPosition();
        helper.setText(R.id.tv_item_text, (position+1)+"===="+item);
    }
}
