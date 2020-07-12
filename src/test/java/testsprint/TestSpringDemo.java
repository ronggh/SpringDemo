package testsprint;

import org.junit.Test;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.UserService;
import springdemo.User;


public class TestSpringDemo {
    @Test
    public void testAdd(){
        // 1. 加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("user.xml");
        // 2. 获取Spring配置文件中创建的对象
        User user = context.getBean("user",User.class);
        System.out.println(user.toString());
        user.add();


        User user1 = context.getBean("user1",User.class);
        System.out.println(user1.toString());
    }

    @Test
    public void testService(){
        // 1. 加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("user2.xml");
        // 2. 获取Spring配置文件中创建的对象
        UserService userService = context.getBean("userService",UserService.class);
        userService.add();
    }

}
