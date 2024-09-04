import java.util.Scanner;
public class class1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a);
        System.out.println(a / 1000);
        System.out.println((a % 1000)/100);
        System.out.println(((a % 1000)/10) % 10);
        System.out.println((a % 100) % 10);
    }
}