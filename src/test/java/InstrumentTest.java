import Behaviors.IPlay;
import Instruments.*;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class InstrumentTest {
    private Guitar guitar;
    private Synthesizer minimoog;
    private BaritoneClarinet baritoneClarinet;

    @Before
    public void before(){
        guitar= new Guitar(7, "EMG", "black","ESP Ltd.", InstrumentType.ELECTRIC, Material.WOOD, Material.COMPOSITE,500,800);
        minimoog= new Synthesizer(true,false,"brown","Moog",InstrumentType.ELECTRIC,Material.COMPOSITE, Material.METAL,400,600);
        baritoneClarinet = new BaritoneClarinet(8, "blue","Stradivari",InstrumentType.WOODWIND, Material.WOOD, 8000,10000);
    }

    @Test
    public void hasMultipleForms(){
        assertEquals("black", guitar.getColor());
        assertEquals(InstrumentType.ELECTRIC, minimoog.getInstrumentType());
        assertEquals(7, guitar.getNumberStrings());
        assertEquals(true, minimoog.isMonoPhonic());
        assertEquals(8, baritoneClarinet.getNumberValves());
        ArrayList<Material> materials = new ArrayList<Material>();
        materials.add(Material.WOOD);
        materials.add(Material.COMPOSITE);
        assertEquals(materials, guitar.getMaterial());
        assertEquals(Material.WOOD, baritoneClarinet.getMaterial());
    }

    @Test
    public void hasInterfaceIPlay(){
        ArrayList<IPlay> instruments = new ArrayList<IPlay>();
        instruments.add(guitar);
        instruments.add(minimoog);
        instruments.add(baritoneClarinet);
        assertEquals("WHEEDELY WHEEDELY WHEEDELY", instruments.get(0).play());
        assertEquals("OPENING MELODY FROM FINAL COUNTDOWN", instruments.get(1).play());
        assertEquals("THEME FROM SCHINDLER'S LIST", instruments.get(2).play());
    }



}
