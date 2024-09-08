import java.util.Scanner;
public class PrintTheUpperCaseOfInputedLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a lowercase: ");
        char LowerCase = sc.next().charAt(0);
        int UpperCase = LowerCase - 32;
        if (LowerCase < 97 || LowerCase > 122) {
            System.out.println("There is not such lowercase in Latin alphabet ");
            System.exit(1);}
            System.out.println(" The uppercase  of your input lowercase is " + (char) UpperCase);
            sc.close();
        }
    }
