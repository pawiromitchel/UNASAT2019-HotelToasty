package sr.unasat.jpa.dao;

import sr.unasat.jpa.entities.Customer;

import javax.persistence.EntityManager;

public class CustomerDAO {
    private EntityManager entityManager;

    public CustomerDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void insert(Customer customer) {
        entityManager.getTransaction().begin();
        entityManager.persist(customer);
        entityManager.getTransaction().commit();
    }
}
