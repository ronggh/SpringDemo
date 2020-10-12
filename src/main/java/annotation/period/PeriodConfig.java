package annotation.period;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class PeriodConfig {

    /**
     * initMethod,指定初始化的方法
     * destroyMethod，指定销毁的方法
     * 单实例（singleton，默认），还是多实例（prototype）
     *
     * 对象创建：
     *       单实例：在容器创建完成即创建出对象
     *       多实例：每次使用时创建
     *
     * 初始化：
     *      单实例、多实例相同，在对象创建完成，并赋值好，会调用初始化的方法
     * 销毁：
     *      单实例：在容器关闭时销毁
     *      多实例：容器不管理这个bean,不会销毁
     *
     * @return
     */
    @Bean(initMethod = "init",destroyMethod = "destroy")
//    @Scope("prototype")
    public Car car(){
        return new Car();
    }

    @Bean
    public Cat cat(){
        return new Cat();
    }

    @Bean
    public Dog dog(){
        return new Dog();
    }

    @Bean
    public MyBeanPostProcessor myBeanPostProcessor(){
        return new MyBeanPostProcessor();
    }
}
