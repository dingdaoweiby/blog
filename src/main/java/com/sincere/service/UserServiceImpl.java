package com.sincere.service;

import com.sincere.dao.UserDao;
import com.sincere.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User checkUser(String username, String password) {
        User user = userDao.findByUsernameAndPassword(username, password);
        System.out.println("User in userServiceImple is " + user.toString());
        return user;
    }
}
