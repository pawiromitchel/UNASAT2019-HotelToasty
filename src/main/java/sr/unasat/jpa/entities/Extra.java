package sr.unasat.jpa.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "extras")
public class Extra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "extra_id")
    private int extraID;

    @Column(name = "name")
    private String name;

    @ManyToMany
    @JoinTable(name = "rooms_extras", joinColumns = @JoinColumn(name = "room_id"), inverseJoinColumns = @JoinColumn(name = "extra_id"))
    private Set<Room> roomExtras = new HashSet<Room>();

    public int getExtraID() {
        return extraID;
    }

    public void setExtraID(int extraID) {
        this.extraID = extraID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
