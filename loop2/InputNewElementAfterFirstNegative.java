package loop2;
//Զանգվածի առաջին բացասական թվից հետո պետքա insert անեք նոր թիվ՝ տվյալ բացասական էլեմենտի ինդեքսը
public class InputNewElementAfterFirstNegative {
    public static void main(String[] args) {

        // declaring int type array with various element
        double[] origin = {1, 0.3, 4, -6, 45, -98, 10};

        // Counting quantity of negative elements
        int x = 0;
        for (double value : origin) {
            if (value < 0)
                x++;
        }

        // Declaring temporary array which length is origin.length + quantity of negative elements
        double [] temp = new double[origin.length + x];

        // Adding required elements to temporary array
        int a = 0;
        for (int i = 0; i < origin.length; i++) {
            if (origin[i] >= 0)
                temp[i + a] = origin[i];
            if (origin[i] < 0) {
                temp[i + a] = origin[i];
                a += 1;
                temp[i + a] = i;
            }
        }
        origin = temp;

        // This is optional, to be sure target is met.
        for (double v : origin) System.out.println(v);
        System.out.println("The length of origin array is " + origin.length);
    }
}
