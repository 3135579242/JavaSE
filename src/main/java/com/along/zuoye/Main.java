package com.along.zuoye;

import org.example.Day2.B;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setLayout(new GridLayout(2,1));
        frame.setSize(400,300);
        frame.setLocation(300,400);
        frame.setBackground(Color.BLACK);

        Panel panel1 = new Panel(new BorderLayout());
        Panel panel2 = new Panel(new BorderLayout(2,1));
        Panel panel3 = new Panel(new BorderLayout());
        Panel panel4 = new Panel(new BorderLayout(2,1));

        panel1.add(new Button("EAST-1"),BorderLayout.EAST);
        panel1.add(new Button("WEST-1"),BorderLayout.WEST);
        panel2.add(new Button("ps-btn-1"));
        panel2.add(new Button("p2-btn-2"));
        panel1.add(panel2,BorderLayout.CENTER);

        panel3.add(new Button("EAST-2"),BorderLayout.EAST);
        panel3.add(new Button("WEST-1"),BorderLayout.WEST);
        for (int i = 0; i < 4; i++) {
            panel4.add(new Button("for-"+i));
        }
        panel3.add(panel4,BorderLayout.CENTER);

        frame.add(panel1);
        frame.add(panel3);

        frame.setVisible(true);



        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}
