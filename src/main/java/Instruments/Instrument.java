package Instruments;

public abstract class Instrument {
    private String color;
    private String brand;
    private InstrumentType instrumentType;
    private double buyingPrice;
    private double sellingPrice;

    public Instrument(String color,
                      String brand,
                      InstrumentType instrumentType,
                      double buyingPrice,
                      double sellingPrice) {
        this.color = color;
        this.brand = brand;
        this.instrumentType = instrumentType;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public abstract Object getMaterial();

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }
}
