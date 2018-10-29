package JVM.classLoad.sequence.compositeMode;

/**
 * Project:
 *
 * File:com.MikeLC7.JavaBase.base.statics
 *
 * Description:
 *
 * @author: MikeLC
 *
 * @date: 2018-10-27 下午 11:12 
 **/
public class CompositeTest {
    /**
     1:g i=0 n=0
     2:h i=1 n=1
     3:j i=2 n=2
     4:构造块 i=3 n=3
     5:t1 i=4 n=4
     6:j i=5 n=5
     7:构造块 i=6 n=6
     8:t2 i=7 n=7
     9:i i=8 n=8
     10:静态块 i=9 n=99
     11:j i=10 n=100
     12:构造块 i=11 n=101
     13:init i=12 n=102
     */
    public static int k = 0;
    public static int g = print("g");
    public static int h = print("h");
    public static CompositeTest t1 = new CompositeTest("t1");
    public static CompositeTest t2 = new CompositeTest("t2");
    public static int i = print("i");
    public static int n = 99;
    public int j = print("j");
 
    {
        print("构造块");
    }
 
    static{
        print("静态块");
    }
 
    public CompositeTest(String str) {
        System.out.println((++k) + ":" + str + " i=" + i + " n=" + n);
        ++n;
        ++i;
    }

    public static int print(String str) {
        System.out.println((++k) + ":" + str + " i=" + i + " n=" + n);
        ++i;
        return ++n;
    }

    public static void main(String[] args) {
        CompositeTest t = new CompositeTest("init");
    }

}

