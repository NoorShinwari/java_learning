package com.company;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilitiesTest {
    private static Utilities util;
    @BeforeAll
    public static void setup() {
        util = new Utilities();
    }

    @Test
    void everyNthChar() {

        char[] output = util.everyNthChar(new char[] {'h','e','l','l','o'},2);
        assertArrayEquals(new char[]{'e','l'}, output);
    }

    @Test
    public void converter_arithmeticException() throws Exception {

        assertThrows(ArithmeticException.class, () -> util.converter(10, 0));
    }

    @Test
    void removedPairs() {

        assertEquals("ABCDEF", util.removedPairs("AABCDDEFF"));
        assertEquals("ABCABDEF", util.removedPairs("ABCCABDEFF"));
    }

    @Test
    void converter() {
        assertEquals(300, util.converter(10,5));
    }

    @Test
    void nullIfOddLength() {
     assertNull(util.nullIfOddLength("odd"));
     assertNotNull(util.nullIfOddLength("even"));
    }
}