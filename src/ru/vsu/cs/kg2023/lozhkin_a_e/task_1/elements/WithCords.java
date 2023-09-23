package ru.vsu.cs.kg2023.lozhkin_a_e.task_1.elements;

public class WithCords {
    protected int x, y;

    public WithCords(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
