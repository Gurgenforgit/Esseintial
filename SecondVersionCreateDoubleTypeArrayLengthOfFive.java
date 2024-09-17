public class SecondVersionCreateDoubleTypeArrayLengthOfFive {
    public static void main(String[] args) {
        double[] arr = {-1, 2, -3, -4, 5};
        double[] PosRev = new double[5];// Positive-Reversed array
        if (arr[0] >= 0)
            PosRev[4] = arr[0];
        if (arr[1] >= 0 && PosRev[4] == 0)
            PosRev[4] = arr[1];
        else if (arr[1] >= 0 && PosRev[4] != 0)
            PosRev[3] = arr[1];
        if (arr[2] >= 0 && PosRev[4] == 0)
            PosRev[4] = arr[2];
        else if (arr[2] >= 0 && PosRev[4] != 0 && PosRev[3] == 0)
            PosRev[3] = arr[2];
        else if (arr[2] >= 0 && PosRev[4] != 0 && PosRev[3] != 0)
            PosRev[2] = arr[2];
        if (arr[3] >= 0 && PosRev[4] == 0)
            PosRev[4] = arr[3];
        else if (arr[3] >= 0 && PosRev[4] != 0 && PosRev[3] == 0)
            PosRev[3] = arr[3];
        else if (arr[3] >= 0 && PosRev[4] != 0 && PosRev[3] != 0 && PosRev[2] == 0)
            PosRev[2] = arr[3];
        else if (arr[3] >= 0 && PosRev[4] != 0 && PosRev[3] != 0 && PosRev[2] != 0)
            PosRev[1] = arr[3];
        if (arr[4] >= 0 && PosRev[4] == 0)
            PosRev[4] = arr[4];
        else if (arr[4] >= 0 && PosRev[4] != 0 && PosRev[3] == 0)
            PosRev[3] = arr[4];
        else if (arr[4] >= 0 && PosRev[4] != 0 && PosRev[3] != 0 && PosRev[2] == 0)
            PosRev[2] = arr[4];
        else if (arr[4] >= 0 && PosRev[4] != 0 && PosRev[3] != 0 && PosRev[2] != 0 && PosRev[1] == 0)
            PosRev[1] = arr[4];
        else if (arr[4] >= 0 && PosRev[4] != 0 && PosRev[3] != 0 && PosRev[2] != 0 && PosRev[1] != 0)
            PosRev[0] = arr[4];
        System.out.println("element 1 is " + PosRev[0]);
        System.out.println("element 2 is " + PosRev[1]);
        System.out.println("element 3 is " + PosRev[2]);
        System.out.println("element 4 is " + PosRev[3]);
        System.out.println("element 5 is " + PosRev[4]);
    }
}
