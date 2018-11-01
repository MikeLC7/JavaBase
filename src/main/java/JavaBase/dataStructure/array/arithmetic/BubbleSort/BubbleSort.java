package JavaBase.dataStructure.array.arithmetic.BubbleSort;


import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * Project:
 *
 * File: ArrayArithmeticDemoListA
 *
 * Description:
 *
 * @author: MikeLC
 *
 * @date: 2018/11/1 下午 05:26
 *
 * Copyright ( c ) 2018
 *
 */
public class BubbleSort {

    public static void main(String[] args) {
        //@1
        //int[] array = {1,2,3,4,5,6,7,8,9};
        //@2
        //int[] array = {9,8,7,6,5,4,3,2,1};
        //@3
        //int[] array = {1,2,3,4,8,9,5,7,6};
        int[] array = {4,2,8,9,5,7,6,1,3};
        //未排序数组顺序为
        System.out.println("未排序数组顺序为：");
        display(array);
        System.out.println("-----------------------");
        array = sort(array);
        System.out.println("-----------------------");
        System.out.println("经过冒泡排序后的数组顺序为：");
        display(array);
    }

    public static int[] sort(int[] array){
        //计算时间复杂度
        int timeComplexity = 0;
        //计算交换复杂度
        int exchangeComplexity = 0;
        //这里for循环表示总共需要比较多少轮
        for(int i = 1 ; i < array.length; i++){
            //设定一个标记，若为true，则表示此次循环没有进行交换，也就是待排序列已经有序，排序已经完成。
            boolean flag = true;
            //这里for循环表示每轮比较参与的元素下标
            //对当前无序区间array[0......length-i]进行排序
            //j的范围很关键，这个范围是在逐步缩小的,因为每轮比较都会将最大的放在右边
            for(int j = 0 ; j < array.length-i ; j++){
                //登记时间复杂度
                timeComplexity++ ;
                //
                if(array[j]>array[j+1]){
                    //登记交换复杂度
                    exchangeComplexity++ ;
                    //
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = false;
                }
            }
           if(flag){
                break;
            }
            //第i轮排序的结果为
            System.out.print("第"+i+"轮排序后的结果为:");
            display(array);
        }
        //打印复杂度
        System.out.println("时间复杂度为：" + timeComplexity);
        System.out.println("交换复杂度为：" + exchangeComplexity);
        return array;

    }

    //遍历显示数组
    public static void display(int[] array){
        for(int i = 0 ; i < array.length ; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

}