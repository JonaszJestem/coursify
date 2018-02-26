package com.jonaszwiacek.Services;

import com.jonaszwiacek.Model.User;
import java.util.List;

public interface IUserService {

    public User getUser(int id);

    public void addUser(User user);

    public List<User> getAllUsers();

    public void updateUser(int id, User user);

    public void deleteUser(int id);

    User getUserByUsername(String username);
}
