package com.xcdh.target.javaBase.DataStructure.recursion.Hannuo;


import org.junit.Test;

/**
 * Project:
 *
 * File: HannuoDemoListA
 *
 * Description:
 *
 * @author: MikeLC
 *
 * @date: 2018/11/2 下午 05:18
 *
 * Copyright ( c ) 2018
 *
 */
public class HannuoDemoListA {


    /**
     * 汉诺塔问题
     * @param dish 盘子个数(也表示名称)
     * @param from 初始塔座
     * @param temp 中介塔座
     * @param to   目标塔座
     */
    public static void move(int dish,String from,String temp,String to){
        if(dish == 1){
            System.out.println("将盘子"+dish+"从塔座"+from+"移动到目标塔座"+to);
        }else{
            move(dish-1,from,to,temp);//A为初始塔座，B为目标塔座，C为中介塔座
            System.out.println("将盘子"+dish+"从塔座"+from+"移动到目标塔座"+to);
            move(dish-1,temp,from,to);//B为初始塔座，C为目标塔座，A为中介塔座
        }
    }

    public static int search(int[] array,int key,int low,int high){
        int mid = (high-low)/2+low;
        if(key == array[mid]){//查找值等于当前值，返回数组下标
            return mid;
        }else if(low > high){//找不到查找值，返回-1
            return -1;
        }else{
            if(key < array[mid]){//查找值比当前值小
                return search(array,key,low,mid-1);
            }
            if(key > array[mid]){//查找值比当前值大
                return search(array,key,mid+1,high);
            }
        }
        return -1;
    }






}