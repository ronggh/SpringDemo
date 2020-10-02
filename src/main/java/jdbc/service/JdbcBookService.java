package jdbc.service;

import jdbc.dao.JdbcBookDao;
import jdbc.entity.JdbcBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JdbcBookService {

    @Autowired  // 注入dao
    private JdbcBookDao jdbcBookDao;

    public void add(JdbcBook book){
        jdbcBookDao.add(book);
    }
}
