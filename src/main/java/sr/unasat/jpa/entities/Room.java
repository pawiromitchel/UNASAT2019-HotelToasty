package sr.unasat.jpa.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "rooms")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_id")
    private int roomID;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "beschrijving")
    private String beschrijving;

    @ManyToOne
    @JoinColumn(name = "room_type")
    private RoomType roomType;

    @ManyToMany(mappedBy = "rooms")
    private Set<Branch> branches = new HashSet<Branch>();

    @ManyToMany(mappedBy = "roomExtras")
    private Set<Extra> extras = new HashSet<Extra>();

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBeschrijving() {
        return beschrijving;
    }

    public void setBeschrijving(String beschrijving) {
        this.beschrijving = beschrijving;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public Set<Branch> getBranches() {
        return branches;
    }

    public void setBranches(Set<Branch> branches) {
        this.branches = branches;
    }

    public Set<Extra> getExtras() {
        return extras;
    }

    public void setExtras(Set<Extra> extras) {
        this.extras = extras;
    }

    @Override
    public String toString() {
        return "\nNaam: " + name + "\nCode: " + roomID;
    }
}
