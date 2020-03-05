package com.example.springboot.pojo;

/**
 * @description
 * @version 1.0.0
 * @author xuzhaochao
 * @date 2020年02月29日 17:39:00
 */
public class Student {

    public Student() {
        System.out.println("******* 学生类构造函数 ********");
    }

    @Override
    public String toString() {
        return "学生信息";
    }
}