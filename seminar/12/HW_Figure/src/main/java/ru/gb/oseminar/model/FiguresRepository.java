package ru.gb.oseminar.model;

import ru.gb.oseminar.data.Figure;
import ru.gb.oseminar.data.ILengthable;
import ru.gb.oseminar.data.IPerimeterable;

import java.util.ArrayList;
import java.util.Collection;

public class FiguresRepository implements IRepository {
    private Collection<Figure> figures;

    public FiguresRepository() {
        this.figures = new ArrayList<>();
    }

    @Override
    public void add(Figure figure) {
        this.figures.add(figure);
    }

    public Double allPerimeters() {
        Double perimeter = 0.0;
        for (Figure figure : this.figures) {
            if (figure instanceof IPerimeterable) {
                perimeter += ((IPerimeterable) figure).perimeter();
            }
        }
        return perimeter;
    }

    public Double allLength() {
        Double length = 0.0;
        for (Figure figure : this.figures) {
            if (figure instanceof ILengthable) {
                length += ((ILengthable) figure).length();
            }
        }
        return length;
    }

    public Double allAreas() {
        Double area = 0.0;
        for (Figure figure : this.figures) {
            area += figure.area();
        }
        return area;
    }
}
