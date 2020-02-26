package com.example.springboot.factory;

/**
 * @description
 * @version 1.0.0
 * @author xuzhaochao
 * @date 2020年02月26日 16:05:00
 */
public class AbstractPayFactoryTest {

    public static void main(String[] args) {
        ChinaPayFactory payFactory = new ChinaPayFactory();
        payFactory.createWeiXinPay().pay();

        ForeignPayFactory foreignPayFactory = new ForeignPayFactory();
        foreignPayFactory.createApplePay().pay();
    }
}