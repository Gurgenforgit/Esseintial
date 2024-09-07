import java.util.Scanner;

public class EntertainmentVenue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the age of costumer");
        int age = sc.nextInt();
        if (age < 16) {
            System.out.println("The entry of the costumer is banned");
            System.exit(0);
        } else {
            System.out.println("Is the costumer VIP? ");
            System.out.println("Type true or false");
            boolean VIP = sc.nextBoolean();
            System.out.println("Enter the amount of payment");
            double AmountForOrder;
            double TotalPay;
            AmountForOrder = sc.nextDouble();
            if (VIP) {
                TotalPay = (AmountForOrder - 15 * AmountForOrder / 100);
                System.out.println("The costumer has to pay " + TotalPay);
            } else {
                TotalPay = AmountForOrder + 5000;
                System.out.println("The costumer has to pay " + TotalPay);
            }

        }
    }
}




