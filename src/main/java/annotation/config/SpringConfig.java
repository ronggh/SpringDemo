package annotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// 表示用这个类作为Spring的配置类，代替xml配置文件
@Configuration
// 配置组件扫描
@ComponentScan(basePackages = {"annotation"})
public class SpringConfig {
}
