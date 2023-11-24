import java.util.Scanner;
import java.util.Arrays;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static int[] getInt(){
        Scanner s = new Scanner(System.in);
        System.out.print("Amount of number :");
        int n = s.nextInt();
        int[] N = new int[n];
        for(int i = 0; i< n; i++){
            System.out.print(i+1 + " : ");
            N[i] = s.nextInt();
        }
        return N;
    }
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");
        int[] numbers = getInt();
        Arrays.sort(numbers);
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + numbers[i-1]);
        }
    }
}