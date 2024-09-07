import java.util.Scanner;
public class PrintTheReverseOfThreeDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input 3 digits number");
        int ThreeDigitsNumber = sc.nextInt();
        if (ThreeDigitsNumber > 999 || ThreeDigitsNumber < 100) {
            System.exit(1);
        } else {
            int ThirdDigit = ((ThreeDigitsNumber % 100) % 10);
            int SecondDigit = ((ThreeDigitsNumber % 100) / 10);
            int FirstDigit = (ThreeDigitsNumber / 100);
            int ReversedNumber = (ThirdDigit * 100 + SecondDigit * 10 + FirstDigit);
            if (ThirdDigit == 0) {
                System.out.println("It is not possible to reverse this number");
            } else {
                System.out.println("The reversed input number is " + ReversedNumber);
            }
        }
    }
}


