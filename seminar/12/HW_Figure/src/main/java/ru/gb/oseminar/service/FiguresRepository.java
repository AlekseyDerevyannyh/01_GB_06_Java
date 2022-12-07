package ru.gb.oseminar.service;

import ru.gb.oseminar.data.Figure;
import ru.gb.oseminar.data.ILengthable;
import ru.gb.oseminar.data.IPerimeterable;

import java.util.ArrayList;
import java.util.List;

public class FiguresRepository implements IRepository {
    private List<Figure> figures;

    public FiguresRepository() {
        this.figures = new ArrayList<>();
    }

    @Override
    public void add(Figure figure) {
        this.figures.add(figure);
    }

    public Double getAllPerimeters() {
        Double perimeter = 0.0;
        for (Figure figure : this.figures) {
            if (figure instanceof IPerimeterable) {
                perimeter += ((IPerimeterable) figure).perimeter();
            }
        }
        return perimeter;
    }

    public Double getAllLength() {
        Double length = 0.0;
        for (Figure figure : this.figures) {
            if (figure instanceof ILengthable) {
                length += ((ILengthable) figure).length();
            }
        }
        return length;
    }

    public Double getAllAreas() {
        Double area = 0.0;
        for (Figure figure : this.figures) {
            area += figure.area();
        }
        return area;
    }

    public List<Figure> getFigures() {
        return figures;
    }

//    public void setFigures(List<Figure> figures) {
//        this.figures = figures;
//    }
}
