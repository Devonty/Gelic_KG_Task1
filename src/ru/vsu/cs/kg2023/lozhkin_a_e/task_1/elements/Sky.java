package ru.vsu.cs.kg2023.lozhkin_a_e.task_1.elements;

import java.awt.*;
import java.util.Random;

public class Sky {
    private Sun sun;
    private Cloud[] clouds;

    public Sky() {
        sun = new Sun(1230, 15);
        Random rd = new Random();
        int size = 10;
        clouds = new Cloud[10];
        for (int i = 0; i < 10; i++) {
            clouds[i] = new Cloud(200 * i + rd.nextInt(100), rd.nextInt(10, 60), -rd.nextInt(2,5));
        }
    }

    public void draw(Graphics2D g) {
        Color save = g.getColor();
        // ...
        g.setColor(new Color(44, 136, 197));
        g.fillRect(0, 0, 1920, 540);
        // draw
        sun.draw(g);
        for (int i = 0; i < 10; i++) {
            clouds[i].draw(g);
        }
        // ...
        g.setColor(save);
    }
}
