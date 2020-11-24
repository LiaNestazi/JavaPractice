package ru.mirea.pr12;

public class CreateMusicDocument implements ICreateDocument {
    public MusicDocument CreateNew(String path){
        return new MusicDocument(path);
    }
    public MusicDocument CreateOpen(String path) { return new MusicDocument(path); }
}
