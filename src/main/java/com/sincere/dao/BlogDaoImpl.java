package com.sincere.dao;

import com.sincere.mapper.BlogMapper;
import com.sincere.model.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BlogDaoImpl implements BlogDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Blog> getBlogList() {
        String sql = String.format("select * from t_blog");
        List list = new ArrayList();
        try {
            list = jdbcTemplate.queryForList(sql);
        } catch (DataAccessException e) {
            System.out.println("nothing to get");
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Blog getBlogById(Long id) {
        String sql = String.format("select * from t_blog where id = '%d'", id);
        RowMapper mapper = new BlogMapper();
        try {
            Blog blog = (Blog) jdbcTemplate.queryForObject(sql,mapper);
            return blog;
        } catch (DataAccessException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Blog updateBlog(Long id, Blog blog) {
        return null;
    }

        @Override
    public Blog insertById(Long id) {
        String sql = String.format("insert into t_blog set id = '%d'", id);
        String sqlAfterUpdate = String.format("slect * from t_blog where id = '%d'", id);
        RowMapper mapper = new BlogMapper();
        try {
            jdbcTemplate.update(sql);
            Blog blog = (Blog) jdbcTemplate.queryForObject(sqlAfterUpdate, mapper);
            System.out.println("insert blog in t_blog impl is " + blog.toString());
            return blog;
        } catch (DataAccessException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void deleteById(Long id) {
        String sql = String.format("delete * from t_blog where id = '%d'", id);
        jdbcTemplate.update(sql);
    }
}
