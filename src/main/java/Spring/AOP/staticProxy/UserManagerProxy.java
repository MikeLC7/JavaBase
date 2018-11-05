package Spring.AOP.staticProxy;

/**
 * Project: 
 *
 * File: UserManagerProxy
 *
 * Description: 
 *
 * @author: MikeLC
 *
 * @date: 2018/11/5 下午 02:37
 *
 * Copyright ( c ) 2018
 *
 */
public class UserManagerProxy implements UserManager {

    private UserManager userManager;

    public UserManagerProxy(UserManager userManager){
        this.userManager = userManager;
    }

    @Override
    public void addUser(String userId, String userName) {
        System.out.println("UserManagerImpl.addUser");
    }

    @Override
    public void delUser(String userId) {
        System.out.println("UserManagerImpl.delUser");
    }

    @Override
    public String findUser(String userId) {
        System.out.println("UserManagerProxy.before.findUser");
        System.out.println("UserManagerImpl.findUser");
        System.out.println("UserManagerProxy.after.findUser");
        return userId;
    }

    @Override
    public void modifyUser(String userId, String userName) {
        System.out.println("UserManagerImpl.modifyUser");
    }
    
}