package ch00_moja_nauka;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        System.out.println("Wybierz opcję: ");
        System.out.println("1 - dodawanie");
        System.out.println("2 - odejmowanie");
        int a = UserInputHandler.getNumberFromUser();
        int b = UserInputHandler.getNumberFromUser();
        printOptions();
        System.out.println("Twój wynik to:" + Calculator.add(a,b));

        System.out.println("Twój wynik to:" + Calculator.substract(a,b));
    }
    public static int printOptions() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbe");
        int a = scanner.nextInt();
        System.out.println("Podaj drugą liczbe");
        int b = scanner.nextInt();
        return scanner.nextInt();
    }
}
