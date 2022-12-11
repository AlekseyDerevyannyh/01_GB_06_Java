package ru.gb.oseminar.service;

import ru.gb.oseminar.data.Schoolboy;

import java.util.ArrayList;
import java.util.List;

public class Program {
    private final List<Schoolboy> schoolboys;

    public Program() {
        this.schoolboys = new ArrayList<>();
    }

    public void add(Schoolboy schoolboy) {
        this.schoolboys.add(schoolboy);
    }

    public void allMethods() {
        for (Schoolboy schoolboy : this.schoolboys) {
            schoolboy.allMethods();
        }
    }
}
