package MojaNauka;

public class SalaryP {
    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5};
        int x = tab[0] + tab[1] + tab[2] + tab[3] + tab[4]; // inna opcja sum += tab[i];
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
        int sum = x;
        System.out.println("Suma liczb to: " + sum);

        int srednia = sum / tab.length;
        System.out.println("Srednia liczb to: " + srednia);

    }
}
