package ru.gb.oseminar;

import ru.gb.oseminar.controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createTeacher("Aleksandr", "Aleksandrov", "Aleksandrovich");
        controller.createStudent("Ivan", "Ivanov", "Ivanovich");
        controller.createStudent("Petr", "Petrov", "Petrovich");
        controller.createStudent("Vladislav", "Vladislavov", "Vladislavovich");

        controller.createStudyGroup();
    }
}