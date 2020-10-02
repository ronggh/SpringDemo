package basic;

public class User3 {
    private String userName;
    private Integer age;

    // 有参数的构造函数
    public User3(String userName, Integer age) {
        this.userName = userName;
        this.age = age;
    }

    // 测试方法
    public void test() {
        System.out.println("User3 ===> userName = " + userName + " age = " + age);
    }
}
