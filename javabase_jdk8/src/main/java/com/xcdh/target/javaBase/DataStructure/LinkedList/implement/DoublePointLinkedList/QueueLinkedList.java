package com.xcdh.target.javaBase.DataStructure.LinkedList.implement.DoublePointLinkedList;

/**
 * Project: 
 *
 * File: QueueLinkedList
 *
 * Description: 
 *
 * @author: MikeLC
 *
 * @date: 2018/11/2 上午 11:50
 *
 * Copyright ( c ) 2018
 *
 */
public class QueueLinkedList {

    private DoublePointLinkedList dp;

    public QueueLinkedList(){
        dp = new DoublePointLinkedList();
    }
    public void insert(Object data){
        dp.addTail(data);
    }

    public void delete(){
        dp.deleteHead();
    }

    public boolean isEmpty(){
        return dp.isEmpty();
    }

    public int getSize(){
        return dp.getSize();
    }

    public void display(){
        dp.display();
    }

}
