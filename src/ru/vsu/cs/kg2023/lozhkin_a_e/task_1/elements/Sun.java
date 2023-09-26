package ru.vsu.cs.kg2023.lozhkin_a_e.task_1.elements;

import java.awt.*;

public class Sun extends WithCords{

    public Sun(int x, int y) {
        super(x, y);
    }

    public void draw(Graphics2D g){
        Color save = g.getColor();
        // ...
        int r;
        r = 60;
        g.setColor(Color.YELLOW);
        g.fillOval(x - r, y - r, 2 * r, 2 * r);
        // ...
        g.setColor(save);
    }
}
