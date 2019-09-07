package com.sincere.mapper;

import com.sincere.model.Blog;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BlogMapper implements RowMapper {
    @Override
    public Blog mapRow(ResultSet resultSet, int i) throws SQLException {
        Blog blog = new Blog();
        blog.setId(resultSet.getLong("id"));
        blog.setTitle(resultSet.getString("title"));
        blog.setContent(resultSet.getString("content"));
        blog.setViews(resultSet.getInt("views"));
        blog.setAppreciation(resultSet.getBoolean("appreciation"));
        blog.setCommentabled(resultSet.getBoolean("commentabled"));
        blog.setPublished(resultSet.getBoolean("published"));
        blog.setRecommend(resultSet.getBoolean("recommend"));
        blog.setCreateDate(resultSet.getDate("createDate"));
        blog.setUpdateDate(resultSet.getDate("updateDate"));
        return blog;
    }
}
