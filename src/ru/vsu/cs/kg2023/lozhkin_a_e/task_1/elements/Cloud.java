package ru.vsu.cs.kg2023.lozhkin_a_e.task_1.elements;

import java.awt.*;

public class Cloud extends WithCords{
    private int dx;
    private int startX;
    public Cloud(int x, int y, int dx) {
        super(x, y);
        startX = 1920;
        this.dx = dx;
    }
    public Cloud(int x, int y) {
        this(x, y, -2);
    }

    public void draw(Graphics2D g){
        x += dx;
        if (x < -100) restart();

        Color save = g.getColor();
        // ...
        int r;
        r = 20;
        g.setColor(new Color(183, 197, 197, 240));
        g.fillOval(x, y, 3 * r, 2 * r);
        g.fillOval(x - 5, y + 10, 4 * r, 2 * r);
        g.fillOval(x + 10, y + 5, 5 * r, 3 * r);
        g.fillOval(x + 15, y + 15, 4 * r, 2 * r);
        g.fillOval(x + 20, y + 5, 2 * r, 2 * r);
        // ...
        g.setColor(save);
    }

    public void restart() {
        x = startX;
    }
}
