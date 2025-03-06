import java.util.Arrays;

public class OperatoryLogiczne {
    public static void main(String[] args) {

        boolean value1 = true,
                value2 = false,
                value3 = false,
                value4 = true;

        // && "i" -> true kiedy wszystkie wyrażenia składowe są równe true
        System.out.println(value1 && value2);
        System.out.println(value1 && value4);

        // || lub -> true gdy przynajmniej jedna z wyrażen składowych jest równa true
        System.out.println(value1 || value2);
        System.out.println(value2 || value3);

        // ! negacja -> zwraca wartość przeciwną do wyrażenia, przed którym się znajduje
        System.out.println(!value1);
        System.out.println(!value2);
    }
}
