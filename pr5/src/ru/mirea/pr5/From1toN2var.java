package ru.mirea.pr5;

import java.util.Scanner;

public class From1toN2var {
    private static int cur=1;
    public static void rec(int n){
        if (cur>n)
            return;
        else {
            System.out.print(cur+" ");
            cur++;
            rec(n);
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        rec(n);
    }
}
