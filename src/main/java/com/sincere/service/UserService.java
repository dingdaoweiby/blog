package com.sincere.service;

import com.sincere.model.User;

public interface UserService {

    User checkUser(String username, String password);

}
