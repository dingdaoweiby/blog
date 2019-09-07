package com.sincere.dao;

import com.sincere.mapper.UserMapper;
import com.sincere.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public User findByUsernameAndPassword(String username, String password) {
        String sql = String.format("select * from t_user where username = '%s' and password = '%s'", username, password);
        RowMapper mapper = new UserMapper();
        try {
            User user = (User) jdbcTemplate.queryForObject(sql, mapper);
            System.out.println("sql in daoImple is " + sql);
            return user;
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
