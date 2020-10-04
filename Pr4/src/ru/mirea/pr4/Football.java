package ru.mirea.pr4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Football extends JFrame {
    JButton ac_milan = new JButton("AC Milan");
    JButton real_madrid = new JButton("Real Madrid");
    int ac_res = 0;
    int rm_res = 0;
    String score_info="N/A";
    String win="DRAW";
    Font fnt1 = new Font("Times new roman", Font.BOLD,16);
    Font fnt = new Font("Times new roman", Font.PLAIN,15);
    JLabel result = new JLabel("Result: "+ac_res+" X "+rm_res);
    JLabel last = new JLabel("Last Scorer: "+score_info);
    Label winner = new Label("Winner: "+win);
    public void refresh(){
        result.setText("Result: "+ac_res+" X "+rm_res);
        last.setText("Last Scorer: "+score_info);
        winner.setText("Winner: "+win);
    }
    public Football(){
        super("Match Results");
        setLayout(new FlowLayout());
        setSize(270,170);
        ac_milan.setFont(fnt1);
        real_madrid.setFont(fnt1);
        ac_milan.setBackground(Color.WHITE);
        real_madrid.setBackground(Color.WHITE);
        result.setFont(fnt);
        last.setFont(fnt);
        winner.setFont(fnt);
        add(ac_milan);
        add(real_madrid);
        add(result);
        add(last);
        add(winner);
        ac_milan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ac_res++;
                score_info="AC Milan";
                if (ac_res>rm_res)
                    win="AC Milan";
                else if (ac_res<rm_res)
                    win="Real Madrid";
                else win="DRAW";
                refresh();
            }
        });
        real_madrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rm_res++;
                score_info="Real Madrid";
                if (ac_res>rm_res)
                    win="AC Milan";
                else if (ac_res<rm_res)
                    win="Real Madrid";
                else win="DRAW";
                refresh();
            }
        });
    }
    public static void main(String[] args){
        new Football().setVisible(true);
    }
}
