package JavaBase.collection.Set.TreeSet;


import org.junit.Test;

import java.util.*;

/**
 * Project:
 *
 * File: TreeSetDemoListA
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
public class TreeSetDemoListA {


    class C implements Comparable{
        int age ;
        public C(int age){
            this.age = age;
        }
        public String toString(){
            return "M{age:"+age+"}";
        }

        @Override
        public int compareTo(Object o) {
            C c2 = (C)o;
            return this.age > c2.age ? -1 : this.age < c2.age ? 1 : 0;
        }
    }

    @Test
    public void treeSetCustomComparebleDemo(){
        Set setDemo = new TreeSet();
        setDemo.add(new C(-1));
        setDemo.add(new C(98));
        setDemo.add(new C(8));
        setDemo.add(new C(0));
        //
        System.out.println(setDemo);
    }

    class M {
        int age ;
        public M(int age){
            this.age = age;
        }
        public String toString(){
            return "M{age:"+age+"}";
        }
    }

    @Test
    public void treeSetCustomSortDemo(){
        Set setDemo = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                M m1 = (M)o1;
                M m2 = (M)o2;
                return m1.age > m2.age ? -1 : m1.age < m2.age ? 1 : 0;
            }
        });
        setDemo.add(new M(-1));
        setDemo.add(new M(98));
        setDemo.add(new M(8));
        setDemo.add(new M(0));
        //
        System.out.println(setDemo);
    }

    @Test
    public void treeSetErrorDemo2(){
        Set setDemo = new TreeSet();
        System.out.println(setDemo.add(new Date()));
        System.out.println(setDemo.add(new String("123")));//java.lang.ClassCastException
        //
        System.out.println(setDemo);
    }

    class TreeSetError {

    }
    @Test
    public void treeSetErrorDemo(){
        Set setDemo = new TreeSet();
        System.out.println(setDemo.add(new TreeSetError()));//java.lang.ClassCastException
        System.out.println(setDemo.add(new TreeSetError()));
        //
        System.out.println(setDemo);
    }

    @Test
    public void treeSetSimpleDemo(){
        Set setDemo = new TreeSet();
        System.out.println(setDemo.add("123"));
        System.out.println(setDemo.add("456"));
        System.out.println(setDemo.add("789"));
        System.out.println(setDemo.add("012"));
        //System.out.println(setDemo.add(null));
        System.out.println(setDemo.add("123"));
        //
        System.out.println(setDemo);
    }

}