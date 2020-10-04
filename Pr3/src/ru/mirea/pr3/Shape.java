package ru.mirea.pr3;

public abstract class Shape {
    protected String color;
    protected boolean filled;
    public Shape(){
        color="white";
        filled=false;
    }
    public Shape(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled=filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public String toString(){
        return "Color:"+this.color+" Filled:"+this.filled;
    }
}
