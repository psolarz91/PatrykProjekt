package ch00_moja_nauka;

import java.util.Random;
import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {
        int numberToGuess = new Random().nextInt(100);
        System.out.println("Proszę zgadnij liczbę z zakresu 0-99");
        //getNumberFromUser();
        checkIfGuessed(numberToGuess, 4);
    }
    public static void checkIfGuessed(int numberToGuess, int tries) {
        while (tries > -1 ) {
            int userNumber = getNumberFromUser();

            if (userNumber > numberToGuess) {
                System.out.println("Podałeś za dużą liczbę");
                System.out.println("Masz pięć prób. Liczba pozostałych prób: " + tries);
            }
            if  (userNumber < numberToGuess) {
                System.out.println("Podałeś za małą liczbę");
                System.out.println("Masz pięć prób. Liczba pozostałych prób: " + tries );
            }
            if (userNumber == numberToGuess) {
                System.out.println("Zgadłeś!");
                break;
            }
            tries--;
        }

        System.out.println("Niestety nie udało Ci się zgadnąć, poprawna odpowiedź to: " + numberToGuess );
    }
    public static int getNumberFromUser() {
        System.out.println("Podaj Liczbę");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}