package basic;

public class User2 {
    private String userName;
    private Integer age;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    // 一个用于测试的方法
    public void testProperty(){
        System.out.println("Usre2 ===> userName = " + userName +" age = " + age);
    }
}
