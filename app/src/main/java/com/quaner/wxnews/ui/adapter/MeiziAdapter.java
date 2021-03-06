package com.quaner.wxnews.ui.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.quaner.wxnews.R;
import com.quaner.wxnews.ui.entity.GankEntity;
import com.wxandroid.common.CommonApplication;
import com.wxandroid.common.utils.DensityUtil;
import com.wxandroid.common.utils.glide.GlideImgManager;
import com.wxandroid.common.widget.ScaleImageView;

import java.util.List;

/**
 * Created by wenxin
 */
public class MeiziAdapter extends BaseQuickAdapter<GankEntity, BaseViewHolder> {

    private int screenWidth;

    public MeiziAdapter(@Nullable List<GankEntity> data) {
        super(R.layout.item_meizi, data);
        screenWidth = DensityUtil.getWidth(CommonApplication.getContext());
    }

    @Override
    protected void convert(BaseViewHolder helper, final GankEntity item) {
        final ScaleImageView imageView = helper.getView(R.id.iv_photo);
        imageView.setOriginalSize(item.getItemWidth(),item.getItemHeight());
        GlideImgManager.loadImage(mContext,item.getUrl(),imageView);

    }
}
