package com.app.demo.activity;

import android.content.Intent;
import android.view.View;

import com.app.demo.R;
import com.app.demo.base.BaseActivity;

public class LoginActivity extends BaseActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    protected void initViews() {

    }

    @Override
    protected void setListener() {
        findViewById(R.id.btn_register).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            }
        });

        findViewById(R.id.btn_login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, MainActivity.class));
            }
        });
    }

    @Override
   protected void initData() {

    }
}