package aop.dynamic.proxy;

public class PersonDaoImpl implements PersonDao {
    public int add(int a, int b) {
        System.out.println("add方法执行了....");
        return a + b;
    }

    public String update(String id) {
        System.out.println("update方法执行了....");
        return id;
    }
}
