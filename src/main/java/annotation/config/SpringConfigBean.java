package annotation.config;

import annotation.bean.*;
import org.springframework.context.annotation.*;

import javax.sound.midi.Soundbank;

/**
 * 表示用这个类作为Spring的配置类，代替xml配置文件
 */
@Configuration
public class SpringConfigBean {
    /**
     * 使用@Bean,创建 PersonBean对象
     * 类型名即为返回值类型
     * id为方法名,可以通过@Bean(value="xxx")指定。
     * 使用@Scope,来指定创建是的单实例（singleton，默认），还是多实例（prototype）
     *  单实例：加载环境时即被创建（默认），可以指定@Lazy进行懒加载(只对单实例有效)
     *  多实例：使用懒加载
     * @return
     */
    @Bean("pBean")
//    @Lazy
//    @Scope("prototype")
    public PersonBean getPersonBean(){
        System.out.println("在容器中创建了PersonBean....");
        return new PersonBean("张飞",26);
    }
}
