package com.zhouyu.service;

public class Teacher {
    public Student student =new Student("张三");
    public void say (){
        System.out.println(student);
    }

    @Override
    public String toString() {
        return "Teacher{}";
    }
}
