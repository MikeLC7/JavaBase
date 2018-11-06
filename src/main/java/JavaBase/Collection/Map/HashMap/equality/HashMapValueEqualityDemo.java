package JavaBase.Collection.Map.HashMap.equality;


import org.junit.Test;

import java.util.HashMap;

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
public class HashMapValueEqualityDemo {

    class A {
        public int hashCode(){
            return 17;
        }
        public boolean equals(Object o){
            return true;
        }
    }

    class B {
        public int hashCode(){
            return 1;
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
    public void hashMapValyeEqualityDemo(){
        HashMap hashMap = new HashMap();
        //@1
        System.out.println(hashMap.put(new A(),"A1"));
        System.out.println(hashMap.put(new A(),"A2"));
        //@2
        System.out.println(hashMap.put(new B(),"B1"));
        System.out.println(hashMap.put(new B(),"B2"));
        //@7
        System.out.println("//////");
        for (Object key : hashMap.keySet()) {
            System.out.println(key.toString()+"="+hashMap.get(key));
        }
        //
        System.out.println("//////");
        //@11
        System.out.println(hashMap.get(new A()));
        System.out.println(hashMap.get(new B()));

    }


}