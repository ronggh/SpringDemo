package annotation.factorybean;

import annotation.bean.Red;
import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBean implements FactoryBean<Red> {
    /**
     * 返回对象，这个对象会加到容器中
     * @return
     * @throws Exception
     */
    @Override
    public Red getObject() throws Exception {
        System.out.println("工厂Bean的getObject()方法创建对象实例．．．");
        return new Red();
    }

    /**
     * 返回类型
     * @return
     */
    @Override
    public Class<?> getObjectType() {
        return Red.class;
    }

    /**
     * 返回true,单实例，
     * @return
     */
    @Override
    public boolean isSingleton() {
        return true;
    }
}
