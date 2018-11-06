package JavaBase.base.InterfaceAndAbstractClass.JDK8;

import JavaBase.base.extendsAndImpl.AbstractClassDemoA;
import JavaBase.base.extendsAndImpl.InterfaceDemoA;

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
public class ClassDemoA implements InterfaceJDK8Demo {


    public static void main(String args[]){
       InterfaceJDK8Demo.syaHello();
       new ClassDemoA().syaHelloInstance();
    }


    @Override
    public void interfaceMethodNormalA() {

    }

    @Override
    public void interfaceMethodNormalB() {

    }

    @Override
    public void interfaceMethodAbstractA() {

    }

    @Override
    public void interfaceMethodAbstractB() {

    }
}
