package JavaBase.Thread.Syn.lock.ReentrantLock;


import org.junit.Test;

import java.util.concurrent.locks.ReentrantLock;

public class DemoList {


    @Test
    public void simpleDemo(){
        ReentrantLock reentrantLock = new ReentrantLock();
        reentrantLock.lock();
    }

}
