package JavaBase.DataStructure.recursion.Factorial;


import org.junit.Test;

/**
 * Project:
 *
 * File: Factorial
 *
 * Description:
 *
 * @author: MikeLC
 *
 * @date: 2018/11/2 下午 05:11
 *
 * Copyright ( c ) 2018
 *
 */
public class FactorialDemoListA {


    /**
     * 0！=1  1！=1
     * 负数没有阶乘,如果输入负数返回-1
     * @param n
     * @return
     */
    public static int getFactorial(int n){
        if(n >= 0){
            if(n==0){
                System.out.println(n+"!=1");
                return 1;
            }else{
                System.out.println(n);
                int temp = n*getFactorial(n-1);
                System.out.println(n+"!="+temp);
                return temp;
            }
        }
        return -1;
    }

    /**
     * 0！=1  1！=1
     * 负数没有阶乘,如果输入负数返回-1
     * @param n
     * @return
     */
    public static int getFactorialFor(int n){
        int temp = 1;
        if(n >=0){
            for(int i = 1 ; i <= n ; i++){
                temp = temp*i;
            }
        }else{
            return -1;
        }
        return temp;
    }



}