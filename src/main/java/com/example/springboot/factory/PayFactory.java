package com.example.springboot.factory;

/**
 * @description
 * @version 1.0.0
 * @author xuzhaochao
 * @date 2020年02月26日 15:21:00
 */
public abstract class PayFactory {

    public void init() {
        System.out.println("初始化支付设置");

    }
}