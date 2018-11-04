package JavaBase.Thread.Exit;

/**
 * Project:
 *
 * File: MyThread
 *
 * Description:
 *
 * @author: MikeLC
 *
 * @date: 2018/11/4 下午 11:29
 *
 * Copyright ( c ) 2018
 *
 */
public class MyThread2 extends Thread {
    public void run(){
        super.run();
        for(int i=0; i<500000; i++){
            if(this.interrupted()) {
                System.out.println("线程已经终止， for循环不再执行");
                break;
            }
            System.out.println("i="+(i+1));
        }
        System.out.println("MyThread2:isInterrupted=" + this.isInterrupted());
        System.out.println("这是for循环外面的语句，也会被执行");
        System.out.println("MyThread2:isInterrupted=" + this.isInterrupted());
    }
}