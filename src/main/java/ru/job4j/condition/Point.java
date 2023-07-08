package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
    private final int x;
    private final int y;
    private final int z;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
        z = -1;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getDistance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public double distance3d(Point that) {
        return sqrt(pow(x - that.x, 2) + pow(y - that.y, 2) + pow(z - that.z, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.getDistance(b);
        System.out.println(dist);
    }
}