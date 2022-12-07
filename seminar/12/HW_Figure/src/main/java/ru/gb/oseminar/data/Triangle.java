package ru.gb.oseminar.data;

public class Triangle extends Polygon {
    public Triangle(Double side1, Double side2, Double side3) {
        super(new Double[]{side1, side2, side3});
    }

    @Override
    public Double area() {
        Double p = super.perimeter() / 2;   // Находим полупериметр для вычисления площади треугольника по формуле Герона
        return Math.sqrt(p * (p - super.sides[0]) * (p - super.sides[1]) * (p - super.sides[2]));
    }

    public Double getSide1() {
        return super.sides[0];
    }

    public Double getSide2() {
        return super.sides[1];
    }
    public Double getSide3() {
        return super.sides[2];
    }
}
