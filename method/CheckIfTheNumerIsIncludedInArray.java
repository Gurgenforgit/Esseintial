package method;

// պիտի գրեք մեթոդ, որը կստանաս ամբողջ թվերի array ու ևս մեկ՝ array-ի տիպն ունեցող պարամետր։ Ձեր մեթոդը պետքա վերադարձնի
// true, եթե էդ թիվը պարունակվումա array-ի մեջ, ու false, եթե չի պարունակվում։
public class CheckIfTheNumerIsIncludedInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 12;
        boolean result = checkIfIncluded(arr, n);
        System.out.println(result);
    }

    static boolean checkIfIncluded(int[] arr, int n) {
        boolean Included = false;
        for (int i = 0; i < arr.length; i++) {
            if (n == arr[i])
                Included = true;
        }
        return Included;
    }
}
