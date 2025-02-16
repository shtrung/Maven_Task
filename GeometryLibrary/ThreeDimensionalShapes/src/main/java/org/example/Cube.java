package org.example;

public class Cube implements ThreeDimensionalFigure {

    private final double edge;


    public Cube(double edge) {
        this.edge = edge;
    }

    @Override
    public double getThreeSquare() {
        return (edge*edge)*6;
    }

    @Override
    public double getVolume() {
        return Math.pow(edge,3);
    }

}
