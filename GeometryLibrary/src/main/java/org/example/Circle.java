package org.example;

public class Circle implements Figure {

    private final double diameter;
    private static final double PI = 3.14159;

    public Circle(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public double getSquare() {
        return (PI * Math.pow(diameter / 2, 2));
    }

    @Override
    public double getPerimeter() {
        return diameter * PI;
    }
}
