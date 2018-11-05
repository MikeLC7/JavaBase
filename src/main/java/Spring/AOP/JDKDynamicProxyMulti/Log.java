package Spring.AOP.JDKDynamicProxyMulti;

/**
 * Project:
 *
 * File: UserManagerImpl
 *
 * Description:
 *
 * @author: MikeLC
 *
 * @date: 2018/11/5 下午 02:36
 *
 * Copyright ( c ) 2018
 *
 */
public class Log {

    public void start() {
        System.out.println("Log.start");
    }

    public void end(String args) {
        System.out.println("Log.end---"+args);
    }

}