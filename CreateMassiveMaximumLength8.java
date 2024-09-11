import java.util.Scanner;

public class CreateMassiveMaximumLength8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the length of the scanner which has to be in <1-8> range ");
        int n = sc.nextInt();
        if (n < 1 || n > 8) {
            System.out.println("Not valid length for this array");
            System.exit(1);
        }
        int Massive[] = new int[n];
        System.out.println("Input two whole numbers ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Massive[(n / 2 - 1)] = a;
        Massive[(n / 2 + 1)] = b;
    }
}
