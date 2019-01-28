package sr.unasat.jpa.dao;

import sr.unasat.jpa.entities.Reservation;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

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

    public Reservation searchOne(int reservationId){
        entityManager.getTransaction().begin();
        String jpql = "select e from Reservation e where e.reservationID = :reservationID";
        TypedQuery<Reservation> query = entityManager.createQuery(jpql, Reservation.class);
        query.setParameter("reservationID", reservationId);
        Reservation reservation = query.getSingleResult();
        entityManager.getTransaction().commit();
        return reservation;
    }
}
