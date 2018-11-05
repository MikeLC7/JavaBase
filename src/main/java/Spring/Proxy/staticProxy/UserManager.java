package Spring.Proxy.staticProxy;

/**
 * Project:
 *
 * File: UserManager
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
public interface UserManager {

    public void addUser(String userId, String userName);

    public void delUser(String userId);

    public String findUser(String userId);

    public void modifyUser(String userId, String userName);
}
