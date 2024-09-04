public class class1 {
    public static void main(String[] args) {
        int a = 9876;
        System.out.println(a / 1000);
        System.out.println((a % 1000)/100);
        System.out.println(((a % 1000)/10) % 10);
        System.out.println((a % 100) % 10);
    }
}