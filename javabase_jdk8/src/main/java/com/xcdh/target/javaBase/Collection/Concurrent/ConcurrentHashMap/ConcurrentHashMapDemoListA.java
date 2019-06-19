package com.xcdh.target.javaBase.Collection.Concurrent.ConcurrentHashMap;


import org.junit.Test;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Project: 
 *
 * File: HashMapDemoListA
 *
 * Description: 
 *
 * @author: MikeLC
 *
 * @date: 2018/10/30 下午 04:55
 *
 * Copyright ( c ) 2018
 *
 */
public class ConcurrentHashMapDemoListA {


    @Test
    public void simpleDemo(){
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put("A","123");
    }

}