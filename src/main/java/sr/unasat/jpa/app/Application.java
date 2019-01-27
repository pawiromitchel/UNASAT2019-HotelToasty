package sr.unasat.jpa.app;

import sr.unasat.jpa.builders.Builder;
import sr.unasat.jpa.builders.ReservationBuilder;
import sr.unasat.jpa.config.JPAConfiguration;
import sr.unasat.jpa.dao.BranchDAO;
import sr.unasat.jpa.dao.CustomerDAO;
import sr.unasat.jpa.dao.ReservationDAO;
import sr.unasat.jpa.dao.RoomDAO;
import sr.unasat.jpa.entities.Branch;
import sr.unasat.jpa.entities.Reservation;
import sr.unasat.jpa.entities.Room;
import sr.unasat.jpa.payments.MasterCard;
import sr.unasat.jpa.payments.PayPal;
import sr.unasat.jpa.payments.Payment;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        // Setup
        RoomDAO roomDAO = new RoomDAO(JPAConfiguration.getEntityManager());

        ReservationDAO reservationDAO = new ReservationDAO(JPAConfiguration.getEntityManager());

        // show all rooms
        List<Room> roomList = roomDAO.selectAll();
        roomList.forEach(System.out::println);

        System.out.println("Selecteer AUB een kamer");
        Scanner sc = new Scanner(System.in);
        int room = sc.nextInt();
        System.out.println("Je hebt Code: " + room + " geselecteerd");

        System.out.println("Plaats uw begindatum van verblijf (dd-mm-yyyy)");
        Scanner begindatumRead = new Scanner(System.in);
        String begindatum = begindatumRead.nextLine();

        System.out.println("Plaats uw eindatum van verblijf (dd-mm-yyyy)");
        Scanner einddatumRead = new Scanner(System.in);
        String einddatum = einddatumRead.nextLine();

        System.out.println("Jouw verblijf is " + begindatum + " t/m " + einddatum);

        System.out.println("Wat is uw klantCode?");
        Scanner customerCodeRead = new Scanner(System.in);
        int customerCode = customerCodeRead.nextInt();

        // Builder Pattern for building the registration
        ReservationBuilder reservationBuilder = new ReservationBuilder();
        Random rand = new Random();
        reservationBuilder.setReservationId(rand.nextInt(100000));
        reservationBuilder.setCustomerId(customerCode);
        reservationBuilder.setDateFrom(begindatum);
        reservationBuilder.setDateTo(einddatum);
        reservationBuilder.setTotalPrice(100);
        reservationBuilder.setRoomId(room);

        Reservation reservation1 = reservationBuilder.getResult();
        reservationDAO.insert(reservation1);

        // Template pattern for Payment
        Payment payment = null;
        System.out.println("\nChoose your Payment method.\n" +
                "1 - PayPal\n" +
                "2 - MasterCard");
        Scanner chooseRead = new Scanner(System.in);
        int choice = chooseRead.nextInt();

        if(choice == 1){
            payment = new PayPal();
        } else if(choice == 2){
            payment = new MasterCard();
        }

        payment.pay();

        System.out.println("Uw registratie is opgeslagen");

    }
}
