package ru.mirea.pr12;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Window extends JFrame {
    private static JTextArea input=new JTextArea(20,30);
    IDocument carcass;
    ICreateDocument createDoc;
    String path="src/ru/mirea/pr12/test.txt";
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
                input.setText("");
                JOptionPane.showMessageDialog(Window.this,"Документ создан");
            }
        });
        open.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                carcass=createDoc.CreateOpen(path);
                String s="";
                try {
                    FileReader fileReader =new FileReader(carcass.getPath());
                    Scanner scan=new Scanner(fileReader);
                    while (scan.hasNextLine()) {
                        s = scan.nextLine();
                        input.append(s+"\n");
                    }
                    fileReader.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                input.setEnabled(true);
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

    public static String getInputText(){
        return input.getText();
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
        input.setEnabled(false);
        JScrollPane inScroll=new JScrollPane(input, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        JPanel card=new JPanel();
        card.add(inScroll);
        add(card);
        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Window("Text");
    }
}
