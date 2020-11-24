package ru.mirea.pr13;

public class Variable implements IEquation {
    private String variable;
    private double varValue;
    public Variable(String variable){

        this.variable=variable;
    }
    public void setVariable(String variable) {

        this.variable = variable;
    }
    public void set(double value){
        varValue=value;
    }
    public double evaluate() {
        return varValue;
    }
    public double evaluate(double value){
        varValue=value;
        return varValue;
    }
}
