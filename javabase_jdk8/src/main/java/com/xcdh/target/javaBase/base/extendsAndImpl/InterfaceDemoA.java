package com.xcdh.target.javaBase.base.extendsAndImpl;
/**
 * Project:
 *
 * File:com.MikeLC7.com.xcdh.target.javaBase.base.extendsAndImple
 *
 * Description:
 *
 * @author: MikeLC
 *
 * @date: 2018-10-27 下午 08:34 
 **/
public interface InterfaceDemoA {

    public String interfaceStringNormal = "i am interfaceStringNormal";

    public static String interfaceStringStatic = "i am interfaceStringStatic";

    /**
     * Interface中的成员方法都是
     */
    public void interfaceMethodNormalA();

    public void interfaceMethodNormalB();

    abstract void interfaceMethodAbstractA();

    void interfaceMethodAbstractB();


}
