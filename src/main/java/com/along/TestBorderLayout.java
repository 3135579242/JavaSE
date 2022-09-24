package com.along;

import java.awt.*;

public class TestBorderLayout {
    public static void main(String[] args) {
        Frame frame = new Frame();

        Button east = new Button("east");//东
        Button west = new Button("west");//西
        Button south = new Button("south");//南
        Button north = new Button("north");//北
        Button center = new Button("center");//中

        frame.add(east,BorderLayout.EAST);
        frame.add(west,BorderLayout.WEST);
        frame.add(south,BorderLayout.SOUTH);
        frame.add(north,BorderLayout.NORTH);
        frame.add(center,BorderLayout.CENTER);

        frame.setVisible(true);
        frame.setSize(200,200);
    }
}
