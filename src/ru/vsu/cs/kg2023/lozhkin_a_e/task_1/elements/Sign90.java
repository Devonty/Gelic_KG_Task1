package ru.vsu.cs.kg2023.lozhkin_a_e.task_1.elements;

import java.awt.*;

public class Sign90 extends WithCords {
    private int dx;
    private int startX;

    public Sign90(int x, int y, int dx) {
        super(x, y);
        startX = x;
        this.dx = dx;
    }
    public Sign90(int x, int y) {
        this(x, y, -10);
    }

    public void draw(Graphics2D g) {
        x += dx;
        if (x < -100) restart();
        Color save = g.getColor();
        // ...
        // pillar
        g.setColor(Color.BLACK);
        int w = 4, h = 160;
        g.fillRect(x - w / 2, y, w, h);
        // circles
        int r;
        // red
        r = 40;
        g.setColor(Color.RED);
        g.fillOval(x - r, y - r, 2 * r, 2 * r);
        // white
        r = 35;
        g.setColor(Color.WHITE);
        g.fillOval(x - r, y - r, 2 * r, 2 * r);
        // 90
        g.setColor(Color.BLACK);
        g.setFont(new Font("Times New Roman", Font.BOLD, 40));
        g.drawString("90", x - 17, y + 17);
        // ...
        g.setColor(save);
    }

    public void restart() {
        x = startX;
    }
}
