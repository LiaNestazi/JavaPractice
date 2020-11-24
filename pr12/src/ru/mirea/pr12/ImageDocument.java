package ru.mirea.pr12;

import java.awt.*;

public class ImageDocument implements IDocument {
    String path;
    public ImageDocument(String path){
        this.path=path;
    }
    public String getPath() {
        return path;
    }

    public void save() {
        System.out.println("Image document saved");
    }
}
