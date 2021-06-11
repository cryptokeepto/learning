package com.mycompany.app;

public class Captcha {
    private Operand leftOperand;
    private Operand rightOperand;
    private Operator operator;

    @Override
    public String toString() {
        return "Captcha{" +
                "leftOperand=" + leftOperand +
                ", rightOperand=" + rightOperand +
                ", operator=" + operator +
                '}';
    }

    public Captcha(int pattern, int leftOperand, int operator, int rightOperand) {
        this.leftOperand = OperandFactory.createLeft(pattern, leftOperand);
        this.rightOperand = OperandFactory.createRight(pattern, rightOperand);
        this.operator = new Operator(operator);
    }

    public Operand getLeft() {
        return this.leftOperand;
    }

    public Operand getRight() {
        return this.rightOperand;
    }
}
