package MojaNauka;

public class SquareP {
    public static void main(String[] args) {
        int n = 20;
        int i = 0;
        int[] tab = new int[n];

        for (i = 0; i < tab.length; i++) {
            tab[i] = i * i;

            System.out.println("Element o indeksie:" + i + " ma wartość: " + tab[i]);
        }
    }
}
