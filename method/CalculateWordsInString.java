package method;

// Ունեք սովորական String փոփոխական, որի մեջ անգլերեն տառերով տեքստա գրած պրոբելներով։։ Դուք պիտի գրեք մեթոդ,
// որը կստանաս տվյալ String-ը որպես պարամետր ու կվերադարձնի String-ում բառերի քանակը։
public class CalculateWordsInString {
    public static void main(String[] args) {
        String Example = "  Բարև ախպեր ջան, ներողություն     տունը   մեկը չիգա։    ";
        int result = calculateWords(Example);
        System.out.println(result);
    }

    static int calculateWords(String str) {
        int quantity = 0;

        // This fragment of code checking if there is 'space' in the beginning of the string
        int k = 0;
        while (str.charAt(k) == ' ') {
            k++;
        }

        boolean Space = false;
        for (int i = k; i < str.length(); i++) {

            // This condition is checking whether there are  more than one 'space' in between
            if (Space && str.charAt(i) == ' ')
                continue;

            if (str.charAt(i) == ' ') {
                quantity += 1;
                Space = true;
            } else Space = false;
        }
        return quantity;
    }
}
