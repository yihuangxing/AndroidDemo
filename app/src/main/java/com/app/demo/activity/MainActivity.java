package com.app.demo.activity;

import android.content.Intent;
import android.view.View;

import com.app.demo.R;
import com.app.demo.base.BaseActivity;

public class MainActivity extends BaseActivity {


    @Override
    protected  int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initViews() {

    }

    @Override
    protected void setListener() {
        findViewById(R.id.btn_search).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SearchActivity.class));
            }
        });

        findViewById(R.id.btn_recruitment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RecruitmentActivity.class));
            }
        });
    }

    @Override
    protected void initData() {

    }
}