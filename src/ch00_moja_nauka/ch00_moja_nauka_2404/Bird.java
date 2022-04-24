package ch00_moja_nauka.ch00_moja_nauka_2404;

public class Bird extends Animal {
    boolean canFly;
    int wingspan;

    public Bird(String name, int wingspan, boolean canFly) {
        super(name);
        this.wingspan = wingspan;
        this.canFly = canFly;
    }

    public void introduce(){
        System.out.println("I'm bird, my name is " + name + " and I have " + wingspan + " wingspan");
    }
    public void fly() {
        if (canFly) {
            System.out.println("I can fly");
        } else {
            System.out.println("I can not fly");
        }
    }
}
