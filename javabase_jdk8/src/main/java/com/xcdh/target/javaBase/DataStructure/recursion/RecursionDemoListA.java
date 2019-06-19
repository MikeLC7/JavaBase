package com.xcdh.target.javaBase.DataStructure.recursion;


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
public class RecursionDemoListA {


    @Test
    public void demo1(){
        System.out.println(pow(2,8));
    }

    /**
     * Description: x^y= (x^2)^(y/2)，定义a=x^2,b=y/2, 则得到形如： x^y= a^b;
     *
     * @param:
     *
     * @author: MikeLC
     *
     * @date: 2018/11/2 下午 05:01
     */
    public static int pow(int x,int y){
        if(x == 0 || x == 1){
            return x;
        }
        if(y > 1){
            int b = y/2;
            int a = x*x;
            if(y%2 == 1){//y为奇数
                return pow(a,b)*x;
            }else{//y为偶数
                return pow(a,b);
            }
        }else if(y == 0){
            return 1;
        }else{//y==1
            return x;
        }
    }

    public static int[] mergeSort(int[] c,int start,int last){
        if(last > start){
            //也可以是(start+last)/2，这样写是为了防止数组长度很大造成两者相加超过int范围，导致溢出
            int mid = start + (last - start)/2;
            mergeSort(c,start,mid);//左边数组排序
            mergeSort(c,mid+1,last);//右边数组排序
            merge(c,start,mid,last);//合并左右数组
        }
        return c;
    }

    public static void merge(int[] c,int start,int mid,int last){
        int[] temp = new int[last-start+1];//定义临时数组
        int i = start;//定义左边数组的下标
        int j = mid + 1;//定义右边数组的下标
        int k = 0;
        while(i <= mid && j <= last){
            if(c[i] < c[j]){
                temp[k++] = c[i++];
            }else{
                temp[k++] = c[j++];
            }
        }
        //把左边剩余数组元素移入新数组中
        while(i <= mid){
            temp[k++] = c[i++];
        }
        //把右边剩余数组元素移入到新数组中
        while(j <= last){
            temp[k++] = c[j++];
        }

        //把新数组中的数覆盖到c数组中
        for(int k2 = 0 ; k2 < temp.length ; k2++){
            c[k2+start] = temp[k2];
        }
    }

    /**
     * 传入两个有序数组a和b，返回一个排好序的合并数组
     * @param a
     * @param b
     * @return
     */
    public static int[] simpleMerge(int[] a,int[] b){
        int[] c = new int[a.length+b.length];
        int aNum = 0,bNum = 0,cNum=0;
        while(aNum<a.length && bNum < b.length){
            if(a[aNum] >= b[bNum]){//比较a数组和b数组的元素，谁更小将谁赋值到c数组
                c[cNum++] = b[bNum++];
            }else{
                c[cNum++] = a[aNum++];
            }
        }
        //如果a数组全部赋值到c数组了，但是b数组还有元素，则将b数组剩余元素按顺序全部复制到c数组
        while(aNum == a.length && bNum < b.length){
            c[cNum++] = b[bNum++];
        }
        //如果b数组全部赋值到c数组了，但是a数组还有元素，则将a数组剩余元素按顺序全部复制到c数组
        while(bNum == b.length && aNum < a.length){
            c[cNum++] = a[aNum++];
        }
        return c;
    }

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