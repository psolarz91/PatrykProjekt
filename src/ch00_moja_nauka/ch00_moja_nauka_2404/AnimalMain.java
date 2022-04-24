package ch00_moja_nauka.ch00_moja_nauka_2404;

public class AnimalMain {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Burek", 120);
        Bird bird1 = new Bird("Wróbel", 120, true);
        Eagle eagle1 = new Eagle("Czarek", 155, 12);
        Pinquin pinquin1 = new Pinquin("Natan", 22, 34);

        dog1.bark();
        dog1.introduce();
        dog1.eat();
        bird1.introduce();
        bird1.fly();
        bird1.eat();
        eagle1.introduce();
        eagle1.fly();
        eagle1.eat();
        System.out.println("ClawsLength:" + eagle1.clawsLegth);
        pinquin1.introduce();
        pinquin1.fly();
        pinquin1.eat();
        System.out.println("Swimming speed: " + pinquin1.swimmingSpead);

    }
}
