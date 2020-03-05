package com.example.springboot.factory.methodFactory;

/**
 * @description
 * @version 1.0.0
 * @author xuzhaochao
 * @date 2020年02月26日 18:34:00
 */
public class JavaFactory implements CourseFactory{

    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}