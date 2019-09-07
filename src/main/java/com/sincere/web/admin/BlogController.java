package com.sincere.web.admin;

import com.sincere.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class BlogController {

    @Autowired
    private BlogService blogService;

    public String blogsPage(@PageableDefault(size = 5, sort = {"id"}, direction = Sort.Direction.DESC)Pageable pageable, Model model) {
        model.addAttribute("page", blogService.listBlog(pageable));
        return "admin/blogs";
    }

}
