package com.example.springboot.component;

/**
 * @description 顶层的抽象组件
 * @version 1.0.0
 * @author xuzhaochao
 * @date 2020年03月08日 14:29:00
 */
public abstract class CourseComponent {

    public void addChild(CourseComponent catalogComponent){
       throw new UnsupportedOperationException("不支持添加操作");
    }

    public void removeChild(CourseComponent catalogComponent){
        throw new UnsupportedOperationException("不支持删除操作");
    }

    public String getName(CourseComponent catalogComponent){
        throw new UnsupportedOperationException("不支持获取名称操作");
    }

    public double getPrice(CourseComponent catalogComponent){
        throw new UnsupportedOperationException("不支持获取价格操作");
    }

    public void print(){
        throw new UnsupportedOperationException("不支持打印操作");
    }
}