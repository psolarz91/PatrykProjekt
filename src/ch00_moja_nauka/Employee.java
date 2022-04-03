package ch00_moja_nauka;

public class Employee {

    public Employee(String nameToSet, String surnameToSet, int ageToSet){
        name = nameToSet;
        surname = surnameToSet;
        age = ageToSet;
    }
    public String name;
    public String surname;
    public int age;

    public void printInfo() {
        System.out.println("Moje imię to: " + name + ", Moje nazwisko to: " + surname + ", Mój wiek to: " + age);
    }
}
