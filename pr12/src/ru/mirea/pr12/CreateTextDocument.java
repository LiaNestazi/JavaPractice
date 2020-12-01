package ru.mirea.pr12;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateTextDocument implements ICreateDocument {
    public TextDocument CreateNew(String path) {
        File f = new File(path);
        if (f.delete()){
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return new TextDocument(path);
    }

    public TextDocument CreateOpen(String path) {
        TextDocument doc = new TextDocument(path);
        File file = new File(path);
        try (FileWriter writer = new FileWriter(path, true)) {
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return doc;
    }
};
