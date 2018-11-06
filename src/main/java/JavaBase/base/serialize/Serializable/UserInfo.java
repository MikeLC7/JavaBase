package JavaBase.base.serialize.Serializable;

import java.io.Serializable;

/**
 * Project:
 *
 * File: UserInfo
 *
 * Description:
 *
 * @author: MikeLC
 *
 * @date: 2018/11/6 下午 09:15
 *
 * Copyright ( c ) 2018
 *
 */
public class UserInfo implements Serializable {
    private String userName;
    private String usePass;
    private transient int userAge;//使用transient关键字修饰的变量不会被序列化
    public String getUserName() {
        return userName;
    }
    public UserInfo() {
        System.out.println("UserInfo");
        userAge=20;
    }
    public UserInfo(String userName, String usePass, int userAge) {
        super();
        this.userName = userName;
        this.usePass = usePass;
        this.userAge = userAge;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUsePass() {
        return usePass;
    }
    public void setUsePass(String usePass) {
        this.usePass = usePass;
    }
    public int getUserAge() {
        return userAge;
    }
    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }
    @Override
    public String toString() {
        return "UserInfo [userName=" + userName + ", usePass=" + usePass + ",userAge="+(userAge==0?"NOT SET":userAge)+"]";
    }


}
