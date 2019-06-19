package com.xcdh.target.Spring.Proxy.JDKDynamicProxy.SimpleMode;

/**
 * Project:
 *
 * File: UserClass
 *
 * Description:
 *
 * @author: MikeLC
 *
 * @date: 2018/11/5 下午 03:47
 *
 * Copyright ( c ) 2018
 *
 */
public class UserClass {


    public String findUser(String userId) {
        System.out.println("UserClass.findUser");
        return userId;
    }


}