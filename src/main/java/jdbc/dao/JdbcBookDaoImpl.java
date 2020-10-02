package jdbc.dao;

import jdbc.entity.JdbcBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository(value = "jdbcBookDao")
public class JdbcBookDaoImpl implements JdbcBookDao {
    @Autowired // 注入JdbcTemplate
    private JdbcTemplate jdbcTemplate;


    public void add(JdbcBook book) {
        String sql = "insert into t_book values(?,?,?)";
        Object[] args = {book.getBookId(),book.getBookName(),book.getStatus()};
        int result = jdbcTemplate.update(sql,args);
        System.out.println("result = " + result);
    }
}
