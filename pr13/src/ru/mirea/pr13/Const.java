package ru.mirea.pr13;

public class Const implements IEquation {
    private double value;
    public Const(int value){
        this.value=value;
    }
    public void set(double value){
        this.value=value;
    }
    public double evaluate() {
        return value;
    }
    public double evaluate(double value){
        this.value=value;
        return value;
    }

}
