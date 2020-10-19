package ru.mirea.pr8;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Класс списка ожидания со свойством <b>content</b>.
 * @author Анастасия Лиджигоряева
 * @version 1.0
 */
public class WaitList<E> implements IWaitList<E> {
    /**Поле содержание - связанная очередь*/
    protected ConcurrentLinkedQueue<E> content;

    /**
     * Конструктор - создание нового объекта
     * @see WaitList#WaitList()
     */
    public WaitList(){
        content=new ConcurrentLinkedQueue<E>();
    }

    /**
     * Конструктор - создание нового объекта с определенными значениями
     * @param c - коллекция
     * @see WaitList#WaitList(Collection)
     */
    public WaitList(Collection<E> c){
        content=new ConcurrentLinkedQueue<E>(c);
    }

    /**
     * Функция преобразования в строку
     * @return возвращает содержание поля {@link WaitList#content}
     */
    public String toString(){
        return "Content:"+content.toString();
    }

    /**
     * Функция добавления элемента в очередь
     * @param element - добавляемый элемент
     */
    public void add(E element) {
        content.add(element);
    }

    /**
     * Метод удаления первого элемента
     * @return возвращает флаг об удалении
     */
    public E remove() {
        return content.remove();
    }

    /**
     * Метод проверки содержания элемента в очереди
     * @param element - искомый элемент
     * @return возвращает флаг о нахождении элемента
     */
    public boolean contains(E element) {
        return content.contains(element);
    }

    /**
     * Метод проверки содержания коллекции
     * @param c - коллекция элементов
     * @return возвращает флаг о содержании коллекции
     */
    public boolean containsAll(Collection<E> c) {
        return content.containsAll(c);
    }

    /**
     * Метод проверки на пустоту очереди
     * @return возвращает 1, когда очередь пуста и 0, когда не пуста
     */
    public boolean isEmpty() {
        return content.isEmpty();
    }
}
