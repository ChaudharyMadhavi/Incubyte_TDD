package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class String_Calculator_Test {

    String_Calculator calc=new String_Calculator();
    @Test
    public void testEmptyString(){
        assertEquals(0,calc.add(""));
    }

    @Test
    public void testSingleNumber() {
        assertEquals(101, calc.add("101"));
    }

    @Test
    public void testTwoNumbers() {
        assertEquals(302, calc.add("100,202"));
    }

    @Test
    public void testMultipleNumbers() {
        assertEquals(1000000, calc.add("100000,200000,300000,400000"));
    }

    @Test
    public void testNewlineAsDelimiter() {
        assertEquals(303, calc.add("100\n200,3"));
    }
    @Test
    public void testCustomDelimiter() {
        assertEquals(301, calc.add("//;\n100;201"));
    }
}
