package com.mycompany.app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ME007 on 5/6/2017 AD.
 */
public class OperatorTest {
    @Test
    public void operatorShouldBeMinus() {
        Operator operator = new Operator(3);
        assertEquals("-", operator.toString());
    }
    @Test
    public void operatorShouldBeMultiply() {
        Operator operator = new Operator(2);
        assertEquals("*", operator.toString());
    }
    @Test
    public void operatorShouldBePlus() {
        Operator operator = new Operator(1);
        assertEquals("+", operator.toString());
    }
}
