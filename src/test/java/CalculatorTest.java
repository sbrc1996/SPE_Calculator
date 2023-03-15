import org.example.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class CalculatorTest
{
    Calculator cc = new Calculator();
    @Test
    public void testAddFunction()
    {
        assertEquals("Verifying the add function for True Positive: ",26,cc.add(13,13));
        assertNotEquals("Verifying the add function for False Positive: ",22,cc.add(13,13));
    }
    @Test
    public void testSubFunction()
    {
        assertEquals("Verifying the add function for True Positive: ",0,cc.sub(13,13));
        assertNotEquals("Verifying the add function for False Positive: ",22,cc.sub(13,13));
    }
    @Test
    public void testMulFunction()
    {
        assertEquals("Verifying the add function for True Positive: ",169,cc.mul(13,13));
        assertNotEquals("Verifying the add function for False Positive: ",22,cc.mul(13,13));
    }

}
