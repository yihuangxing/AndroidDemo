package com.app.demo.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.app.demo.bean.RecruitmentBean;

import java.util.ArrayList;
import java.util.List;

/**
 * author : yi.huangxing
 * date   : 2021/2/26/0026  16:24
 * desc   :
 */
public class RecruitmentDao {
    private RecruitmentDb mRecruitmentDb;
    private static final String TAG = "=======";

    public RecruitmentDao(Context context) {
        mRecruitmentDb = RecruitmentDb.getInstance(context);
    }


    public int  insert(String recruitment_name, String recruitment_dpt, String recruitment_form, String recruitment_time, String recruitment_number) {

        SQLiteDatabase db = mRecruitmentDb.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("recruitment_name", recruitment_name);
        values.put("recruitment_dpt", recruitment_dpt);
        values.put("recruitment_form", recruitment_form);
        values.put("recruitment_time", recruitment_time);
        values.put("recruitment_number", recruitment_number);
        String nullColumnHack = "values(null,?,?,?,?,?)";
        //执行
        int insert = (int) db.insert("recruitment_table", nullColumnHack, values);
        db.close();
        return insert;
    }


    public List<RecruitmentBean> queryAll() {
        List<RecruitmentBean> beanList = new ArrayList<>();

        SQLiteDatabase db = mRecruitmentDb.getReadableDatabase();

        String sql = "select _id,recruitment_name,recruitment_dpt,recruitment_form,recruitment_time,recruitment_number from recruitment_table";
        Cursor cursor = db.rawQuery(sql, null);
        while (cursor.moveToNext()) {
            int id = cursor.getInt(cursor.getColumnIndex("_id"));
            String name = cursor.getString(cursor.getColumnIndex("recruitment_name"));
            String dpt = cursor.getString(cursor.getColumnIndex("recruitment_dpt"));
            String form = cursor.getString(cursor.getColumnIndex("recruitment_form"));
            String time = cursor.getString(cursor.getColumnIndex("recruitment_time"));
            int number = cursor.getInt(cursor.getColumnIndex("recruitment_number"));
            beanList.add(new RecruitmentBean(name, dpt, form, time, number));
        }
        cursor.close();
        db.close();

        return beanList;
    }
}
