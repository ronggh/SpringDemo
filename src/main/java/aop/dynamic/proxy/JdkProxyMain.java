package aop.dynamic.proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JdkProxyMain {
    //
    public static void main(String[] args) {
        // 创建接口实现类的代理对象
        Class[] interfaces = {PersonDao.class};
        PersonDao personDao = (PersonDao) Proxy.newProxyInstance(JdkProxyMain.class.getClassLoader(), interfaces,
                new PersonDaoProxy(new PersonDaoImpl()));
        int result = personDao.add(1,2);
        System.out.println("result = " + result);

        System.out.println(personDao.update("update 111"));
    }
}
