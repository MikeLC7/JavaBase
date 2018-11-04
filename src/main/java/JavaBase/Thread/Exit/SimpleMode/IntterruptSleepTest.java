package JavaBase.Thread.Exit.SimpleMode;


import JavaBase.Thread.Exit.MySleepThread;

public class IntterruptSleepTest {

    public static void main(String args[]){
        MySleepThread myThread = new MySleepThread();
        myThread.start();
        System.out.println("isInterrupted-1:"+myThread.isInterrupted());
        try {
            Thread.sleep(2000);
            System.out.println("isInterrupted-2:"+myThread.isInterrupted());
            myThread.interrupt();
            myThread.join();
            System.out.println("isInterrupted-3:"+myThread.isInterrupted());
            System.out.println("isInterrupted-4:"+myThread.isAlive());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
