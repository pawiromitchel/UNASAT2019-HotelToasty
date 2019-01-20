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
    @JoinColumn(name = "address_id")
    private Adres adres;

    @OneToOne(mappedBy = "branch")
    private User user;

    @OneToMany(mappedBy = "branch")
    private Set<Reservation> reservations = new HashSet<Reservation>();

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
}
