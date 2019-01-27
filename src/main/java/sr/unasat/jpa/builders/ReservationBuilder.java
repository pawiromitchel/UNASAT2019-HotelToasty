package sr.unasat.jpa.builders;

import sr.unasat.jpa.entities.Reservation;

public class ReservationBuilder implements Builder {
    private int reservationId;
    private int customerId;
    private String dateFrom;
    private String dateTo;
    private double totalPrice;
    private int roomId;

    @Override
    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    @Override
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Override
    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }

    @Override
    public void setDateTo(String dateTo) {
        this.dateTo = dateTo;
    }

    @Override
    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    @Override
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Reservation getResult(){
        return new Reservation(reservationId, customerId, dateFrom, dateTo, totalPrice, roomId);
    }
}
