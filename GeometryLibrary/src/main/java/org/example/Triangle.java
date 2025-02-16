package org.example;

public class Triangle implements Figure {

    private final double sideA;
    private final double sideB;
    private final double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
@Override
    public double getSquare() {
        double s = (double) getPerimeter() / 2;
        double A = s * (s - sideA) * (s - sideB) * (s - sideC);
        return Math.sqrt(A);
    }
@Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }
}
