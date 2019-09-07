package com.sincere.mapper;

import com.sincere.model.Category;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoryMapper implements RowMapper {
    @Override
    public Category mapRow(ResultSet resultSet, int i) throws SQLException {
        Category category = new Category();
        category.setId(resultSet.getInt("id"));
        category.setName(resultSet.getString("name"));
        category.setText(resultSet.getString("text"));
        category.setDateTime(resultSet.getDate("datetime"));
        category.setTimeStamp(resultSet.getTimestamp("timestamp"));
        return category;
    }
}
