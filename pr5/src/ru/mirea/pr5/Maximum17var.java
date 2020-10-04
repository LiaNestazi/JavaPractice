package ru.mirea.pr5;

import java.util.Scanner;

public class Maximum17var {
    private static Scanner scan = new Scanner(System.in);
    private static int x,max=0;
    public static int maximum(){
        x=scan.nextInt();
        if (x==0)
            return max;
        else {
            if (x>max)
                max=x;
            return maximum();
        }
    }
    public static void main(String[] args){
        System.out.println(maximum());
    }
}
