package aop.aspectj.annotate;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"aop.aspectj.annotate"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AopConfig {

}
