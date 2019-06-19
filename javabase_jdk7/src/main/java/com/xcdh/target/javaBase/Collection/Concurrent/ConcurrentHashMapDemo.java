package com.xcdh.target.javaBase.Collection.Concurrent;

import org.junit.Test;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Project:
 *
 * File: ConcurrentHashMapDemo
 *
 * Description:
 *
 * @author: MikeLC
 *
 * @date: 2018/11/6 下午 11:08
 *
 * Copyright ( c ) 2018
 *
 */
public class ConcurrentHashMapDemo {

    @Test
    public void simpleDemo(){
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put("123","23");
    }

}
