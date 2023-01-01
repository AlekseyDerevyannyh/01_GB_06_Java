package model;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    private UserMapper mapper = new UserMapper();
    private FileOperation fileOperation;

    public Repository(FileOperation fileOperation) {
        this.fileOperation = fileOperation;
    }

    public void createUser(String lastName, String firstName, String patronymic, String birthDate, Long phone, Character sex) {
        users.add(new User(lastName, firstName, patronymic, birthDate, phone, sex));
    }

    public void saveUser()
}
