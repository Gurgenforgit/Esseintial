package loop2;

//արդյոք 2-րդ զանգվածը պարունակվումա առաջինի մեջ թե չէ ու տպեք համապատասխան հաղորդագրություն
public class CheckIfOneArrayIsIncludedInSecond {
    public static void main(String[] args) {
        double[] arr2 = {-9, 11, 4, 3, 1};
        double[] arr1 = {1, 2, 3, 4, 5, -9, 100};
        boolean a = false;
        boolean b = false;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] != arr1[j]) {
                    b = true;
                }
                else b = false;
                if (arr2[i] == arr1[j]) {
                    a = true;
                    break;
                }
                else a = false;
            }
            if (b) {
                System.out.println("arr2 is not included in arr1");
                break;
            }
        }
        if (a)
            System.out.println("arr2 is included in arr1");
    }
}
