package com.zeynal.app;

import org.junit.Assert;
import org.junit.Test;

public class BalancedBracesSolutionTest {

    @Test
    public void whenShortBalancedReturnsTrue() {
        String input = "()";
        boolean actual = BalancedBracesSolution.isBalanced(input);

        Assert.assertTrue(actual);
    }

    @Test
    public void whenLongBalancedReturnsTrue() {
        String input = "(){}[](())[{{[]}}]";
        boolean actual = BalancedBracesSolution.isBalanced(input);

        Assert.assertTrue(actual);
    }

    @Test
    public void whenShortUnbalancedReturnsFalse() {
        String input = "(]";
        boolean actual = BalancedBracesSolution.isBalanced(input);

        Assert.assertFalse(actual);
    }

    @Test
    public void whenLongUnbalancedReturnsFalse() {
        String input = "(){}[](())[{{[]}}][";
        boolean actual = BalancedBracesSolution.isBalanced(input);

        Assert.assertFalse(actual);
    }
}