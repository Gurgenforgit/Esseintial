import java.util.Scanner;
public class CreateArrayFromAnotherArray {
    public static void main(String[] srgs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the length of array");
        int size = sc.nextInt();
        int[] original = new int[size];
        for (int i = 0; i < size; i++){
            System.out.println("Input the elements of array");
            original[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println(" Input two whole non negative numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a < 0 || b < 0 || a == b) {
            System.out.println("Not valid input for this case");
            System.exit(1);
        }
            // define the bigger
            int c;
            int d;
            if(a < b)
                c = a;
            else c = b;
            if(a > b)
                d =a;
            else d = b;
            // assigning elements to the second array
            int[] second = new int[(d-c) + 1];
            for(int k = 0; k < second.length ; k++){
                second[k] = original[a];
                a = a+1;
                System.out.println(second[k]);
            }
        }
}

