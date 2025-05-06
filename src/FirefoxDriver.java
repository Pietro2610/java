import java.sql.SQLOutput;

public class FirefoxDriver implements WebDriver{
    @Override
    public void get() {
        System.out.println("Otwieramy przeglądarkę Firefox");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajdujemy element za pomocą przeglądarji Firefox");
    }
}
