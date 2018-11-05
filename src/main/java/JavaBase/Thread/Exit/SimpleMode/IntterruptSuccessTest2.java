package JavaBase.Thread.Exit.SimpleMode;


import JavaBase.Thread.Exit.MyIsInterruptThread;

public class IntterruptSuccessTest2 {

    public static void main(String args[]){
        MyIsInterruptThread myThread = new MyIsInterruptThread();
        myThread.start();
        System.out.println("isInterrupted-1:"+myThread.isInterrupted());
        try {
            Thread.sleep(2000);
            System.out.println("isInterrupted-2:"+myThread.isInterrupted());
            myThread.interrupt();
            System.out.println("isInterrupted-3:"+myThread.isInterrupted());
            System.out.println("isInterrupted-4:"+myThread.isInterrupted());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
