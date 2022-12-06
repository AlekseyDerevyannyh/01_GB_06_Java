package ru.gb.oseminar.model;

import ru.gb.oseminar.data.Figure;

public interface IRepository<T extends Figure> {
    public void add(T value);
}
