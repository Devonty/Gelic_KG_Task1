package ru.vsu.cs.kg2023.lozhkin_a_e.task_1.elements;

import java.awt.*;

public class CarWheel extends WithCords{
    private double angleRadians;
    private double stepRadians;
    public CarWheel(int x, int y) {
        super(x, y);
        angleRadians = 0;
        stepRadians = Math.PI / 36.;
    }

    public void draw(Graphics2D g) {
        // calc angle
        angleRadians += stepRadians;
        g.rotate(angleRadians, x, y);
        // save color
        Color save = g.getColor();
        // draw
        int r;
        // biggest
        r = 50;
        g.setColor(Color.BLACK);
        g.fillOval(x -r, y - r, 2*r, 2*r);
        // mid
        r = 35;
        g.setColor(Color.GRAY);
        g.fillOval(x -r, y - r, 2*r, 2*r);
        // star
        int step = 2;
        int count = 16;
        g.setColor(Color.WHITE);
        for (int i = 0; i < 16; i++) {
            g.drawPolygon(new int[]{x + step, x - step, x}, new int[]{y, y, y + r + 1}, 3);
            g.rotate(2 * Math.PI / count, x, y);
        }
        // rotate back
        g.rotate(-angleRadians, x, y);
        // back color
        g.setColor(save);
    }
}
