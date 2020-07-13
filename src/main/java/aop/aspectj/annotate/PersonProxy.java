package aop.aspectj.annotate;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect // 增强类的注解，生成代理对象
@Order(value = 1)  // 设置代理对象的优先级，数字越小，优先级越高
public class PersonProxy {
    // 相同的切入点进行抽取
    @Pointcut(value = "execution(* aop.aspectj.annotate.Person.add(..))")
    public void pointCut(){

    }


    // 想让该方法在Person类中add()方法之前执行
    // 使用@Before 代表前置通知
    @Before(value = "pointCut()")
    public void before(){
        System.out.println("PersonProxy before....");
    }

    @After(value = "pointCut()")
    public void after(){
        System.out.println("PersonProxy after ....");
    }

    @AfterReturning(value = "pointCut()")
    public void afterReturning(){
        System.out.println("PersonProxy after returning....");
    }

    // 异常通知
    @AfterThrowing(value = "pointCut()")
    public void afterThrowing(){
        System.out.println("PersonProxy after throwing....");
    }

    // 环绕通知
    @Around(value = "pointCut()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("PersonProxy around before....");

        // 被增强的方法
        proceedingJoinPoint.proceed();

        System.out.println("PersonProxy around after....");
    }
}
