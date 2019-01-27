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

        System.out.println("Uw registratie is opgeslagen");

        // Reservation reservation = new Reservation();

        //        Systeem controleert als de saldo hoger is dan het totaal bedrag
        // TODO: Er wordt op dit moment niet in de database bijgehouden wat de saldo is van de gebruiker

        //        Borg wordt afgetrokken van de saldo van de gebruiker (voorschot)

        //        Formulier wordt opgeslagen door het systeem

        


        //        Conformatie wordt gestuurd naar de gebruiker dat de reservering is geplaatst


        // TODO: https://refactoring.guru/design-patterns/builder

    }
}
