import java.util.Scanner;
public class CalculateAriphmeticMeanOfThreeShorts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input 3 whole numbers ");
        short Number1 = sc.nextShort();
        short Number2 = sc.nextShort();
        short Number3 = sc.nextShort();
        int Mean = (Number1 + Number2 + Number3) / 3;
        System.out.println(Mean);
        if(Number1 > 0) {
            Number1 = Number1;
        }
        else {
            Number1 = (short) (-1 * Number1);
        }
        if(Number2 > 0) {
            Number2 = Number2;
        }
        else {
            Number2 = (short) (-1 * Number2);
        }
        if(Number3 > 0) {
            Number3 = Number3;
        }
        else {
            Number3 = (short) (-1 * Number3);
        }
        System.out.println((Number1 + Number2 + Number3) / Mean);



    }
    }



