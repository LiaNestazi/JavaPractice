package ru.mirea.pr5;

import java.util.Scanner;

public class Triangle1var {
    private static int k=1;
    private static int count=0;
    public static void rec(int n){
        if (count>=n){
            return;
        }
        else {
            for (int i = 0; i < k; i++) {
                if (count>=n)
                    return;
                else
                    System.out.print(k + " ");
                count++;
            }
            k++;
            rec(n);
        }
    }
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        int n=scan.nextInt();
        rec(n);
    }
}
