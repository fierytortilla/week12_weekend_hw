package Instruments;
import Behaviors.ISell;

public class Tambourine implements ISell {
    private InstrumentType instrumentType;
    private double buyingPrice;
    private double sellingPrice;

    public Tambourine(double buyingPrice, double sellingPrice) {
        this.instrumentType = InstrumentType.PERCUSSION;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public double calculateMarkup() {
        return this.sellingPrice- this.buyingPrice;
    }

    public double getBuyingPrice() {
        return this.buyingPrice;
    }

    public double getSellingPrice() {
        return this.sellingPrice;
    }
}
