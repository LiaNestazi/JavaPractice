package ru.mirea.pr12;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    IDocument carcass;
    ICreateDocument createDoc;
    String path="C:/Users/ПК/Desktop/textfile.txt";
    private JMenu createFileMenu(ICreateDocument factory){
        createDoc=factory;
        JMenu file = new JMenu("File");
        JMenuItem nw = new JMenuItem("New");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem exit = new JMenuItem("Exit");
        file.add(nw);
        file.addSeparator();
        file.add(open);
        file.addSeparator();
        file.add(save);
        file.addSeparator();
        file.add(exit);
        nw.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                carcass=createDoc.CreateNew(path);
                JOptionPane.showMessageDialog(Window.this,"Документ создан");
            }
        });
        open.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                carcass=createDoc.CreateOpen(path);
                JOptionPane.showMessageDialog(Window.this,"Документ открыт");
            }
        });
        save.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                carcass.save();
                JOptionPane.showMessageDialog(Window.this,"Документ сохранен");
            }
        });
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        return file;
    }
    public Window(String type){
        super("File menu");
        ICreateDocument factory;
        switch (type) {
            case "Text":
                factory=new CreateTextDocument();
            case "Image":
                factory=new CreateImageDocument();
            case "Music":
                factory=new CreateMusicDocument();
            default:
                factory=new CreateTextDocument();
        }
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(createFileMenu(factory));
        setJMenuBar(menuBar);
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Window("Text");
    }
}
