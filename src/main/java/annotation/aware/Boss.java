package annotation.aware;

import org.springframework.beans.BeansException;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

@Component
public class Boss implements ApplicationContextAware, BeanNameAware,EmbeddedValueResolverAware {
    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        System.out.println("当前的ApplicationContext: " + applicationContext);
    }

    @Override
    public void setBeanName(String beanName) {
        System.out.println("当前类的名字：" + beanName);
    }

    /**
     * 解析 ${},#{}等
     * @param stringValueResolver
     */
    @Override
    public void setEmbeddedValueResolver(StringValueResolver stringValueResolver) {
        String osName = stringValueResolver.resolveStringValue("${os.name}");
        System.out.println("当前的操作系统是：" + osName);
    }
}
