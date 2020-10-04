package ru.mirea.pr5;

import java.util.Scanner;

public class FromAtoB3var {
    public static void rec(int a, int b){
        if (a==b) {
            System.out.print(b);
            return;
        }
        if (a<b){
            System.out.print(a+" ");
            rec(a+1,b);
        }
        else {
            System.out.print(a+" ");
            rec(a-1,b);
        }
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        rec(a,b);
    }
}
