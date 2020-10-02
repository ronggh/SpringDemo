package basic;

public class User1 {
    // 加一个属性和有参构造方式，默认不会再生成无参构造方法
    // 来验证Spring创建对象时默认调用的是无参的构造方法
//    private String userName;
//
//    public User1(String userName) {
//        this.userName = userName;
//    }

    public void add(){
        System.out.println("User1 add()..........");
    }
}
