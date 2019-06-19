package com.xcdh.target.Spring.AOP.implement.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Project: 
 *
 * File: LogAspect
 *
 * Description: 
 *
 * @author: MikeLC
 *
 * @date: 2018/11/5 下午 07:18
 *
 * Copyright ( c ) 2018
 *
 */
@Aspect
@Order(-99)
@Component
public class LogAspect {

    @Pointcut("execution(* com.xcdh.target.Spring.AOP.implement.annotation.*.*(..))")
    public void webPointCut(){}

    @Before("webPointCut()")
    public void deBefore(JoinPoint joinPoint) throws Throwable {
        // 接收到请求，记录请求内容
        System.out.println("【注解：Before】------------------切面  before;");
    }

    @AfterReturning(returning = "ret", pointcut = "webPointCut()")
    public void doAfterReturning(Object ret) throws Throwable {
        // 处理完请求，返回内容
        System.out.println("【注解：AfterReturning】这个会在切面最后的最后打印，方法的返回值 : " + ret);
    }

    //后置异常通知
    @AfterThrowing(pointcut = "webPointCut()", throwing = "e")
    public void throwss(JoinPoint jp, Throwable e){
        System.out.println("【注解：AfterThrowing】方法异常时执行.....");
        System.out.println("【注解：AfterThrowing】Throwable....." + e.getMessage());
    }

    //后置最终通知,final增强，不管是抛出异常或者正常退出都会执行
    @After("webPointCut()")
    public void after(JoinPoint jp){
        System.out.println("【注解：After】方法最后执行.....");
    }

    //环绕通知,环绕增强，相当于MethodInterceptor
    @Around("webPointCut()")
    public Object arround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("【注解：Around . 环绕前】方法环绕start.....");
        //@1
        /*try {
            Object o =  pjp.proceed();//如果不执行这句，会不执行切面的Before方法及controller的业务方法
            System.out.println("【注解：Around. 环绕后】方法环绕proceed，结果是 :" + o);
            return o;
        } catch (Throwable e) {
            e.printStackTrace();
            return null;
        }
        */
        //
        Object o =  pjp.proceed();//如果不执行这句，会不执行切面的Before方法及controller的业务方法
        System.out.println("【注解：Around. 环绕后】方法环绕proceed，结果是 :" + o);
        return o;
    }


}
