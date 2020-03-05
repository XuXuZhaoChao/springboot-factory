package com.example.springboot.proxy.staticproxy;

/**
 * @description 代理对象角色
 * @version 1.0.0
 * @author xuzhaochao
 * @date 2020年03月02日 11:51:00
 */
public class ZhangLaoSan implements IPerson {

    private ZhangSan zhangSan;

    public ZhangLaoSan(ZhangSan zhangSan) {
        this.zhangSan = zhangSan;
    }

    @Override
    public void findLove() {
        before();
        zhangSan.findLove();
        after();
    }

    @Override
    public void buyInsurance(int money) {
        zhangSan.buyInsurance(money);
    }

    private void before(){
        System.out.println("张老三开始物色");
    }

    private void after(){
        System.out.println("开始恋爱");
    }
}