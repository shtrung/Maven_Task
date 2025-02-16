package org.example;


public class GeometryUtils {

    public static boolean compareToSquare(Figure f1, Figure f2) {
        return f1.getSquare() == f2.getSquare();
    }

    public static boolean compareToPerimeter(Figure f1, Figure f2) {
        return f1.getPerimeter() == f2.getPerimeter();
    }

}
