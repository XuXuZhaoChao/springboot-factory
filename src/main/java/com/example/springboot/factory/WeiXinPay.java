package com.example.springboot.factory;

/**
 * @description
 * @version 1.0.0
 * @author xuzhaochao
 * @date 2020年02月26日 15:59:00
 */
public class WeiXinPay implements IPay{

    @Override
    public void pay() {
        System.out.println("微信支付");
    }
}