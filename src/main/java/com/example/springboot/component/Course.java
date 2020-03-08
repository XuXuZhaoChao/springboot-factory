package com.example.springboot.component;

/**
 * @description 课程类
 * @version 1.0.0
 * @author xuzhaochao
 * @date 2020年03月08日 14:34:00
 */
public class Course extends CourseComponent {

    private String name;
    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(CourseComponent catalogComponent) {
        return this.name;
    }

    @Override
    public double getPrice(CourseComponent catalogComponent) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println(name + " (¥" + price + "元)");
    }
}