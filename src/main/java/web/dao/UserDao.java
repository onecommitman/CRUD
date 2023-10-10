package web.dao;

import org.springframework.data.repository.CrudRepository;
import web.model.User;

import java.util.List;

public interface UserDao{

    void create(User user);
    List<User> getAllUsers();

    //User getUserById(Long id);

    User updateUser(Long id);

    User deleteUser(Long id);





}