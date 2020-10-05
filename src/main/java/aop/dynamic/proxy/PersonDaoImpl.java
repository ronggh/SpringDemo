package aop.dynamic.proxy;

public class PersonDaoImpl implements PersonDao {
    @Override
    public int add(int a, int b) {
        System.out.println("add方法执行了....");
        return a + b;
    }

    @Override
    public String update(String id) {
        System.out.println("update方法执行了....");
        return id;
    }
}
