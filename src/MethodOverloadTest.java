public class MethodOverloadTest {
    public static void main(String[] args) {
        MethodOverload method = new MethodOverload();

        method.add(2,1);
        method.add(2,1,5);
        method.add(2);
        method.add("Fajny overload");
        method.add();
    }
}
