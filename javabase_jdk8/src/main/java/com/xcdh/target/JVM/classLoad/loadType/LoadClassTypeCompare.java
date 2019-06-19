package com.xcdh.target.JVM.classLoad.loadType;

/**
 * Project: 
 *
 * File: LoadClassTypeCompare
 *
 * Description: 
 *
 * @author: MikeLC
 *
 * @date: 2018/11/5 下午 11:59
 *
 * Copyright ( c ) 2018
 *
 */
public class LoadClassTypeCompare {

    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader loader = CommonClass.class.getClassLoader();
        System.out.println(loader);
        //使用ClassLoader.loadClass()来加载类，不会执行初始化块
        loader.loadClass("com.xcdh.target.JVM.classLoad.loadType.LoadClassType");
        System.out.println("////////////");
        //使用Class.forName()来加载类，默认会执行初始化块
        Class.forName("com.xcdh.target.JVM.classLoad.loadType.LoadClassType");
        //使用Class.forName()来加载类，并指定ClassLoader，初始化时不执行静态块
//                Class.forName("Test2", false, loader);
    }


}
class LoadClassType {
    // 静态属性
    private static String staticField = getStaticField();
    // 静态的参数初始化
    static {
        System.out.println("--静态的参数初始化--");
    }
    // 普通属性
    private String field = getField();
    // 构造函数
    public LoadClassType() {
        System.out.println("--构造函数--");
    }
    // 非静态的参数初始化
    {
        System.out.println("--非静态的参数初始化--");
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
