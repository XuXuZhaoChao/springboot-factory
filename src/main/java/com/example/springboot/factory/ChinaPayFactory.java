package com.example.springboot.factory;

/**
 * @description
 * @version 1.0.0
 * @author xuzhaochao
 * @date 2020年02月26日 15:58:00
 */
public class ChinaPayFactory extends PayFactory {

    protected IPay createWeiXinPay() {
        super.init();
        return new WeiXinPay();
    }


    protected IPay createAliPay() {
        super.init();
        return new AliPay();
    }


    protected IPay createUniPay() {
        super.init();
        return new UniPay();
    }
}