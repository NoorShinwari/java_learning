package com.javaLearning;

public class Point {

    private int x;
    private int y;

    public Point() {
    };

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        Point another = new Point(0, 0);

        double a = ((another.x - this.x) * (another.x - this.x)) + ((another.y - this.y) * (another.y - this.y));
        return Math.sqrt(a);

    }

    public double distance(int x, int y) {

        Point another = new Point(x, y);

        double a = ((another.x - this.x) * (another.x - this.x)) + ((another.y - this.y) * (another.y - this.y));
        return Math.sqrt(a);

    }

    public double distance(Point another) {

        double a = ((another.x - this.x) * (another.x - this.x)) + ((another.y - this.y) * (another.y - this.y));
        return Math.sqrt(a);

    }

}
