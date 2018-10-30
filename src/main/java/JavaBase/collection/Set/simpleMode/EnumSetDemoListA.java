package JavaBase.collection.Set.simpleMode;


import org.junit.Test;

import java.util.*;

/**
 * Project:
 *
 * File: EnumSetDemoListA
 *
 * Description:
 *
 * @author: MikeLC
 *
 * @date: 2018/10/29 下午 10:26
 *
 * Copyright ( c ) 2018
 *
 */
public class EnumSetDemoListA {


    @Test
    public void enumSetCopyOfDemo(){

    }

    enum Season{
       SPRING,
       SUMMER,
       AUTOMN,
       WINTER
    }

    @Test
    public void enumSetSimpleDemo(){
        //
        Set es1 = EnumSet.allOf(Season.class);
        System.out.println(es1);
        //
        Set es2 = EnumSet.noneOf(Season.class);
        System.out.println(es2);
        es2.add(Season.WINTER);
        es2.add(Season.AUTOMN);
        System.out.println(es2);
        //
        Set es3 = EnumSet.of(Season.SUMMER, Season.WINTER);
        System.out.println(es3);
        //
        EnumSet es4 = EnumSet.range(Season.SUMMER, Season.WINTER);
        System.out.println(es4);
        //
        Set es5 = EnumSet.complementOf(es4);
        System.out.println(es5);
        //
    }


}