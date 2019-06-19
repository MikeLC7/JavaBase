package com.xcdh.target.javaBase.Collection.List.Interator;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Project:
 *
 * File: ListIteratorDemoListA
 *
 * Description:
 *
 * @author: MikeLC
 *
 * @date: 2018/10/30 上午 11:06
 *
 * Copyright ( c ) 2018
 *
 */
public class ListIteratorDemoListA {




    @Test
    public void listIteratorDemo(){
        List listDemo = new ArrayList();
        //
        listDemo.add("abc");
        listDemo.add("123");
        System.out.println(listDemo);
        //
        ListIterator lit = listDemo.listIterator();
        while (lit.hasNext()){
            System.out.println(lit.next());
            System.out.println("------");
        }
        System.out.println("----reserve---");
        while (lit.hasPrevious()){
            System.out.println(lit.previous());
            System.out.println("=======");
        }
        System.out.println(listDemo);
    }


}