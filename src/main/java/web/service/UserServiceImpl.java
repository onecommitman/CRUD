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


    public boolean saveUser(String name, String lastName, byte age) {
        try {
            userDao.create(new User(name, lastName, age));
            System.out.println("User с именем – " + name + " добавлен в базу данных");
            return true;
        }catch(Exception ex) {
            return false;
        }

    }

    @Override
    public boolean removeUserById(Long id) {
        try {
            userDao.deleteUser(id);
            return true;
        }catch(Exception ex) {
            return false;
        }
    }

    public List<User> getAllUsers() {
        List users = new ArrayList();
        userDao.getAllUsers().forEach(e -> users.add(e));
        return users;
    }

    @Override
    public User getUserByID(Long id) {
        //User user = repository.findById(id).get();
        return null;
    }

    @Override
    public boolean updateUser(int id, User user) {
        //userDao.updateUser(id, user);
        return true;
    }

}