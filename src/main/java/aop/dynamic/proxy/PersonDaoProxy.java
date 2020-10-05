package aop.dynamic.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class PersonDaoProxy implements InvocationHandler {
    // 创建谁的代理对象，需要知道,可以通过有参的构造函数传递
    private Object object;

    public PersonDaoProxy(Object object) {
        this.object = object;
    }

    // 代理中增加的逻辑
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // 原方法之前，增强的处理
        System.out.println("增强方法之前执行..." + method.getName() +
                ">>>> 传递的参数：" + Arrays.toString(args));
        // 还可以根据不同的方法进行不同的处理
        String methodName = method.getName();
        if(methodName.equalsIgnoreCase("add")){
            System.out.println("add方法的增强处理....");
        }
        if(methodName.equalsIgnoreCase("update")){
            System.out.println("update方法的增加强处理.....");
        }

        // 原方法
        System.out.println("原方法执行：" + method.getName());
        Object result = method.invoke(object, args);

        // 原方法之后，增加的处理
        System.out.println("增强方法之后执行..." + object);

        return result;
    }
}
