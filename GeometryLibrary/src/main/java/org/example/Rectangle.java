package org.example;

public class Rectangle implements Figure {

    private final double sideA;
    private final double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSquare() {
        return sideA * sideB;
    }

    public double getPerimeter() {
        return sideA * 2 + sideB * 2;
    }
}
