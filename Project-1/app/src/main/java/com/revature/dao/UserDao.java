package com.revature.dao;

import com.revature.models.User;

public interface UserDao {

    public void createUser(User user);

    public User readUserByEmail(String email);

    public User getUserById(int id);


}
