package model;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    private final List<User> users;

    public Repository() {
        this.users = new ArrayList<>();
    }

    public void createUser(String lastName, String firstName, String patronymic, String birthDate, Long phone, Character sex) {
        users.add(new User(lastName, firstName, patronymic, birthDate, phone, sex));
    }

    public List<User> getAllUser() {
        return this.users;
    }
}
