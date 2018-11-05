package Spring.Proxy.JDKDynamicProxyMulti;

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
        JDKDynamicProxyMulti dynamicProxyMulti = new JDKDynamicProxyMulti();
        UserManager userManager = (UserManager) dynamicProxyMulti.newProxyInstance(new UserManagerImpl(), new Log());
        userManager.findUser("dynamicProxyMulti_testDemo");
    }

}
