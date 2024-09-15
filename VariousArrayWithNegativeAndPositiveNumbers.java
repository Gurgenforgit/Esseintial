public class VariousArrayWithNegativeAndPositiveNumbers {
    public static void main(String[] args) {
        double[] arr = {5, -45, 2, 8, 0, 10};
        double b = arr[0]; // by my logic 'b' should be 0, but if it is 0, the code doesn't run like it should, it skips add the first element
        int i = 0;
        for (; i < arr.length; ) {
            if (arr[i] > 0) {
                i++;
                b = b + arr[i];
            }
            if (arr[i] < 0) {
                i = i + 2;
                b = b + arr[i];
            }
            if (arr[i] == 0) {
                break;
            }
        }
        System.out.println(b);
    }
}
