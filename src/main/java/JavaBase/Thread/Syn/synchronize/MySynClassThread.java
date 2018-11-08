package JavaBase.Thread.Syn.synchronize;

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
public class MySynClassThread implements Runnable{

    private static int count;

    public MySynClassThread() {
        count = 0;
    }

    public  void run() {
        method();
    }

    public static void method() {
        synchronized (MySynClassThread.class){
            for (int i = 0; i < 5; i ++) {
                try {
                    System.out.println(Thread.currentThread().getName() + ":" + (count++));
//                Thread.sleep(100);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        /**
         * @1
         */
        /*MySynThreadB t = new MySynThreadB();

        Thread t1 = new Thread(t,"Thread1");
        Thread t2 = new Thread(t,"Thread2");

        t1.start();
        t2.start();*/
        /**
         * @2
         */
        MySynMethodThread tA = new MySynMethodThread();
        MySynMethodThread tB = new MySynMethodThread();

        Thread t11 = new Thread(tA,"Thread11");
        Thread t12 = new Thread(tA,"Thread12");
        Thread t13 = new Thread(tB,"Thread13");
        Thread t14 = new Thread(tB,"Thread14");

        t11.start();
        t12.start();
        t13.start();
        t14.start();
    }

}