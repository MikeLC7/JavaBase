package com.xcdh.target.javaBase.DataStructure.recursion.FindTwoPoint;


import org.junit.Test;

/**
 * Project:
 *
 * File: RecursionDemoListA
 *
 * Description:
 *
 * @author: MikeLC
 *
 * @date: 2018/11/2 下午 04:10
 *
 * Copyright ( c ) 2018
 *
 */
public class FindTwoPointDemoListA {



    /**
     * 找到目标值返回数组下标，找不到返回-1
     * @param array
     * @param key
     * @return
     */
    public static int findTwoPoint(int[] array,int key){
        int start = 0;
        int last = array.length-1;
        while(start <= last){
            int mid = (last-start)/2+start;//防止直接相加造成int范围溢出
            if(key == array[mid]){//查找值等于当前值，返回数组下标
                return mid;
            }
            if(key > array[mid]){//查找值比当前值大
                start = mid+1;
            }
            if(key < array[mid]){//查找值比当前值小
                last = mid-1;
            }
        }
        return -1;
    }

 


}