package com.mycompany.app;

public class Operator {
    private int value;
    public Operator(int value) {
        this.value = value;
    }

    public String toString() {
        if(this.value == 1)
            return "+";
        if(this.value ==2 )
            return "*";
        return "-";
    }
}
