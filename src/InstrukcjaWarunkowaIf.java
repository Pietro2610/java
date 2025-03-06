import java.util.Arrays;

public class InstrukcjaWarunkowaIf {
    public static void main(String[] args) {

        float dzielna = 4F,
              dzielnik = 0F;

        if (dzielnik != 0) {
            System.out.println("Wynik dzielenia to: " + dzielna/dzielnik);
        }
        else {
            System.out.println("Dzielnik musi być różny od 0");
        }
    }
}
