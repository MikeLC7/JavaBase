package com.xcdh.target.javaBase.base;


import org.junit.Test;

/**
 * Project:
 *
 * File: DemoList
 *
 * Description:
 *
 * @author: MikeLC
 *
 * @date: 2018/11/5 下午 11:38
 *
 * Copyright ( c ) 2018
 *
 */
public class DemoList {

    class TestClass{

    }

    @Test
    public void demo1(){
        TestClass testClass = new TestClass();
        System.out.println(testClass.getClass());
        System.out.println(TestClass.class);
        System.out.println(testClass.getClass().equals(TestClass.class));
        System.out.println(testClass.getClass() == TestClass.class);
    }

}
