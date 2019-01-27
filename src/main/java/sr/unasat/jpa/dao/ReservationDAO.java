package sr.unasat.jpa.dao;

import sr.unasat.jpa.entities.Reservation;

import javax.persistence.EntityManager;

public class ReservationDAO {
    private EntityManager entityManager;

    public ReservationDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void insert(Reservation reservation) {
        entityManager.getTransaction().begin();
        entityManager.persist(reservation);
        entityManager.getTransaction().commit();
    }
}
