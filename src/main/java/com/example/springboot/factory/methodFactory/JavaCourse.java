package com.example.springboot.factory.methodFactory;

/**
 * @description
 * @version 1.0.0
 * @author xuzhaochao
 * @date 2020年02月26日 18:32:00
 */
public class JavaCourse implements ICourse {

    @Override
    public void record() {
        System.out.println("录制 java课程");
    }
}