package annotation.aware;

import annotation.dao.UserDao2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
@ComponentScan({"annotation.aware"})
public class AwareConfig {

}
