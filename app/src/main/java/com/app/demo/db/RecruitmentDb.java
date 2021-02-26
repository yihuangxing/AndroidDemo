package com.app.demo.db;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

/**
 * author : yi.huangxing
 * date   : 2021/2/26/0026  16:04
 * desc   :
 */
public class RecruitmentDb extends SQLiteOpenHelper {
    private static final String TAG = "===========";
    public static RecruitmentDb mRecruitmentDb;

    private static final String DB_NAME = "recruitment_info.db";
    private static final int VERSION = 1;

    public RecruitmentDb(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public synchronized static RecruitmentDb getInstance(Context context) {
        if (null == mRecruitmentDb) {
            mRecruitmentDb = new RecruitmentDb(context, DB_NAME, null, VERSION);
        }
        return mRecruitmentDb;
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table recruitment_table (_id integer primary key autoincrement, " +
                "recruitment_name text," +     //岗位名称
                "recruitment_dpt text," +      //招聘部门
                "recruitment_form text," +     //用工形式
                "recruitment_time text," +    //招聘时间
                "recruitment_number integer)" +  // 招聘数量
                "");


        Log.d(TAG, "onCreate: j建表成功");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
