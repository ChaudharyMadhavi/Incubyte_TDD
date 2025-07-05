package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    public void testNegativeNumber() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            calc.add("1,-2");
        });
        assertTrue(ex.getMessage().contains("-2"));
    }

    @Test
    public void testMultipleNegatives() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            calc.add("-19,-20,3");
        });
        assertTrue(ex.getMessage().contains("-19"));
        assertTrue(ex.getMessage().contains("-20"));
    }

    @Test
    public void testCustomDelimiterAnyLength() {
        assertEquals(51, calc.add("//[***]\n10***40***1"));
    }
    @Test
    public void testTrailingDelimiter() {
        assertEquals(6, calc.add("1,2,3,"));
    }

    @Test
    public void testLargeInput() {
        StringBuilder input = new StringBuilder();
        for (int i = 1; i <= 1000; i++) {
            input.append(i).append(",");
        }

        input.setLength(input.length() - 1);

        assertEquals(500500, calc.add(input.toString()));
    }
    @Test
    public void testWhitespaceAroundNumbers() {
        assertEquals(6, calc.add(" 1 , 2 , 3 ,,"));
    }

    @Test
    public void testNegativeNumbersWithMultipleDelimiters() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            calc.add("//[*][%]\n-100*222%-30");
        });
        assertTrue(ex.getMessage().contains("-100"));
        assertTrue(ex.getMessage().contains("-30"));
    }


}
