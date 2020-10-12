package aop.aspectj.annotate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class MathDivConfig {
    @Bean
    public MathDiv mathDiv(){
        return new MathDiv();
    }

    @Bean
    public MathDivLogAspect mathDivLogAspect(){
        return new MathDivLogAspect();
    }
}
