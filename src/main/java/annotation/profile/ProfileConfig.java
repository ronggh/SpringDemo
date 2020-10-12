package annotation.profile;

import annotation.aware.Boss;
import annotation.bean.Red;
import annotation.period.Car;
import annotation.period.Cat;
import annotation.period.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
// 加在配置类上，表示只有环境匹配时，整个配置类下的组件才会进行注册
//@Profile("dev")
public class ProfileConfig {
    @Bean
    public Red red(){
        return new Red();
    }

    @Bean
    @Profile("default")
    public Car car(){
        return new Car();
    }

    @Bean
    @Profile("dev")
    public Dog dog(){
        return new Dog();
    }

    @Bean
    @Profile("test")
    public Cat cat(){
        return new Cat();
    }

    @Bean
    @Profile("prod")
    public Boss boss(){
        return new Boss();
    }
}
