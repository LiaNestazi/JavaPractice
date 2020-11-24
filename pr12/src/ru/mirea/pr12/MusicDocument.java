package ru.mirea.pr12;

public class MusicDocument implements IDocument{
    String path;
    public MusicDocument(String path){
        this.path=path;
    }
    public String getPath() {
        return path;
    }

    public void save() {
        System.out.println("Music document saved");
    }
}
