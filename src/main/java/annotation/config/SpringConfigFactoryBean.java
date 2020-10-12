package annotation.config;

import annotation.factorybean.MyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 表示用这个类作为Spring的配置类，代替xml配置文件
 */
@Configuration
public class SpringConfigFactoryBean {
    @Bean
    public MyFactoryBean myFactoryBean(){
        return new MyFactoryBean();
    }
}
