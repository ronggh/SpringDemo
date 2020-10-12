package annotation.autowired;

import annotation.dao.UserDao2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
@ComponentScan({"annotation.dao","annotation.service"})
public class AutowiredConfig {
    /**
     * 使用 @Primary 指定如果存在多个同类型的bean,有此注解的作为首选装配
     * @return
     */
    @Primary
    @Bean(value = "uDao2")
    public UserDao2 userDao2(){
        UserDao2 userDao2 = new UserDao2();
        userDao2.setLabel("2");
        return userDao2;
    }
}
