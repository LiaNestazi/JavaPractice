package ru.mirea.pr9.var2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LabClassUI extends JFrame {
    private LabClass lab=new LabClass();
    private int width=350;
    private int height=450;
    private int current=0;
    private JLabel inputName, inputGrade, data, result;
    private JButton button,getResult,refresh;
    private JTextField name=new JTextField(15);
    private JTextField grade=new JTextField(15);
    private JTextArea input=new JTextArea(5,20);
    private JTextArea output=new JTextArea(5,20);
    public LabClassUI(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Test Frame");
        setSize(width,height);
        setResizable(false);
        setLayout(new FlowLayout());
        inputName=new JLabel("Enter student name: ");
        inputGrade=new JLabel("Enter student grade:");
        data=new JLabel("Your input:");
        result=new JLabel("Output:      ");
        button=new JButton("Next student");
        getResult=new JButton("Sort students by GPA");
        refresh=new JButton("Refresh");
        name.setText("");
        grade.setText("");
        input.setAutoscrolls(true);
        input.setEditable(false);
        output.setAutoscrolls(true);
        output.setEditable(false);
        JScrollPane inScroll=new JScrollPane(input, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        JScrollPane outScroll=new JScrollPane(output, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        JPanel card=new JPanel();
        JPanel card2=new JPanel();
        JPanel card3=new JPanel();
        JPanel card4=new JPanel();
        JPanel card5=new JPanel();
        JPanel card6=new JPanel();
        JPanel card7=new JPanel();
        card.add(inputName);
        card.add(name);
        card2.add(inputGrade);
        card2.add(grade);
        card3.add(button);
        card4.add(data);
        card4.add(inScroll);
        card5.add(getResult);
        card6.add(result);
        card6.add(outScroll);
        card7.add(refresh);
        add(card);
        add(card2);
        add(card3);
        add(card4);
        add(card5);
        add(card6);
        add(card7);
        name.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (name.getText().equals("")){
                    JOptionPane.showMessageDialog(LabClassUI.this,"Введите имя студента");
                }
            }
        });
        grade.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (grade.getText().equals("")){
                    JOptionPane.showMessageDialog(LabClassUI.this,"Введите оценку студента");
                }
            }
        });
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean isReady=true;
                if (name.getText().equals("")){
                    JOptionPane.showMessageDialog(LabClassUI.this,"Введите имя студента");
                    isReady=false;
                }
                if (grade.getText().equals("")){
                    JOptionPane.showMessageDialog(LabClassUI.this,"Введите оценку студента");
                    isReady=false;

                }
                if (isReady) {
                    input.append(name.getText()+" "+grade.getText()+"\n");
                    Student temp=new Student(name.getText(),Integer.parseInt(grade.getText()));
                    if (current<lab.list.length) {
                        lab.list[current] = temp;
                        current++;
                    }
                    else{
                        Student[] tempList=new Student[lab.list.length+1];
                        lab.clone(tempList,lab.list);
                        tempList[current]=temp;
                        lab.list=tempList;
                        current++;
                    }
                    name.setText("");
                    grade.setText("");
                }
            }
        });
        getResult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name.setEditable(false);
                grade.setEditable(false);
                button.setEnabled(false);
                if (input.getText().equals("")){
                    JOptionPane.showMessageDialog(LabClassUI.this,"There aren't any students");
                }
                else {
                    LabClassDriver driver=new LabClassDriver();
                    driver.run(lab.list);
                    for (int i = 0; i < lab.list.length; i++) {
                        output.append(lab.list[i].getName() + " " + lab.list[i].getGrade() + "\n");
                    }
                }
            }
        });
        refresh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lab.clear();
                current=0;
                name.setEditable(true);
                grade.setEditable(true);
                button.setEnabled(true);
                input.setText("");
                output.setText("");
            }
        });
    }
    public static void main(String[] args) {
        LabClassUI l=new LabClassUI();
        l.setVisible(true);
    }
}
