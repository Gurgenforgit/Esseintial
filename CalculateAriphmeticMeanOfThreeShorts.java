import java.util.Scanner;

public class CalculateAriphmeticMeanOfThreeShorts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input 3 whole numbers ");
        short Number1 = sc.nextShort();
        short Number2 = sc.nextShort();
        short Number3 = sc.nextShort();
        int Mean = (Number1 + Number2 + Number3) / 3;
        System.out.println("The arithmetical mean of input numbers is " + Mean);
            if (Number1 < 0) Number1 = (short) (-1 * Number1);
            if (Number2 < 0) Number2 = (short) (-1 * Number2);
            if (Number3 < 0) Number3 = (short) (-1 * Number3);
            if (Mean == 0){
            System.out.println("Not possible to continue The operation because of division on zero is banned in Math.  ");
        System.exit(0);}
        System.out.println("The result of second required arithmetical operation is " +  (Number1 + Number2 + Number3) / Mean);
    }
}


