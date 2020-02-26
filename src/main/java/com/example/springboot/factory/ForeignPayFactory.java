package com.example.springboot.factory;

/**
 * @description
 * @version 1.0.0
 * @author xuzhaochao
 * @date 2020年02月26日 15:58:00
 */
public class ForeignPayFactory extends PayFactory {

    protected IPay createApplePay(){
        super.init();
        return new ApplePay();
    }
}