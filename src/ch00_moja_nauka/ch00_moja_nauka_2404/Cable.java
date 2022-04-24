package ch00_moja_nauka.ch00_moja_nauka_2404;

public class Cable {
    private String type;

    public Cable(String type) {
        this.type = type;
    }

    public void print(){
        System.out.println("Jest to kabel typu: " + type);
    }
}
