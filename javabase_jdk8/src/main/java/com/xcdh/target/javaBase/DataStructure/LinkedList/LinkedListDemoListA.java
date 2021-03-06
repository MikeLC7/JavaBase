package com.xcdh.target.javaBase.DataStructure.LinkedList;


import com.xcdh.target.javaBase.DataStructure.LinkedList.implement.SingleLinkedList.SingleLinkedList;
import org.junit.Test;

/**
 * Project:
 *
 * File: StackDemoListA
 *
 * Description:
 *
 * @author: MikeLC
 *
 * @date: 2018/11/2 上午 09:30
 *
 * Copyright ( c ) 2018
 *
 */
public class LinkedListDemoListA {



    @Test
    public void testSingleLinkedList(){
        SingleLinkedList singleList = new SingleLinkedList();
        singleList.addHead("A");
        singleList.addHead("B");
        singleList.addHead("C");
        singleList.addHead("D");
        //打印当前链表信息
        singleList.display();
        //删除C
        singleList.delete("C");
        singleList.display();
        //查找B
        System.out.println(singleList.find("B"));
    }

}