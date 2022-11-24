package ru.gb.oseminar.controller;

import ru.gb.oseminar.data.*;
import ru.gb.oseminar.service.UserService;
import ru.gb.oseminar.service.StudyGroupService;
import ru.gb.oseminar.view.StudentView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Controller {

    private final UserService userService = new UserService();

    private final StudentView studentView = new StudentView();

    private final StudyGroupService studyGroupService = new StudyGroupService();

    public void createUser(String firstName, String lastName, String patronymic) {
        userService.createUser(firstName, lastName, patronymic);

    }

    public Teacher createTeacher(String firstName, String lastName, String patronymic, Long teacherId) {
        return userService.createUser(firstName, lastName, patronymic, teacherId);

    }

    public void showAllStudents() {
        List<User> students = userService.getAll();
        studentView.sendOnConsole(students);
    }

    public List<Student> getOnlyStudents(){
        return userService.getAllStudents();
    }

    public void showTeacherInfo(Teacher teacher){
        List<User> teachers = new ArrayList<>();
        teachers.add(teacher);
        studentView.sendOnConsole(teachers);
    }

    public List<StudyGroup> createTimetable(Teacher teacher, List<Student> studentList) {
        return studyGroupService.completeStudyGroup(teacher, studentList);
    }

    public void showStudyGroups(List<StudyGroup> studyGroups){
        studentView.showStudyGroups(studyGroups);
    }

    public void showSortStudyGroup (List<Student> students) {
//        Collections.sort(students, new StudyGroupComparator());
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.getLastName().equalsIgnoreCase(s2.getLastName())) {
                    return s1.getFirstName().compareTo(s2.getFirstName());
                }
                return s1.getLastName().compareTo(s2.getLastName());
            }
        });
        studentView.showStudents(students);
    }
}
