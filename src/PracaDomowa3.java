public class PracaDomowa3 {
    public static void main(String[] args) {

//wypisanie wszystkich liczb od 0 do 100, podzielnych przez 3

/*
        for (int i=0; i<=100; i++) {
            if (i%3 == 0) {
                System.out.println(i);
            }
        }
*/

// odwrócenie kolejności w tablicy
        int[] numbers = new int[] {1,3,5,7,0};

        for (int i=0;i<(numbers.length/2); i++) {
            int temp = numbers[i]; //tymczasowa zmienna int dla pierwszego wyrażenia w tablicy
            numbers[i] = numbers[numbers.length-1-i];
            numbers[numbers.length-1-i] = temp;
        }

        for (int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
