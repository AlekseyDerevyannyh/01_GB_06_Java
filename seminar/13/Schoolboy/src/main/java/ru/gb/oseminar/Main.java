package ru.gb.oseminar;

import ru.gb.oseminar.data.HighSchoolboy;
import ru.gb.oseminar.data.JuniorSchoolboy;
import ru.gb.oseminar.data.SecondarySchoolboy;
import ru.gb.oseminar.service.Program;

public class Main {
    public static void main(String[] args) {
        Program program = new Program();
        program.add(new JuniorSchoolboy("Ivan", "Ivanov"));
        program.add(new SecondarySchoolboy("Petr", "Petrov"));
        program.add(new HighSchoolboy("Aleksandr", "Aleksandrov"));
        program.allMethods();
    }
}