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
        content.add(element);
    }

    @Override
    public String toString() {
        return "Content:"+content.toString();
    }
}
