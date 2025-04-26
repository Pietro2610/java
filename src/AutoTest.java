public class AutoTest {
    public static void main(String[] args) {

        Auto auto = new Auto("Audi", "A6", 2003, 1200);
        auto.info();
      Auto mercedes = new Auto();
        mercedes.marka = "Mercedes";
        mercedes.model = "Klasa S";
        mercedes.rok = 1999;
        mercedes.przebieg = 1000;

        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();

      Auto audi = new Auto();
      audi.marka = "Audi";
      audi.model = "A5";
      audi.rok = 2020;
      audi.przebieg = 0;
      audi.info();

      Auto noname = new Auto();

      noname.info();

    }
}
