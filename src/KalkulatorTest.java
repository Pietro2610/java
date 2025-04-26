import java.util.Scanner;

public class KalkulatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        int secondNumber = scanner.nextInt();
        Kalkulator dodawanie = new Kalkulator();
        System.out.println("Wynik dodawania to " + dodawanie.addition(firstNumber,secondNumber));
        System.out.println("Wynik odejmowania to " + dodawanie.subtraction(firstNumber,secondNumber));
        System.out.println("Wynik mnożenia to "+ dodawanie.multiplication(firstNumber,secondNumber));
        System.out.println("Wynik dzielenia to "+dodawanie.division(firstNumber,secondNumber));
        System.out.println("wynik modulo to "+ dodawanie.mod(firstNumber,secondNumber));
    }
}