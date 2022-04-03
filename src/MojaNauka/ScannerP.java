package MojaNauka;

import java.util.Scanner;

public class ScannerP {
    public static void main(String[] args) {
      /*  int y = 1;
        System.out.println(y);
        y++;
        System.out.println(y);
        y++;
        System.out.println(y);
        y++;
        System.out.println(y);
        y--;
        System.out.println(y);*/

        Scanner input = new Scanner(System.in);
        System.out.println("powiedz jak się nazywasz");
        String name = input.nextLine();
        System.out.println("elo:" + name + "!");
    }
}
