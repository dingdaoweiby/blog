package com.sincere.dao;

import com.sincere.mapper.TypeMapper;
import com.sincere.model.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class TypeDaoImpl implements TypeDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Type getTypeById(Long id) {
        String sql = String.format("select * from t_type where id = '%s'", id);
        RowMapper rowMapper = new TypeMapper();
        try {
            Type type = (Type) jdbcTemplate.queryForObject(sql,rowMapper);
            return type;
        } catch (DataAccessException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Type updateTypeByNameAndId(String name, String id) {
        String sql = String.format("update t_type set name = '%s' where id = '%s'", name, id);
        String sqlAfterUpdate = String.format("select * from t_type where id = '%s'", id);
        RowMapper rowMapper = new TypeMapper();
        try {
            jdbcTemplate.update(sql);
            Type type = (Type) jdbcTemplate.queryForObject(sqlAfterUpdate, rowMapper);
            System.out.println("update type in dao impl is : " + type.toString());
            return type;
        } catch (DataAccessException e) {
            System.out.println(sql + " is not updated");
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Type insertTypeByName(String name) {
        String sql = String.format("insert into t_type set name = '%s'", name);
        String sqlAfterUpdate = String.format("select * from t_type where name = '%s'", name);
        RowMapper rowMapper = new TypeMapper();
        try {
            jdbcTemplate.update(sql);
            Type type = (Type) jdbcTemplate.queryForObject(sqlAfterUpdate, rowMapper);
            System.out.println("insert type in dao impl is : " + type.toString());
            return type;
        } catch (DataAccessException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void deleteTypeById(Long id) {
        String sql = String.format("delect * from t_type where id = '%s'", id);
        jdbcTemplate.update(sql);
    }
}
