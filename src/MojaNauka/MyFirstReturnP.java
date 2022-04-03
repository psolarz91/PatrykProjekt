package MojaNauka;

public class MyFirstReturnP {
    public static void main(String[] args) {
        System.out.println("->Mam wartośc " + getNumber());
        System.out.println("->Mam wartość " + getBoolean());
        System.out.println("->Mam wartość " + getTekst());
    }

    public static int getNumber() {
        System.out.println("Zwracam wartość: 10");
        return 10;
    }

    public static String getTekst() {
        System.out.println("Zwracam wartość: Hi!");
        return "Hi!";
    }

    public static boolean getBoolean() {
        System.out.println("Zwracam wartość: True");
        return true;
    }
}
