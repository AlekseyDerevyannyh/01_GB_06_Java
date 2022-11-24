package ru.gb.oseminar;

import ru.gb.oseminar.controller.UserController;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        UserController userController = new UserController();
        userController.createStudent(
                "ExampleFirstName",
                "ExampleSecondName",
                "ExamplePatronymic",
                LocalDate.now());
    }
}