package testsprint;

import aop.aspectj.annotate.AopConfig;
import aop.aspectj.annotate.Person;
import aop.aspectj.xml.AopBook;
import cn.annotate.config.SpringConfig;
import cn.annotate.service.UserService2;
import beanperiod.Order;
import collectiontype.Book;
import collectiontype.Course;
import collectiontype.Student;
import org.junit.Test;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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

    @Test
    public void testAutowire(){
        // 1. 加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("autowire.xml");
        // 2. 获取Spring配置文件中创建的对象
        autowire.Emp emp = context.getBean("emp", autowire.Emp.class);
        System.out.println(emp);
        emp.test();
    }

    @Test
    public void testAnnotate(){
        // 1. 加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("annotate.xml");
        // 2. 获取Spring配置文件中创建的对象
        UserService2 userService2= context.getBean("userService2", UserService2.class);
        System.out.println(userService2);
        userService2.update();
    }

    @Test
    public void testAnnotate2(){
        // 1. 加载Spring配置类
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        // 2. 获取Spring配置文件中创建的对象
        UserService2 userService2= context.getBean("userService2", UserService2.class);
        System.out.println(userService2);
        userService2.update();

    }
    @Test
    public void testAopAnnotateXml(){
        // 1. 加载Spring配置类
        ApplicationContext context = new ClassPathXmlApplicationContext("aop_annotate.xml");
        // 2. 获取Spring配置文件中创建的对象
        Person person= context.getBean("person", Person.class);
        person.add();

    }
    @Test
    public void testAopAnnotate(){
        // 1. 加载Spring配置类
        ApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        // 2. 获取Spring配置文件中创建的对象
        Person person= context.getBean("person", Person.class);
        person.add();

    }

    @Test
    public void testAopXml(){
        // 1. 加载Spring配置类
        ApplicationContext context = new ClassPathXmlApplicationContext("aop_xml.xml");
        // 2. 获取Spring配置文件中创建的对象
        AopBook book= context.getBean("book", AopBook.class);
        book.buy();

    }

}
