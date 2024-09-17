import java.util.Scanner;

public class CreateArrayAnElementMatchingInputedNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the lenght of the scanner which is greater than three");
        int n = sc.nextInt();
        if (n < 4) {
            System.out.println("Sorry, but it is not possible to continue due to wrong input");
            System.exit(1);
        }
        System.out.println("Please input a whole number which is bigger zero and less of array's length by four");
        int a = sc.nextInt();
        if (a > (n - 4) || a < 0) {
            System.out.println("Sorry, but it is not possible to continue due to wrong input");
            System.exit(1);
        }
        int[] arr = new int[n];// Considered that the array has to be int type.
        arr[a + 1] = a + 1;
        arr[a + 2] = a + 2;
        arr[a + 3] = a + 3;
        System.out.println("The element " + (a + 1) + " is " + arr[a + 1]); // Optional
        System.out.println("The element " + (a + 2) + " is " + arr[a + 2]); // Optional
        System.out.println("The element " + (a + 3) + " is " + arr[a + 3]); // Optional
    }
}
