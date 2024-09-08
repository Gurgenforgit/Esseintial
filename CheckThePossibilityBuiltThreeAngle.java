import java.util.Scanner;
public class CheckThePossibilityBuiltThreeAngle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the lengths of the sides of triangle");
        int Side1 = sc.nextInt();
        int Side2 = sc.nextInt();
        int Side3 = sc.nextInt();
        if (Side1 <= 0 || Side2 <= 0 || Side3 <= 0) {
            System.out.println("The sided of triangle can not be negative number ");
            System.exit(1);
        } else {
            if ((Side1 + Side2) <= Side3 || (Side1 + Side3) <= Side2 || (Side2 + Side3) <= Side1) {
                System.out.println("It is not possible to create a triangle with provided sides " + "Side1 = " + Side1 + " " + "Side2 = " + " " + Side2 + " " + "Side3 = " + Side3);
            } else {
                System.out.println("It is  possible to create a triangle with provided sides " + "Side1 = " + Side1 + " " + "Side2 = " + " " + Side2 + " " + "Side3 = " + Side3);
            }
        }
    }
}
