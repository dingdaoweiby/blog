package com.sincere.dao;

import com.sincere.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Transactional
public class CategoryDaoImpl implements CategoryDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Category> getCategoryList() {
        String sql = String.format("select * from categories");
        //RowMapper rowMapper = new RowMapper();
        List list = new ArrayList();
        try {
            list = jdbcTemplate.queryForList(sql);
        } catch (DataAccessException e) {
            System.out.println("nothing to get");
            e.printStackTrace();
        }
        return list;
    }
}
