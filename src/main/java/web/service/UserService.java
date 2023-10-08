package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    boolean saveUser(String name, String lastName, byte age);

    boolean removeUserById(Long id);

    List<User> getAllUsers();

    User getUserByID(Long id);

    boolean updateUser(int id, User user);

}