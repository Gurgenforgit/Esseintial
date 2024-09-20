package loop2;
// Գրել ծրագիր, որը կգտնի տվյալ զանգվածում ամենաերկար աճող հաջորդականության երկարությունը։
public class FindTheLongestSequence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 8, 9, 2, 1, 2, 3, 4, 5, 6, 7, 78, 0, 2, 98};
        int temp = 0;
        int longest = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] > arr[i]) {
                temp = temp + 1;
                if (temp >= longest) {
                    longest = temp;
                }
            }
            if (arr[i + 1] < arr[i]) {
                temp = 0;
                continue;
            }
        }
        System.out.println(longest);
    }
}