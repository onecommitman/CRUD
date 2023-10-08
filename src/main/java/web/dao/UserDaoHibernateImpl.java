package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import java.util.ArrayList;
import java.util.List;

//@Repository
public class UserDaoHibernateImpl implements UserDao{



    /*List<User> users;
    private static int USERS_COUNT;


    {
        users = new ArrayList<>();
        User user1 = new User("Austin", "Powers", (byte)33);
        user1.setId(++USERS_COUNT);
        users.add(user1);

        User user2 = new User("Harry", "Potter", (byte)28);
        user2.setId(++USERS_COUNT);
        users.add(user2);

        User user3 = new User("Salam", "Aleykum", (byte)30);
        user3.setId(++USERS_COUNT);
        users.add(user3);

        User user4 = new User("Bonjorno", "Zhies", (byte)63);
        user4.setId(++USERS_COUNT);
        users.add(user4);

    }

    @Override
    public void createUsersTable() {
        users = new ArrayList<>();
    }

    @Override
    public void dropUsersTable() {
        users = null;
    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
        User user = new User();
        user.setName(name);
        user.setLastName(lastName);
        user.setAge(age);
        user.setId(++USERS_COUNT);
        users.add(user);
    }

    @Override
    public void removeUserById(int id) {
        System.out.println("====================================");
        System.out.println("Удаляемый ID = " + id);
        System.out.println(users.get(id-1));
        System.out.println("====================================");
        users.removeIf(user -> user.getId() == (id));
    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public User getUserByID(int id) {
        return users.get(id-1);
    }

    @Override
    public void updateUser(int id, User user) {
        users.set(id-1, user);
    }
*/

}
