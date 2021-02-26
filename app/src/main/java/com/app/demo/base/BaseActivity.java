package com.app.demo.base;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * author : yi.huangxing
 * date   : 2021/2/26/0026  12:33
 * desc   :
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(getLayoutId());
        initViews();
        setListener();
        initData();
    }


    protected abstract int getLayoutId();

    protected abstract void initViews();

    protected abstract void setListener();

    protected abstract void initData();


    protected  void BastToast(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
