package com.xcdh.target.javaBase.Thread.Pool;

import org.junit.Test;

import java.util.concurrent.*;

/**
 * Project:
 *
 * File: ThreadPoolDemo
 *
 * Description:
 *
 * @author: MikeLC
 *
 * @date: 2018/11/7 下午 06:20
 *
 * Copyright ( c ) 2018
 *
 */
public class ThreadPoolDemo {


    @Test
    public void simpldeDemo() throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Callable<Integer> callableThread = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int i = 0;
                while (true){
                    System.out.println(Thread.currentThread().getName()+":"+i);
                    i++;
                    if (i >= 10) break;
                }
                return i;
            }
        };
        Future<Integer> future = executorService.submit(callableThread);
        Future<Integer> future2 = executorService.submit(callableThread);
        //
        FutureTask<Integer> futureTask = new FutureTask<Integer>(callableThread);
        executorService.submit(futureTask);
        //
        Thread.sleep(5000);
        System.out.println(future.get());
        System.out.println(future2.get());
        System.out.println(futureTask.get());
        //
        executorService.shutdown();
    }

}