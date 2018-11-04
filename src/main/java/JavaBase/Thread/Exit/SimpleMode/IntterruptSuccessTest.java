package JavaBase.Thread.Exit.SimpleMode;


import JavaBase.Thread.Exit.MyThread3;

public class IntterruptSuccessTest {

    public static void main(String args[]){
        MyThread3 myThread = new MyThread3();
        myThread.start();
        System.out.println("isInterrupted-1:"+myThread.isInterrupted());
        try {
            Thread.sleep(2000);
            System.out.println("isInterrupted-2:"+myThread.isInterrupted());
            myThread.interrupt();
            myThread.join();
            System.out.println("isInterrupted-3:"+myThread.isInterrupted());
            System.out.println("isInterrupted-4:"+myThread.isInterrupted());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
