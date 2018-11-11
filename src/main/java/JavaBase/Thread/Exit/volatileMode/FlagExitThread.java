package JavaBase.Thread.Exit.volatileMode;

import org.junit.Test;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FlagExitThread extends Thread {
    //标识线程是否结束
    public static boolean isDestroy = false;
    public static int i = 0;

    @Override
    public void run() {
        while (!isDestroy) {
            i++;
            System.out.println(Thread.currentThread().getName()+":"+i+";time"+System.currentTimeMillis());
        }
    }

    public static void main(String[] args) {
        FlagExitThread t = new FlagExitThread();
        t.start();
        try {
            //先让线程跑起来
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //结束线程
        isDestroy = true;
        System.out.println("main_exit time:"+System.currentTimeMillis());
    }

    //@Test
    public void singleTest(){
        FlagExitThread t = new FlagExitThread();
        t.start();
        try {
            //先让线程跑起来
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //结束线程
        isDestroy = true;
        System.out.println("main_exit time:"+System.currentTimeMillis());
    }

    @Test
    public void multiTest(){
        //
        for (int i=1;i<=20;i++){
            FlagExitThread t = new FlagExitThread();
            t.start();
        }
        try {
            //先让线程跑起来
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //结束线程
        isDestroy = true;
        System.out.println("main_exit time:"+System.currentTimeMillis());
    }


}