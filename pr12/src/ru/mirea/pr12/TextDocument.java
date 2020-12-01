package ru.mirea.pr12;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TextDocument implements IDocument{
    private String path;
    public TextDocument(String path){
        File f=new File(path);
        this.path=path;
    }

    public String getPath() {
        return path;
    }
    public void save() {
        String text=Window.getInputText();
        try(FileWriter writer=new FileWriter(path,false)){
            writer.write(text);
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
