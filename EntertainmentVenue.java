import java.util.Scanner;

public class EntertainmentVenue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the age of costumer");
        int age = sc.nextInt();
        if (age < 16) {
            System.out.println("The entry of the costumer is banned");
            System.exit(0);}
            System.out.println("Is the costumer VIP? ");
            System.out.println("Type true or false");
            boolean VIP = sc.nextBoolean();
            System.out.println("Enter payment");
            double PriceForOrder;
            double FinalPay;
            PriceForOrder = sc.nextDouble();
            if (VIP) {
                FinalPay = (PriceForOrder - 15 * PriceForOrder / 100);
                System.out.println("The costumer has to pay " + FinalPay);
            System.exit(0);}
                FinalPay = PriceForOrder + 5000;
                System.out.println("The costumer has to pay " + FinalPay);
            }
}






