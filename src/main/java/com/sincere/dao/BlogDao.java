package com.sincere.dao;

import com.sincere.model.Blog;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface BlogDao {

    List<Blog> getBlogList();

    Blog getBlogById(Long id);

    Blog updateBlog(Long id, Blog blog);

    Blog insertById(Long id);

    void deleteById(Long id);
}
