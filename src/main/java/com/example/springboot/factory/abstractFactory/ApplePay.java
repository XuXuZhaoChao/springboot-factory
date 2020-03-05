package com.example.springboot.factory.abstractFactory;

/**
 * @description
 * @version 1.0.0
 * @author xuzhaochao
 * @date 2020年02月26日 15:59:00
 */
public class ApplePay implements IPay {

    @Override
    public void pay() {
        System.out.println("苹果支付");
    }
}