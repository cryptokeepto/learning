package com.mycompany.app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ME007 on 5/6/2017 AD.
 */
public class IntegerOperandTest {
    @Test
    public void operandShouldBe1() {
        IntegerOperand operand = new IntegerOperand(1);
        assertEquals("1", operand.toString());
    }
    @Test
    public void operandShouldBe5() {
        IntegerOperand operand = new IntegerOperand(5);
        assertEquals("5", operand.toString());
    }
    @Test
    public void operandShouldBe9() {
        IntegerOperand operand = new IntegerOperand(9);
        assertEquals("9", operand.toString());
    }
}
