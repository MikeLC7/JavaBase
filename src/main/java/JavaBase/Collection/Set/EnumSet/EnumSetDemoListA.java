package JavaBase.Collection.Set.EnumSet;


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
        Collection c = new HashSet();
        c.add(Season.SPRING);
        c.add(Season.SUMMER);
        //
        EnumSet es = EnumSet.copyOf(c);
        System.out.println(es);
        //
        //es.add("123"); //java.lang.ClassCastException
        c.add(Season.AUTOMN);
        es = es.copyOf(c);
        //
        System.out.println(es);
        //
        c.add("123");
        //es.copyOf(c); //java.lang.ClassCastException
        System.out.println(es);
    }

    enum Season{
       SPRING,
       SUMMER,
       AUTOMN,
       WINTER
    }

    @Test
    public void enumSetSimpleDemo(){
        //@1
        Set es1 = EnumSet.allOf(Season.class);
        System.out.println(es1);
        //@2
        Set es2 = EnumSet.noneOf(Season.class);
        System.out.println(es2);
        es2.add(Season.WINTER);
        es2.add(Season.AUTOMN);
        System.out.println(es2);
        //@3
        Set es3 = EnumSet.of(Season.SUMMER, Season.WINTER);
        System.out.println(es3);
        //@4
        EnumSet es4 = EnumSet.range(Season.SUMMER, Season.WINTER);
        System.out.println(es4);
        //@5
        Set es5 = EnumSet.complementOf(es4);
        //
        System.out.println(es5);
    }


}