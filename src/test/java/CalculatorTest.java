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
    @Test
    public void testSquareRootFunction()
    {
        assertEquals("Verifying the sqrt function for True Positive: ",13.0,cc.sqrRoot(169));
        assertNotEquals("Verifying the sqrt function for False Positive: ",22,cc.sqrRoot(13));
    }
    @Test
    public void testFactorialFunction()
    {
        assertEquals("Verifying the Factorial function for True Positive: ",120,cc.fact(5));
        assertNotEquals("Verifying the factorial function for False Positive: ",785,cc.fact(10));
    }
    @Test
    public void testNaturalLogarithmFunction()
    {
        assertEquals("Verifying the Natural Logarithm function for True Positive: ",4.204692663411985,cc.natLog(67));
        assertNotEquals("Verifying the Natural Logarithm function for False Positive: ",5,cc.natLog(13));
    }
    @Test
    public void testPowerFunction()
    {
        assertEquals("Verifying the Power function for True Positive: ",32,cc.pow(2,5));
        assertNotEquals("Verifying the Power function for False Positive: ",62,cc.pow(10,5));
    }

}
