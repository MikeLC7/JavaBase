package Spring.AOP.DynamicProxy;

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
        DynamicProxy dynamicProxy = new DynamicProxy();
        UserManager userManager = (UserManager) dynamicProxy.newProxyInstance(new UserManagerImpl());
        userManager.findUser("TestDemo");
    }

}
