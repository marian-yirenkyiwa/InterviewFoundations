package io.turntabl.foundation;

import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedTest {
    Balanced underTest = new Balanced();

    @Test
    public void testIsBalancedMethod() {
        assertTrue(underTest.isBalanced("((()))"));
//        underTest.isBalanced("((()))");
    }

    @Test
    public void testIsNotBalanced(){
        assertFalse(underTest.isBalanced("((())"));
    }

    @Test
    public void testOpeningParenthesesGreaterThanClosingParentheses(){
        assertFalse(underTest.isBalanced("((()))))"));
    }
}