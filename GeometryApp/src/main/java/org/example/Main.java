package org.example;

public class Main {
    public static void main(String[] args) {
        Figure circle = new Circle(10);
        System.out.printf("""
                Круг:
                  Площадь: %f
                  Длина окужности (периметр): %f%n
                """,circle.getSquare(),circle.getPerimeter());

        Figure triangle = new Triangle(6 ,10,20);
        System.out.printf("""
                Треугольник:
                  Площадь: %f
                  Периметр: %f%n
                """,triangle.getSquare(),triangle.getPerimeter());

        Figure rectangle = new Rectangle(12 ,6);
        System.out.printf("""
                Прямоугольник:
                  Площадь: %f
                  Периметр: %f%n
                """,rectangle.getSquare(),rectangle.getPerimeter());


        System.out.printf("""
                Периметр треугольника равен периметру прямоугольника - %b
                """,GeometryUtils.compareToPerimeter(triangle,rectangle));

        Cube cube = new Cube(5);
        System.out.printf("""
                Куб:
                  Площадь: %f
                  Объем: %f%n
                """,cube.getThreeSquare(),cube.getVolume());

        Sphere sphere = new Sphere(10);
        System.out.printf("""
                Сфера:
                  Площадь: %f
                  Объем: %f%n
                """,sphere.getThreeSquare(),sphere.getVolume());

    }
}