package identifiers.first;

public class Child extends Parent{

    public void testIdentifiers() {
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
        firstMethod();
        secondMethod();
        thirdMethod();
        fourthMethod();
    }
}
//klasa potomna w tej samej paczce nie ma dostępu do pól/metod private