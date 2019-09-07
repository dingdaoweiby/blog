package com.sincere.service;

import com.sincere.dao.BlogDao;
import com.sincere.model.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogDao blogDao;

    @Override
    public Blog getBlogById(Long id) {
        return blogDao.getBlogById(id);
    }

    @Override
    public Page<Blog> listBlog(Pageable pageable) {
        return (Page<Blog>) blogDao.getBlogList();
    }

    @Override
    public Blog addBlog(Blog blog) {
        return null;
    }

    @Override
    public Blog updateBlog(Long id, Blog blog) {
        return blogDao.updateBlog(id, blog);
    }

    @Override
    public void deleteBlog(Long id) {
        blogDao.deleteById(id);
    }
}
