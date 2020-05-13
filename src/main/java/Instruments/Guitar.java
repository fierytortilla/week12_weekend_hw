package Instruments;
import Behaviors.IPlay;
import Behaviors.ISell;
import java.util.ArrayList;

public class Guitar extends Instrument implements IPlay, ISell {
    private int numberStrings;
    private String pickupType;
    private ArrayList<Material> materials;

    public Guitar(int numberStrings, String pickupType, String color,
                  String brand, InstrumentType instrumentType, Material material, Material secondaryMaterial, double buyingPrice, double sellingPrice) {
        super(color, brand, instrumentType, buyingPrice, sellingPrice);
        this.numberStrings = numberStrings;
        this.pickupType = pickupType;
        this.materials = new ArrayList<Material>();
        this.materials.add(material);
        this.materials.add(secondaryMaterial);
    }

    public ArrayList<Material> getMaterial() {
        return this.materials;
    }

    public int getNumberStrings() {
        return numberStrings;
    }

    public String getPickupType() {
        return pickupType;
    }

    public String play() {
        return "WHEEDELY WHEEDELY WHEEDELY";
    }

    public double calculateMarkup() {
        return this.getSellingPrice()-this.getBuyingPrice();
    }
}
