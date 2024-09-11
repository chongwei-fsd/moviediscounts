import discounts.Discounts;
import utils.PrinterHelper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PrinterHelper.ageInput();
        int age = sc.nextInt();

        PrinterHelper.qtyTicket();
        int qty = sc.nextInt();

        Discounts discounts=new Discounts(age,qty);
        PrinterHelper.ticketPrice(discounts.qtyDiscount());


    }
}
