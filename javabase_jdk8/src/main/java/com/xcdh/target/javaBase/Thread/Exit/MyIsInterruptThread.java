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
public class MyIsInterruptThread extends Thread {
    public void run(){
        super.run();
        try {
            for(int i=0; i<500000; i++){
                if(this.isInterrupted()) {
                    System.out.println("线程已经终止， for循环不再执行");
                    throw new InterruptedException();
                }
                System.out.println("i="+(i+1)+";"+this.isInterrupted());
            }

            System.out.println("这是for循环外面的语句，也会被执行");
        } catch (InterruptedException e) {
            System.out.println("进入MyThread.java类中的catch了。。。isInterrupted=" + this.isInterrupted());
            e.printStackTrace();
        }
    }
}