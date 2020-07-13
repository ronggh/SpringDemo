package cn.annotate.service;

import cn.annotate.dao.UserDao2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

// 使用注解,value属性可省略,值首字母小写
//
//@Component(value = "userService2")
@Service
public class UserService2 {
    // 注入dao属性,不需要设置set方法
//    @Autowired // 根据类型进行属性注入
    @Resource(name = "userDao22")  // 根据名称进行注入
    private UserDao2 userDao2;


    //
    public void update(){
        System.out.println("service update.....");
        userDao2.update();
    }
}
