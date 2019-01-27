package sr.unasat.jpa.dao;

import sr.unasat.jpa.entities.Room;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class RoomDAO {
    private EntityManager entityManager;

    public RoomDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Room> selectAll() {
        entityManager.getTransaction().begin();
        String jpql = "select e from Room e";
        TypedQuery<Room> query = entityManager.createQuery(jpql, Room.class);
        List<Room> listRecords = query.getResultList();
        entityManager.getTransaction().commit();
        return listRecords;
    }
}
