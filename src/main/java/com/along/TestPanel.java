package com.along;


import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestPanel {
    public static void main(String[] args) {
        Frame frame = new Frame();
        //布局的概念 Panel
        Panel panel = new Panel();

        //设置布局
        frame.setLayout(null);

        //坐标
        frame.setBounds(300,300,500,500);
        frame.setBackground(new Color(157, 185, 89));


        //设置Panel坐标 相对于Frame
        panel.setBounds(50,50,400,400);
        panel.setBackground(new Color(59, 210, 127));

        frame.add(panel);

        frame.setVisible(true);

        //监听事件，监听窗口关闭事件 System.exit(0)
        frame.addWindowListener(new WindowAdapter() {
            //窗口点击关闭的时候需要做的事情
            @Override
            public void windowClosing(WindowEvent e) {
                //结束程序
                System.exit(0);
            }
        });

    }

}
