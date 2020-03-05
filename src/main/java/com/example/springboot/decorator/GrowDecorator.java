package com.example.springboot.decorator;

/**
 * @description
 * @version 1.0.0
 * @author xuzhaochao
 * @date 2020年03月05日 09:42:00
 */
public class GrowDecorator extends LoginGperPageDecorator {

    public GrowDecorator(GperPage gperPage) {
        super(gperPage);
    }

    @Override
    protected String gperPage() {
        return super.gperPage() + ",成长墙模块";
    }
}