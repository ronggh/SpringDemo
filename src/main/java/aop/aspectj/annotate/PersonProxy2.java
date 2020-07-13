package aop.aspectj.annotate;

import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect // 增强类的注解，生成代理对象
@Order(value = 10)  // 设置代理对象的优先级，数字越小，优先级越高
public class PersonProxy2 {

    // 使用@Before 代表前置通知
    @Before(value = "execution(* aop.aspectj.annotate.Person.add(..))")
    public void before() {
        System.out.println("PersonProxy2 before....");
    }


}
