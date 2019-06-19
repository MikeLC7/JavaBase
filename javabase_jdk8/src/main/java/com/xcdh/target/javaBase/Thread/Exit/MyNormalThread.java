package com.xcdh.target.javaBase.Thread.Exit;

/**
 * Project:
 *
 * File: MyThread
 *
 * Description:
 *
 * @author: MikeLC
 *
 * @date: 2018/11/4 下午 11:29
 *
 * Copyright ( c ) 2018
 *
 */
public class MyNormalThread extends Thread {
    public void run(){
        super.run();
        for(int i=0; i<50000; i++){
            System.out.println("i="+(i+1));
        }
    }






}
