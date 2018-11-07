package JavaBase.Thread.Pool.concurentDemo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Project: 
 *
 * File: ThreadMakeListDemo
 *
 * Description: 
 *
 * @author: MikeLC
 *
 * @date: 2018/11/7 下午 08:29
 *
 * Copyright ( c ) 2018
 *
 */
public class ThreadMakeListDemo implements Runnable{


    private List list;


    public ThreadMakeListDemo(List list){
        this.list=list;
    }
    /**
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            list.add("a");
        }
    }



}
