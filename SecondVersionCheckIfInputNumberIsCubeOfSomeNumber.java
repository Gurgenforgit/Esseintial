import java.util.Scanner;

public class SecondVersionCheckIfInputNumberIsCubeOfSomeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input any whole number");
        int input = sc.nextInt();
        int i = 0;
        for (i = 0; Math.abs(i * i * i) <= Math.abs(input); i++) {
            if (Math.abs(i * i * i) == Math.abs(input) && input >= 0) {
                System.out.println(input + " is the cube of " + i);
                break;
            }
            if (Math.abs(i * i * i) == Math.abs(input) && input <= 0) {
                System.out.println(input + " is the cube of " + -i);
                break;
            }
        }
        if (Math.abs(i * i * i) > Math.abs(input))
            System.out.println("This  is not a cube of any number");

    }
}


