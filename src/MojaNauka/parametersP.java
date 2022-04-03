package MojaNauka;

public class parametersP {
    public static void main(String[] args) {
        int[] dividers = {2, 3, 4, 5};
        System.out.println("Witaj w kalkulatorze liczb podzielnych");
        printIfNumberCanBeDividedBy(33, dividers);
        printIfNumberCanBeDividedBy(44, dividers);
        printIfNumberCanBeDividedBy(55, dividers);
        printIfNumberCanBeDividedBy(30, dividers);
        printIfNumberCanBeDividedBy(15, dividers);

    }

    public static void printIfNumberCanBeDividedBy(int number, int[] dividers) {
        System.out.println("Sprawdzam liczbę: " + number);

        for (int i = 0; i < dividers.length; i++) {
            
            if (number % dividers[i] == 0) {
                System.out.println("Liczba " + number + " jest podzielna przez: " + dividers[i]);
            } else {
                System.out.println("Liczba " + number + " jest niepodzielna przez: " + dividers[i]);
            }
        }

    }
}