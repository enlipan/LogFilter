package com.example.lee.logfilter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.lee.logfilter.logger.SLog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SLog.d("OnCreate");
    }
}
