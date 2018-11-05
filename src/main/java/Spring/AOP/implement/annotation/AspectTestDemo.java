package Spring.AOP.implement.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Project:
 *
 * File: AspectTestDemo
 *
 * Description:
 *
 * @author: MikeLC
 *
 * @date: 2018/11/5 下午 07:27
 *
 * Copyright ( c ) 2018
 *
 */
public class AspectTestDemo {

    public static void main(String[] args) throws Exception {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class); // 1
        //注解
        AspectTestService aspectTestService = context.getBean(AspectTestService.class);
        aspectTestService.normalMethod("AspectTestDemo");
        //
        System.out.println("//////////////////");
        //
        aspectTestService.exception();
        context.close();

    }



}
