package sr.unasat.jpa.dao;

import sr.unasat.jpa.entities.Branch;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class BranchDAO {
    private EntityManager entityManager;

    public BranchDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Branch> selectAll() {
        entityManager.getTransaction().begin();
        String jpql = "select e from Branch e";
        TypedQuery<Branch> query = entityManager.createQuery(jpql, Branch.class);
        List<Branch> listRecords = query.getResultList();
        entityManager.getTransaction().commit();
        return listRecords;
    }
}
