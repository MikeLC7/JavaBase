package Spring.AOP.implement.annotation;


import org.springframework.stereotype.Service;

@Service
public class AspectTestService {

    public String normalMethod(String test){
        System.out.println("=====AspectTestService.normalMethod=====start");
        System.out.println(test);
        System.out.println("=====AspectTestService.normalMethod=====end");
        return test;
    }

    public void exception() throws Exception{
        System.out.println("=====AspectTestService.exception=====start");
        int i = 5/0;
        System.out.println("=====AspectTestService.exception=====end");
    }

}
