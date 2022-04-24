package ch00_moja_nauka.ch00_moja_nauka_2404;

public class Eagle extends Bird {
    int clawsLegth;

    public Eagle(String name, int wingspan, int clawsLegth) {
        super(name, wingspan, true);
        this.clawsLegth = clawsLegth;
    }

}
