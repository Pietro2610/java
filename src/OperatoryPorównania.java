import java.util.Scanner;

public class OperatoryPorównania {
    public static void main(String[] args) {

        int number1,number2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        number1 = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        number2 = scanner.nextInt();

        System.out.println(number1 < number2);
        System.out.println(number1 > number2);
        System.out.println(number1 <= number2);
        System.out.println(number1 >= number2);
        System.out.println(number1 == number2);
        System.out.println(number1 != number2);

    }
}
