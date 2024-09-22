package method;

//Գրեք մեթոդ, որը կընդունի ամբողջ թվերի զանգված։ Ձեր խնդիրնա գտնել մեթոդին փոխանցված array-ում դրական ու բացասական թվերի
// հարաբերակցությունը` positive / negative, ու վերադարձնել տվյալ double թիվը։ Եթե չլինեն բացասական թվեր, թող վերադարձնի
// -1։

//import java.util.Scanner;

public class RatioOfPositiveAndNegativeElements {
    public static void main(String[] args) {

        // This fragment of code is optional, in case if I didn't get the condition properly.

       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of desired array ");
        int length = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Input next element ");
            arr[i] = sc.nextInt();
        }*/
        int[] arr = {1, 2, -9, 15, -7, 89, -9, 58, 0};
        double result = ratio(arr);
        System.out.println(result);
    }

    static double ratio(int[] newArray) {
        int Pos = 0;
        int Neg = 0;
        double ratio = 1; // to ratio assigned a value because 'return' statement need it
        for (int k = 0; k < newArray.length; k++) {
            if (newArray[k] > 0)
                Pos = Pos + 1;
            if (newArray[k] < 0)
                Neg = Neg + 1;
            if (Neg > 0)
                ratio = (double) Pos / Neg;
            else ratio = -1;
        }
        return ratio;
    }
}
