package com.xcdh.target.javaBase.Thread.Pool.concurentDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

/**
 * Project:
 *
 * File: ConcurrentDemo
 *
 * Description:
 *
 * @author: MikeLC
 *
 * @date: 2018/11/7 下午 07:41
 *
 * Copyright ( c ) 2018
 *
 */
public class ConcurrentGetFromListDemo {


    /**
     * 每500条数据开启一条线程
     *
     * @Author: wpf
     * @Date: 16:05 2018/5/21
     * @Description:
     * @param  * @param null
     * @return
     */
    private void threadExec2(List<String> list) throws ExecutionException, InterruptedException {
        // 开始时间
        long start = System.currentTimeMillis();

        System.out.println("list的大小：" + list.size());

        // 每500条数据开启一条线程
        int threadSize = 500;
        // 总数据条数
        int dataSize = list.size();
        // 线程数
        int threadNum = dataSize / threadSize + 1;
        // 定义标记,过滤threadNum为整数
        boolean special = dataSize % threadSize == 0;
        // 创建一个线程池
        ExecutorService exec = Executors.newFixedThreadPool(threadNum);
        // 定义一个任务集合
        List<Callable<String>> tasks = new ArrayList<Callable<String>>();
        Callable<String> task = null;
        List<String> cutList = null;
        // 确定每条线程的数据
        for (int i = 0; i < threadNum; i++) {
            if (i == threadNum - 1) {
                if (special) {
                    break;
                }
                cutList = list.subList(threadSize * i, dataSize);
            } else {
                cutList = list.subList(threadSize * i, threadSize * (i + 1));
            }
            // LOG.info("第" + (i + 1) + "组：" + cutList.toString());
            final List<String> listStr = cutList;
            task = new Callable<String>() {

                @Override
                public String call() throws Exception {

                    for(int i =0;i<listStr.size(); i++){

                    }
                    return null;
                }
            };
            // 这里提交的任务容器列表和返回的Future列表存在顺序对应的关系
            tasks.add(task);
        }
        List<Future<String>> results = exec.invokeAll(tasks);
    /*for (Future<SysCompany> future : results) {
        SysCompany c = future.get();
    }*/
        // 关闭线程池
        exec.shutdown();
        System.out.println("线程任务执行结束");
        System.out.println("执行任务消耗了 ：" + (System.currentTimeMillis() - start) + "毫秒");
    }

    /**
     * 固定开辟8线程
     *
     * @Author: wpf
     * @Date: 16:05 2018/5/21
     * @Description:
     * @param  * @param null
     * @return
     */
    private void threadExec1(List<String> list) throws ExecutionException, InterruptedException{
        // 开始时间
        long start = System.currentTimeMillis();

        // 总数据条数
        int listSize = list.size();
        System.out.println("总记录数为："+listSize);
        // 线程数
        int threadNum = 8;

        // 创建一个线程池
        ExecutorService exec = Executors.newFixedThreadPool(threadNum);
        // 定义一个任务集合
        List<Callable<Integer>> tasks = new ArrayList<Callable<Integer>>();
        Callable<Integer> task = null;
        //
        List<String> cutList = null;

        // 均分算法
        Map<Integer,Long> map = allotOfAverage1(threadNum,listSize);
        int endValue = 0;
        int startValue = 0;
        int i = 0;
        for (Long v : map.values()) {
            endValue = (int)(startValue+v);
            cutList = list.subList(startValue, endValue);
            startValue += v;
            System.out.println("第" + ++i +"组大小为："+cutList.size());
            final List<String> listStr = cutList;
            task = new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    for(String c : listStr){
                            // LOG.info("timer：在执行中..." + c.getUsername());
                            // 业务...

                    }
                    return 1;
                }
            };
            // 这里提交的任务容器列表和返回的Future列表存在顺序对应的关系
            tasks.add(task);
        }

        List<Future<Integer>> results = exec.invokeAll(tasks);
        for (Future<Integer> future : results) {
            System.out.println(future.get());
        }
        // 关闭线程池
        exec.shutdown();
        System.out.println("线程任务执行结束");
        System.out.println("执行任务消耗了 ：" + (System.currentTimeMillis() - start) + "毫秒");
    }


    /*
     * 平均分配
     */
    public static Map<Integer,Long> allotOfAverage1(int threadNum, long listSize){
        Map<Integer,Long> allot=new HashMap<Integer,Long>(); //保存分配的信息
        for(int i=0;i<listSize;i++){
            int j=i%threadNum;
            if(allot.containsKey(j)){
                allot.put(j, allot.get(j) +1);
            }else{
                allot.put(j, 1L);
            }
        }
        return allot;
    }


}
