package ru.gb.oseminar;

import ru.gb.oseminar.controller.Controller;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.createTeacher("Aleksandr", "Aleksandrov", "Aleksandrovich");
        controller.createStudent("Vladislav", "Vladislavov", "Vladislavovich");
        controller.createStudent("Petr", "Petrov", "Petrovich");
        controller.createStudent("Ivan", "Ivanov", "Ivanovich");
        controller.createStudyGroup();

        controller.createTeacher("Anton", "Antonov", "Antonovich");
        controller.createStudent("Vladimir", "Konstantinov", "Vladimirovich");
        controller.createStudent("Konstantin", "Sokolov", "Konstantinovich");
        controller.createStudent("Evgeniy", "Evgen'ev", "Evgenevich");
        controller.createStudyGroup();

        controller.createTeacher("Aleksey", "Alekseev", "Alekseevich");
        controller.createStudent("Yuriy", "Yur'ev", "Yur'evich");
        controller.createStudent("Maksim", "Maksimov", "Maksimovich");
        controller.createStudent("Boris", "Borisov", "Borisovich");
        controller.createStudyGroup();

        controller.showSortedStudents(controller.getAllStudyGroups());
    }
}