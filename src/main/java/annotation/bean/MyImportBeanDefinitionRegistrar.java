package annotation.bean;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 自定义组件
 * 逻辑为：如果容器中有red和blue组件，则注册RainBow组件
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean hasRed = registry.containsBeanDefinition("annotation.bean.Red");
        boolean hasBlue = registry.containsBeanDefinition("annotation.bean.Blue");

        if(hasRed && hasBlue){
            registry.registerBeanDefinition("rainBow",new RootBeanDefinition(RainBow.class));
        }
    }
}
