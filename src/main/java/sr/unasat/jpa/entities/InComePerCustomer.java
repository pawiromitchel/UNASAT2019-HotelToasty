package sr.unasat.jpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "income_per_customer")
public class InComePerCustomer {
    @Id
    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "total")
    private double total;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "InComePerCustomer{" +
                "customerId=" + customerId +
                ", total=" + total +
                '}';
    }
}
