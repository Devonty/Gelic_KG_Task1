package ru.vsu.cs.kg2023.lozhkin_a_e.task_1;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private JPanel jp;


    public MainWindow() throws HeadlessException {
        this.jp = new DrawPanel();
        this.setContentPane(jp);
    }
}
