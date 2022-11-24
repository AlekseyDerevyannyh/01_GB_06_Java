package ru.gb.oseminar;

import ru.gb.oseminar.controller.Controller;
import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.StudyGroup;
import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.data.User;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.createUser("Petr", "Ivanov", "Anton");
        controller.createUser("Ilon", "Mask", "Joe");
        controller.createUser("Joe", "Doe", "Djek");
        controller.createUser("Andrey", "Doe", "Djek");
        controller.showAllStudents();
        List <StudyGroup> studyGroups  = controller.createTimetable(controller.createTeacher("Master", "Ioda", "Djedai", 111L),
                controller.getOnlyStudents());
        controller.showStudyGroups(studyGroups);
        controller.showSortStudyGroup(controller.getOnlyStudents());

    }
}
