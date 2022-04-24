package ch00_moja_nauka.ch00_moja_nauka_2404;

import java.util.ArrayList;
import java.util.List;

public class CableMain {
    public static void main(String[] args) {
        List<Cable> cables = new ArrayList<>();

        Cable usb = new Cable("usb");
        Cable vga = new Cable("vga");
        Cable hdmi = new Cable("hdmi");
        Cable rda = new Cable("rda");
        Cable jack = new Cable("jack");

        cables.add(usb);
        cables.add(vga);
        cables.add(hdmi);
        cables.add(rda);
        cables.add(jack);

        for (Cable cable : cables) {
            cable.print();

        }

    }
}
