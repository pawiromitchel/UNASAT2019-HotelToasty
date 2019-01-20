package sr.unasat.jpa.entities;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;

    // Role
    @OneToOne
    @JoinColumn(name="role_id")
    private Role role;

    @OneToOne
    @JoinColumn(name = "branch_id")
    private Branch branch;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String last_name;

    @Column(name = "id_number", nullable = false)
    private String idNumber;

    @Column(name = "mobile", nullable = false)
    private String mobile;

    @Column(name = "email", nullable = false)
    private String email;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", role=" + role +
                ", firstName='" + firstName + '\'' +
                ", last_name='" + last_name + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email +
                '}';
    }
}
