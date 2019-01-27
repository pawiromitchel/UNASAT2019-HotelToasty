package sr.unasat.jpa.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "branch")
public class Branch {

    @Id
    @Column(name = "branch_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int branchID;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToOne
    @JoinColumn(name = "adress_id")
    private Adres adres;

//    @OneToOne(mappedBy = "branch")
//    private User user;

    @ManyToMany
    @JoinTable(name = "branch_room", joinColumns = @JoinColumn(name = "branch_id"), inverseJoinColumns = @JoinColumn(name = "room_id"))
    private Set<Room> rooms = new HashSet<Room>();

    public int getBranchID() {
        return branchID;
    }

    public void setBranchID(int branchID) {
        this.branchID = branchID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public Set<Room> getRooms() {
        return rooms;
    }

    public void setRooms(Set<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
//        return "Branch{" +
//                "branchID=" + branchID +
//                ", name='" + name + '\'' +
//                ", adres=" + adres +
//                ", rooms=" + rooms +
//                '}';
        return name + "\n" + "rooms: " + rooms;
    }
}
