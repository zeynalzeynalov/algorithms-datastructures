package com.zeynal.app;

import org.junit.Assert;
import org.junit.Test;

public class BalancedBracesSolutionTest {

    @Test
    public void whenShortBalancedReturnTrue() {
        String input = "()";
        boolean actual = BalancedBracesSolution.isBalanced(input);

        Assert.assertEquals(true, actual);
    }

    @Test
    public void whenLongBalancedReturnTrue() {
        String input = "(){}[](())[{{[]}}]";
        boolean actual = BalancedBracesSolution.isBalanced(input);

        Assert.assertEquals(true, actual);
    }

    @Test
    public void whenShortUnBalancedReturnFalse() {
        String input = "(]";
        boolean actual = BalancedBracesSolution.isBalanced(input);

        Assert.assertEquals(false, actual);
    }

    @Test
    public void whenLongUnBalancedReturnFalse() {
        String input = "(){}[](())[{{[]}}][";
        boolean actual = BalancedBracesSolution.isBalanced(input);

        Assert.assertEquals(false, actual);
    }
}