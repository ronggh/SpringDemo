package annotation.period;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Cat implements InitializingBean,DisposableBean {
    /**
     * 构造方法
     */
    public Cat() {
        System.out.println("Cat constructor....");
    }

    /**
     * 这个 对应初始化方法
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Cat init.....");
    }

    /**
     * 这个对应 销毁方法
     * @throws Exception
     */
    @Override
    public void destroy() throws Exception {
        System.out.println("Cat destroy.....");
    }
}
