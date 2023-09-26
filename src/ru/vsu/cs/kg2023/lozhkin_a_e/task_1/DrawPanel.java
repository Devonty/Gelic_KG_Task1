package ru.vsu.cs.kg2023.lozhkin_a_e.task_1;

import ru.vsu.cs.kg2023.lozhkin_a_e.task_1.elements.Car;
import ru.vsu.cs.kg2023.lozhkin_a_e.task_1.elements.Road;
import ru.vsu.cs.kg2023.lozhkin_a_e.task_1.elements.Sky;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DrawPanel extends JPanel {
    private Car car;
    private Road road;

    private Sky sky;

    public DrawPanel() {
        car = new Car();
        road = new Road();
        sky = new Sky();
        Timer timer = new Timer(25, new ActionListener() {
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
        // car
        sky.draw(g);
        road.draw(g);
        car.draw(g);
    }
}
