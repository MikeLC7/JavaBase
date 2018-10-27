package com.MikeLC7.JavaBase.base.extendsAndImpl.cascadeMode;

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
public class ClassDemoB extends AbstractClassDemoB {


    public static void main(String args[]){
        ClassDemoB classDemoB = new ClassDemoB();
        //
        System.out.println(classDemoB.abstracStringNormal);
        System.out.println(classDemoB.abstractStringStatic);
        classDemoB.abstractMethodNormalA();
        classDemoB.abstractMethodNormalB();
        classDemoB.abstractMethodAbstractA();
        classDemoB.abstractMethodAbstractB();
        //
        System.out.println(classDemoB.interfaceStringNormal);
        System.out.println(classDemoB.interfaceStringStatic);
        classDemoB.interfaceMethodAbstractA();
        classDemoB.interfaceMethodAbstractB();
        classDemoB.interfaceMethodNormalA();
        classDemoB.interfaceMethodNormalB();

    }


    @Override
    public void interfaceMethodNormalB() {
        System.out.println("interfaceMethodNormalB---leaf");
    }

    @Override
    public void interfaceMethodAbstractB() {
        System.out.println("interfaceMethodAbstractB---leaf");
    }

    @Override
    public void abstractMethodAbstractB() {
        System.out.println("abstractMethodAbstractB---leaf");
    }

}
