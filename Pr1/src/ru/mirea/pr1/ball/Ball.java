package ru.mirea.pr1.ball;

public class Ball {
    private double diameter;
    private String color;
    public Ball(){
        diameter=1.0;
        color="purple";
    }
    public Ball(double d){
        diameter=d;
        color="purple";
    }
    public Ball(double d, String c){
        diameter=d;
        color=c;
    }
    public void setDiameter(double diameter){
        this.diameter=diameter;
    }
    public void setColor(String color){
        this.color=color;
    }
    public double getDiameter(){
        return diameter;
    }
    public String getColor(){
        return color;
    }
    public String toString(){
        return "Color:"+this.color+" Diameter:"+this.diameter;
    }
}
