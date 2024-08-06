import java.util.Scanner;
public class OnlineReservationSystem {
    private static boolean[] seats = new boolean[10];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nPLEASE CHOOSE A OPTION:");
            System.out.println("1. VIEW SEAT MAP");
            System.out.println("2. RESERVE SEAT");
            System.out.println("3. CANCEL THE RESERVATION");
            System.out.println("4. EXIT");
            int option = scanner.nextInt();

            switch (option) {

                case 1:
                    viewSeatMap();
                    break;

                case 2:
                    reserveSeat();
                    break;

                case 3:
                    cancelReservation();
                    break;

                case 4:
                    System.exit(0); 

                default:
                    System.out.println("INVALID OPTION");
            }
        }
    }

    private static void viewSeatMap() {
        System.out.println("\nCURRENT SEAT MAP:");
        for (int i = 0; i < seats.length; i++) {
            if (seats[i]) {
                System.out.print("X ");
            } else {
                System.out.print((i + 1) + " "); 
            }
        }
        System.out.println();
    }

    private static void reserveSeat() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nENTER THE SEAT NUMBER(1-10): ");
        int seatNumber = scanner.nextInt();
        if (seatNumber < 1 || seatNumber > 10) {
            System.out.println("INVALID SEAT NUMBER!");
        } else if (seats[seatNumber - 1]) {
            System.out.println("SORRY , SEAT ALREADY HAVE BEEN RESERVED!");
        } else {
            seats[seatNumber - 1] = true; // reserve the seat
            System.out.println("Seat reserved!");
        }
    }

    private static void cancelReservation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nENTER SEAT NUMBER(1-10): ");
        int seatNumber = scanner.nextInt();
        if (seatNumber < 1 || seatNumber > 10) {
            System.out.println("INVALID SEAT NUMBER!");
        } else if (!seats[seatNumber - 1]) {
            System.out.println("SEAT NOT REVERSED!");
        } else {
            seats[seatNumber - 1] = false; // unreserve the seat
            System.out.println("RESERVATION CANCELLED!");
        }
    }
}