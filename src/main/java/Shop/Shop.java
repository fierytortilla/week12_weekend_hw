package Shop;
import Behaviors.ISell;
import java.util.ArrayList;

public class Shop {
    private String shopName;
    private double till;
    private ArrayList<ISell> stock;

    public Shop(String shopName, double till) {
        this.shopName= shopName;
        this.till= till;
        this.stock = new ArrayList<ISell>();
    }

    public String getShopName(){
        return this.shopName;
    }

    public double getTill() {
        return till;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addToStock(ISell instrument){
        this.stock.add(instrument);
        this.till-= instrument.getBuyingPrice();
    }

    public ISell sellInstrument(ISell instrument){
        this.till+=instrument.getSellingPrice();
        return this.stock.get(this.stock.indexOf(instrument));
    }


}
