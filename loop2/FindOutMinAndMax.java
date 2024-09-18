package loop2;
//Վերցնում եք ամբողջ թվերի զանգված։ Մի ցիկլով գտնում եք տվյալ զանգվածի միջի մինիմում ու մաքսիմում թվերը։
public class FindOutMinAndMax {
    public static void main(String[] args) {
        int[] arr = {1, 1, 58, 1, 0, 1, -89};
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < (arr.length ); i++) {
           if (arr[i] > max) {
               max = arr[i];
           }
           if (arr[i] < min) {
               min = arr[i];
           }
        }
        System.out.println("Maximum is " + max);
        System.out.println("Minimum is " + min);
    }
}
