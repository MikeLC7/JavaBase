package JavaBase.DataStructure.Array.arithmetic.InsertSort;

/**
 * Project:
 *
 * File: InsertSort
 *
 * Description:
 *
 * @author: MikeLC
 *
 * @date: 2018/11/1 下午 07:42
 *
 * Copyright ( c ) 2018
 *
 */
public class InsertSort {

    public static void main(String[] args){
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
        System.out.println("经过插入排序后的数组顺序为：");
        display(array);
    }

    public static int[] sort(int[] array){
        //计算时间复杂度
        int timeComplexity = 0;
        //计算交换复杂度
        int exchangeComplexity = 0;
        //
        int j;
        //从下标为1的元素开始选择合适的位置插入，因为下标为0的只有一个元素，默认是有序的
        for(int i = 1 ; i < array.length ; i++){
            boolean timeFlag = true;
            int tmp = array[i];//记录要插入的数据
            j = i;
            while(j > 0 && tmp < array[j-1]){//从已经排序的序列最右边的开始比较，找到比其小的数
                //
                array[j] = array[j-1];//向后挪动
                j--;

                //登记时间复杂度
                timeComplexity++ ;
                timeFlag = false;
                //登记交换复杂度
                exchangeComplexity++ ;
            }
            //
            array[j] = tmp;//存在比其小的数，插入
            //登记时间复杂度
            if (timeFlag){
                timeComplexity++ ;
            }
            //第 i轮排序的结果为
            System.out.print("第"+(i)+"轮排序后的结果为:");
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