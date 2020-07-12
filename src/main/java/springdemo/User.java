package springdemo;

public class User {
    //
    private String userName;
    private int age;



    private String address;

    //


    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setAddress(String address) {
        this.address = address;
    }


//
    public User() {

    }

    public User(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }

    //
    public void  add(){
        System.out.println("add user...");
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                ", address = " + address +
                '}';
    }

    //
    public static void main(String[] args) {
        User user = new User();
        user.setUserName("John");
        user.setAge(20);
        System.out.println(user.getUserName()+":"+user.getAge());
    }




}
