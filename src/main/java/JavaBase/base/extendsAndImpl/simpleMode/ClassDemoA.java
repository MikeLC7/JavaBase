package JavaBase.base.extendsAndImpl.simpleMode;

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
public class ClassDemoA extends AbstractClassDemoA implements InterfaceDemoA {


    public static void main(String args[]){
        ClassDemoA classDemoA = new ClassDemoA();
        //
        System.out.println(classDemoA.abstracStringNormal);
        System.out.println(classDemoA.abstractStringStatic);
        classDemoA.abstractMethodNormalA();
        classDemoA.abstractMethodNormalB();
        classDemoA.abstractMethodAbstractA();
        classDemoA.abstractMethodAbstractB();
        //
        System.out.println(classDemoA.interfaceStringNormal);
        System.out.println(classDemoA.interfaceStringStatic);
        classDemoA.interfaceMethodAbstractA();
        classDemoA.interfaceMethodAbstractB();
        classDemoA.interfaceMethodNormalA();
        classDemoA.interfaceMethodNormalB();
    }

    @Override
    public void abstractMethodAbstractA() {
        System.out.println("abstractMethodAbstractA---leaf");
    }

    @Override
    public void abstractMethodAbstractB() {
        System.out.println("abstractMethodAbstractB---leaf");
    }

    @Override
    public void interfaceMethodNormalA() {
        System.out.println("interfaceMethodNormal---leaf");
    }

    @Override
    public void interfaceMethodNormalB() {
        System.out.println("interfaceMethodNormalB---leaf");
    }

    @Override
    public void interfaceMethodAbstractA() {
        System.out.println("interfaceMethodAbstractA---leaf");
    }

    @Override
    public void interfaceMethodAbstractB() {
        System.out.println("interfaceMethodAbstractB---leaf");
    }


}
