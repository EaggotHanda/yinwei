package com.example.yinweiapplication.ui;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.yinweiapplication.R;
import com.example.yinweiapplication.utils.AppUtils;

public class SplashActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        startAction();
    }
    //判断是否为第一次启动
    private void startAction() {
        Intent intent;
        if (AppUtils.isFirst(getApplicationContext())){
             intent = new Intent(this,GuidActivity.class);
        }else {
             intent = new Intent(this,MainActivity.class);
        }
        startActivity(intent);
    }


}
