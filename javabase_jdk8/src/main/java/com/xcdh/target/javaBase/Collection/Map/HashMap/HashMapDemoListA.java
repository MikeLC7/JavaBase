package com.xcdh.target.javaBase.Collection.Map.HashMap;


import org.junit.Test;

import java.util.HashMap;
import java.util.Hashtable;

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
public class HashMapDemoListA {

    @Test
    public void hashTableHashDemo(){
        String key = new String("abc");
        int h;
        System.out.println(key.hashCode());
        System.out.println((key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16));
        System.out.println();
    }

    @Test
    public void hashTableIndexDemo3(){
        int hash = 1;
        int hash2 = 17;
        int n = 8;
        for (int i=1;i<=5;i++){
            n = n * 2;
            System.out.println("n="+n);
            System.out.println((n - 1) & hash);
            System.out.println((n - 1) & hash2);
            System.out.println("===========");
        }
    }

    @Test
    public void hashTableIndexDemo2(){
        String str = new String("abc");
        String str2 = new String("abcasdasdasd23");
        int hash = str.hashCode();
        int hash2 = str2.hashCode();
        int n = 16;
        for (int i=1;i<=5;i++){
            n = n * 2;
            System.out.println("n="+n);
            System.out.println((n - 1) & hash);
            System.out.println((n - 1) & hash2);
            System.out.println("===========");
        }
        //
        HashMap hashMap = new HashMap();
        hashMap.put(str, "mapValue");
    }

    @Test
    public void hashTableIndexDemo(){
        String str = new String("abc");
        int hash = str.hashCode();
        int n = 16;
        System.out.println((n - 1) & hash);
        n = 32;
        System.out.println((n - 1) & hash);
        n = 64;
        System.out.println((n - 1) & hash);
        n = 128;
        System.out.println((n - 1) & hash);
        n = 256;
        System.out.println((n - 1) & hash);
        n = 512;
        System.out.println((n - 1) & hash);
        //
        HashMap hashMap = new HashMap();
        hashMap.put(str, "mapValue");
    }

    @Test
    public void simpleDemo(){
        HashMap hashMap = new HashMap();

        Hashtable hashtable = new Hashtable();
    }

}