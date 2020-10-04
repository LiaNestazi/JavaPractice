package ru.mirea.pr2.author;

import ru.mirea.pr2.author.Author;

public class TestAuthor {
    public static void main(String[] args){
        Author a1 = new Author("Mike","mike2000@gmail.com",'M');
        Author a2 = new Author("Elly","el2305@gmail.com",'F');
        System.out.println("Second author name:"+a2.getName());
        System.out.println("First author name:"+a1.getName()+" email:"+a1.getEmail());
        System.out.println(a1);
        System.out.println(a2);
        a1.setEmail("wmsh0309@gmail.com");
        System.out.println(a1);
    }
}
