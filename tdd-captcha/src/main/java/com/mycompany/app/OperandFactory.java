package com.mycompany.app;

public class OperandFactory {
    public static Operand createLeft(int pattern, int value) {
        if(pattern == 2)
            return new StringOperand(value);
        return new IntegerOperand(value);
    }

    public static Operand createRight(int pattern, int value) {
        if (pattern == 1) {
            return new StringOperand(value);
        }
        return new IntegerOperand(value);
    }
}