package com.example.springboot.factory.abstractFactory;

/**
 * @description 复杂的产品工厂
 * @version 1.0.0
 * @author xuzhaochao
 * @date 2020年02月26日 16:05:00
 */
public class AbstractPayFactoryTest {

    public static void main(String[] args) {
        ChinaAbstractPayFactory payFactory = new ChinaAbstractPayFactory();
        payFactory.createWeiXinPay().pay();

        ForeignAbstractPayFactory foreignPayFactory = new ForeignAbstractPayFactory();
        foreignPayFactory.createApplePay().pay();
    }
}