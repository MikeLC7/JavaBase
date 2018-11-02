package JavaBase.Collection.List.ArrayList;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Project:
 *
 * File: ListDemoListA
 *
 * Description:
 *
 * @author: MikeLC
 *
 * @date: 2018/10/30 上午 10:58
 *
 * Copyright ( c ) 2018
 *
 */
public class ArrayListDemoListA {


    @Test
    public void ensureCapacityInitDemo(){
        //@1
        List listDemo = new ArrayList(20);
        //
        for (int i=1; i<=20; i++){
            System.out.println("==="+i+"===");
            System.out.println(listDemo.size());
            //@2
            listDemo.add("abc");
        }
        //
        System.out.println(listDemo);
        System.out.println(listDemo.size());
    }

    @Test
    public void ensureCapacitySimpleDemo(){
        List listDemo = new ArrayList();
        //
        for (int i=1; i<=20; i++){
            System.out.println("==="+i+"===");
            System.out.println(listDemo.size());
            //@1
            listDemo.add("abc");
        }
        //
        System.out.println(listDemo);
        System.out.println(listDemo.size());
    }

    class Lee {
        public boolean equals(Object o){
            return true;
        }
    }

    @Test
    public void listEqualDemo(){
        List listDemo = new ArrayList();
        //
        listDemo.add("abc");
        listDemo.add("123");
        //
        System.out.println(listDemo);
        String testStr = new String("abc");
        //@1
        System.out.println(listDemo.indexOf(testStr));
        //@2
        System.out.println(listDemo.indexOf(new Lee()));
        //@3
        System.out.println(listDemo.remove(new Lee()));
        //
        System.out.println(listDemo);
    }


}