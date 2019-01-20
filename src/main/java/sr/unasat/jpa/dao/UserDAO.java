package sr.unasat.jpa.dao;

import sr.unasat.jpa.entities.User;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class UserDAO {
    private EntityManager entityManager;

    public UserDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<User> selectAllUsers() {
        entityManager.getTransaction().begin();
        String jpql = "select e from User e";
        TypedQuery<User> query = entityManager.createQuery(jpql, User.class);
        List<User> listRecords = query.getResultList();
        entityManager.getTransaction().commit();
        return listRecords;
    }
}
