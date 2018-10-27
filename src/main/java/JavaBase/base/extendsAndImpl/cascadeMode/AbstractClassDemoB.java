package JavaBase.base.extendsAndImpl.cascadeMode;

import JavaBase.base.extendsAndImpl.AbstractClassDemoA;
import JavaBase.base.extendsAndImpl.InterfaceDemoA;

/**
 * Project:
 *
 * File: AbstractClassDemoB
 *
 * Description:
 *
 * @author: MikeLC
 *
 * @date: 2018/10/27 下午 09:15
 *
 * Copyright ( c ) 2018
 *
 */
public abstract class AbstractClassDemoB extends AbstractClassDemoA implements InterfaceDemoA {


    public void abstractMethodNormalA() {
        System.out.println("abstractMethodNormalA---second");
    }

    public void abstractMethodAbstractA() {
        System.out.println("abstractMethodAbstractA---second");
    }

    public void interfaceMethodNormalA() {
        System.out.println("interfaceMethodNormalA---second");
    }

    public void interfaceMethodAbstractA() {
        System.out.println("interfaceMethodAbstractA---second");
    }



}