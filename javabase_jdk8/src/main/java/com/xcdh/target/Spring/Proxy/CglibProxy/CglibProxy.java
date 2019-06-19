package com.xcdh.target.Spring.Proxy.CglibProxy;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Project: 
 *
 * File: UserManagerProxy
 *
 * Description: 
 *
 * @author: MikeLC
 *
 * @date: 2018/11/5 下午 02:37
 *
 * Copyright ( c ) 2018
 *
 */
public class CglibProxy implements MethodInterceptor {

    /**
     * 在enhancer中有一个setCallBack(this)
     * 这样就实现了代理类和委托类的关联
     */
    private Enhancer enhancer=new Enhancer();

    /**
     *  创建代理类对象
     */
    public  Object  createProxy(Class clazz){
        //设置公共的接口或者公共的类
        enhancer.setSuperclass(clazz);
        //建立关联关系
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("satrt-->>"); //系统级业务   开始事务
        Object result= methodProxy.invokeSuper(o,objects);  // 主业务
        System.out.println("end-->>"); //系统级业务     日志处理  关闭事务
        return result;
    }

}