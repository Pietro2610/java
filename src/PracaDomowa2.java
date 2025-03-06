import java.util.Arrays;
import java.util.Scanner;

public class PracaDomowa2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile lat skoczyłeś?");
        int wiek = scanner.nextInt();

        if (wiek < 18) {
            System.out.println("Musisz mieć ukonczone 18 lat");
        }
        else {
            System.out.println("Dziękujemy za zakupy");
        }
    }
}