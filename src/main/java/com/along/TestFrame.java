package com.along;

import org.example.Day2.C;

import java.awt.*;

public class TestFrame {
    public static void main(String[] args) {

        Frame frame = new Frame("图形界面窗口");
        //设置可见
        frame.setVisible(true);
        //设置  宽   高
        frame.setSize(400,500);
        //设置背景颜色 Color
        frame.setBackground(new Color(65, 205, 166));
        //设置弹出初始化位置
        frame.setLocation(200,200);
        //设置大小固定
        frame.setResizable(false);

    }
}
