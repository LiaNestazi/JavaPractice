package ru.mirea.pr12;


public class TextDocument implements IDocument{
    private String path;
    public TextDocument(String path){
        this.path=path;
    }

    public String getPath() {
        return path;
    }

    public void save() {}
}
