import java.util.Scanner;

public class CheckIfInputNumberIsCubeOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input any whole number");
        int input = sc.nextInt();
        if (input >= 0) {
            int i = 0;
            for (i = 0; i * i * i <= input; i++) {
                if (i * i * i == input) {
                    System.out.println(input + " is the cube of " + i);
                    break;
                }
            }
            if (i * i * i > input)
                System.out.println("There is not exist such whole number");
        }
        if (input < 0) {
            int i = -1;
            for (; i * i * i >= input; i--) {
                if (i * i * i == input) {
                    System.out.println(input + " is the cube of " + i);
                    break;
                }
            }
            if (i * i * i < input)
                System.out.println("There is not exist such whole number");
        }
    }
}
