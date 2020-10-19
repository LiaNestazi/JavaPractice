package ru.mirea.pr8;

import java.util.concurrent.ConcurrentLinkedQueue;

public class BoundedWaitList<E> extends WaitList<E> {
    private int capacity;
    public BoundedWaitList(int capacity){
        content=new ConcurrentLinkedQueue<E>();
        this.capacity=capacity;
    }
    public int getCapacity() {
        return capacity;
    }
    public void add(E element){
        if (content.size()<capacity) {
            content.add(element);
        }else System.out.println("No space for the new element");
    }

    @Override
    public String toString() {
        return "Content:"+content.toString();
    }
}
