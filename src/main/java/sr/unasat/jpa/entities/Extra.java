package sr.unasat.jpa.entities;

import javax.persistence.*;

@Entity
@Table(name = "extras")
public class Extra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "extra_id")
    private int extraID;

    @Column(name = "name")
    private String name;

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
