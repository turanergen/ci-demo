package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test void testAddition()    { assertEquals(5, App.add(2, 3)); }
    @Test void testSubtraction() { assertEquals(1, App.subtract(4, 3)); }
    @Test void testMultiply()    { assertEquals(6, App.multiply(2, 3)); }
    @Test void testDivide()      { assertEquals(2.5, App.divide(5, 2)); }
    @Test void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> App.divide(5, 0));
    }
}