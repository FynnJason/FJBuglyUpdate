package com.fynnjason.fjbuglyupdate;

import android.app.Application;

import com.tencent.bugly.Bugly;
import com.tencent.bugly.beta.Beta;


public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // 配置bugly
        Beta.autoCheckUpgrade = false; // 是否自动检测更新
        Beta.enableHotfix = false; // 是否热更新
        Beta.upgradeDialogLayoutId = R.layout.layout_app_update; // 自定义布局
        // 初始化
        Bugly.init(this, "341bb2e515", true);

    }
}
