import java.util.Scanner;

public class CreateMassiveMaximumLength8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the length of the array which has to be in <3-8> range ");
        int n = sc.nextInt();
        if (n < 3 || n > 8) {
            System.out.println("Not valid length for this array");
            System.exit(1);
        }
        int Massive[] = new int[n];
        System.out.println("Input two different whole numbers ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b) {
            System.out.println(" The program terminated due to wrong input");
            System.exit(1);
        }
        if (a < b) {
            Massive[(n / 2 - 1)] = a;
            Massive[(n / 2 + 1)] = b;
        } else {
            Massive[(n / 2 - 1)] = b;
            Massive[(n / 2 + 1)] = a;
        }
        System.out.println("The length of the array is " + Massive.length);//optional
        System.out.println("The element-" + (n / 2 - 1) + " " + "is " + Massive[(n / 2 - 1)]);//optional
        System.out.println("The element-" + (n / 2 + 1) + " " + "is " + Massive[(n / 2 + 1)]);//optional
    }
}
