package sr.unasat.jpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "total_income")
public class TotalIncome {
    @Id
    @Column(name = "reservation_id")
    private int reservationId;

    @Column(name = "total_income")
    private double totalIncome;

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public double getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(double totalIncome) {
        this.totalIncome = totalIncome;
    }

    @Override
    public String toString() {
        return "TotalIncome{" +
                "reservationId=" + reservationId +
                ", totalIncome=" + totalIncome +
                '}';
    }
}
