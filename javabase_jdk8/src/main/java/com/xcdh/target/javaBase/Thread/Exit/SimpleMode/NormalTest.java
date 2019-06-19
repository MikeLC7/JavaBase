package com.xcdh.target.javaBase.Thread.Exit.SimpleMode;


import com.xcdh.target.javaBase.Thread.Exit.MyNormalThread;

public class NormalTest {

    public static void main(String args[]){
        MyNormalThread myThread = new MyNormalThread();
        myThread.start();
        System.out.println("isInterrupted-1:"+myThread.isInterrupted());
        try {
            Thread.sleep(200);
            System.out.println("isInterrupted-2:"+myThread.isInterrupted());
            myThread.interrupt();
            System.out.println("isInterrupted-3:"+myThread.isInterrupted());
            System.out.println("isInterrupted-4:"+myThread.isInterrupted());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
