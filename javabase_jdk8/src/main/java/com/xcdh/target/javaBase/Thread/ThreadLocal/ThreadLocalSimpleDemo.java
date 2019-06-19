package com.xcdh.target.javaBase.Thread.ThreadLocal;

/**
 * Project:
 *
 * File: DemoList
 *
 * Description:
 *
 * @author: MikeLC
 *
 * @date: 2018/11/8 下午 05:38
 *
 * Copyright ( c ) 2018
 *
 */
public class ThreadLocalSimpleDemo {

    public String noramFiled = "000";

    public ThreadLocal<Integer> longThreadLocal = new ThreadLocal<Integer>(){
        public Integer initialValue(){
            return 0;
        }
    };
    public ThreadLocal<String> stringThreadLocal = new ThreadLocal<String>(){
        public String initialValue(){
            return "";
        }
    };

    public void getNoramFiled() {
        System.out.println("noramFiled=" + this.noramFiled);
    }

    public void setNoramFiled(String noramFiled) {
        this.noramFiled = noramFiled;
    }

    public void set(){
        longThreadLocal.set((int) Thread.currentThread().getId());
        stringThreadLocal.set(Thread.currentThread().getName());
    }

    public void get(){
        System.out.println("longThreadLocal=" + longThreadLocal.get());
        System.out.println("stringThreadLocal=" + stringThreadLocal.get());
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadLocalSimpleDemo test = new ThreadLocalSimpleDemo();
        test.set();
        test.get();
        test.setNoramFiled("main-Test");
        test.getNoramFiled();
        System.out.println("/////////");
        //
        Thread threadA = new Thread(){
            public void run(){
                test.set();
                test.get();
                //
                test.getNoramFiled();
                test.setNoramFiled("threadA-Test");
                System.out.println("/////////");
            }
        };
        threadA.start();
        threadA.join();
        //
        test.get();
        test.getNoramFiled();
        System.out.println("/////////");
    }

}
