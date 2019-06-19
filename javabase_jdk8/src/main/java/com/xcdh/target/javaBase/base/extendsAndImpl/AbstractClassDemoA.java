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
public abstract class AbstractClassDemoA {

    public String abstracStringNormal = "i am abstracStringNormal";

    public static String abstractStringStatic = "i am abstractStringStatic";

    public void abstractMethodNormalA() {
        System.out.println("abstractMethodNormalA---root");
    }

    protected void abstractMethodNormalB() {
        System.out.println("abstractMethodNormalB---root");
    }

    public abstract void abstractMethodAbstractA();

    protected abstract void abstractMethodAbstractB();

}
