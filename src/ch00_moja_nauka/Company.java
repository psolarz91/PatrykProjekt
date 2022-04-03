package ch00_moja_nauka;

public class Company {
    public static void main(String[] args) {

        Employee pracownik1 = new Employee("Piotr" , "Kowalski",18);
        /*pracownik1.name = "Piotr";
        pracownik1.surname = "Kowalski";
        pracownik1.age = 18;*/

        Employee pracownik2 = new Employee("Piotr", "Zenon", 21);
        /*pracownik2.name = "Piotr";
        pracownik2.surname = "Zenon";
        pracownik2.age = 21;*/

        Employee pracownik3 = new Employee("Tomasz", "Kowalski", 22);
        /*pracownik3.name = "Tomasz";
        pracownik3.surname = "Kowalski";
        pracownik3.age = 22;*/

        pracownik1.printInfo();
        pracownik2.printInfo();
        pracownik3.printInfo();
    }
}
