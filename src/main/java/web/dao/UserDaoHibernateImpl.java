package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;


@Repository
public class UserDaoHibernateImpl implements UserDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void create(User user) {

    }

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("select u from User u", User.class).getResultList();
    }

    @Override
    public User updateUser(Long id) {
        TypedQuery<User> query =  entityManager.createQuery("select u from User u where u.id = :id", User.class);
        query.setParameter("id", id);
        query.getSingleResult();

        return query.getResultList().stream().findAny().orElse(null);

    }

    @Override
    public User deleteUser(Long id) {
        return null;
    }
}
