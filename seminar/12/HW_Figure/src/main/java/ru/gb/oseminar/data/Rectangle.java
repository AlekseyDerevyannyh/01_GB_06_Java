package ru.gb.oseminar.data;

public class Rectangle extends Polygon {
    public Rectangle(Double side1, Double side2) {
        super(new Double[]{side1, side2});
    }

    @Override
    public Double area() {
        return super.sides[0] * super.sides[1];
    }

    public Double getSide1() {
        return super.sides[0];
    }

    public Double getSide2() {
        return super.sides[1];
    }
}
