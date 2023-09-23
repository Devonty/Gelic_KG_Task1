package ru.vsu.cs.kg2023.lozhkin_a_e.task_1;

import ru.vsu.cs.kg2023.lozhkin_a_e.task_1.elements.Car;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DrawPanel extends JPanel {
    private Car car;

    public DrawPanel() {
        car = new Car();
        Timer timer = new Timer(15, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                repaint();
            }
        });
        timer.start();

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("(" + e.getX() + " " + e.getY() + ")");
            }
        });
    }

    @Override
    public void paint(Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        // background
        g.setColor(new Color(88, 189, 182));
        g.fillRect(0,0,getWidth(), getHeight());
        // car
        car.draw(g);
    }
}
