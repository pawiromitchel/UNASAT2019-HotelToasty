package sr.unasat.jpa.dao;

import sr.unasat.jpa.entities.CountReservationPerRoom;
import sr.unasat.jpa.entities.InComePerCustomer;
import sr.unasat.jpa.entities.TotalIncome;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class ReportDAO {
    private EntityManager entityManager;

    public ReportDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<TotalIncome> generateReportTotalIncome() {
        entityManager.getTransaction().begin();
        String jpql = "select e from TotalIncome e";
        TypedQuery<TotalIncome> query = entityManager.createQuery(jpql, TotalIncome.class);
        List<TotalIncome> listRecords = query.getResultList();
        entityManager.getTransaction().commit();
        return listRecords;
    }

    public List<InComePerCustomer> generateReportIncomePerCustomer() {
        entityManager.getTransaction().begin();
        String jpql = "select e from InComePerCustomer e";
        TypedQuery<InComePerCustomer> query = entityManager.createQuery(jpql, InComePerCustomer.class);
        List<InComePerCustomer> listRecords = query.getResultList();
        entityManager.getTransaction().commit();
        return listRecords;
    }

    public List<CountReservationPerRoom> generateReportCountReservationPerRoom() {
        entityManager.getTransaction().begin();
        String jpql = "select e from CountReservationPerRoom e";
        TypedQuery<CountReservationPerRoom> query = entityManager.createQuery(jpql, CountReservationPerRoom.class);
        List<CountReservationPerRoom> listRecords = query.getResultList();
        entityManager.getTransaction().commit();
        return listRecords;
    }

}
