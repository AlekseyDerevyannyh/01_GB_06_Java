package ru.gb.oseminar.data;

public abstract class Polygon extends Figure implements IPerimeterable {
    protected Double[] sides;

    protected Polygon(Double[] sides) {
        this.sides = sides;
    }

    public Double perimeter() {
        Double perimeter = 0.0;
        for (Double side : this.sides) {
            perimeter += side;
        }
        return perimeter;
    }
}
