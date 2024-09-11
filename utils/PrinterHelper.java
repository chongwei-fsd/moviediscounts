package utils;

public class PrinterHelper {
    public static void ageInput(){
        System.out.println("Enter age: ");
    }

    public static void qtyTicket(){
        System.out.println("Enter qty of ticket: ");
    }

    public static void ticketPrice(double ticket){
        System.out.printf("Ticket is €%.2f %n",ticket);
    }
}
