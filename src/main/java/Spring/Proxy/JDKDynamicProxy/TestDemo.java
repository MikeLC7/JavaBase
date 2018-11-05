package Spring.Proxy.JDKDynamicProxy;

/**
 * Project:
 *
 * File: TestDemo
 *
 * Description:
 *
 * @author: MikeLC
 *
 * @date: 2018/11/5 下午 02:39
 *
 * Copyright ( c ) 2018
 *
 */
public class TestDemo {

    public static void main(String[]args){
        JDKDynamicProxy dynamicProxy = new JDKDynamicProxy();
        UserManager userManager = (UserManager) dynamicProxy.newProxyInstance(new UserManagerImpl());
        userManager.findUser("TestDemo");
    }

}
