package com.quaner.wxnews.ui.presenter;


import com.quaner.wxnews.ui.entity.GankEntity;

import java.util.List;

/**
 * Created by wenxin
 */
public interface IMeiziPresenter {

    interface View {
        void hideLoading();

        void hideLoadingMore(boolean isFail);

        void setData(List<GankEntity> results);

        void addData(List<GankEntity> results);

    }

    interface Presenter {

        void getMeiziData(String type, int page, int add);
    }
}