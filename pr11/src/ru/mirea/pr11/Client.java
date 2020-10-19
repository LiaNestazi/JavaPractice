package ru.mirea.pr11;

public class Client {
    public Chair chair;

    public void sit(){
        System.out.println("You sat down");
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
