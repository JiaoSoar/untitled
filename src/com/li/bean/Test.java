package com.li.bean;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> aClass = Class.forName("com.li.bean.User");
        System.out.println(aClass);
    }
}
