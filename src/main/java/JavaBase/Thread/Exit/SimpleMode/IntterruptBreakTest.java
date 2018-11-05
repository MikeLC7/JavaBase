package JavaBase.Thread.Exit.SimpleMode;


import JavaBase.Thread.Exit.MyBreakThread;

public class IntterruptBreakTest {

    public static void main(String args[]){
        MyBreakThread myThread = new MyBreakThread();
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
