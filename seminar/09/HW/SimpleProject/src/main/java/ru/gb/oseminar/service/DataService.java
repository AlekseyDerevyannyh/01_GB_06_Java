package ru.gb.oseminar.service;

import ru.gb.oseminar.data.User;

import java.util.List;

public interface DataService {
    void createStudent(String firstName, String lastName, String patronymic);

    void createTeacher(String firstName, String lastName, String patronymic);

    List<User> getAll();

    void deleteStudent(Long id);

    void deleteTeacher(Long id);

}
