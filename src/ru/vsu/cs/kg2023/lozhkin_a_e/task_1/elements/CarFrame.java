package ru.vsu.cs.kg2023.lozhkin_a_e.task_1.elements;

import java.awt.*;
import java.awt.geom.AffineTransform;

public class CarFrame {
    public void draw(Graphics2D g) {
        Color save = g.getColor();
        // ...
        int[] x, y;
        Color gray = new Color(71, 92, 103, 123);
        Color black = new Color(0,0,0);

        // wheelShadow
        x = new int[]{41, 71, 208, 437, 575, 559, 470, 428, 212, 176, 96};
        y = new int[]{317, 319, 318, 318, 320, 258, 255, 309, 307, 256, 257};
        Polygon wheelShadow = new Polygon(x, y, x.length);
        g.setColor(new Color(0,0,0, 170));
        g.fillPolygon(wheelShadow);

        // frame
        x = new int[]{32, 39, 70, 102, 167, 174, 207, 211, 229, 221, 226, 233, 239, 243, 249, 268, 431, 472, 484, 548, 564, 575, 594, 596, 590, 599, 599, 592, 590, 585, 580, 579, 565, 432, 384, 385, 366, 65, 50, 28, 20, 14, 10, 13, 16, 37, 39};
        y = new int[]{293, 314, 320, 264, 264, 267, 319, 323, 324, 331, 336, 336, 335, 338, 338, 326, 327, 264, 259, 259, 279, 317, 319, 307, 306, 305, 282, 279, 243, 238, 239, 231, 226, 213, 149, 145, 138, 136, 192, 194, 201, 222, 242, 262, 281, 286, 294};
        Polygon frame = new Polygon(x, y, x.length);
        g.setColor(Color.WHITE);
        g.fillPolygon(frame);
        g.setColor(gray);
        g.fillPolygon(frame);
        g.setColor(black);
        g.drawPolygon(frame);

        // botton
        x = new int[]{31, 40, 70, 83, 102, 169, 206, 214, 432, 469, 479, 550, 563, 571, 556, 485, 468, 446, 426, 324, 218, 176, 168, 107, 95, 73};
        y = new int[]{294, 317, 319, 297, 264, 263, 321, 325, 326, 268, 260, 261, 278, 279, 256, 253, 257, 289, 319, 320, 319, 259, 256, 254, 262, 296};
        Polygon botton = new Polygon(x, y, x.length);
        g.setColor(gray);
        g.fillPolygon(botton);
        g.setColor(black);
        g.drawPolygon(botton);

        // bumper
        x = new int[]{563, 576, 594, 595, 590, 599, 599, 596, 566};
        y = new int[]{281, 319, 320, 307, 306, 305, 284, 281, 279};
        Polygon bumper = new Polygon(x, y, x.length);
        g.setColor(gray);
        g.fillPolygon(bumper);
        g.setColor(black);
        g.drawPolygon(bumper);

        // capote
        x = new int[]{431, 435, 578, 578, 566, 451};
        y = new int[]{214, 222, 238, 231, 228, 215};
        Polygon capote = new Polygon(x, y, x.length);
        g.setColor(gray);
        g.fillPolygon(capote);
        g.setColor(black);
        g.drawPolygon(capote);

        // doorSectoin
        x = new int[]{181, 178, 217, 287, 296, 416, 417, 376, 292, 286};
        y = new int[]{149, 247, 306, 307, 307, 307, 209, 149, 149, 149};
        Polygon doorSectoin = new Polygon(x, y, x.length);
        g.setColor(gray);
        g.fillPolygon(doorSectoin);
        g.setColor(black);
        g.drawPolygon(doorSectoin);

        // doorSpliter
        x = new int[]{288, 288, 294, 294};
        y = new int[]{307, 149, 149, 307};
        Polygon doorSpliter = new Polygon(x, y, x.length);
        g.setColor(gray);
        g.fillPolygon(doorSpliter);

        // top
        x = new int[]{63, 75, 370, 386, 380, 368, 357};
        y = new int[]{137, 146, 146, 146, 142, 138, 137};
        Polygon top = new Polygon(x, y, x.length);
        g.setColor(gray);
        g.fillPolygon(top);
        g.setColor(black);
        g.drawPolygon(top);

        // windowLeft
        x = new int[]{76, 73, 65, 67, 160, 168, 168, 171, 171, 165, 83};
        y = new int[]{150, 157, 207, 211, 212, 210, 206, 157, 151, 151, 151};
        Polygon windowLeft = new Polygon(x, y, x.length);
        g.setColor(gray);
        g.fillPolygon(windowLeft);
        g.setColor(black);
        g.drawPolygon(windowLeft);

        // windowMid
        x = new int[]{197, 192, 192, 197, 272, 280, 280, 273};
        y = new int[]{151, 156, 207, 214, 214, 210, 154, 151};
        Polygon windowMid = new Polygon(x, y, x.length);
        g.setColor(gray);
        g.fillPolygon(windowMid);
        g.setColor(black);
        g.drawPolygon(windowMid);

        // windowRight
        x = new int[]{305, 301, 303, 308, 412, 375, 368};
        y = new int[]{152, 155, 210, 215, 215, 156, 153};
        Polygon windowRight = new Polygon(x, y, x.length);
        g.setColor(gray);
        g.fillPolygon(windowRight);
        g.setColor(black);
        g.drawPolygon(windowRight);

        // radiator
        x = new int[]{451, 456, 482, 478};
        y = new int[]{229, 244, 242, 231};
        Polygon radiator = new Polygon(x, y, x.length);
        g.setColor(gray);
        g.fillPolygon(radiator);
        g.setColor(black);
        g.drawPolygon(radiator);

        // backwheel
        x = new int[]{51, 27, 16, 11, 11, 14, 18, 39, 41, 43};
        y = new int[]{192, 192, 206, 229, 251, 271, 285, 288, 255, 226};
        Polygon backwheel = new Polygon(x, y, x.length);
        g.setColor(gray);
        g.fillPolygon(backwheel);
        g.setColor(black);
        g.drawPolygon(backwheel);

        // horizontalLine
        x = new int[]{59, 56, 60, 573, 573, 569};
        y = new int[]{244, 249, 250, 250, 247, 245};
        Polygon horizontalLine = new Polygon(x, y, x.length);
        g.setColor(gray);
        g.fillPolygon(horizontalLine);
        g.setColor(black);
        g.drawPolygon(horizontalLine);

        // turbines
        x = new int[]{230, 223, 230, 237, 244, 252, 268};
        y = new int[]{326, 331, 338, 334, 339, 337, 327};
        Polygon turbines = new Polygon(x, y, x.length);
        g.setColor(gray);
        g.fillPolygon(turbines);
        g.setColor(black);
        g.drawPolygon(turbines);

        // turbinesHoleLeft
        x = new int[]{222, 228, 235, 230, 224};
        y = new int[]{331, 329, 333, 338, 334};
        Polygon turbinesHoleLeft = new Polygon(x, y, x.length);
        g.setColor(gray);
        g.fillPolygon(turbinesHoleLeft);
        g.setColor(black);
        g.drawPolygon(turbinesHoleLeft);

        // turbinesHoleRight
        x = new int[]{244, 239, 242, 249, 251, 248};
        y = new int[]{330, 332, 337, 339, 333, 329};
        Polygon turbinesHoleRight = new Polygon(x, y, x.length);
        g.setColor(gray);
        g.fillPolygon(turbinesHoleRight);
        g.setColor(black);
        g.drawPolygon(turbinesHoleRight);

        // headlight
        x = new int[]{561, 560, 574, 573};
        y = new int[]{252, 257, 256, 250};
        Polygon headlight = new Polygon(x, y, x.length);
        g.setColor(gray);
        g.fillPolygon(headlight);
        g.setColor(black);
        g.drawPolygon(headlight);

        // doorKnobLeft
        x = new int[]{189, 189, 183, 183, 188, 191, 198, 201, 207, 207, 200, 196};
        y = new int[]{242, 246, 245, 250, 250, 254, 253, 250, 250, 245, 244, 240};
        Polygon doorKnobLeft = new Polygon(x, y, x.length);
        g.setColor(gray);
        g.fillPolygon(doorKnobLeft);
        g.setColor(black);
        g.drawPolygon(doorKnobLeft);

        // doorKnobRight
        x = new int[]{299, 299, 304, 304, 312, 318, 323, 323, 318, 314, 308, 305};
        y = new int[]{244, 249, 250, 253, 255, 251, 249, 245, 245, 243, 242, 245};
        Polygon doorKnobRight = new Polygon(x, y, x.length);
        g.setColor(gray);
        g.fillPolygon(doorKnobRight);
        g.setColor(black);
        g.drawPolygon(doorKnobRight);

        // mirror
        Color mirrorColor = new Color(46, 59, 70);
        x = new int[]{393, 390, 390, 391, 397, 403, 407, 415, 412, 412, 412, 410, 400};
        y = new int[]{199, 203, 215, 219, 220, 221, 223, 219, 216, 208, 202, 200, 199};
        Polygon mirror = new Polygon(x, y, x.length);
        g.setColor(mirrorColor);
        g.fillPolygon(mirror);
        g.setColor(black);
        g.drawPolygon(mirror);

        // ...
        g.setColor(save);
    }
}
