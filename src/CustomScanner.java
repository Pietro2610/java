import java.util.Arrays;
import java.util.Scanner;

public class CustomScanner {
    public static void main(String[] args) {
/*      Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoje imię");
        String name =  scanner.nextLine();
        System.out.println("Cześć "+name+"!");
 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int liczba1 = scanner.nextInt();
        int wynik1 = liczba1 * liczba1;
        System.out.println("Kwadrat tej liczby to: "+wynik1);
    }
}
