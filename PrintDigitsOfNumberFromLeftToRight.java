import java.util.Scanner;

public class PrintDigitsOfNumberFromLeftToRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Input any positive whole number");
        int a = sc.nextInt();

        // Preventing input not positive number
        if (a <= 0){
            System.out.println(" Next time please input a Positive whole number");
            System.exit(1);
        }

        int b = a; // to keep input number for further operations
        int i = 1;
        for (; a > 9 ; a /= 10) {
            i++;
        }
        // creating array of digits consisting of input number - from left to right
        int[] arr = new int[i];
        for(; i > 0 ; i--)  {
            arr[i-1] = b % 10;
            b = b/10;
        }
        for(int k = 0; k < arr.length ; k++){
            System.out.println(arr[k]);
        }
    }
}