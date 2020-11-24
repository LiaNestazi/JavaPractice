package ru.mirea.pr12;

public class CreateTextDocument implements ICreateDocument  {
    public TextDocument CreateNew(String path){
        return new TextDocument(path);
    }
    public TextDocument CreateOpen(String path) { return new TextDocument(path); }
}
