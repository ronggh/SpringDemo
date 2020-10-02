package testspring;

import aop.aspectj.annotate.AopConfig;
import aop.aspectj.annotate.Person;
import aop.aspectj.xml.AopBook;
import basic.User1;
import basic.User2;
import basic.User3;
import cn.annotate.config.SpringConfig;
import cn.annotate.service.UserService2;
import beanperiod.Order;
import collectiontype.Book;
import collectiontype.Course;
import collectiontype.Student;
import jdbc.entity.JdbcBook;
import jdbc.service.JdbcBookService;
import org.junit.Test;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.UserService;
import basic.Emp;


public class TestSpringDemo {
    /**
     * 1. 测试Bean的创建
     */
    @Test
    public void testUser1Add(){
        // 1. 加载Spring配置文件
        // ApplicationContext 换成 BeanFactory 也行
        // BeanFactory:是IOC容器基本实现，是Spring内部的使用接口，不提供开发人员进行使用
        //              加载配置文件时候不会创建对象，在获取对象（使用）才去创建对象（即懒加载）
        // ApplicationContext: 是BeanFactory接口的子接口，提供更多更强大的功能，一般由开发人员进行使用
        // 加载配置文件时候就会把在配置文件对象进行创建

        ApplicationContext context = new ClassPathXmlApplicationContext(
                "user1.xml");
        // 2. 获取Spring配置文件中创建的对象
        //
        User1 user = context.getBean("user1",User1.class);
        System.out.println(user.toString());
        user.add();
    }

    /**
     *  2. 测试通过 property 注入属性值
     */
    @Test
    public void testUser2Property(){
        // 1. 加载Spring配置文件
       ApplicationContext context = new ClassPathXmlApplicationContext(
                "user2.xml");
        // 2. 获取Spring配置文件中创建的对象
        //
        User2 user = context.getBean("user2", User2.class);
        System.out.println(user.toString());
        user.testProperty();
    }

    /**
     *  3. 测试通过 有参构造函数 注入属性值
     */
    @Test
    public void testUser3Constructor(){
        // 1. 加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "user3.xml");
        // 2. 获取Spring配置文件中创建的对象
        //r
        User3 user = context.getBean("user3", User3.class);
        System.out.println(user.toString());
        user.test();
    }

    /**
     *  4. 测试通过 p名称空间注入属性值
     */
    @Test
    public void testUser2pNameSpace(){
        // 1. 加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "user4.xml");
        // 2. 获取Spring配置文件中创建的对象
        //
        User2 user = context.getBean("user4", User2.class);
        System.out.println(user.toString());
        user.testProperty();
    }

    /**
     *  5. 测试注入属性值为 null
     */
    @Test
    public void testUser2Null(){
        // 1. 加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "user5.xml");
        // 2. 获取Spring配置文件中创建的对象
        //
        User2 user = context.getBean("user5", User2.class);
        System.out.println(user.toString());
        user.testProperty();
    }

    /**
     *  6. 测试 属性值中含有特殊字符
     */
    @Test
    public void testUser2SpecString(){
        // 1. 加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "user6.xml");
        // 2. 获取Spring配置文件中创建的对象
        //
        User2 user = context.getBean("user6", User2.class);
        System.out.println(user.toString());
        user.testProperty();
    }

    @Test
    public void testService(){
        // 1. 加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("user200.xml");
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

    @Test
    public void testJdbcAdd(){
        // 1. 加载Spring配置类
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbc_template.xml");
        // 2. 获取Spring配置文件中创建的对象
        JdbcBookService bookService = context.getBean("jdbcBookService", JdbcBookService.class);

       bookService.add(new JdbcBook("1","Java 编程思想","1"));

    }

}