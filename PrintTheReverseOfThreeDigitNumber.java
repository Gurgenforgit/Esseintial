import java.util.Scanner;
public class PrintTheReverseOfThreeDigitNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input 3 digits number");
    int ThreeDigitsNumber = sc.nextInt();
    if (ThreeDigitsNumber > 999 || ThreeDigitsNumber < 100) {
      System.out.println("You didn't input three-digit number, Please next time input valid three-digit numbe ");
      System.exit(1);
    }
      int ThirdDigit = ((ThreeDigitsNumber % 100) % 10);
      if (ThirdDigit == 0) {
        System.out.println("It is not possible to reverse this number");
      System.exit(0);
      }
      int SecondDigit = ((ThreeDigitsNumber % 100) / 10);
      int FirstDigit = (ThreeDigitsNumber / 100);
      int ReversedNumber = (ThirdDigit * 100 + SecondDigit * 10 + FirstDigit);
      System.out.println("The reversed input number is " + ReversedNumber);
      }
    }




