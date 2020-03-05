package com.example.springboot.decorator;

/**
 * @description 装饰器模式
 * @version 1.0.0
 * @author xuzhaochao
 * @date 2020年03月05日 09:50:00
 */
public class DecoratorTest {

    public static void main(String[] args) {
        GperPage gperPage = new BaseGperPage();
        System.out.println("基础页面 ：" + gperPage.gperPage());
        //给基本页面【BaseGperPage】加配置
        gperPage = new HomeWorkDecorator(gperPage);
        gperPage = new QuestionBankDecorator(gperPage);
        gperPage = new GrowDecorator(gperPage);
        System.out.println("登录后页面 ：" + gperPage.gperPage());
    }
}