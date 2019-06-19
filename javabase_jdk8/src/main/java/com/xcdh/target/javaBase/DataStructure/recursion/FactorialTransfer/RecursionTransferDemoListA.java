package com.xcdh.target.javaBase.DataStructure.recursion.FactorialTransfer;


import org.junit.Test;

/**
 * Project:
 *
 * File: RecursionTransferDemoListA
 *
 * Description:
 *
 * @author: MikeLC
 *
 * @date: 2018/11/2 下午 05:23
 *
 * Copyright ( c ) 2018
 *
 */
public class RecursionTransferDemoListA {


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






}