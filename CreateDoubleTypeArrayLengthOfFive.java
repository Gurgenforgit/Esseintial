public class CreateDoubleTypeArrayLengthOfFive {
    public static void main(String[] args) {
        double[] arr = {-15, 9, -11.5, 100, -63.9};
        double[] PosRev = new double[5];// Positive Reversed array
        if (arr[0] >= 0) {
            PosRev[4] = arr[0];
        }
            if (arr[1] >= 0){
                PosRev[3] = arr[1];
        }
            if (arr[2] >= 0){
                PosRev[2] = arr[2];
            }
            if (arr[3] >= 0){
                PosRev[1] = arr[3];
            }
            if (arr[4] >= 0){
                PosRev[0] = arr[4];
            }
        System.out.println("element 1 is " +  PosRev[0] + ", element 2 is  " + PosRev[1] + ", element3 is  " + PosRev[2] + ", element 4 is  " + PosRev[3] + ", element 5 is  " + PosRev[4]) ;

        }
    }