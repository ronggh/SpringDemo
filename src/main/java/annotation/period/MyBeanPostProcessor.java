package annotation.period;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
    /**
     * 初始化之前被调用
     *
     * @param bean，            bean实例
     * @param beanName，bean的名字
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization ==> bean :" + bean + " bean name:" + beanName);
        return bean;
    }

    /**
     * 初始化之后被调用
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization ==> bean :" + bean + " bean name:" + beanName);
        return bean;
    }
}
