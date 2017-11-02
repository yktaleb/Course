package by.training;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArithmeticTest {
    @Test
    public void add() throws Exception {
        Arithmetic arithmetic = new Arithmetic();
        double result = arithmetic.add(5, 8);
        if(result != 13) fail("Method don`t work right");
    }

    @Test
    public void deduct() throws Exception {
        Arithmetic arithmetic = new Arithmetic();
        double result = arithmetic.deduct(5, 8);
        assertTrue(result == -3);
    }

    @Test
    public void div() throws Exception {
        Arithmetic arithmetic = new Arithmetic();
        double result = arithmetic.div(20, 4);
        assertTrue("Method don`t work right", result == 5);
    }

    @Test
    public void mult() throws Exception {
        Arithmetic arithmetic = new Arithmetic();
        double result = arithmetic.mult(2, 8);
        assertEquals(result, 16, 0.001);
    }

}