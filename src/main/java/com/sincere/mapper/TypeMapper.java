package com.sincere.mapper;

import com.sincere.model.Type;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TypeMapper implements RowMapper {
    @Override
    public Type mapRow(ResultSet resultSet, int i) throws SQLException {
        Type type = new Type();
        type.setId(resultSet.getLong("id"));
        type.setName(resultSet.getString("name"));
        return type;
    }
}
