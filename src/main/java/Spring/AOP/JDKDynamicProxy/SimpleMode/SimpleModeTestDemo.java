package Spring.AOP.JDKDynamicProxy.SimpleMode;

import Spring.AOP.JDKDynamicProxy.JDKDynamicProxy;
import Spring.AOP.JDKDynamicProxy.UserManager;

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
        JDKDynamicProxy dynamicProxy = new JDKDynamicProxy();
        UserClass userClass = (UserClass) dynamicProxy.newProxyInstance(new UserClass());
        userClass.findUser("TestDemo");
    }

}
