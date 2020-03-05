package com.example.springboot.prototype;

import java.io.Serializable;

/**
 * @description
 * @version 1.0.0
 * @author xuzhaochao
 * @date 2020年03月01日 13:27:00
 */
public class Address implements Serializable,Cloneable {

    private String city;
    private String country;

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    protected Address clone() throws CloneNotSupportedException {
        return  (Address)super.clone();
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}