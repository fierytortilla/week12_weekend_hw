package Instruments;

public abstract class Instrument {
    private String color;
    private String brand;
    private InstrumentType instrumentType;
    private double buyingPrice;
    private double sellingPrice;
    private String tuning;

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
        this.tuning = "standard";
    }

    public void changeTuning(String tuning){
        this.tuning= tuning;
    }

    public String getTuning(){
        return tuning;
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
