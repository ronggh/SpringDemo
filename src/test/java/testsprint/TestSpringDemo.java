package testsprint;

import beanperiod.Order;
import collectiontype.Book;
import collectiontype.Course;
import collectiontype.Student;
import factorybean.MyBean;
import org.junit.Test;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.UserService;
import springdemo.Emp;
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

    @Test
    public void testEmp(){
        // 1. 加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("dept_emp.xml");
        // 2. 获取Spring配置文件中创建的对象
        Emp emp = context.getBean("emp",Emp.class);
        emp.add();
    }

    @Test
    public void testStudent(){
        // 1. 加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("student.xml");
        // 2. 获取Spring配置文件中创建的对象
        Student student = context.getBean("student",Student.class);
        student.test();
    }
    @Test
    public void testBook(){
        // 1. 加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("book.xml");
        // 2. 获取Spring配置文件中创建的对象
        Book book = context.getBean("book",Book.class);
        book.test();
    }

    @Test
    // 单实例，多实例
    public void testBook2(){
        // 1. 加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("book.xml");
        // 2. 获取Spring配置文件中创建的对象
        Book book1 = context.getBean("book",Book.class);
        Book book2 = context.getBean("book",Book.class);
        System.out.println(book1);
        System.out.println(book2);
    }

    @Test
    public void testMyBean(){
        // 1. 加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("mybean.xml");
        // 2. 获取Spring配置文件中创建的对象
        Course mybean = context.getBean("mybean", Course.class);
        System.out.println(mybean);
    }

    @Test
    public void testOrder(){
        // 1. 加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("order.xml");
        // 2. 获取Spring配置文件中创建的对象
        Order order = context.getBean("order", Order.class);
        System.out.println(order);

        // 手动销毁Bean
        ((ClassPathXmlApplicationContext) context).close();
    }

}
