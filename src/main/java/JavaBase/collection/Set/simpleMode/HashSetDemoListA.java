package JavaBase.collection.Set.simpleMode;


import org.junit.Test;

import java.util.*;

/**
 * Project:
 *
 * File: HashSetDemoListA
 *
 * Description:
 *
 * @author: MikeLC
 *
 * @date: 2018/10/29 下午 10:14
 *
 * Copyright ( c ) 2018
 *
 */
public class HashSetDemoListA {

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
    public void hashSetSimpleDemo(){
        Set setDemo = new HashSet();
        System.out.println(setDemo.add("123"));
        System.out.println(setDemo.add("456"));
        System.out.println(setDemo.add("789"));
        System.out.println(setDemo.add("012"));
        System.out.println(setDemo.add(null));
        System.out.println(setDemo.add("123"));
        //
        System.out.println(setDemo);
    }


}