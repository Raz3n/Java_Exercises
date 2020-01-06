import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;
    @Before
    public void before(){
        calculator = new Calculator(25.0, 5.0);
    }

    @Test
    public void add(){
        assertEquals(30.0, calculator.add(), 0.01);
    }

    @Test
    public void subtract(){
        assertEquals(20.0, calculator.subtract(), 0.01 );
    }

    @Test
    public void multiply(){
        assertEquals(125, calculator.multiply(), 0.01);
    }

    @Test
    public void divide(){
        assertEquals(5, calculator.divide(), 0.01);
    }

}
