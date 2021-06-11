package com.mycompany.app;

public class IntegerOperand extends Operand{
    public IntegerOperand(int value) {
        super.value = value;

    }
    public String toString() {
        return String.valueOf(this.value);
    }
}
