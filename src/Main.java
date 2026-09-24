import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int routes, price = 0, seat, total, cash, change;

        System.out.println("       AVAILABLE ROUTES");
        System.out.println("===========================================");
        System.out.println("|No.|From        |To      |Time    |Price |");
        System.out.println("===========================================");
        System.out.println("|1. |Naga        |Cebu    |10:00am |40Php |");
        System.out.println("|2. |Minglanilla |Cebu    |11:00am |35Php |");
        System.out.println("===========================================");

        System.out.print("Enter no. route: ");
        routes = sc.nextInt();

        if (routes == 1) {
            System.out.println("From: Naga");
            System.out.println("To: Cebu");
            System.out.println("Time: 10:00am");
            System.out.println("Price: 40Php");
            price = 40;

        } else if (routes == 2) {
            System.out.println("From: Minglanilla");
            System.out.println("To: Cebu");
            System.out.println("Time: 11:00am");
            System.out.println("Price: 35Php");
            price = 35;

        } else {
            System.out.println("Invalid Route!");
            sc.close();
            return;
        }

        System.out.print("Enter how many Seats: ");
        seat = sc.nextInt();

        while (seat <= 0) {
            System.out.println("Invalid number of seats!");
            System.out.print("Enter how many Seats: ");
            seat = sc.nextInt();
        }

        total = price * seat;

        System.out.println("Total Payment: " + total + " Php");
        System.out.println("=================");

        System.out.print("Enter Cash: ");
        cash = sc.nextInt();

        while (cash < total) {
            System.out.println("Not Enough Money!");
            System.out.print("Cash: ");
            cash = sc.nextInt();
        }

        change = cash - total;

        System.out.println("===============");
        System.out.println("Receipt");
        System.out.println("===============");

        if (routes == 1) {
            System.out.println("From: Naga");
            System.out.println("To: Cebu");
            System.out.println("Time: 10:00am");
        } else if (routes == 2) {
            System.out.println("From: Minglanilla");
            System.out.println("To: Cebu");
            System.out.println("Time: 11:00am");
        }

        System.out.println("Price per Seat: " + price + " Php");
        System.out.println("Seat: " + seat);
        System.out.println("Total: " + total + " Php");
        System.out.println("Cash: " + cash + " Php");
        System.out.println("Change: " + change + " Php");
        System.out.println("===============");
        System.out.println("Thank you for using our System!");

        sc.close();
    }
}