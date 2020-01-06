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

}
