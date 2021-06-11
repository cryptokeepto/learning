package com.mycompany.app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ME007 on 5/6/2017 AD.
 */
public class StringOperatorTest {
    @Test
    public void operandShouldBeOne() {
        StringOperand one = new StringOperand(1);
        assertEquals("One", one.toString());
    }
    @Test
    public void operandShouldBeFive() {
        StringOperand one = new StringOperand(5);
        assertEquals("Five", one.toString());
    }
    @Test
    public void operandShouldBeNine() {
        StringOperand one = new StringOperand(9);
        assertEquals("Nine", one.toString());
    }
}
