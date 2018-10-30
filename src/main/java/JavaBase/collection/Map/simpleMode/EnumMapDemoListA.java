package JavaBase.collection.Map.simpleMode;


import org.junit.Test;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Set;

/**
 * Project:
 *
 * File: EnumMapDemoListA
 *
 * Description:
 *
 * @author: MikeLC
 *
 * @date: 2018/10/30 下午 04:37
 *
 * Copyright ( c ) 2018
 *
 */
public class EnumMapDemoListA {


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
    public void enumMapSimpleDemo(){
        //
        EnumMap es1 = new EnumMap(Season.class);
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
        //
        System.out.println(es5);
        //
    }


}