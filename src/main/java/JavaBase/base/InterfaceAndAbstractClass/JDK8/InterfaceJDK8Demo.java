package JavaBase.base.InterfaceAndAbstractClass.JDK8;

import JavaBase.base.extendsAndImpl.AbstractClassDemoA;

/**
 * Project:
 *
 * File:com.MikeLC7.JavaBase.base.extendsAndImple
 *
 * Description:
 *
 * @author: MikeLC
 *
 * @date: 2018-10-27 下午 08:34 
 **/
public interface InterfaceJDK8Demo {

    public String interfaceStringNormal = "i am interfaceStringNormal";

    public static String interfaceStringStatic = "i am interfaceStringStatic";

    /**
     * Interface中的成员方法都是
     */
    public void interfaceMethodNormalA();

    public void interfaceMethodNormalB();

    abstract void interfaceMethodAbstractA();

    void interfaceMethodAbstractB();

    /**
     *
     */
    public static void syaHello(){
        System.out.println("syaHello");
    }

    public default void syaHelloInstance(){
        System.out.println("syaHelloInstance");
    }

}
