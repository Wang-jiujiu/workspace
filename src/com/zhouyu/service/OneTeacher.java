package com.zhouyu.service;

public class OneTeacher extends Teacher{
    private  Student student;
    @Override
    public void say() {
        super.say();
    }

    @Override
    public String toString() {
        return "OneTeacher{" +
                "student=" + student +
                '}';
    }
}
