public class Tablica {
    public static void main(String[] args) {

        String[] imiona = new String[3];
                imiona[0] = "Piotr";
                imiona[1] = "Anna";
                imiona[2] = "Maciej";

/*
        System.out.println(imiona[0]);
        System.out.println(imiona[1]);
        System.out.println(imiona[2]);

        int[] lottoNumbers = new int[] {43,12,13,10,23,35};
        System.out.println(lottoNumbers[0]);
        System.out.println(lottoNumbers[1]);
        System.out.println(lottoNumbers[2]);
        System.out.println(lottoNumbers[3]);
        System.out.println(lottoNumbers[4]);
        System.out.println(lottoNumbers[5]);

        System.out.println(lottoNumbers.length);
*/
        for (int i=0; i<imiona.length; i++) {
            System.out.println(imiona[i]);
        }
    }
}
