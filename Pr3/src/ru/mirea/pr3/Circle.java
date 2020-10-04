package ru.mirea.pr3;

import org.w3c.dom.ls.LSOutput;

public class Circle extends Shape{
    protected double radius;
    public Circle(){
        radius=1.0;
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(double radius,String color,boolean filled){
        this.radius=radius;
        this.color=color;
        this.filled=filled;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    public String toString(){
        return "Color:"+this.color+" Filled:"+this.filled+" Radius:"+this.radius;
    }
}
