package Instruments;
import Behaviors.IPlay;

public class BaritoneClarinet extends Instrument implements IPlay {
    private int numberValves;
    private Material material;

    public BaritoneClarinet(int numberValves, String color, String brand,
                            InstrumentType instrumentType, Material material,
                            double buyingPrice, double sellingPrice) {
        super(color, brand, instrumentType, buyingPrice, sellingPrice);
        this.numberValves= numberValves;
        this.material= material;
    }

    public int getNumberValves() {
        return numberValves;
    }

    public String play() {
        return "THEME FROM SCHINDLER'S LIST";
    }

    public Material getMaterial() {
        return this.material;
    }
}
