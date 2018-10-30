package JavaBase.collection.Iterator.simpleMode;



import org.junit.Test;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Project:
 *
 * File: IteratorDemoA
 *
 * Description:
 *
 * @author: MikeLC
 *
 * @date: 2018/10/29 下午 06:06
 *
 * Copyright ( c ) 2018
 *
 */
public class IteratorDemoListA {


    /**
     * Description: 迭代过程中由于集合被修改，引发异常：java.util.ConcurrentModificationException
     *
     * @param:
     *
     * @author: MikeLC
     *
     * @date: 2018/10/29 下午 06:17
     */
    @Test
    public void foreachTraverseErrorDemo(){
        //create collection
        Collection books = new HashSet();
        books.add("aaaaa");
        books.add("bbbbb");
        books.add("ccccc");
        //foreach
        for (Object object : books){
            String temp = (String) object;
            System.out.println(temp);
            if (temp.equals("bbbbb")){
                books.remove(temp);
            }
            //测试iterator值传递
            temp = "XXX";
        }
        System.out.println(books);
    }

    /**
     * Description: foreach-值传递
     *
     * @param:
     *
     * @author: MikeLC
     *
     * @date: 2018/10/29 下午 06:07
     */
    @Test
    public void foreachTraverseDemo(){
        //create collection
        Collection books = new HashSet();
        books.add("aaaaa");
        books.add("bbbbb");
        books.add("ccccc");
        //foreach
        for (Object object : books){
            String temp = (String) object;
            System.out.println(temp);
            //测试iterator值传递
            temp = "XXX";
        }
        System.out.println(books);
    }


    /**
     * Description: 迭代过程中由于集合被修改，引发异常：java.util.ConcurrentModificationException
     *
     * @param:
     *
     * @author: MikeLC
     *
     * @date: 2018/10/29 下午 06:17
     */
    @Test
    public void iteratorTraverseErrorDemo(){
        //create collection
        Collection books = new HashSet();
        books.add("aaaaa");
        books.add("bbbbb");
        books.add("ccccc");
        //iterator
        Iterator iterator = books.iterator();
        while (iterator.hasNext()){
            String temp = (String) iterator.next();
            System.out.println(temp);
            //
            if (temp.equals("ccccc")){
                books.remove(temp);
            }
            //测试iterator值传递
            temp = "XXX";
        }
        System.out.println(books);
    }

    /**
     * Description: Iterator简单测试-值传递
     *
     * @param:
     *
     * @author: MikeLC
     *
     * @date: 2018/10/29 下午 06:07
     */
    @Test
    public void iteratorTraverseDemo(){
        //create collection
        Collection books = new HashSet();
        books.add("aaaaa");
        books.add("bbbbb");
        books.add("ccccc");
        //iterator
        Iterator iterator = books.iterator();
        while (iterator.hasNext()){
            String temp = (String) iterator.next();
            System.out.println(temp);
            //
            if (temp.equals("ccccc")){
                iterator.remove();
            }
            //测试iterator值传递
            temp = "XXX";
        }
        System.out.println(books);
    }

}