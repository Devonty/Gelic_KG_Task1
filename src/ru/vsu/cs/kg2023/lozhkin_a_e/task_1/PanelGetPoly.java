package ru.vsu.cs.kg2023.lozhkin_a_e.task_1;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PanelGetPoly extends JPanel {
    private BufferedImage img;
    private java.util.List<Polygon> polygonList;
    private java.util.List<String> namesList;
    private Polygon polygon;

    public PanelGetPoly() {
        polygon = new Polygon();
        polygonList = new ArrayList<>();
        namesList = new ArrayList<>();
        try {
            img = ImageIO.read(new File("D:\\.JavaProjects\\ComputerGraphics\\Gelic_KG_Task1\\src\\ru\\vsu\\cs\\kg2023\\lozhkin_a_e\\task_1\\ref.jpg"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                switch (e.getButton()) {
                    case (1):
                        System.out.println("Add (" + e.getX() + " " + e.getY() + ")");
                        polygon.addPoint(e.getX(), e.getY());
                        break;
                    case (2):
                        try {
                            savePolygonsInFile();
                            System.out.println("Success!");
                        } catch (IOException ex) {
                            System.out.println(ex.getMessage());
                        }
                        break;
                    case (3):
                        System.out.println("Введите имя полигона(уникальное на англ): ");
                        namesList.add(new Scanner(System.in).next());
                        polygonList.add(polygon);
                        System.out.println(Arrays.toString(polygon.xpoints) + "\n" + Arrays.toString(polygon.ypoints));
                        polygon = new Polygon();
                        break;
                    case (4):
                        if(polygonList.size() > 0)
                            polygonList.remove(polygonList.size() - 1);
                        System.out.println("Последний сохранненый стерт");
                        break;
                    case (5):
                        System.out.println("Полигон очищен");
                        polygon = new Polygon();
                        break;
                }
                repaint();
            }
        });
    }

    @Override
    public void paint(Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        drawIcon(g);


        g.setColor(new Color(0, 41, 255, 95));
        for (Polygon p : polygonList) {
            g.fillPolygon(p);
        }
        g.setColor(new Color(247, 255, 0, 126));
        g.fillPolygon(polygon);

        g.setColor(new Color(255, 0, 18, 126));
        int r = 4;
        for (int i = 0; i < polygon.xpoints.length; i++) {
            g.fillOval(polygon.xpoints[i] - r, polygon.ypoints[i] - r, 2 * r, 2 * r);
        }



    }

    public void drawIcon(Graphics2D g) {
        g.drawImage(img, 0, 0, img.getWidth(), img.getHeight(), null);
    }

    public void savePolygonsInFile() throws IOException {
        String fileName = "D:\\.JavaProjects\\ComputerGraphics\\Gelic_KG_Task1\\src\\ru\\vsu\\cs\\kg2023\\lozhkin_a_e\\task_1\\Polygons.txt";

        BufferedWriter writer = null;
        writer = new BufferedWriter(new FileWriter(fileName, false));
        writer.append("int x[], y[];\n\n");

        writer.flush();

        String name;
        Polygon p;
        String stringXPoint;
        String stringYPoint;

        for (int i = 0; i < polygonList.size(); i++) {
            name = namesList.get(i);
            p = polygonList.get(i);
            stringXPoint = Arrays.toString(clearZeroes(p.xpoints));
            stringYPoint = Arrays.toString(clearZeroes(p.ypoints));

            writer.append("// ").append(name).append("\n");
            writer.append("x = new int[]{").append(stringXPoint.substring(1, stringXPoint.length() - 1)).append("};\n");
            writer.append("y = new int[]{").append(stringYPoint.substring(1, stringYPoint.length() - 1)).append("};\n");
            writer.append("Polygon ").append(name).append(" = ").append("new Polygon(x, y, x.length);\n");
            writer.append("g.fillPolygon(").append(name).append(");\n\n");
        }
        writer.close();
    }

    private int[] clearZeroes(int[] nums) {
        int realSize = nums.length;
        while (nums[realSize - 1] == 0) realSize--;
        return Arrays.copyOf(nums, realSize);
    }
}
