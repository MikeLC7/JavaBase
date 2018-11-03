package JVM.classLoad.sequence.simpleMode;

/**
 * Project:
 *
 * File: TestClass
 *
 * Description:
 *
 * @author: MikeLC
 *
 * @date: 2018/11/3 下午 08:45
 *
 * Copyright ( c ) 2018
 *
 */
public class TestClass {
    public static void main(String[] args) {
        try {
            // 测试Class.forName()
            Class testTypeForName = Class.forName("JVM.classLoad.sequence.simpleMode.TestClassType");
            System.out.println("testForName--" + testTypeForName);
            // 测试类名。class
            Class testTypeClass = TestClassType.class;
            System.out.println("testTypeClass--" + testTypeClass);
            // 测试Object.getClass()
            TestClassType testGetClass = new TestClassType();
            System.out.println("testGetClass--" + testGetClass.getClass());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
class TestClassType {
    // 构造函数
    public TestClassType() {
        System.out.println("--构造函数--");
    }
    // 静态的参数初始化
    static {
        System.out.println("--静态的参数初始化--");
    }
    // 非静态的参数初始化
    {
        System.out.println("--非静态的参数初始化--");
    }
}
