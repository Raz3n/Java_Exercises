import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterBottle;
    @Before
    public void before(){
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void getVolume(){
        assertEquals(100,waterBottle.getVolume(), 0.001);
    }

    @Test
    public void drink(){
        waterBottle.drink();
        waterBottle.drink();
        assertEquals(80,waterBottle.getVolume(),0.001);
    }

    @Test
    public void empty(){
        waterBottle.empty();
        assertEquals(0,waterBottle.getVolume(),0.001);
    }

    @Test
    public void fill(){
        waterBottle.empty();
        waterBottle.fill();
        assertEquals(100,waterBottle.getVolume(),0.001);
    }
}
