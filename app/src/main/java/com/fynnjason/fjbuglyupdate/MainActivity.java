package com.fynnjason.fjbuglyupdate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.tencent.bugly.beta.Beta;
import com.tencent.bugly.beta.UpgradeInfo;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvUpdate = findViewById(R.id.tv_update);

        // 判断有没有新版本
        UpgradeInfo upgradeInfo = Beta.getUpgradeInfo();
        if (upgradeInfo == null) {
            tvUpdate.setText("已是最新版本");
        } else {
            tvUpdate.setText("有新版本");
        }
    }

    // 点击按钮后检测版本更新
    public void onCheckUpdate(View view) {
        Beta.checkUpgrade();
        Log.e(TAG, "onCheckUpdate: ");
    }


}
