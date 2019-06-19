package com.xcdh.target.Spring.Proxy.JDKDynamicProxy;

/**
 * Project:
 *
 * File: UserManagerImpl
 *
 * Description:
 *
 * @author: MikeLC
 *
 * @date: 2018/11/5 下午 02:36
 *
 * Copyright ( c ) 2018
 *
 */
public class UserManagerImpl implements UserManager {

    @Override
    public void addUser(String userId, String userName) {
        System.out.println("UserManagerImpl.addUser");
    }

    @Override
    public void delUser(String userId) {
        System.out.println("UserManagerImpl.delUser");
    }

    @Override
    public String findUser(String userId) {
        System.out.println("UserManagerImpl.findUser");
        return userId;
    }

    @Override
    public void modifyUser(String userId, String userName) {
        System.out.println("UserManagerImpl.modifyUser");
    }

}