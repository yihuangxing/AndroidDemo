package com.app.demo.activity;

import android.text.TextUtils;
import android.view.View;

import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.Toolbar;

import com.app.demo.R;
import com.app.demo.base.BaseActivity;
import com.app.demo.db.RecruitmentDao;
import com.app.demo.db.RecruitmentDb;

import org.w3c.dom.Text;

public class AddRecruitmentActivity extends BaseActivity {
    private Toolbar mToolbar;
    private AppCompatEditText mrecruitment_name, mrecruitment_dpt, mrecruitment_form, mrecruitment_time, mrecruitment_number;

    private RecruitmentDao mRecruitmentDao;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_add_recruitment;
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

        findViewById(R.id.btn_publish).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mrecruitment_name = findViewById(R.id.recruitment_name);
                mrecruitment_dpt = findViewById(R.id.recruitment_dpt);
                mrecruitment_form = findViewById(R.id.recruitment_form);
                mrecruitment_time = findViewById(R.id.recruitment_time);
                mrecruitment_number = findViewById(R.id.recruitment_number);


                if (TextUtils.isEmpty(mrecruitment_name.getText().toString().trim())) {
                    BastToast("请输入岗位名称");
                } else if (TextUtils.isEmpty(mrecruitment_dpt.getText().toString().trim())) {
                    BastToast("请输入招聘部门");
                } else if (TextUtils.isEmpty(mrecruitment_form.getText().toString().trim())) {
                    BastToast("请输入用工形式");
                } else if (TextUtils.isEmpty(mrecruitment_time.getText().toString().trim())) {
                    BastToast("请输入招聘时间");
                } else if (TextUtils.isEmpty(mrecruitment_number.getText().toString().trim())) {
                    BastToast("请输入招聘数量");
                } else {
                    if (null != mRecruitmentDao) {
                        int insert = mRecruitmentDao.insert(
                                mrecruitment_name.getText().toString(),
                                mrecruitment_dpt.getText().toString(),
                                mrecruitment_form.getText().toString(),
                                mrecruitment_time.getText().toString(),
                                mrecruitment_number.getText().toString());

                        if (insert != -1) {
                            BastToast("发布成功");
                            finish();
                        }
                    }
                }
            }
        });
    }

    @Override
    protected void initData() {
        mRecruitmentDao = new RecruitmentDao(this);
    }
}