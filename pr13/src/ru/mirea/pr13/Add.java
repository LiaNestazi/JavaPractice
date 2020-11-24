package ru.mirea.pr13;

public class Add extends BinaryOperation implements IEquation {
    private double result;
    IEquation first;
    IEquation second;
    public Add(IEquation first, IEquation second){
        this.first=first;
        this.second=second;
    }
    public double evaluate(){
        return result;
    }
    public void set(double value){
        result=value;
    }
    public double evaluate(double value){
        if (first.getClass()==Variable.class){
            first.set(value);
        }
        else if (first.getClass()!=Const.class){
            first.evaluate(value);
        }
        if (second.getClass()==Variable.class){
            second.set(value);
        }
        else if (second.getClass()!=Const.class){
            second.evaluate(value);
        }
        result=first.evaluate()+second.evaluate();
        return result;
    }
}
