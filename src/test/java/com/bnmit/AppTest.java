package com.bnmit;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    App calc;

    @Before
    public void setUp() {
        calc = new App();
    }

    @Test
    public void testAdd() {
        assertEquals(5, calc.add(2, 3));
        assertEquals(0, calc.add(-2, 2));
    }

    @Test
    public void testSub() {
        assertEquals(1, calc.sub(3, 2));
        assertEquals(-4, calc.sub(-2, 2));
    }

    @Test
    public void testMul() {
        assertEquals(6, calc.mul(2, 3));
        assertEquals(0, calc.mul(5, 0));
    }

    @Test
    public void testDiv() {
        assertEquals(2, calc.div(6, 3));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivByZero() {
        calc.div(5, 0);
    }
}
