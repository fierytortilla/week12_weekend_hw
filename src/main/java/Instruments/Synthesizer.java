package Instruments;
import Behaviors.IPlay;
import Behaviors.ISell;
import java.util.ArrayList;

public class Synthesizer extends Instrument implements IPlay, ISell {
    private boolean monoPhonic;
    private boolean polyPhonic;
    private ArrayList<Material> materials;


    public Synthesizer(boolean monoPhonic, boolean polyPhonic, String color, String brand, InstrumentType instrumentType, Material material, Material secondaryMaterial, double buyingPrice, double sellingPrice) {
        super(color, brand, instrumentType, buyingPrice, sellingPrice);
        this.monoPhonic = monoPhonic;
        this.polyPhonic = polyPhonic;
        this.materials = new ArrayList<Material>();
        this.materials.add(material);
        this.materials.add(secondaryMaterial);
    }

    public boolean isMonoPhonic() {
        return monoPhonic;
    }

    public boolean isPolyPhonic() {
        return polyPhonic;
    }

    public String play() {
        return "OPENING MELODY FROM FINAL COUNTDOWN";
    }

    public double calculateMarkup() {
        return getSellingPrice()-getBuyingPrice();
    }

    public ArrayList<Material> getMaterial() {
        return this.materials;
    }
}
