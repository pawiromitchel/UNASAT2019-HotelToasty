package sr.unasat.jpa.builders;

public interface Builder {
    void setReservationId(int reservationId);
    void setCustomerId(int customerId);
    void setDateFrom(String dateFrom);
    void setDateTo(String dateTo);
    void setTotalPrice(double totalPrice);
    void setRoomId(int roomId);
}
