package JavaBase.Thread.Pool.concurentDemo;

import org.junit.Test;

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
public class ConcurrentAddToListDemo {


    @Test
    public void testListAddConcurrentA(){
        int count=100;
        List list=new ArrayList();
        //List list=Collections.synchronizedList(new ArrayList());
        ThreadMakeListDemo t1=new ThreadMakeListDemo(list);
        for(int i=0;i<count;i++){
            new Thread(t1).start();
        }
        System.out.println("size:"+list.size());
    }

    @Test
    public void testListAddConcurrentB(){
        int count=100;
        List list=new ArrayList();
        //List list=Collections.synchronizedList(new ArrayList());
        for(int i=0;i<count;i++){
            ThreadMakeListDemo t1=new ThreadMakeListDemo(list);
            new Thread(t1).start();
        }
        System.out.println("size:"+list.size());
    }

    @Test
    public void testMakeTheList(){
        List<String> resultList = null;
        try {
            resultList = makeTheList(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //System.out.println(resultList);
        System.out.println(resultList.size());
    }

    public static List<String> makeTheList(final int nThreads)
            throws Exception {
        //
        List<String> resultString = new ArrayList<>();
        //每个线程负责的数量
        int maxCount = 1000;
        //
        List<Callable<String>> tasks = new ArrayList<Callable<String>>();
        ExecutorService executorService = Executors.newFixedThreadPool(nThreads);
        for (int i = 0; i < nThreads; i++) {
            int threadIndex = i;
            Callable<String> task = new Callable<String>() {
                public String call() throws Exception {
                    int beigin = threadIndex*maxCount+1;
                    int end = beigin + maxCount-1;
                    //System.out.println(Thread.currentThread().getName()+":Info:begin="+beigin+";end="+end+";threadIndex="+threadIndex);
                    for (int i=beigin;i<=end;i++) {
                        resultString.add(i+"");
                        //System.out.println(Thread.currentThread().getName()+":"+i);
                    }
                    //System.out.println(Thread.currentThread().getName()+":final:"+resultString.toString());
                    return null;
                }
            };
            tasks.add(task);
        }
        executorService.invokeAll(tasks);
        /*for (Future<String> future : futures) {
            ret.append(future.get());
        }*/
        executorService.shutdown();

        return resultString;
    }

    @Test
    public void testList2Str(){
        try {
            List<String> list = new ArrayList<String>();
            for (int i = 0; i < 1000; i++) {
                list.add(i + ",");
            }

            System.out.println(list2Str(list, 5));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String list2Str(List<String> list, final int nThreads)
            throws Exception {
        if (list == null || list.isEmpty()) {
            return null;
        }
        StringBuffer ret = new StringBuffer();

        int size = list.size();
        ExecutorService executorService = Executors.newFixedThreadPool(nThreads);
        List<Future<String>> futures = new ArrayList<Future<String>>(nThreads);
        for (int i = 0; i < nThreads; i++) {
            final List<String> subList = list.subList(size / nThreads * i, size/ nThreads * (i + 1));
            Callable<String> task = new Callable<String>() {
                public String call() throws Exception {
                    StringBuffer sb = new StringBuffer();
                    for (String str : subList) {
                        System.out.println(Thread.currentThread().getName()+":"+str);
                        sb.append(str);
                    }
                    return sb.toString();
                }
            };
            futures.add(executorService.submit(task));
        }

        for (Future<String> future : futures) {
            ret.append(future.get());
        }
        executorService.shutdown();

        return ret.toString();
    }

}