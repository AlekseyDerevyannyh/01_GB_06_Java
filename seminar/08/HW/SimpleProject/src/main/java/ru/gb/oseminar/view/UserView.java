package ru.gb.oseminar.view;

import ru.gb.oseminar.data.User;

import java.util.List;
import java.util.logging.Logger;

public class UserView {

    public void sendOnConsole(List<User> users) {
        Logger log = Logger.getLogger(UserView.class.getName());
        for (User user : users) {
            log.info(user.toString());
        }
    }
}
