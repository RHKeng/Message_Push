package com.example.keng.message_push;

import android.app.Service;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cn.jpush.android.api.JPushInterface;

public class MainActivity extends AppCompatActivity {

    private Vibrator vibrator = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //创建vibrator对象
        vibrator = (Vibrator) getSystemService(Service.VIBRATOR_SERVICE);
        //参数表示：在开启震动后3秒开始持续1秒的震动，-1代表不重复震动
        vibrator.vibrate(new long[]{3000,1000},-1);

        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
    }
}
