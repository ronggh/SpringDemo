package annotation.dao;

import org.springframework.stereotype.Repository;

/**
 * 可以在 value 指定不按约定的名字，如 userDao22等，默认为同类名的（首字母小写）
 */
@Repository(value = "userDao2")
public class UserDao2 {
    // 默认给个值1
    private String label = "1";
    public void update(){
        System.out.println("UserDao2 update....");
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "UserDao2{" +
                "label='" + label + '\'' +
                '}';
    }
}
