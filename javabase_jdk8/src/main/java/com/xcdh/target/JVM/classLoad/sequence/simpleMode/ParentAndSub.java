package com.xcdh.target.JVM.classLoad.sequence.simpleMode;

/**
 * Project:
 *
 * File: ParentAndSub
 *
 * Description:
 *
 * @author: MikeLC
 *
 * @date: 2018/11/3 下午 07:32
 *
 * Copyright ( c ) 2018
 *
 */
public class ParentAndSub {


    public static void main(String... args) {
        Bar bar = new Bar();
        System.out.println(bar.getValue());
    }


}
//父类
class Foo {
    int i = 1;

    Foo() {
        System.out.println("Foo()");
        System.out.println(i);
        int x = getValue();
        System.out.println(x);
    }

    {
        i = 2;
    }

    protected int getValue() {
        System.out.println("Foo()--getValue()");
        return i;
    }
}

//子类
class Bar extends Foo {
    int j = 1;

    Bar() {
        j = 2;
    }

    {
        j = 3;
    }

    @Override
    protected int getValue() {
        System.out.println("Bar()--getValue()");
        return j;
    }
}