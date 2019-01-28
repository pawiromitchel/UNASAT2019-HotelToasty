package sr.unasat.jpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "count_reservation_per_room")
public class CountReservationPerRoom {
    @Id
    @Column(name = "room_id")
    private int roomId;

    @Column(name = "name")
    private String name;

    @Column(name = "total_reservations")
    private double totalReservations;

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotalReservations() {
        return totalReservations;
    }

    public void setTotalReservations(double totalReservations) {
        this.totalReservations = totalReservations;
    }

    @Override
    public String toString() {
        return "CountReservationPerRoom{" +
                "roomId=" + roomId +
                ", name='" + name + '\'' +
                ", totalReservations=" + totalReservations +
                '}';
    }
}
