package org.example;

public class Coordinate {
    double x;
    double y;

    public Coordinate(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String formatAsString() {
        return "[x:" + this.x+ ", y:" + this.y + "]";
    }
}
