import Behaviors.ISell;
import Instruments.*;
import Shop.Shop;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class ShopTest {
    private Shop shop;
    private Tambourine tambourine;
    private SheetMusic sheetMusic;
    private Guitar guitar;
    private BaritoneClarinet baritoneClarinet;

    @Before
    public void before(){
        shop= new Shop("Cool Music Shop", 10000);
        tambourine= new Tambourine(30,40);
        sheetMusic= new SheetMusic("All Star","Smash Mouth", 5, 10);
        guitar= new Guitar(7, "EMG", "black","ESP Ltd.", InstrumentType.ELECTRIC, Material.WOOD, Material.COMPOSITE, 500,800);
        baritoneClarinet = new BaritoneClarinet(8, "blue","Stradivari",InstrumentType.WOODWIND, Material.WOOD, 8000,10000);
    }

    @Test
    public void canGetStock(){
        assertEquals(10000, shop.getTill(), 0.1);
        shop.addToStock(tambourine);
        shop.addToStock(sheetMusic);
        shop.addToStock(guitar);
        ArrayList<ISell> instruments= new ArrayList<ISell>();
        instruments.add(tambourine);
        instruments.add(sheetMusic);
        instruments.add(guitar);
        assertEquals(300, guitar.calculateMarkup(), 0.1);
        assertEquals(9465, shop.getTill(), 0.1);
        assertEquals(instruments, shop.getStock());
        assertFalse(baritoneClarinet instanceof ISell);
    }

    @Test
    public void canSellInstruments(){
        shop.addToStock(tambourine);
        shop.addToStock(sheetMusic);
        shop.addToStock(guitar);
        shop.sellInstrument(tambourine);
        assertEquals(9505, shop.getTill(), 0.1);
    }
}
