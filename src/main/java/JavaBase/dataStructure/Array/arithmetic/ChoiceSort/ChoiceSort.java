package JavaBase.dataStructure.Array.arithmetic.ChoiceSort;

/**
 * Project: 
 *
 * File: ChoiceSort
 *
 * Description: 
 *
 * @author: MikeLC
 *
 * @date: 2018/11/1 下午 06:02
 *
 * Copyright ( c ) 2018
 *
 */
public class ChoiceSort {

    public static void main(String[] args){
        //@1
        //int[] array = {1,2,3,4,5,6,7,8,9};
        //@2
        //int[] array = {9,8,7,6,5,4,3,2,1};
        //@3
        int[] array = {1,2,3,4,8,9,5,7,6};
        //int[] array = {4,2,8,9,5,7,6,1,3};
        //未排序数组顺序为
        System.out.println("未排序数组顺序为：");
        display(array);
        System.out.println("-----------------------");
        array = sort(array);
        System.out.println("-----------------------");
        System.out.println("经过选择排序后的数组顺序为：");
        display(array);
    }

    public static int[] sort(int[] array){
        //计算时间复杂度
        int timeComplexity = 0;
        //计算交换复杂度
        int exchangeComplexity = 0;
        //总共要经过N-1轮比较
        for(int i = 0 ; i < array.length-1 ; i++){
            int min = i;
            //每轮需要比较的次数
            for(int j = i+1 ; j < array.length ; j++){
                //登记时间复杂度
                timeComplexity++ ;
                //
                if(array[j]<array[min]){
                    min = j;//记录目前能找到的最小值元素的下标
                }
            }
            //将找到的最小值和i位置所在的值进行交换
            if(i != min){
                //登记交换复杂度
                exchangeComplexity++ ;
                //
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
            //第 i轮排序的结果为
            System.out.print("第"+(i+1)+"轮排序后的结果为:");
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