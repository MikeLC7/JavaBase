package com.xcdh.target.Spring.Proxy.staticProxy;

/**
 * Project:
 *
 * File: TestDemo
 *
 * Description:
 *
 * @author: MikeLC
 *
 * @date: 2018/11/5 下午 02:39
 *
 * Copyright ( c ) 2018
 *
 */
public class TestDemo {

    public static void main(String[]args){
        UserManager userManager = new UserManagerProxy(new UserManagerImpl());
        System.out.println(userManager.findUser("testDemo"));
    }

}
