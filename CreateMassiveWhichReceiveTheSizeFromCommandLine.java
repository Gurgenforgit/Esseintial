import java.util.Scanner;

public class CreateMassiveWhichReceiveTheSizeFromCommandLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the length of the array ");
        int n = sc.nextInt();
        if (n < 1) {
            System.exit(1);
        }
        int arr[] ;
        switch (n) {
            default:
                arr = new int[15];
                arr[0] = 15;
                break;
            case 6, 7:
                arr = new int[10];
                break;
            case 3:
                arr = new int[3];
                break;
            case 4:
                arr = new int[4];
                break;
            case 5:
                arr = new int[5];
        }
                System.out.println("The first element of array is " + arr[0]);
        System.out.println("The length of the array is " + arr.length);
    }
}

