package Spring.Proxy.JDKDynamicProxyMulti;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Project: 
 *
 * File: UserManagerProxy
 *
 * Description: 
 *
 * @author: MikeLC
 *
 * @date: 2018/11/5 下午 02:37
 *
 * Copyright ( c ) 2018
 *
 */
public class JDKDynamicProxyMulti implements InvocationHandler {

    // 目标对象
    private Object targetObject;
    //
    private Object proxyObject;

    //绑定关系，也就是关联到哪个接口（与具体的实现类绑定）的哪些方法将被调用时，执行invoke方法。
    public Object newProxyInstance(Object targetObject, Object proxyObject){
        this.targetObject=targetObject;
        this.proxyObject=proxyObject;
        //该方法用于为指定类装载器、一组接口及调用处理器生成动态代理类实例
        //第一个参数指定产生代理对象的类加载器，需要将其指定为和目标对象同一个类加载器
        //第二个参数要实现和目标对象一样的接口，所以只需要拿到目标对象的实现接口
        //第三个参数表明这些被拦截的方法在被拦截时需要执行哪个InvocationHandler的invoke方法
        //根据传入的目标返回一个代理对象
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),
                targetObject.getClass().getInterfaces(),this);
    }
    @Override
    //关联的这个实现类的方法被调用时将被执行
    /*InvocationHandler接口的方法，proxy表示代理，method表示原对象被调用的方法，args表示方法的参数*/
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        System.out.println("start-->>");
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
        Object ret=null;
        try{
            //反射得到操作者的实例
            Class clazz = this.proxyObject.getClass();
            //反射得到操作者的Start方法
            Method start = clazz.getDeclaredMethod("start", null);
            //反射执行start方法
            start.invoke(this.proxyObject, null);
            /**
             * 调用目标方法
             */
            ret=method.invoke(targetObject, args);
            /*原对象方法调用后处理日志信息*/
            //反射得到操作者的Start方法
            Method end = clazz.getDeclaredMethod("end", String.class);
            //反射执行start方法
            end.invoke(this.proxyObject, "123");

        }catch(Exception e){
            e.printStackTrace();
            System.out.println("error-->>");
            throw e;
        }
        return ret;
    }


}