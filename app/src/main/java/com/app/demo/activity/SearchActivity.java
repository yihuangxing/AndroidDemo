package com.app.demo.activity;

import android.view.View;

import androidx.appcompat.widget.Toolbar;

import com.app.demo.R;
import com.app.demo.base.BaseActivity;

public class SearchActivity extends BaseActivity {
    private Toolbar mToolbar;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_search;
    }

    @Override
    protected void initViews() {
        mToolbar = findViewById(R.id.toolbar);
    }

    @Override
    protected void setListener() {
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    protected void initData() {

    }
}