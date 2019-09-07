package com.sincere.dao;

import com.sincere.model.User;

public interface UserDao {
    User findByUsernameAndPassword(String username, String password);

}
