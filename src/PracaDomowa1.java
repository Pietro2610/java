import java.util.Scanner;

public class PracaDomowa1 {
    public static void main(String[] args) {

        int number1, number2, result;
        float number3, number4, result1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        number1 = scanner.nextInt();
        number3 = number1;
        System.out.println("Podaj drugą liczbę");
        scanner = new Scanner(System.in);
        number2 = scanner.nextInt();
        number4 = number2;

        result = number1 + number2;
        System.out.println("Dodawanie: " + result);
        result = number1 - number2;
        System.out.println("Odejmowanie: " + result);
        result = number1 * number2;
        System.out.println("Mnożenie: " + result);
        result1 = number3 / number4;
        System.out.println("Dzielenie: " + result1);
        result = number1 % number2;
        System.out.println("Reszta z dzielenia: " + result);

    }
}
