import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before(){
        printer = new Printer(20, 20);
    }

    @Test
    public void getSheets(){
        assertEquals(20, printer.getSheets());
    }

    @Test
    public void willPrintIfPaperAvailable(){
        printer.print(5, 4);
        assertEquals(0, printer.getSheets());
    }

    @Test
    public void wontPrintIfPaperUnavailable(){
        printer.print(5, 5);
        assertEquals(20, printer.getSheets());
    }

    @Test
    public void getToner(){
        assertEquals(20, printer.getToner());
    }

    @Test
    public void willPrintIfTonerAvailable(){
        printer.print(5, 4);
        assertEquals(0, printer.getToner());
    }

    @Test
    public void wontPrintIfTonerUnavailable(){
        printer.print(5, 5);
        assertEquals(20, printer.getSheets());
    }


//    @Test
//    public void willPrintIfPaperAvailable2(){
//        printer.print(4, 4);
//        assertEquals(4, printer.getSheets());
//    }
}
