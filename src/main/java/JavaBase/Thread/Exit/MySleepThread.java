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
public class MySleepThread extends Thread {
    public void run(){
        super.run();
        try {
            System.out.println("线程开始。。。");
            Thread.sleep(200000);
            //
            for(int i=0; i<500000; i++){
                //@1
                if(this.interrupted()) {
                    System.out.println("线程已经终止， for循环不再执行");
                    throw new InterruptedException();
                }
                System.out.println("i="+(i+1)+";"+this.isInterrupted());
            }
            System.out.println("线程结束。");
        } catch (InterruptedException e) {
            System.out.println("在沉睡中被停止, 进入catch， 调用isInterrupted()方法的结果是：" + this.isInterrupted());
            e.printStackTrace();
        }

    }
}