package annotation.service;

import annotation.dao.UserDao2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 使用注解,value属性可省略,值首字母小写
 * //@Component(value = "userService2")
 */
//@Component(value = "userService2")
@Service
public class UserService2 {
    // 注入dao属性,不需要设置set方法
    // 根据类型进行属性注入
    // required = false，如果容器中不存在该类型的组件，则返回 null,默认如果不设置，程序会出错
//    @Autowired (required = false)
    @Autowired
//    @Qualifier("userDao2")
//    @Resource(name = "userDao2")  // 根据名称进行注入
//    private UserDao2 userDao2;
    private UserDao2 uDao2;

    //
    public void update(){
        System.out.println("UserService2 update.....");
//        userDao2.update();
        uDao2.update();
    }

    @Override
    public String toString() {
        return "UserService2{" +
                "uDao2=" + uDao2 +
                '}';
    }
}
