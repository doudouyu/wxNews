package com.quaner.wxnews;


import com.quaner.wxnews.common.AppComponent;
import com.quaner.wxnews.common.DaggerAppComponent;
import com.quaner.wxnews.http.module.ServiceModule;
import com.wxandroid.common.CommonApplication;

/**
 * Created by wenxin
 */
public class Application extends CommonApplication {

    AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent
                .builder()
                .appModule(getAppModule())
                .httpModule(getHttpModule())
                .serviceModule(new ServiceModule())
                .build();
    }


    public AppComponent getAppComponent() {
        return appComponent;
    }


}
