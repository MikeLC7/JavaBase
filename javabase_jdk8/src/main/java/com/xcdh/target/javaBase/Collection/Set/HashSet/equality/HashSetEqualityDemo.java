package com.xcdh.target.javaBase.Collection.Set.HashSet.equality;


import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Project:
 *
 * File: HashSetEqualityDemo
 *
 * Description:
 *
 * @author: MikeLC
 *
 * @date: 2018/10/30 下午 10:44
 *
 * Copyright ( c ) 2018
 *
 */
public class HashSetEqualityDemo {

    class A {
        public boolean equals(Object o){
            return true;
        }
    }

    class B {
        public int hashCode(){
            return 1;
        }
    }

    class C {
        public int hashCode(){
            return 1;
        }
        public boolean equals(Object o){
            return true;
        }
    }

    class D {
        public int hashCode(){
            return 1;
        }
        public boolean equals(Object o){
            return false;
        }
    }

    class E {
        public int hashCode(){
            return 2;
        }
        public boolean equals(Object o){
            return true;
        }
    }

    /**
     * Description: 
     *
     * @param:
     *
     * @author: MikeLC
     * 
     * @date: 2018/10/24 下午 08:12
     */    
    @Test
    public void hashSetEqualityDemo(){
        Set setDemo = new HashSet();
        //@1
        System.out.println(setDemo.add(new A()));
        System.out.println(setDemo.add(new A()));
        //@2
        System.out.println(setDemo.add(new B()));
        System.out.println(setDemo.add(new B()));
        //@3
        System.out.println(setDemo.add(new C()));
        System.out.println(setDemo.add(new C()));
        //@4
        System.out.println(setDemo.add(new D()));
        System.out.println(setDemo.add(new D()));
        //@5
        System.out.println(setDemo.add(new E()));
        //@6
        System.out.println(setDemo.add(new E()));
        //@7
        System.out.println(setDemo);
        //
        System.out.println("//////");
        System.out.println(setDemo.contains(new A()));
        System.out.println(setDemo.contains(new B()));
        System.out.println(setDemo.contains(new C()));
        System.out.println(setDemo.contains(new D()));
        System.out.println(setDemo.contains(new E()));
        /**
         [JavaBase.collection.Set.HashSet.equality.HashSetEqualityDemo$B@1
         JavaBase.collection.Set.HashSet.equality.HashSetEqualityDemo$B@1
         JavaBase.collection.Set.HashSet.equality.HashSetEqualityDemo$D@1
         JavaBase.collection.Set.HashSet.equality.HashSetEqualityDemo$D@1
         JavaBase.collection.Set.HashSet.equality.HashSetEqualityDemo$A@1eb44e46
         JavaBase.collection.Set.HashSet.equality.HashSetEqualityDemo$E@2
         JavaBase.collection.Set.HashSet.equality.HashSetEqualityDemo$A@6504e3b2]
         */
    }


}