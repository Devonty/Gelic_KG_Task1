package ru.vsu.cs.kg2023.lozhkin_a_e.task_1.elements;

import java.awt.*;

public class Car {
    private CarFrame carFrame;
    private CarWheel wheelLeft, wheelRight;

    public Car() {
        this.carFrame = new CarFrame();
        this.wheelLeft = new CarWheel(135, 320);
        this.wheelRight = new CarWheel(510, 320);
    }

    public void draw(Graphics2D g) {
        Color save = g.getColor();
        // ...
        carFrame.draw(g);
        wheelLeft.draw(g);
        wheelRight.draw(g);
        // ...
        g.setColor(save);
    }
}
