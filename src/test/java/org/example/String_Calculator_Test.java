package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class String_Calculator_Test {

    String_Calculator calc=new String_Calculator();
    @Test
    public void testEmptyString(){
        assertEquals(0,calc.add(""));
    }
}
