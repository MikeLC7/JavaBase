package JavaBase.Collection.Map.HashMap.equality;


import org.junit.Test;

import java.util.HashMap;
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
public class HashMapEqualityDemo {

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
    public void hashMapEqualityDemo(){
        HashMap hashMap = new HashMap();
        //@1
        System.out.println(hashMap.put(new A(),"A1"));
        System.out.println(hashMap.put(new A(),"A2"));
        //@2
        System.out.println(hashMap.put(new B(),"B1"));
        System.out.println(hashMap.put(new B(),"B2"));
        //@3
        System.out.println(hashMap.put(new C(),"C1"));
        System.out.println(hashMap.put(new C(),"C2"));
        //@4
        System.out.println(hashMap.put(new D(),"D1"));
        System.out.println(hashMap.put(new D(),"D2"));
        //@5
        System.out.println(hashMap.put(new E(),"E1"));
        //@6
        System.out.println(hashMap.put(new E(),"E2"));
        //@7
        System.out.println("//////");
        for (Object key : hashMap.keySet()) {
            System.out.println(key.toString()+"="+hashMap.get(key));
        }
        //
        System.out.println("//////");
        System.out.println(hashMap.get(new A()));
        System.out.println(hashMap.get(new B()));
        System.out.println(hashMap.get(new C()));
        System.out.println(hashMap.get(new D()));
        System.out.println(hashMap.get(new E()));
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