package org.example;

public class Sphere  implements ThreeDimensionalFigure {

    private final double diameter;

    public Sphere(double diameter) {
       this.diameter=diameter;
    }

    @Override
    public double getThreeSquare() {
        return 4*Math.PI*Math.pow(diameter/2,2);
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(diameter/2, 3);
    }
}
