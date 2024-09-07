import java.util.Scanner;
public class RetrieveDigitsFrom4DigitsNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a four digit number");
        int FourDigitNumber = sc.nextInt();
        if (FourDigitNumber > 9999 || FourDigitNumber < 1000) {
            System.exit(1);
        } else {
            System.out.println(FourDigitNumber / 1000);
            System.out.println((FourDigitNumber % 1000) / 100);
            System.out.println(((FourDigitNumber % 1000) / 10) % 10);
            System.out.println((FourDigitNumber % 100) % 10);
            sc.close();
        }
    }
}