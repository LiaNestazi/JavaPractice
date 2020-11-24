package ru.mirea.pr13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double x=scan.nextDouble();
        Variable var=new Variable("x");
        double res=new Add(
                new Subtract(
                        new Multiply(var,var),
                        new Multiply(new Const(2),var)),
                new Const(1)).evaluate(x);
        System.out.println(res);
    }
}
