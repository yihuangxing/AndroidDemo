package com.app.demo.bean;

/**
 * author : yi.huangxing
 * date   : 2021/2/26/0026  17:29
 * desc   :
 */
public class RecruitmentBean {
    private  String recruitment_name;
    private  String recruitment_dpt;
    private  String recruitment_form;
    private  String recruitment_time;
    private  int recruitment_number;


    public RecruitmentBean(String recruitment_name, String recruitment_dpt, String recruitment_form, String recruitment_time, int recruitment_number) {
        this.recruitment_name = recruitment_name;
        this.recruitment_dpt = recruitment_dpt;
        this.recruitment_form = recruitment_form;
        this.recruitment_time = recruitment_time;
        this.recruitment_number = recruitment_number;
    }

    public String getRecruitment_name() {
        return recruitment_name;
    }

    public void setRecruitment_name(String recruitment_name) {
        this.recruitment_name = recruitment_name;
    }

    public String getRecruitment_dpt() {
        return recruitment_dpt;
    }

    public void setRecruitment_dpt(String recruitment_dpt) {
        this.recruitment_dpt = recruitment_dpt;
    }

    public String getRecruitment_form() {
        return recruitment_form;
    }

    public void setRecruitment_form(String recruitment_form) {
        this.recruitment_form = recruitment_form;
    }

    public String getRecruitment_time() {
        return recruitment_time;
    }

    public void setRecruitment_time(String recruitment_time) {
        this.recruitment_time = recruitment_time;
    }

    public int getRecruitment_number() {
        return recruitment_number;
    }

    public void setRecruitment_number(int recruitment_number) {
        this.recruitment_number = recruitment_number;
    }
}
