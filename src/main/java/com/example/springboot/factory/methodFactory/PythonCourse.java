package com.example.springboot.factory.methodFactory;

/**
 * @description
 * @version 1.0.0
 * @author xuzhaochao
 * @date 2020年02月26日 18:33:00
 */
public class PythonCourse implements ICourse {

    @Override
    public void record() {
        System.out.println("录制 python课程");
    }
}