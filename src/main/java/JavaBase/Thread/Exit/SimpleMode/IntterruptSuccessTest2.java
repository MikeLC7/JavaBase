package JavaBase.Thread.Exit.SimpleMode;


import JavaBase.Thread.Exit.MyThread4;

public class IntterruptSuccessTest2 {

    public static void main(String args[]){
        MyThread4 myThread = new MyThread4();
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
