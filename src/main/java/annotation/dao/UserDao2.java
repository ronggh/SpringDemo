package annotation.dao;

import org.springframework.stereotype.Repository;

// 可以在 value 指定不按约定的名字，如 userDao22等，默认为同类名的（首字母小写）
@Repository(value = "userDao2")
public class UserDao2 {
    public void update(){
        System.out.println("UserDao2 update....");
    }
}
