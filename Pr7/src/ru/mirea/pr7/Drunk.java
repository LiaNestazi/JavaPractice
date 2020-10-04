package ru.mirea.pr7;

import java.util.Scanner;
import java.util.Stack;

public class Drunk {
    public static class Card{
        private int value;
        public Card(int value){
            this.value=value;
        }
        public void setValue(int value) {
            this.value = value;
        }
        public int getValue() {
            return value;
        }
    }
    Stack<Card> first=new Stack<>();
    Stack<Card> second=new Stack<>();
    public void givefirst(){
        Stack<Card> temp=new Stack<>();
        temp.push(second.peek());
        second.pop();
        temp.push(first.peek());
        first.pop();
        Stack<Card> temp2=new Stack<>();
        while(!first.empty()){
            temp2.push(first.peek());
            first.pop();
        }
        while(!temp2.empty()){
            temp.push(temp2.peek());
            temp2.pop();
        }
        first=temp;
    }
    public void givesecond(){
        Stack<Card> temp=new Stack<>();
        temp.push(second.peek());
        second.pop();
        temp.push(first.peek());
        first.pop();
        Stack<Card> temp2=new Stack<>();
        while(!second.empty()){
            temp2.push(second.peek());
            second.pop();
        }
        while(!temp2.empty()){
            temp.push(temp2.peek());
            temp2.pop();
        }
        second=temp;
    }
    public void start(){
        int count=0;
        while(count<=106&&!first.empty()&&!second.empty()) {
            if (first.peek().value == 0 && second.peek().value == 9) {
                givefirst();
                count++;
            } else if (first.peek().value == 9 && second.peek().value == 0) {
                givesecond();
                count++;
            } else if (first.peek().value > second.peek().value) {
                givefirst();
                count++;
            } else if (first.peek().value<second.peek().value){
                givesecond();
                count++;
            }
            else
                count++;
        }
        if (count>106)
            System.out.print("botva");
        else if (first.empty())
            System.out.print("second "+count);
        else if (second.empty())
            System.out.print("first "+count);
    }
    public static void main(String[] args) {
        int n=5;
        Drunk game=new Drunk();
        Scanner scan=new Scanner(System.in);
        int[] temp=new int[n];
        for (int i=0;i<n;i++){
            temp[i]=scan.nextInt();
        }
        for (int i=n-1;i>=0;i--){
            Card card=new Card(temp[i]);
            game.first.push(card);
        }
        for (int i=0;i<n;i++){
            temp[i]=scan.nextInt();
        }
        for (int i=n-1;i>=0;i--){
            Card card=new Card(temp[i]);
            game.second.push(card);
        }
        game.start();
    }
}
