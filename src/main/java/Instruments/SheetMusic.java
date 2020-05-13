package Instruments;
import Behaviors.ISell;

public class SheetMusic implements ISell {
    private String musicTitle;
    private String artistName;
    private InstrumentType instrumentType;
    private double buyingPrice;
    private double sellingPrice;

    public SheetMusic(String musicTitle, String artistName, double buyingPrice, double sellingPrice) {
        this.musicTitle = musicTitle;
        this.artistName = artistName;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.instrumentType= InstrumentType.ACCESSORIES;
    }

    public String getMusicTitle() {
        return musicTitle;
    }

    public String getArtistName() {
        return artistName;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public double calculateMarkup() {
        return this.sellingPrice-this.buyingPrice;
    }

    public double getBuyingPrice() {
        return this.buyingPrice;
    }

    public double getSellingPrice() {
        return this.sellingPrice;
    }
}
