import java.util.Scanner;
public class PrintTheUpperCaseOfInputedLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a lowercase: ");
        char LowerCase = sc.next().charAt(0);
        int UpperCase = LowerCase-32;
        System.out.println("Uppercase is of your input lowercase is " + (char)UpperCase);

        sc.close();
    }
}
