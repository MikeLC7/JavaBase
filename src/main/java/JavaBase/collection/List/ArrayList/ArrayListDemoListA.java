package JavaBase.collection.List.ArrayList;


import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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



    /**
     * Description: undo
     *
     * @param:
     *
     * @author: MikeLC
     *
     * @date: 2018/10/30 上午 11:35
     */
    @Test
    public void ensureCapacityDemo(){
        List listDemo = new ArrayList();
        //
        for (int i=1; i<=20; i++){
            System.out.println("==="+i+"===");
            System.out.println(listDemo.size());
            listDemo.add("abc");
        }
        //
        System.out.println(listDemo);
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
        //
        String testStr = new String("abc");
        //
        System.out.println(listDemo.indexOf(testStr));
        System.out.println(listDemo.indexOf(new Lee()));
        //
        System.out.println(listDemo.remove(new Lee()));
        //
        System.out.println(listDemo);
    }


}