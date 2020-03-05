package com.example.springboot.decorator;

/**
 * @description 扩展咕泡的抽象装饰器
 * @version 1.0.0
 * @author xuzhaochao
 * @date 2020年03月05日 09:35:00
 */
public abstract class LoginGperPageDecorator extends GperPage {

    private GperPage gperPage;

    public LoginGperPageDecorator(GperPage gperPage) {
        this.gperPage = gperPage;
    }

    @Override
    protected String gperPage() {
        return this.gperPage.gperPage();
    }
}