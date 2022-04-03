package ch00_moja_nauka;

public class CarDwaP {
    public static void main(String[] args) {
        CarP car1 = new CarP();

        car1.drive();
        System.out.println("Kolor to: " + car1.color);

        CarP car2 = new CarP();
        car2.drive();
        System.out.println("Kolor to: " + car2.color);
    }
}
