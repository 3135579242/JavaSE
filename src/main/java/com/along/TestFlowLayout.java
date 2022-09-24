package com.along;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestFlowLayout {
    public static void main(String[] args) {
        Frame frame = new Frame();

        //组件-按钮
        Button button1 = new Button("button1");
        Button button2 = new Button("button2");
        Button button3 = new Button("button3");

        //设置流失布局
        frame.setLayout(new FlowLayout(FlowLayout.RIGHT ));
        //设置宽 高
        frame.setSize(200,200);
        //设置为可见
        frame.setVisible(true);
        //添加按钮
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });



    }
}
