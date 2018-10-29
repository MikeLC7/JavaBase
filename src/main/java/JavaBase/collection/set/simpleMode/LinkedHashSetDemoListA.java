package JavaBase.collection.set.simpleMode;


import org.junit.Test;

import java.util.*;

/**
 * Project: 
 *
 * File: LinkedHashSetDemoListA
 *
 * Description: 
 *
 * @author: MikeLC
 *
 * @date: 2018/10/29 下午 10:29
 *
 * Copyright ( c ) 2018
 *
 */
public class LinkedHashSetDemoListA {

 
    @Test
    public void linkedHashSetSimpleDemo(){
        Set setDemo = new LinkedHashSet();
        System.out.println(setDemo.add("123"));
        System.out.println(setDemo.add("456"));
        System.out.println(setDemo.add("789"));
        System.out.println(setDemo.add("012"));
        System.out.println(setDemo.add(null));
        System.out.println(setDemo.add("123"));
        //
        System.out.println(setDemo);
    } 
    
}