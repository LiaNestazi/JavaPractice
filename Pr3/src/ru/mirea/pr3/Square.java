package ru.mirea.pr3;

public class Square extends Rectangle {
    public Square(){
        width=1.0;
        length=1.0;
    }
    public Square(double side){
        this.width=side;
        this.length=side;
    }
    public Square(double side,String color,boolean filled){
        this.width=side;
        this.length=side;
        this.color=color;
        this.filled=filled;
    }
    public double getSide(){
        return width;
    }
    public void setSide(double side){
        this.width=side;
        this.length=side;
    }
    public void setWidth(double side){
        this.width=side;
    }
    public void setLength(double side){
        this.length=side;
    }
    public String toString(){
        return "Color:"+this.color+" Filled:"+this.filled+" Side:"+this.width;
    }
}
