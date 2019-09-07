package com.sincere.service;

import com.sincere.model.Blog;
import com.sincere.model.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BlogService {

    Blog getBlogById(Long id);

    Page<Blog> listBlog(Pageable pageable);

    Blog addBlog(Blog blog);

    Blog updateBlog(Long id, Blog blog);

    void deleteBlog(Long id);

}
