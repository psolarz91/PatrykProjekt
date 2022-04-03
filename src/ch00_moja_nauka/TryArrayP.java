package MojaNauka;

public class TryArrayP {
    public static void main(String[] args) {
        try {
            int[] tab = {2, 4, 9};
            //for (int i = 0; i < 10; i++);
            System.out.println(tab[10]);
        } catch (ArrayIndexOutOfBoundsException x) {
            System.out.println("Wykryto wyjatek ArrawayIndexOutOfBoundsException");
            System.out.println("Koniec zakresu");
        }
        System.out.println("Koniec programu");
    }

}
