package ru.mirea.pr8;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class UnfairWaitList<E> extends WaitList<E> {
    public UnfairWaitList(){
        content=new ConcurrentLinkedQueue<E>();
    }
    public void remove(E element){
        content.remove(element);
    }
    public void moveToBack(E element){
        for(E el:content){
            if (el.equals(element)) {
                content.remove(element);
                content.offer(element);
                break;
            }
        }
    }
}
