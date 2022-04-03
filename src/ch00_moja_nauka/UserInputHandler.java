package ch00_moja_nauka;
import java.util.Scanner;

public class UserInputHandler {
    public static int getNumberFromUser() {
        System.out.println("Podaj Liczbę");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();

    }
}
