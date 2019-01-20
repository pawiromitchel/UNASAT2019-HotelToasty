package sr.unasat.jpa.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "room_types")
public class RoomType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roomTypeID;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "roomType")
    private Set<Room> rooms = new HashSet<Room>();

    public int getRoomTypeID() {
        return roomTypeID;
    }

    public void setRoomTypeID(int roomTypeID) {
        this.roomTypeID = roomTypeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "RoomType{" +
                "roomTypeID=" + roomTypeID +
                ", name='" + name + '\'' +
                '}';
    }
}
