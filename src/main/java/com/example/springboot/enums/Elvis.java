package com.example.springboot.enums;

import com.example.springboot.pojo.User;

/**
 * @description 枚举式单例 代码反编译后是恶汉式单例
 * @version 1.0.0
 * @author xuzhaochao
 * @date 2020年02月27日 11:44:00
 */
public enum Elvis {

    INSTANCE;

    private User user;

    //私有化枚举的构造函数
    private Elvis() {
        user = new User();
    }

    public User getUserInstance(){
        return user;
    }

    public Elvis getInstance(){
        return INSTANCE;
    }

    public Object readResolve(){
        // return user;
        // 避免反序列化创建新实例
        return INSTANCE;
    }
}