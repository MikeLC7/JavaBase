package JavaBase.Thread.Exit.SimpleMode;


import JavaBase.Thread.Exit.MyThread2;

public class IntterruptTest2 {

    public static void main(String args[]){
        MyThread2 myThread = new MyThread2();
        myThread.start();
        System.out.println("isInterrupted-1:"+myThread.isInterrupted());
        try {
            Thread.sleep(200);
            System.out.println("isInterrupted-2:"+myThread.isInterrupted());
            myThread.interrupt();
            System.out.println("isInterrupted-3:"+myThread.isInterrupted());
            System.out.println("isInterrupted-4:"+myThread.isInterrupted());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
