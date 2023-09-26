package ru.vsu.cs.kg2023.lozhkin_a_e.task_1.elements;

import java.awt.*;

public class SignCity extends WithCords{
    private int dx;
    private int startX;

    public SignCity(int x, int y, int dx) {
        super(x, y);
        startX = x;
        this.dx = dx;
    }

    public SignCity(int x, int y) {
        this(x, y, -10);
    }

    public void draw(Graphics2D g) {
        x += dx;
        if (x < -500) restart();
        Color save = g.getColor();
        // ...
        // pillar1
        g.setColor(Color.BLACK);
        int w = 4, h = 160;
        g.fillRect(x - w / 2 + 180, y, w, h);
        g.setColor(Color.BLACK);
        //  pillar2
        g.fillRect(x - w / 2 + 30, y, w, h);
        // table
        g.setColor(Color.BLUE);
        g.fillRoundRect(x, y, 210, 50,  15, 15);
        g.setColor(Color.WHITE);
        g.drawRoundRect(x + 5, y + 5, 210 - 10, 50 - 10, 15, 15);

        // string
        g.setColor(Color.WHITE);
        g.setFont(new Font("Times New Roman", Font.BOLD, 40));
        g.drawString("Липецк", x+ 30, y + 35);
        // ...
        g.setColor(save);
    }

    public void restart() {
        x = startX;
    }
}
