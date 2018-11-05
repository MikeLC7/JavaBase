package Spring.AOP.CglibProxy.SimpleMode;

import Spring.AOP.CglibProxy.CglibProxy;
import Spring.AOP.CglibProxy.UserManager;
import Spring.AOP.CglibProxy.UserManagerImpl;

/**
 * Project:
 *
 * File: SimpleModeTestDemo
 *
 * Description:
 *
 * @author: MikeLC
 *
 * @date: 2018/11/5 下午 03:47
 *
 * Copyright ( c ) 2018
 *
 */
public class SimpleModeTestDemo {

    public static void main(String[]args){
        CglibProxy cglibProxy = new CglibProxy();
        UserClass userClass = (UserClass) cglibProxy.createProxy(UserClass.class);
        userClass.findUser("CglibProxy_testDemo");
    }

}
