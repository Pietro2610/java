public class AppTest {

    public static void main(String[] args) {


        AppAndroid test = new AppAndroid("Plum", "iOS");

        System.out.println("Aplikacja włącza się na " + test.env());
    }
}