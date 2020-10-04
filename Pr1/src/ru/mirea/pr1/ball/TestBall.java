package ru.mirea.pr1.ball;

import ru.mirea.pr1.ball.Ball;

public class TestBall {
    public static void main(String[] args){
        Ball b1 = new Ball();
        Ball b2 = new Ball(3.0);
        Ball b3 = new Ball(2.0,"red");
        b2.setColor("yellow");
        b1.setDiameter(5.0);
        System.out.println(b1);
        System.out.println("Diameter="+b2.getDiameter()+" Color="+b2.getColor());
        System.out.println(b3);
    }
}
