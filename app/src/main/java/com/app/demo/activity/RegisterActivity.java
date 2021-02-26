package com.app.demo.activity;

import android.util.Log;
import android.view.View;

import androidx.appcompat.widget.Toolbar;

import com.app.demo.R;
import com.app.demo.base.BaseActivity;
import com.app.demo.bean.RecruitmentBean;
import com.app.demo.db.RecruitmentDao;

import java.util.List;


public class RegisterActivity extends BaseActivity {
    private static final String TAG = "RegisterActivity";
    private Toolbar mToolbar;
    private RecruitmentDao mRecruitmentDao;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_register;
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