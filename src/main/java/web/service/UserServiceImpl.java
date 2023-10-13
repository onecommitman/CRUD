package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.User;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    public UserServiceImpl() {

    }

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        super();
        this.userDao = userDao;
    }

    private UserDao userDao;


    public void saveUser(User user) {
        userDao.create(user);
    }

    @Override
    public void deleteUserById(Long id) {
        userDao.deleteUser(id);
    }

    public List<User> getAllUsers() {
        List users = new ArrayList();
        userDao.getAllUsers().forEach(e -> users.add(e));
        return users;
    }

    @Override
    public User getUserByID(Long id) {
        User user = userDao.getUserById(id);
        return user;
    }

    @Override
    public void updateUser(Long id, User user) {
        userDao.updateUser(id, user);
    }

}