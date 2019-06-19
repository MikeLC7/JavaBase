package com.xcdh.target.javaBase.Thread.Demo.ABC;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ABCLock {
    private static Lock lock = new ReentrantLock();//通过JDK5中的锁来保证线程的访问的互斥
    private static int state = 0;

    static class ThreadA extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 10;) {
                lock.lock();
                if (state % 3 == 0) {
                    System.out.print("A");
                    state++;
                    i++;
                }
                lock.unlock();
            }
        }
    }

    static class ThreadB extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 10;) {
                lock.lock();
                if (state % 3 == 1) {
                    System.out.print("B");
                    state++;
                    i++;
                }
                lock.unlock();
            }
        }
    }

    static class ThreadC extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 10;) {
                lock.lock();
                if (state % 3 == 2) {
                    System.out.println("C");
                    state++;
                    i++;
                }
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new ThreadA().start();
        new ThreadB().start();
        ThreadC threadC = new ThreadC();
        threadC.start();
        threadC.join();
        System.out.println(state);
    }

}
