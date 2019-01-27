package sr.unasat.jpa.entities;

import javax.persistence.*;

@Entity
@Table(name = "adresses")
public class Adres {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "adress_id")
    private int addressID;

    @Column(name = "name")
    private String name;

    @OneToOne(mappedBy = "adres")
    private Branch branch;

    public int getAddressID() {
        return addressID;
    }

    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return name;
    }
}
