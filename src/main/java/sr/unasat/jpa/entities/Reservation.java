package sr.unasat.jpa.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "reservations")
public class Reservation {
    @Id
    @Column(name = "reservation_id")
    private int reservationID;

    @Column(name = "customer_id")
    private int customerID;

    @Column(name = "date_from")
    private String dateFrom;

    @Column(name = "date_to")
    private String dateTo;

    @Column(name = "total_price")
    private double totalPrice;

    @Column(name = "room_id")
    private int roomID;

    public Reservation(int reservationID, int customerID, String dateFrom, String dateTo, double totalPrice, int roomID) {
        this.reservationID = reservationID;
        this.customerID = customerID;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.totalPrice = totalPrice;
        this.roomID = roomID;
    }

    public int getReservationID() {
        return reservationID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public String getDateFrom() {
        return dateFrom;
    }

    public String getDateTo() {
        return dateTo;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public int getRoomID() {
        return roomID;
    }
}
