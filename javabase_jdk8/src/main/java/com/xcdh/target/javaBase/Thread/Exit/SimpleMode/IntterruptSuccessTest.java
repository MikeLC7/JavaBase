package com.xcdh.target.javaBase.Thread.Exit.SimpleMode;


import com.xcdh.target.javaBase.Thread.Exit.MyExceptionThread;

public class IntterruptSuccessTest {

    public static void main(String args[]){
        MyExceptionThread myThread = new MyExceptionThread();
        myThread.start();
        System.out.println("isInterrupted-1:"+myThread.isInterrupted());
        try {
            Thread.sleep(2000);
            System.out.println("isInterrupted-2:"+myThread.isInterrupted());
            myThread.interrupt();
            myThread.join();
            System.out.println("isInterrupted-3:"+myThread.isInterrupted());
            System.out.println("isInterrupted-4:"+myThread.isInterrupted());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
