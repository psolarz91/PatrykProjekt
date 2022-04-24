package ch00_moja_nauka.ch00_moja_nauka_2404;

    public class Dog extends Animal {
        int height;

            public Dog(String name, int height) {
                super(name);
                this.height = height;
            }

    public void bark() {
        System.out.println("\nwoof woof");
    }
    public void introduce() {
        System.out.println("I'm dog, my name is " + name + " and i have " + height + " height");
    }
}
