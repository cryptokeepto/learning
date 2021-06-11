package com.mycompany.app;

public class StringOperand extends Operand{
    public StringOperand(int value) {
        super.value = value;
    }
    public String toString() {
        String[] numericString = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        return numericString[this.value-1];
    }
}
