package ru.mirea.pr11;

public class VictorianChair implements Chair{
    private int age;

    public VictorianChair(){

    }

    public int getAge(){
        return this.age;
    }

    public VictorianChair(int age){
        this.age=age;
    }
}
