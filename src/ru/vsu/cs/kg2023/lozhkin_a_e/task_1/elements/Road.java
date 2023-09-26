package ru.vsu.cs.kg2023.lozhkin_a_e.task_1.elements;

import java.awt.*;

public class Road {
    private int ticks = 0;
    private Sign90 sign90;
    private SignCity signCity;

    public Road() {
        sign90 = new Sign90(2200, 150);
        signCity = new SignCity(1800, 150);
    }

    public void draw(Graphics2D g) {
        ticks++;
        Color save = g.getColor();
        // ...
        // road ponts
        int x1, x2, y1, y2;
        x1 = 0;
        x2 = 1980;
        y1 = 320;
        y2 = 440;
        // green
        g.setColor(new Color(24, 103, 31));
        g.fillRect(0,y1 - 100,1920, y2 - y1 + 250);
        // road
        g.setColor(new Color(32, 37, 44));
        g.fillRect(x1, y1, x2, y2 - y1);
        g.setColor(Color.YELLOW);
        g.drawLine(x1, y1, x2, y1);
        g.drawLine(x1, y2, x2, y2);
        // lines
        int height = 10, width = 170;
        int step = 80;
        int x = -10 * (ticks % ((width + step) / 10));
        int y = (y1 + y2) / 2;
        g.setColor(Color.YELLOW);
        while(x < x2){
            g.fillRoundRect(x, y - height / 2, width, height, 15, 120);
            x += width + step;
        }
        // components
        sign90.draw(g);
        signCity.draw(g);

        // ...
        g.setColor(save);
    }
}
