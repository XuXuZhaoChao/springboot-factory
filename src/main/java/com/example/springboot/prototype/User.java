package com.example.springboot.prototype;

import java.io.Serializable;

/**
 * @description
 * @version 1.0.0
 * @author xuzhaochao
 * @date 2020年03月01日 13:27:00
 */
public class User implements Serializable,Cloneable {

    private String name;

    private Address address;

    public User(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    protected User clone() throws CloneNotSupportedException {
        User user = (User) super.clone();
        //不加下面就是浅克隆,加上下面就是深克隆;
        //user.setAddress(this.address.clone());
        return user;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}