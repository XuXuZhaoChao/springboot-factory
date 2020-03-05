package com.example.springboot.factory.abstractFactory;

/**
 * @description
 * @version 1.0.0
 * @author xuzhaochao
 * @date 2020年02月26日 15:58:00
 */
public class ForeignAbstractPayFactory extends AbstractPayFactory {

    protected IPay createApplePay(){
        super.init();
        return new ApplePay();
    }
}