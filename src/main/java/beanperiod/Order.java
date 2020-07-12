package beanperiod;

public class Order {
    private String orderName;

    public void setOrderName(String orderName) {
        this.orderName = orderName;
        System.out.println("调用set方法设置属性值....");
    }

    public Order() {
        System.out.println("执行了无参的构造函数.....");
    }

    // 定义一个初始化的方法
    public void initMethod(){
        System.out.println("执行初始化的方法....");
    }

    // 定义一个销毁的方法
    public void destroyMethod(){
        System.out.println("执行销毁的方法....");
    }
}
