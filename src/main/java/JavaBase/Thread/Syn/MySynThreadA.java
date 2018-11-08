package JavaBase.Thread.Syn;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Project: 
 *
 * File: MySynThreadA
 *
 * Description: 
 *
 * @author: MikeLC
 *
 * @date: 2018/11/8 上午 12:12
 *
 * Copyright ( c ) 2018
 *
 */
public class MySynThreadA implements Callable{

    private int ticket = 100;
    @Override
    public  String call(){
        synchronized(this){
            while(this.ticket>0){
                try{
                    Thread.sleep(0);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"卖票结果，ticket="+ticket--);
            }
        }
        return String.valueOf(ticket);
    }


    public static void main(String[] args) throws InterruptedException {
        //
        ExecutorService executorService = Executors.newFixedThreadPool(50);
        //
        MySynThreadA mythread16 = new MySynThreadA();
        List<Callable<String>> taskList = new ArrayList<>();
        for(int i=0;i<50;i++){
            taskList.add(mythread16);
        }
        List<Future<String>> futureList = executorService.invokeAll(taskList);
        //
        executorService.shutdown();
    }


}