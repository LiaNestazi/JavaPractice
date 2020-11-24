package ru.mirea.pr12;

public interface ICreateDocument {
    IDocument CreateNew(String path);
    IDocument CreateOpen(String path);
}
