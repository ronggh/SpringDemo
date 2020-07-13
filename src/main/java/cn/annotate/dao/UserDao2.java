package cn.annotate.dao;

import org.springframework.stereotype.Repository;

@Repository(value = "userDao22")
//@Repository
public class UserDao2 {
    public void update(){
        System.out.println("dao update....");
    }
}
