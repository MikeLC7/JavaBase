package JavaBase.collection.Set.HashSet.equality;


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
        System.out.println(setDemo.add("abc"));
        System.out.println(setDemo.add("123"));
        System.out.println(setDemo.add("456"));
        System.out.println(setDemo.add("789"));
        System.out.println(setDemo.add("012"));
        System.out.println(setDemo.add("edf"));
        //@1
        System.out.println(setDemo.add(null));
        //@2
        System.out.println(setDemo.add("123"));
        //@3
        System.out.println(setDemo);
    }


}