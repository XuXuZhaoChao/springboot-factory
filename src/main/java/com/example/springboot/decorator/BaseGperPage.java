package com.example.springboot.decorator;

/**
 * @description 基础页面
 * @version 1.0.0
 * @author xuzhaochao
 * @date 2020年03月05日 09:32:00
 */
public class BaseGperPage extends GperPage {

    @Override
    protected String gperPage() {
        return "问答模块" + ",文章模块" + ",精品课模块" + ",冒泡模块" + ",商城模块";
    }
}