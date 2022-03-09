package com.example.tp2tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @BeforeEach
    public void before(){
        System.out.println(6%99);
    }
    @Test
    public void divisible() {
        Calculator cal = new Calculator();
        int a,b,c;
        a=6;b=3;c=99;
        assertEquals(Integer.toString(b),cal.divisible(a,b,c));
        a=6;b=99;c=3;
        assertEquals(Integer.toString(c),cal.divisible(a,b,c));
        a=6;b=2;c=3;
        assertEquals(Integer.toString(b+c),cal.divisible(a,b,c));
        a=1;b=2;c=3;
        assertEquals("test",cal.divisible(a,b,c));
    }
}