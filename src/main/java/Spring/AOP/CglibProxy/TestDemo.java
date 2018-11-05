package Spring.AOP.CglibProxy;

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
        CglibProxy cglibProxy = new CglibProxy();
        UserManager userManager = (UserManager) cglibProxy.createProxy(UserManagerImpl.class);
        userManager.findUser("CglibProxy_testDemo");
    }

}
