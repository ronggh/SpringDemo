package annotation.config;

import annotation.bean.*;
import org.springframework.context.annotation.*;
/**
 * 表示用这个类作为Spring的配置类，代替xml配置文件
 */
@Configuration
@Import({Green.class,Red.class,MyImportSelector.class,MyImportBeanDefinitionRegistrar.class})
public class SpringConfigImport {

}
