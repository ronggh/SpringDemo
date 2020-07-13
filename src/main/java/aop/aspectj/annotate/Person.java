package aop.aspectj.annotate;

import org.springframework.stereotype.Component;

@Component
public class Person {
    public void add(){
        System.out.println("Person add....");
    }
}
