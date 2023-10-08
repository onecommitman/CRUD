package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserRepository;
import web.model.User;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository repository;

    public UserServiceImpl() {

    }

    @Autowired
    public UserServiceImpl(UserRepository repository) {
        super();
        this.repository = repository;
    }

    /*@Autowired
    private UserDao userDao;*/


    public boolean saveUser(String name, String lastName, byte age) {
        try {
            repository.save(new User(name, lastName, age));
            System.out.println("User с именем – " + name + " добавлен в базу данных");
            return true;
        }catch(Exception ex) {
            return false;
        }

    }

    @Override
    public boolean removeUserById(Long id) {
        try {
            repository.deleteById(id);
            return true;
        }catch(Exception ex) {
            return false;
        }
    }

    public List<User> getAllUsers() {
        List users = new ArrayList();
        repository.findAll().forEach(e -> users.add(e));
        return users;
    }

    @Override
    public User getUserByID(Long id) {
        User user = repository.findById(id).get();
        return user;
    }

    @Override
    public boolean updateUser(int id, User user) {
        //userDao.updateUser(id, user);
        return true;
    }

}