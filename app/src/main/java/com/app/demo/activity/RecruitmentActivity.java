package com.app.demo.activity;


import android.content.Intent;
import android.util.Log;
import android.view.View;

import androidx.appcompat.widget.Toolbar;

import com.app.demo.R;
import com.app.demo.base.BaseActivity;
import com.app.demo.bean.RecruitmentBean;
import com.app.demo.db.RecruitmentDao;

import java.util.List;

public class RecruitmentActivity extends BaseActivity {
    private static final String TAG = "==============";
    private RecruitmentDao mRecruitmentDao;
    private Toolbar mToolbar;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_recruitment_activity;
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

        findViewById(R.id.btn_recruitment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RecruitmentActivity.this,AddRecruitmentActivity.class));
            }
        });

    }

    @Override
    protected void initData() {


        mRecruitmentDao = new RecruitmentDao(this);
        List<RecruitmentBean> beanList = mRecruitmentDao.queryAll();
        Log.d(TAG, "initData: "+beanList.size());
    }
}