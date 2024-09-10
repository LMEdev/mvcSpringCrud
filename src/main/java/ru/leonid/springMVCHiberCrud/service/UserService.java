package ru.leonid.springMVCHiberCrud.service;

import ru.leonid.springMVCHiberCrud.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);
}
