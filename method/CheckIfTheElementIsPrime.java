package method;
//Ձեզնից պահանջվումա գրել ծրագիր, որը կստուգի array-ի հերթական անդամի պարզ լինել-չլինելը
// ու կտպի համապատասխան հաղորդագրություն։

public class CheckIfTheElementIsPrime {
    public static void main(String[] args) {
        int[] arr = {1, 5, 12, 29};
        boolean yourChoice = primeOrNote(arr[3]);
        System.out.println("If you are searching a prime number it is " + yourChoice);
    }
    public static boolean primeOrNote (int x){
        boolean IsPrime = true;
        for(int i = 2; i <= x/2; i++){
            if(x % i == 0)
                IsPrime = false;
        }
      return IsPrime;
    }
}
