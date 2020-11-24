package ru.mirea.pr12;

public class CreateImageDocument implements ICreateDocument{
    public ImageDocument CreateNew(String path){
        return new ImageDocument(path);
    }
    public ImageDocument CreateOpen(String path) { return new ImageDocument(path); }
}
