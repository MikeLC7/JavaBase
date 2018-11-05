package JVM.classLoad.loadType;

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
public class GetClassTypeCompare {
    public static void main(String[] args) {
        try {
            // 测试类名。class
            Class getClassTypeClass = GetClassType.class;
            System.out.println("testTypeClass--" + getClassTypeClass);
            // 测试Class.forName()
            Class testTypeForName = Class.forName("JVM.classLoad.loadType.GetClassType");
            System.out.println("testForName--" + testTypeForName);
            // 测试Object.getClass()
            GetClassType getClassType = new GetClassType();
            System.out.println("testGetClass--" + getClassType.getClass());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
class GetClassType {
    // 静态属性
    private static String staticField = getStaticField();
    // 静态的参数初始化
    static {
        System.out.println("--静态的参数初始化--");
    }
    // 普通属性
    private String field = getField();
    // 非静态的参数初始化
    {
        System.out.println("--非静态的参数初始化--");
    }
    // 构造函数
    public GetClassType() {
        System.out.println("--构造函数--");
    }

    public static String getStaticField() {
        String statiFiled = "Static Field Initial";
        System.out.println("静态属性初始化");
        return statiFiled;
    }

    public static String getField() {
        String filed = "Field Initial";
        System.out.println("普通属性初始化");
        return filed;
    }
}
